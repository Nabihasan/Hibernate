package com.ms;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class QBCExampleMap {

	public static void main(String[] gg) {

		Session session = Utility.sf().openSession();

		Criteria criteria = session.createCriteria(Employee.class);

		Projection pro1 = Projections.property("emp_code");
		Projection pro2 = Projections.property("emp_name");

		ProjectionList plist = Projections.projectionList();
		plist.add(pro1, "eno");
		plist.add(pro2, "name");

		criteria.setProjection(plist);
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);

		List<Map> list = criteria.list();
		for (Map map : list) {
			System.out.println(map);
		}

	}
}
