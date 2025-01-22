package com.demo.HibernateRelations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
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
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("dell");
        
        Student student = new Student();
        student.setName("Adesh");
        student.setRollNo(1);
        student.setMarks(99);
        student.getLaptop().add(laptop);
        
        laptop.getStudent().add(student);
        	

        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry seg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(seg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        session.save(laptop);
        tx.commit();
        
        
        
    }
}
