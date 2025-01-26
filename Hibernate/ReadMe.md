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


adding hbm2ddl.auto propery as 'create', creates a table each time by dropping previously created table with same name if exist and insert a query.\
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
6. @Embeddable : When there are 2 POJO classes and one of them is entity and another one is used as a type to one of the columns in entity class then on that type class we can add @Embeddable annotation whcih merges that class into entity class table , basically it does not create another table, but add new fields in that table.



## Hibernate Mapping Relations

1. One to One : @OneToOne : if we use this annotation above a variable in class then that class table will have extra column with primary key of another class to which we are trying to join it with
2. One to Many : @OneToMany : if we use this annotation above a variable in class then it will simply create another table for mapping
3. Many to One : @ManyToOne : if we use this annotation above a variable in class then it will simply add a column of primary key of another table for mapping
4. Many to Many : @ManyToMany : many to many relationship in this, we should use mappedBy syntax in order to create just one mapping table.

@OneTeMany(mappedBy="student") : will not create a table and will depend on another table for mapping 


## Fetch : Eager and Lazy

Eager and lazy loading is a technique to load the dependent objects, by default it is lazy but we can declare it to use eager loading like below

> 	@OneToMany(mappedBy="alien", fetch=FetchType.EAGER)


## Hibernate Caching

Hibernate provides a default caching mechanism which works at level 1 caching and it is limited to a single session, means 2 different sessions can not use that same cache.

### Level 1 Cache:

in same session if we make two requests to databse, what iot will do is that, query databse once and shows the result for both the queries without making another query to database.


### Level 2 Cache
There are level 2 cache, which can be used by 2 different sessions. and provided by third parties:
1. ehcache
2. os
3. swarm
   
to use ehcache:
1. Add maven dependancy : ehcache (provides caching feature) 
   1. hibernate-ehcache : 4.1.6.Final  (same as hibernate version we are working with) : provides integration between ehcache and hibernate
   2. ehcache : 3.10.8
2. Add properties to hibernate.cfg.xml file
   1.     <property name="hibernate.cache.use_second_level_cache">true</property>
   2.     <property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>
3. Change entity by adding few annotations:
   1. @Cachable
   2. @Cache(usage=CacheConcurrencyStrategy.READ_ONLY)


## Hibernate Query Language (HQL)

As we know in hibernate we have methods like session.get(Student.class, 15); and session.save(obj) to perform operations.\
but as we can see in get operation we provide class name and primary key as argument. in this it returns a record.\
but what if we want to fetch particular record and particular field from that record, there HQL comes in picture.\
HQL is similar to SQL.\

in SQL
> select * from student

in HQL
> from Student


in JDBC, when we do get operation at that we have to store that result in resultSet unlike in HQL it returns a List.\

We can also simply use SQL in hibernate by using native query.

in Hibernate in order to create a query and execute it we can use below code:

### To save data
      session.save(student);

### Fetching data from DB
      Query q = session.createQuery("from Student");
      List<Student> students = q.list();
      for(Student s : students) System.out.println(s);

we can simply import Query as below
> import org.hibernate.Query;

 and can use list() method to receive all records.
### Fetching specific record

      Query q = session.createQuery("from Student where rollNo = 40");
      Student s = (Student) q.uniqueResult();
      System.out.println(s);

and can use uniqueResult() while fetching single record.

### Positional Parameter
      int rollNo = 40;
      Query q = session.createQuery("select sum(marks) from Student where rollNo > :rollNo");
      q.setParameter("rollNo ", rollNo);
      Long s = (Long) q.uniqueResult();
      System.out.println(s);


## SQL in Hibernate (Native Query)

in order to use SQL in hibernate we have to use below method:

      SQLQuery query = session.createSQLQuery("select * from student where rollNo>40");
      query.addEntity(Student.class);
      List<Student> students = query.list();

      for(Student student: students) {
    	  System.out.println(student);
      }

to use HQL, we use createQuery()\
to use SQL, we use createSQLQuery()

and If we are fetching multiple records then returned result will be a list of Objects, and we need to map it to a particular class Student in above example by using
> query.addEntity(Student.class);

otherwise it will show hex representation of each record.


### Fetching Specific Records
      SQLQuery query = session.createSQLQuery("select name, marks from student where rollNo>40");
      query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP); // TRANSFORM RESULT IN MAP FORMAT
      List students = query.list();

      for(Object student: students) {
    	  Map map =(Map)student;
    	  System.out.println(map.get("name")+" : "+map.get("marks"));
      }


## Hibernate Object States / Persistence Life Cycle

In java, when we create a object by using 'new' keyword it makes a space in heap memory and when we done using it or when we assign 'null' to it, it is available for garbage collector to clear that space. \
Hibernate works exactly at middle.
it provides 4 states:
1. Transient : when we create an object and assign a value to it, at that time it is in Transient state.
2. Persistent : when we perform save() or persist() operation on that object it gets saved to DB and later if you make any changes to that object, then same changes will get reflected in to database.
3. Detached : if we use detach() method on that object, then it stops to reflect changes to database records.
4. Removed : from persistance stage, if we do remove() operation, then it will remove that record/object from DB but at your application means in java that object remains as it is.

Objects can enter in garbage collection stage from Transient, Removed and Detached stage, not from Persistent stage.


      public class App{
         public static void main( String[] args ){    	
            Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
            ServiceRegistry seg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            SessionFactory sf = config.buildSessionFactory(seg);
            Session session = sf.openSession();
            session.beginTransaction();
            Laptop laptop = new Laptop();

            // Entering transient state
            laptop.setLid(50);
            laptop.setBrand("Apple");
            laptop.setPrice(1500);

            session.save(laptop); // Entering Persistence state

            laptop.setPrice(1550); // updating value in DB also

            session.delete(laptop); // Entering removed state

            session.getTransaction().commit();

            session.evict(laptop); // entering in Detached state

            laptop.setPrice(1400); // this value won't get updated in DB

            session.close();
	        
         }
      }

>Hibernate: insert into Laptop (brand, price, lid) values (?, ?, ?)\
> Hibernate: update Laptop set brand=?, price=? where lid=?


as you can see in console statement, it shoots 2 queries first to post the data to DB and another one to update it without we doing any additional operation except updating it.
because it is in persistence state.
