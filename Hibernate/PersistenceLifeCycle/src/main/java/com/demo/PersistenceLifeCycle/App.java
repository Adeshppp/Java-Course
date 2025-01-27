package com.demo.PersistenceLifeCycle;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {    	
	      Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
	      ServiceRegistry seg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	      SessionFactory sf = config.buildSessionFactory(seg);
	      Session session = sf.openSession();
	      session.beginTransaction();
	      
	      // inserting data
//	      Random r = new Random();
//	      for(int i=0;i<50;i++) {
//	    	  Laptop laptop = new Laptop();
//	    	  laptop.setLid(i);
//	    	  laptop.setBrand("Brand "+i);
//	    	  laptop.setPrice((int)(1000+Math.pow(i, 3)));
//	    	  session.save(laptop);
//
//	      }     
	      
	      Laptop laptop = new Laptop();
	      // Entering transient state
//	      laptop.setLid(51);
//	      laptop.setBrand("Apple mac pro");
//	      laptop.setPrice(1800);
//	      session.save(laptop); // Entering Persistence state
//	      laptop.setPrice(1550); // updating value in DB also
//	      session.delete(laptop); // Entering removed state
//	      session.getTransaction().commit();
//	      
//	      session.evict(laptop); // entering in Detached state
//	      laptop.setPrice(1400); // this value won't get updated in DB
	      
	      
	      

	      Laptop lap1 = (Laptop) session.load(Laptop.class, 50);
	      System.out.println(lap1);
	      System.out.println("calling get");
	      Laptop lap = (Laptop) session.get(Laptop.class, 50);
	      System.out.println(lap);
	      
	      session.close();
	        
    }
}
