package com.example.springmvcboot;

import com.example.springmvcboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByName(String name);

    // Query DSL
    List<Student> findByNameOrderById(String name);
    List<Student> findByNameOrderByIdDesc(String name);


    @Query("from Student where name = :name")
    List<Student> find(@Param("name") String name);
}
