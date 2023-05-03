package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QBCExample {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();
		//fetch all the value by query by QBC 
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> emp = criteria.list(); // fetch the all the record.
		// emp.forEach(System.out::println);
		for (Employee emps : emp) {
			System.out.print(emps.getDesignation() + "  ");
			System.out.print(emps.getEmp_name() + "  ");
			System.out.print(emps.getSalary() + "  ");
			System.out.println(emps.getEmp_code());
			System.out.println("-----------------------");
		}
		session.close();

	}

}
