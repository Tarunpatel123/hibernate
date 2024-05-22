package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLRetriveExample {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Query query=session.getNamedQuery("select_query");
	// Query query=session.createQuery(hql);
		   List<Employe>emp=query.list();
		   for(Employe em:emp) {
			   System.out.println(em);
		      }
	         session.close();
	}

}
