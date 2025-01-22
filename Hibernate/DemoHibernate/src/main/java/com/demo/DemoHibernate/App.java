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
        student.setId(1);
        student.setName("adesh");
        student.setEmail("adesh@gmail.com");
        student.setAge(25);
        
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
        
        // buildSessionFactory is deprecated so to replace that
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = cfg.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
    }
}
