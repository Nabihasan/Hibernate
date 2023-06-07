package com.ms;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateUsingHibernateMethod {

	public static void main(String[] args) {
	
		Session session = Utility.sf().openSession();
		Employee emp=	session.get(Employee.class, 107);
		
		emp.setDesignation("sse");
		emp.setSalary(70000);
		
	Transaction tr=	session.beginTransaction();
		session.update(emp);
		tr.commit();
		session.close();
		System.out.println("data updated");
		
		

	}

}
