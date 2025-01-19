package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAssertTrue {

    @Test
    void Test(){
        String str = "Junit";
        assertTrue(str.equals("Junit"));
    }

}
