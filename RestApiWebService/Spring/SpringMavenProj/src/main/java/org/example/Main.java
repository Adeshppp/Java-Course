package org.example;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main(String[] args) {

        // by using bean factory
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        Student student1 = (Student) factory.getBean("student");
        student1.code();

        System.out.println(student1.getAge());


        // by using application context
//        ApplicationContext context = new ClassPathXmlApplicationContext("src/main/spring.xml");
//
//        Student student1 = (Student) context.getBean("student");
//        student1.code();
//        student1.age = 18;
//        System.out.println(student1.age);
//
//        Student student2 = (Student) context.getBean("student");
//        System.out.println(student2.age);

    }
}
