package com.ms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {

		Employee e1 = new Employee( "puskar", "se", 4000);

		Employee e2 = new Employee( "sohail", "sse", 50000);
		Employee e3 = new Employee( "Habibh", "tester", 30000);
		Employee e4 = new Employee("hasan", "devops", 60000);

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
