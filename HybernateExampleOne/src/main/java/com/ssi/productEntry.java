package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class productEntry {

	public static void main(String[] args) {
		  Scanner Sc = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");
		    String Name = Sc.nextLine(); 
		    System.out.println("Enter price");
		    int price =Sc.nextInt(); 
		    Product pd=new Product(Name,price);
			Session session=Utility.getSessionFactory().openSession();
			Transaction tr=session.beginTransaction();
	   	   	session.save(pd);
			tr.commit();
			
			session.close();
			System.out.println("Storded..........");
			

	}

}
