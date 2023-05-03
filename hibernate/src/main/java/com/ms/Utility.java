package com.ms;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	
		public static SessionFactory sf() {
			Configuration co=new Configuration().configure();
			SessionFactory sf=co.buildSessionFactory();
			return sf;
		}
}
