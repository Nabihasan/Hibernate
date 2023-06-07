package com.ms;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateByHQL {

	public static void main(String[] args) {

		String hql = "update Employee set salary=salary+1289 where designation='sse'";

		Session session = Utility.sf().openSession();

		Query query = session.createQuery(hql);
		Transaction tr = session.beginTransaction();
		int n = query.executeUpdate();
		tr.commit();

		System.out.println(n);
		session.close();

	}

}
