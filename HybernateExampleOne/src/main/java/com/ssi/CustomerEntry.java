package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerEntry {

	public static void main(String[] args) {
		  Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class);

	        // Create session factory
	        SessionFactory sessionFactory = configuration.buildSessionFactory();

	        // Open session
	        Session session = sessionFactory.openSession();

	        // Begin transaction
	        Transaction transaction = session.beginTransaction();

	        // Create a new student
	       Address ad= new Address ("101","indore");
	        Customer student = new Customer("rames", "patel",ad);
            Customer student1 = new Customer("ramesh", "patel", new Address("102","indore"));
 
	        // Save the student to the database
	        session.save(student);
	        session.save(student1);

	        // Commit transaction
	        transaction.commit();

	        // Close session and session factory
	        session.close();
	       sessionFactory.close();
	       System.out.println("ADDED");
	    }
}

	
