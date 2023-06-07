package com.ms;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class QBC_Group_BY_Aggregation {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();

		Criteria criteria = session.createCriteria(Employee.class);

		Projection pro1 = Projections.groupProperty("designation");
		Projection pro2 = Projections.max("salary");
		Projection pro3 = Projections.min("salary");
		Projection pro4 = Projections.avg("salary");
		Projection pro5 = Projections.count("salary");
		Projection pro6 = Projections.sum("salary");
		ProjectionList list = Projections.projectionList();

		list.add(pro1, "designation");
		list.add(pro2, "max");
		list.add(pro3, "min");
		list.add(pro4, "avg");
		list.add(pro5, "count");
		list.add(pro6, "sum");
		
		criteria.setProjection(list);

		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

		List<Map> li = criteria.list();
		for (Map map : li) {
			System.out.println(map);
		}

		session.close();

	}

}
