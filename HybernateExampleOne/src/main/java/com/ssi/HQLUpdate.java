package com.ssi;


import org.hibernate.query.Query;


import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLUpdate {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hql="update Employe set name ='patle' where id=302";
	    	Session session=Utility.getSessionFactory().openSession();

	      Query query=session.createQuery(hql);
	     Transaction tr=session.beginTransaction();
	     int n=query.executeUpdate();
	     tr.commit();
	     System.out.println(n+"update.........");
	     session.close();
}
}