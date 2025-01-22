package com.demo.DemoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App {
    public static void main(String[] args) {
        Student student = new Student(); 
        student.setId(2);
        student.setName("nilesh");
        student.setEmail("nilesh@gmail.com");
        
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
        
        // buildSessionFactory is deprecated so to replace that
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = cfg.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
//        session.save(student); // saving record to DB
        student = (Student) session.get(Student.class, 0); // fetching records from DB
        tx.commit();
        System.out.println(student);
    }
}
