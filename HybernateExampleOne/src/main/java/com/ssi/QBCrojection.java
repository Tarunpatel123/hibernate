package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
//import org.hibernate.criterion.PropertyProjection;

public class QBCrojection {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria critera=session.createCriteria(Employe.class);
        // Projection ps=Projections.property("name");
         Projection ps=Projections.property("id");
          critera.setProjection(ps);
        //  List<String>list=critera.list();
          List<Integer>list=critera.list();
          for(Integer s:list) {
        	  System.out.println(s);
          }
          session.close();

	}

}
