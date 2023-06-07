package com.ms.mapping;

import org.hibernate.Session;

import com.ms.Utility;

public class AccountSearch {

	public static void main(String[] args) {
		Session session = Utility.sf().openSession();
		Account acc=session.get(Account.class, "a11");
		System.out.println(acc.getAccno());
		System.out.println(acc.getBank());
		System.out.println(acc.getBranch());
		
		
		Emp emp = acc.getEmp();
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getEmpID());
		session.close();


	}

}
