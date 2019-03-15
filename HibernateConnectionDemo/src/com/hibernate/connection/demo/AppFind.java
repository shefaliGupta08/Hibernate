package com.hibernate.connection.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class AppFind {

	public static void main(String[] args) {
		
		AlienDemo a1 = null;
	
		
		
		//Session/SessionFactory  is an interface, can't create object
		// addAnnotatedclass is to specify that we are working with Alien class which is entity
		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AlienDemo.class);
		
		//After 4.1, new interface to work with sessionFactory
		
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(reg);
		
		Session session = sf.openSession();
		        
		        // Whenever we want some change in database we have to open transaction.
		        Transaction tx = session.beginTransaction();
		        
		        //To fetch data ->get
		        
				a1 = (AlienDemo) session.get(AlienDemo.class, 103);
				
				tx.commit();
				
				System.out.println(a1);
				

	}

}
