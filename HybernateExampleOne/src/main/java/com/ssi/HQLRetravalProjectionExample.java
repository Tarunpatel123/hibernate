package com.ssi;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class HQLRetravalProjectionExample {

	public static void main(String[] args) {
		 
		Session session=Utility.getSessionFactory().openSession();
		//String hql="select name,sal from Employe ";
		String hql="select Sum(sal),avg(sal) from Employe";
	    Query query=session.createQuery(hql);
		     List<Object[]>obj=query.list();
		  
		             for(Object arr[]:obj) {
	     	    for(Object emp: arr) {
			   System.out.println(emp);
		      }
		    }
	   session.close();
	}


}
