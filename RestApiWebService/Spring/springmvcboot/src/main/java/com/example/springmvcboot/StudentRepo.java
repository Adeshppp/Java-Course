package com.example.springmvcboot;

import com.example.springmvcboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
