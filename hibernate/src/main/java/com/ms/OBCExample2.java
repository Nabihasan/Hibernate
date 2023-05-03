package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class OBCExample2 {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();

		Criteria criteria = session.createCriteria(Employee.class);
		//fetch the row by order like asc / desc
		Order order = Order.desc("salary");
		criteria.addOrder(order);

		criteria.addOrder(order.desc("designation"));

		List<Employee> emp = criteria.list();

		for (Employee emps : emp) {
			System.out.println(emps);
		}

		session.close();
	}

}
