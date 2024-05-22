package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCExampleOne {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria critera=session.createCriteria(Employe.class);
		//  Order order1= Order.asc("sal");
	//	Order order1=Order.desc("sal");
		Order order1=Order.desc("address.hno");
		  critera.addOrder(order1);
		List<Employe>employess=critera.list();
		  for(Employe emp:employess)
		  {
			 System.out.println(emp);
			/*  System.out.println(emp.getName());
			  System.out.println(emp.getId());
			  System.out.println(emp.getSal());*/
			  System.out.println("-----------------------");
		  }
		  session.close();
	

	}

}
