package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
//import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


public class QBCFiltration {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria critera=session.createCriteria(Employe.class);
		   //  Criterion ctr1=Restrictions.ge("sal","4000");
		   //  Criterion ctr2=Restrictions.eq("sal","4000");
		   //  Criterion ctr3=Restrictions.or(ctr1,ctr2);
	//	Criterion ctr1=	Restrictions.like("name","%n");
		Criterion ctr1=	Restrictions.between("sal","4000","5000");
//		Criterion ctr1  =Restrictions.in("address.city","indore","bhopal");
		     
		   //  critera.add(ctr1);
		     critera.add(ctr1);
		     List<Employe>employess=critera.list();
		  for(Employe emp:employess)
		  {
			 System.out.println(emp);
			 System.out.println("...........................................");
	         
		  }
		  session.close();

	}

}
