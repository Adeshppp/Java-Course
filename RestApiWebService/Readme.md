REST : Representational State Transfer

<img width="717" alt="Image" src="https://github.com/user-attachments/assets/e569f2ed-d9cd-4312-b4e0-933b643d4fa9" />


Transfering state to the client in form of XML or JSON instead of transferring html page.


CRUD Operations on resource.


E : Create => POST\
R : Read => GET\
U : Update => PUT\
D : Delete => DELETE

How to implement REST?
1. jersey
2. Spring implementation of REST

## Jersey project (Eclipse IDE)

1. Configure Tomcat server (using version 10.1)
2. new
3. maven project 
4. select workspace : select archtype by searching jersey in filter and look for jersey-quickstart-webapp by glassfish and select finish
5. assign a server:
   1. right click on project and select properties
   2. Select Targeted Runtime and select a server and hit finish


### Annotations:

#### Class Level Annotations:
1. @XmlRootElement : to declare POJO class as a root element
2. @Path("aliens") : to declare a path to the resource

#### Method Level Annotations:
1. @GET : method level annotation used to handle get requests
2. @Produces(MediaType.APPLICATION_XML) : to declare a return type


#### Dependancies
1. jakarta.servlet-api : 5.0.0
2. jakarta.xml.bind-api : 3.0.1
3. jaxb-runtime : 3.0.2
4. jersey : 4.0.0-M2


Alien.java:

      package com.demo.demorest;
      
      import jakarta.xml.bind.annotation.XmlRootElement;
      
      @XmlRootElement
      public class Alien {

         private String name;
         private int points;
         
         public String getName() {
           return name;
         }
         public void setName(String name) {
           this.name = name;
         }
         public int getPoints() {
           return points;
         }
         public void setPoints(int points) {
           this.points = points;
         }
      }

AlienResource.java:

      package com.demo.demorest;
      
      import jakarta.ws.rs.GET;
      import jakarta.ws.rs.Path;
      import jakarta.ws.rs.Produces;
      import jakarta.ws.rs.core.MediaType;
      
      @Path("aliens")
      public class AlienResource {

         @GET
         @Produces(MediaType.APPLICATION_XML)
         public Alien getAlien() {
            System.out.println("get Alien called");
            Alien a = new Alien();
            a.setName("Adesh");
            a.setPoints(90);
            return a;
         }
      }


