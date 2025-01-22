package com.demo.DemoHibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Student student = new Student(); 
        student.setId(1);
        student.setName("Adesh");
        student.setEmail("adesh@gmail.com");
        student.setAge(25);
        
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
    }
}
