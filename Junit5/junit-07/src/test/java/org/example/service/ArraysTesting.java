package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTesting {

    @Test
    void testArrays(){
        int[] expected = {2,4,6,8};
        int[] actual = {2,4,6,3};
        assertArrayEquals(expected, actual);
    }
}
