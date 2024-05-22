package com.ssi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StudentEntry {
	
 public static void main(String[] args) {

        // Create Hibernate configuration
	 Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);

     // Create session factory
     SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Open session
        Session session = sessionFactory.openSession();

        // Begin transaction
        Transaction transaction = session.beginTransaction();

        // Create a new student
       Student student = new Student(new Name("Arun","patel"),"Arun@Email.com","9009508239",new Address("101","indore"));
        // Save the student to the database
        session.save(student);

        // Commit transaction
        transaction.commit();

        // Close session and session factory
        session.close();
       sessionFactory.close();
       System.out.println("ADDED");
    }
}