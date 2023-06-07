package com.ms.mapping;

import java.util.List;

import org.hibernate.Session;

import com.ms.Utility;

public class ProjectSearch {

	public static void main(String[] args) {
		Session session = Utility.sf().openSession();
		Project pro=session.get(Project.class, "help1");
		System.out.println(pro.getPcode());
		System.out.println(pro.getCname());
		System.out.println(pro.getPname());
		
		
		List<Emp> emp = pro.getEmps();
		for(Emp emps:emp) {
			System.out.println(emps.getName()+" "+emps.getSalary()+" "+emps.getEmpID());
		}
		
		

		
		
		
		
		session.close();
	}
}