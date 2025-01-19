package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraysTesting {

    @Test
    void testArrays(){
        int[] expected = {2,3,4,6};
        int[] actual = {2,4,6,3};
        Arrays.sort(actual);
//        assertEquals(expected,actual);
        assertArrayEquals(expected, actual);
    }
}
