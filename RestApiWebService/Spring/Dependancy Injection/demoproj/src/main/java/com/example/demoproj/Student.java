package com.example.demoproj;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    Laptop laptop;

    public void code() {
        laptop.compile();
    }
}
