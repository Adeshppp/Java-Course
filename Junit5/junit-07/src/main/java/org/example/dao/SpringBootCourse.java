package org.example.dao;

public class SpringBootCourse implements Course{

    @Override
    public boolean coursePurchased() {
        System.out.println("Springboot course purchased!");
        return true;
    }
}
