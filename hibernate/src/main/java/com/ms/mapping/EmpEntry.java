package com.ms.mapping;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		
	
		Emp e1 = new Emp(101, "puskar",  4000,new Laptop("l1"));
		Emp e2 = new Emp(102, "sohail",  50000,new Laptop("l2"));
		
		Emp e3 = new Emp(103, "Habibh", 30000,new Laptop("l3"));
		Emp e4 = new Emp(104, "hasan", 60000,new Laptop("l4"));

		Configuration config = new Configuration().configure();// hibernate.cg.xml
		SessionFactory sf = config.buildSessionFactory();// make Session
		Session session = sf.openSession();// Connection obtain
		Transaction t = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);

		t.commit();
		session.close();
		System.out.println("data stored successfully.......");

	}

}
