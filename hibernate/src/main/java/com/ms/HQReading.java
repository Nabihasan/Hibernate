package com.ms;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQReading {
	
	public static void main(String[] args) {
		
		Session session=Utility.sf().openSession();
		
		String hql="from Employee where salary>30000";
		
		Query query=session.createQuery(hql);
		
		List<Employee> employee=query.list();
		for(Employee emp:employee) {
			System.out.println(emp);
		}
		
		session.close();
	}
}
