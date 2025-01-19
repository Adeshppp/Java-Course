package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueTest {

    @Test
    void test(){
        String str = "Junit5";
        assertTrue(str.length()>5,"Length of a string is not more than 5");
        assertFalse(str.length()<5,"Length of a string is not less than 5");
    }

}
