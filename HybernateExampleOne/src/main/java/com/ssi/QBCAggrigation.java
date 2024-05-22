package com.ssi;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class QBCAggrigation {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		@SuppressWarnings("deprecation")
		Criteria critera=session.createCriteria(Employe.class);
		Projection ps1= Projections.avg("sal");
		Projection ps2= Projections.sum("sal");
		Projection ps3= Projections.min("sal");
		Projection ps4= Projections.max("sal");
		ProjectionList plist=Projections.projectionList();
		   plist.add(ps1); plist.add(ps1);plist.add(ps3);plist.add(ps4);
		   critera.setProjection(plist);
		   Object objects[]=(Object[])critera.uniqueResult();
		  for(Object obj:objects) {
		   System.out.println(obj);
		  }
		  session.close();
	


		
		
		
		
		
		
		
		/*critera.setProjection(ps);
		critera.setProjection(ps1);
		long sum=(long)critera.uniqueResult();
	Double db=(Double) critera.uniqueResult();
		System.out.print(db);
		System.out.print(sum);*/
	}
}
	