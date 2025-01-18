package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void divide() {
        Calc calc = new Calc();
        int result = calc.divide(10,5);
        assertEquals(2, result);
    }
}
