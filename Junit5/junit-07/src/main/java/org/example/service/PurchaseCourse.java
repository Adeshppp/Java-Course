package org.example.service;

import org.example.dao.Course;

public class PurchaseCourse {

    private Course course;

    public boolean proceedWithCourse(Course course){
        return course.coursePurchased();
    }
}
