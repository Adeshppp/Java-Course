package org.example.service;

import org.example.dao.JavaCourse;
import org.example.dao.JunitCourse;
import org.example.dao.SpringBootCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PurchaseCourseTest {

    @Test
    void proceedWithCourse() {
        PurchaseCourse purchaseCourse = new PurchaseCourse();
        assertTrue(purchaseCourse.proceedWithCourse(new JavaCourse()));
        assertTrue(purchaseCourse.proceedWithCourse(new JunitCourse()));
        assertTrue(purchaseCourse.proceedWithCourse(new SpringBootCourse()));
    }
}
