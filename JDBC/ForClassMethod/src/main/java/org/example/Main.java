package org.example;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        A a  = new A();
        Class.forName("A"); // executes static block

    }
}


class A{
    static {
        System.out.println("Static block of class A");
    }

    // instance block
    {
        System.out.println("Instance block of class A");
    }
}

