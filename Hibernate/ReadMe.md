## ORM : Object Relational Mapping

in this, we map Java object to relational databases. We have few tools to implement that,
1. Hibernate
2. iBatis
3. TopLink



To implement hibernate, we need to use eclipse because intellij community edition does not support jakarta ee to implement hibernate concept.

on eclipse,

To use hibernate we need to install jboss first,
1. search for eclipse marketplace
2. search hibernate in marketpalce
3. From a result list install JBoss Tools

## Hibernate implementation
1. create new maven project by selecting all catalogs and by selecting Archtype by searching "quickstart".
2. right click on project name and select new --> other --> Hibernate(Hibernate Configuration File), select that and click finish

> tip : Make sure that newly created hibernate.cfg.xml file is in src/main/java folder, should not be in any subfolder under that.

Add maven dependancies in pom.xml:
1. hibernate-core : 4.1.6.Final
2. mysql-connector-java : 8.0.33

Provide configuration to hibernate.cfg.xml file

    <?xml version="1.0" encoding="UTF-8"?>
    <!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
                                             "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
    <hibernate-configuration>
     <session-factory name="">
      <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>
      <property name="hibernate.connection.password">password</property>
      <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/Java_course</property>
      <property name="hibernate.connection.username">root</property>
      <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
      <property name="hbm2ddl.auto">create</property>
      <property name="show_sql">true</property>
     </session-factory
    </hibernate-configuration>


adding hbm2ddl.auto propery as 'create', creates a table each time by dropping previously created table with same name if exist and insert a query.
adding hbm2ddl.auto propery as 'update', updates a table and if not exist creates a table and insert a query.


Code example:

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


Operations
1. Saving records to the database : session.save(student);
2. Fetching record from database : session.get(Student.class, PRIMARY_KEY_OF_RECORD);

## Javax Persistence Annotations
1. @Id : Declares a variable as a primary key
2. @Entity : Enables an object of a class to store in database
   * @Entity(table="table_name)
3. @Column(name="column_name) : Changes the name of a column/variable
4. @Table(name="table_name)
5. @Transient : if we declare any variable with @Transient then it won't take that variable as a column in DB.



