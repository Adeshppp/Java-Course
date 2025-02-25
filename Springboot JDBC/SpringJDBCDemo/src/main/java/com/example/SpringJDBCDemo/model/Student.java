package com.example.SpringJDBCDemo.model;


import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@Component
@Scope("prototype")
public class Student {
    private int id;
    private String name;
    private String tech;
}
