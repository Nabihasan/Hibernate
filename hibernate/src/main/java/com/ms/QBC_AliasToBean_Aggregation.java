package com.ms;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class QBC_AliasToBean_Aggregation {

	public static void main(String[] args) {
		Session session = Utility.sf().openSession();

		Criteria criteria = session.createCriteria(Employee.class);

		Projection pro1 = Projections.groupProperty("designation");
		Projection pro2 = Projections.max("salary");
		Projection pro3 = Projections.min("salary");
		Projection pro4 = Projections.sum("salary");
		
		Projection pro6 = Projections.avg("salary");
		ProjectionList list = Projections.projectionList();

		list.add(pro1, "post");
		list.add(pro2, "max");
		list.add(pro3, "min");
		list.add(pro4, "sum");
		
		list.add(pro6, "avg");
		
		criteria.setProjection(list);

		criteria.setResultTransformer(Transformers.aliasToBean(Summary.class));

		List<Summary> sumary = criteria.list();
		
		for(Summary si : sumary) {
			System.out.println(si);
		}

		session.close();


	}

}
