package com.demo.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App
{
    public static void main( String[] args )
    {  	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
//    	Fetching info from MYSQL DB
        Alien a = em.find(Alien.class,102);
        System.out.println(a);
    	
// 		Inserting records
    	Alien alien =new Alien();
    	alien.setAid(105);
    	alien.setAname("John");
    	em.getTransaction().begin();
    	em.persist(alien);
    	em.getTransaction().commit();
    	
    }
}
