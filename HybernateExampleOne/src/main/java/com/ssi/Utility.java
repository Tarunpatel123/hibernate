package com.ssi;

//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.internal.util.ConfigHelper;

public class Utility {

    public static SessionFactory getSessionFactory() {
	   Configuration confi=new Configuration().configure();
	   SessionFactory sf=confi.buildSessionFactory();
	     return sf;
	  
			
		}

	}


