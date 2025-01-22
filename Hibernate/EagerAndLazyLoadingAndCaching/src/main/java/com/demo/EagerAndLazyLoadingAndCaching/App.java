package com.demo.EagerAndLazyLoadingAndCaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//      Insert data into database
//        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
//        ServiceRegistry seg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
//        SessionFactory sf = config.buildSessionFactory(seg);
//        Session session = sf.openSession();
//        Transaction tx = session.beginTransaction();
        
               
//      Alien alien = new Alien();
//      alien.setAid(106);
//      alien.setAname("Abhi");
//      
//      Laptop laptop = new Laptop();
//      laptop.setLid(8);
//      laptop.setBrand("Macbook pro");
//      laptop.setPrice(10000);
//      alien.getLaptop().add(laptop);
//      laptop.setAlien(alien);

//        session.save(laptop);
//        session.save(alien);
//
//        tx.commit();
//        
    	
    	
    	// fetch data from DB
        Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();
        
        Alien a1 = (Alien) session.get(Alien.class, 101);
        System.out.println(a1);

        Transaction tx = session.beginTransaction();

        tx.commit();
        
               

    }
}
