package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCPojectionTwo {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria critera=session.createCriteria(Employe.class);
		 ProjectionList plist=   Projections.projectionList();
		 Projection ps=Projections.property("name");
        Projection ps1=Projections.property("id");
        plist.add(ps);
        plist.add(ps1);
        
        critera.setProjection(plist);
        List<Object[]>list=critera.list();
       for(Object arr[]:list) {
        for(Object s:arr) {
      	  System.out.println(s);
        }
        System.out.println("-------------------------------------");
       }
        session.close();

	}

}
