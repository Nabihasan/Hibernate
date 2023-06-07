package com.ms.mapping;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import com.ms.Utility;

public class ProjectionExample {

	public static void main(String[] args) {
		Session session=Utility.sf().openSession();	
		Criteria criteria=	session.createCriteria(Emp.class);
		criteria.createAlias("laptop", "lapy");
		
	ProjectionList plist=	Projections.projectionList();
	plist.add(Projections.property("name"),"name");//alias
	plist.add(Projections.property("lapy.brand"),"brand");
		criteria.setProjection(plist);
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map> list=criteria.list();
		for(Map lists:list) {
			System.out.println(lists);
		}
		
		session.close();
	}

}
