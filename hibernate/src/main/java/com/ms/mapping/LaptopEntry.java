package com.ms.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopEntry {

	public static void main(String[] args) {
		Laptop e1 = new Laptop("l1","hp",40000);

		Laptop e2 =new Laptop("l2","dell",45000);
		Laptop e3 = new Laptop("l3","mac",50000);
		Laptop e4 = new Laptop("l4","lanovo",30000);

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
		System.out.println("laptop data stored successfully.......");

	}

}
