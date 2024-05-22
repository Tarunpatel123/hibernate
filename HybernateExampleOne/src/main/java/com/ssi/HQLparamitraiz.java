package com.ssi;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class HQLparamitraiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Utility.getSessionFactory().openSession();
		String hql="from Employe where name=:salaryy";
	    Query query=session.createQuery(hql);
	    query.setParameter("salaryy","Tarun");
	    List<Employe>list=query.list();
	    for(Employe em:list) {
	    	System.out.println(em);
	    }
	    session.close();

	}

}
