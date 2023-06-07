package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class QBCExample5 {

	public static void main(String[] args) {

		Session session = Utility.sf().openSession();

		Criteria criteria = session.createCriteria(Employee.class);

		Projection pro1 = Projections.property("emp_name");
		Projection pro2 = Projections.property("emp_code");
		Projection pro3 = Projections.property("designation");
		ProjectionList list = Projections.projectionList();

		list.add(pro1, "empName");
		list.add(pro2, "pay");
		list.add(pro3, "post");

		criteria.setProjection(list);

		criteria.setResultTransformer(Transformers.aliasToBean(EmpInfoBean.class));

		List<EmpInfoBean> li = criteria.list();

		for (EmpInfoBean bean : li) {
			System.out.println(bean.getEmpName()+" "+bean.getPay()+" "+bean.getPost());
		}

		session.close();

	}

}
