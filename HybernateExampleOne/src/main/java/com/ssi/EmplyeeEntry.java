package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmplyeeEntry {

	public static void main(String[] args) {
		  // Create Hibernate configuration
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Employe.class);

        // Create session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open session
        Session session = sessionFactory.openSession();

        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Create a new student
         Employe e1=new Employe(301,"tarun","3000",new Address("101","Indore"));  //Transient state not dirty cheking
         Employe e2=new Employe(302,"tarun","5000",new Address("102","Bhopal"));
         // Save the student to the database
        session.save(e1);  //it will be in persistend state (hybernate start dirty checking
        session.save(e2);
        //  session.clear();
        e1.setSal("4000");
        // Commit transaction
        transaction.commit();
        
         session.evict(e1);
        // session.clear();
         e1.setSal("4000");
         

        // Close session and session factory
        session.close();  // all the object in the persistend state are not in the detached state and hibernate will stop them 
        
        
        sessionFactory.close();
       System.out.println("ADDED"); 
    }
}
