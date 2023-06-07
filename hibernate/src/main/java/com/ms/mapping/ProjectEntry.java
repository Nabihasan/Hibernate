package com.ms.mapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProjectEntry {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(101);
		Emp e2 = new Emp(102);
		Emp e3 = new Emp(103);
		Emp e4 = new Emp(104);
		
		List<Emp> em1=Arrays.asList(e1,e2);
		List<Emp> em2=Arrays.asList(e2,e3);
		List<Emp> em3=Arrays.asList(e3,e4);
		
		Project p1=new Project("help1","helpdesk","icici",em1);
		Project p2=new Project("ar1","er System","sbi",em2);
		Project p3=new Project("hr1","hr system","sbi",em3);
		
		Configuration config = new Configuration().configure();// hibernate.cg.xml
		SessionFactory sf = config.buildSessionFactory();// make Session
		Session session = sf.openSession();// Connection obtain
		Transaction t = session.beginTransaction();

		session.save(p1);
		session.save(p2);
		session.save(p3);
	

		t.commit();
		session.close();
		System.out.println("data stored successfully.......");

	}

}
