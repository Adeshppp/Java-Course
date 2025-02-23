package org.example;

public class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age Assigned");
        this.age = age;
    }

    public void code(){
        System.out.println("coding...");
    }
}
