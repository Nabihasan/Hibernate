package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionExample1 {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();
		Criteria criteria = session.createCriteria(Employee.class);
// select column as your choice by projections
//		Projection p1 = Projections.property("emp_name");
//		criteria.setProjection(p1);
		
		criteria.setProjection(Projections.property("salary"));

		List<Integer> emp = criteria.list();
		for (int emps : emp) {
			System.out.println(emps);
		}
		session.close();
	}

}
