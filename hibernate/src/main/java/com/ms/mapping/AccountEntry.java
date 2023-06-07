package com.ms.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccountEntry {

	public static void main(String[] args) {

		Account a1=new Account("a11","icici","Ab road",new Emp(101));
		Account a2=new Account("a12","hdfc","Mg road",new Emp(101));
		Account a3=new Account("a13","ubi","palasiya",new Emp(102));
		Account a4=new Account("a14","boi","vijay nagar",new Emp(102));
		Account a5=new Account("a15","icici","bhopal",new Emp(103));
		Account a6=new Account("a16","pnb","IT park",new Emp(101));
		Account a7=new Account("a17","idbi","ujjain",new Emp(102));
		Configuration config = new Configuration().configure();// hibernate.cg.xml
		SessionFactory sf = config.buildSessionFactory();// make Session
		Session session = sf.openSession();// Connection obtain
		Transaction t = session.beginTransaction();

		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		session.save(a5);
		session.save(a6);
		session.save(a7);
		
		t.commit();
		session.close();
		System.out.println("data stored successfully.......");

	}

}
