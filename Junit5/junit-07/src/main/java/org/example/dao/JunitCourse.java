package org.example.dao;

public class JunitCourse implements Course{
    @Override
    public boolean coursePurchased() {
        System.out.println("JUnit course purchased!");
        return true;
    }
}
