package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCExample3 {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		// fetch all the value by condition like where condition
		Criterion crt1 = Restrictions.ge("salary", 2000);
		Criterion crt2 = Restrictions.ge("designation", "tester");
		Criterion crt3 = Restrictions.or(crt1, crt2);// or condition by default and condition take place
		// criteria.add(crt1);
		// criteria.add(crt2);
		criteria.add(crt3);
		List<Employee> emp = criteria.list();

		for (Employee emps : emp) {
			System.out.println(emps);
		}

		session.close();
	}

}
