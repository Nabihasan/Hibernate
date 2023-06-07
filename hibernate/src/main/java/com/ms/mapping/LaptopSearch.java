package com.ms.mapping;

import org.hibernate.Session;

import com.ms.Utility;

public class LaptopSearch {

	public static void main(String[] args) {
		Session session = Utility.sf().openSession();
		Laptop lap = session.get(Laptop.class, "l1");
		System.out.println(lap.getLaId());
		System.out.println(lap.getBrand());
		System.out.println(lap.getPrice());

		Emp emp = lap.getEmp();
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getEmpID());

		session.close();
	}

}
