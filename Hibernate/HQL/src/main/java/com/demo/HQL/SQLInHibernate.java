package com.demo.HQL;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SQLInHibernate {

    public static void main( String[] args )
    {
  	
      Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
      ServiceRegistry seg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
      SessionFactory sf = config.buildSessionFactory(seg);
      Session session = sf.openSession();
      session.beginTransaction();
      
      
      // fetching all records
//      SQLQuery query = session.createSQLQuery("select * from student where rollNo>40");
//      query.addEntity(Student.class);
//      List<Student> students = query.list();
//      
//      for(Student student: students) {
//    	  System.out.println(student);
//      }
      
      // fetching specific records
      
      SQLQuery query = session.createSQLQuery("select name, marks from student where rollNo>40");
      query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP); // TRANSFORM RESULT IN MAP FORMAT
      List students = query.list();
      
      for(Object student: students) {
    	  Map map =(Map)student;
    	  System.out.println(map.get("name")+" : "+map.get("marks"));
      }
      session.getTransaction().commit();
      session.close();
        


    }
}