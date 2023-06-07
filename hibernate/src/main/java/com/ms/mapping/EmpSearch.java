package com.ms.mapping;

import java.util.List;

import org.hibernate.Session;

import com.ms.Utility;

public class EmpSearch {

	public static void main(String[] args) {
		Session session = Utility.sf().openSession();
		Emp emp = session.get(Emp.class, 101);
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getEmpID());

		Laptop lap = emp.getLaptop();
		System.out.println(lap.getBrand());
		System.out.println(lap.getPrice());
		System.out.println(lap.getLaId());
		
		List<Account> acc = emp.getAccount();
		for (Account accounts : acc) {
			System.out.println(accounts.getAccno() + " " + accounts.getBank() + " " + accounts.getBranch());
		}
		
		List<Project> project=emp.getProject();
		for(Project pro:project) {
			System.out.println(pro.getPcode()+" "+pro.getPname()+" "+pro.getCname());
		}
		
		session.close();
	}

}
