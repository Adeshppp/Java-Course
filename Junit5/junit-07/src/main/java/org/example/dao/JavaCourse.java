package org.example.dao;

public class JavaCourse implements Course{
    @Override
    public boolean coursePurchased() {
        System.out.println("Java course purchased!");
        return true;
    }
}
