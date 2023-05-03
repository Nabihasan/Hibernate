package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionExample2 {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();

		Criteria criteria = session.createCriteria(Employee.class);

		Projection p1 = Projections.property("emp_name");
		Projection p2 = Projections.property("salary");
		Projection p3 = Projections.property("designation");

		ProjectionList plist = Projections.projectionList();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);

		criteria.setProjection(plist);

		List<Object[]> list = criteria.list();
		for (Object arr[] : list) {
			for (Object item : arr) {
				System.out.println(item);

			}

			System.out.println("-------------------");
		}

	}

}
