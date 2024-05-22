package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=Utility.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria critera=session.createCriteria(Employe.class);
		 ProjectionList plist=Projections.projectionList();
		Projection ps=Projections.groupProperty("address.city");
		 Projection ps2=Projections.sum("sal");
	     critera.setProjection(plist);
		
		
		plist.add(ps);
		plist.add(ps2); 
		List <Object[]>list=critera.list();
		for(Object oarr[]:list) {
			for(Object s:oarr) {
				System.out.println(s);
			}
			System.out.println("------------------------");
		}
		
	}

}
