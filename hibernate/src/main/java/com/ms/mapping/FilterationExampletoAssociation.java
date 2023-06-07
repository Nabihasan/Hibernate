package com.ms.mapping;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.ms.Utility;

public class FilterationExampletoAssociation {

	public static void main(String[] args) {
		
		Session session=Utility.sf().openSession();	
	Criteria criteria=	session.createCriteria(Emp.class);
	criteria.createAlias("account", "account");
	criteria.add(Restrictions.eq("account.branch","bhopal"));
	List<Emp> emp=criteria.list();
	for(Emp emps:emp) {
		System.out.println(emps.getName()+" "+emps.getSalary()+" "+emps.getEmpID());
		System.out.println("---------account details------------");
	List<Account> list=	emps.getAccount();
	for(Account acc:list) {
		System.out.println(acc.getBank()+" "+acc.getBranch());
	}
	System.out.println("---------------------");
	}
	
	
	
/*	//criteria.add(Restrictions.gt("salary", 50000));
	criteria.createAlias("laptop", "lapy");
	criteria.add(Restrictions.lt("lapy.price", 50000));
	List<Emp> emp=criteria.list();
	for(Emp emps:emp) {
		System.out.println(emps.getName()+" "+emps.getSalary()+" "+emps.getLaptop().getBrand()+" "+emps.getLaptop().getPrice());
	}
	*/
	session.close();
	}

}
