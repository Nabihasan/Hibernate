package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCexample4 {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();

		Criteria criteria = session.createCriteria(Employee.class);

		// Criterion cr= Restrictions.between("salary", 30000, 50000);

		// criteria.add(cr);

		// criteria.add(Restrictions.in("designation", "se","sse"));
		criteria.add(Restrictions.like("emp_name", "s%"));
		List<Employee> emp = criteria.list();
		for (Employee emps : emp) {
			System.out.println(emps);
		}
		session.close();

	}

}
