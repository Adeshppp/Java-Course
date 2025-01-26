package com.demo.HQL;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
  	
    	
    	
// Hibernate Caching Level 1
    	

    	
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
        ServiceRegistry seg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
      SessionFactory sf = config.buildSessionFactory(seg);
      Session session = sf.openSession();
      session.beginTransaction();
      Random r = new Random();
      
      
//      insert data into postgreSQL DB.
      
//      for(int i=0;i<50;i++) {
//    	  Student student = new Student();
//    	  student.setRollNo(i);
//    	  student.setName("name "+i);
//    	  student.setMarks(r.nextInt());
//    	  session.save(student);
//    	  
//      }
      
      // fetching data from DB
      
//      Query q = session.createQuery("from Student");
//      List<Student> students = q.list();
//      for(Student s : students) System.out.println(s);
//      
//      session.getTransaction().commit();
//      session.close();
      
      //fetching specific record

      Query q = session.createQuery("from Student where rollNo = 40");
      Student s = (Student) q.uniqueResult();
      System.out.println(s);
      
      session.getTransaction().commit();
      session.close();
        


    }
}