package com.example.SpringBootRest;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private int points;
}
