package com.ssi;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLdelete {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		//String hql="delete from Employe where sal>4000 ";
	    //Query query=session.createQuery(hql);
	        Query query = session.getNamedQuery("delete_query");
	      Transaction tr=session.beginTransaction();
	      int n=query.executeUpdate();
	    tr.commit();
	    session.close();
	    System.out.println("deleted-------------");	
	
	}

}

