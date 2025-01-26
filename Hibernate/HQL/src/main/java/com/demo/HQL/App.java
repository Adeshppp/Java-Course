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

//      Query q = session.createQuery("from Student where rollNo = 40");
//      Student s = (Student) q.uniqueResult();
//      System.out.println(s);
//      
//      q = session.createQuery("select rollNo,name,marks from Student where rollNo = 40");
//      Object[] student =  (Object[]) q.uniqueResult();
//      for(Object o: student) {
//    	  System.out.println(o);   
//      }
//      System.out.println(student[0]+" : "+student[1]+" : "+student[2]);
      
      
      // positional parameter
      int rollNo = 40;
      Query q = session.createQuery("select sum(marks) from Student where rollNo > :rollNo");
      q.setParameter("rollNo ", rollNo);
      Long s = (Long) q.uniqueResult();
      System.out.println(s);
      
     
      session.getTransaction().commit();
      session.close();
        


    }
}