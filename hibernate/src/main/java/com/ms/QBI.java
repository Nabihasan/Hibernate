package com.ms;

import org.hibernate.Session;

public class QBI {

	public static void main(String[] agrs) {
		Session session = Utility.sf().openSession();
		
		//fetch the value only one by Query by ID
		Employee emp = session.get(Employee.class, 101); //by get method return one row 
		if (emp != null) {
			System.out.println(emp.getEmp_code());// print one by one column
			System.out.println(emp.getDesignation());
			System.out.println(emp.getSalary());
			System.out.println(emp.getEmp_name());
			session.close();
		} else {
			System.out.println("invalid id");
		}

	}
}
