package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeSearch {

	public static void main(String[] args) {
		 Configuration configuration = new Configuration().configure().addAnnotatedClass(Employe.class);

	        // Create session factory
		 SessionFactory sessionFactory = configuration.buildSessionFactory();
	   	 Session session = sessionFactory.openSession();
	   	Employe em=session.load(Employe.class,101);  
	   //	 Employe em=session.get(Employe.class,101);
      String name=em.getName();
      String sal=em.getSal();
      System.out.println(em);
      System.out.println(name);
      System.out.println(sal);
      session.clear();

	}

}
