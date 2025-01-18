package org.example.annotations;

import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeforeEachDemoTest {

    private Calculator calculator;

    @BeforeEach
    void testSetup(){
        calculator = new Calculator();
    }
    @Test
    void add() {
        int result = calculator.add(3,4);
        assertEquals(7, result);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(3,4);
        assertEquals(-1, result);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(3,4);
        assertEquals(12, result);
    }

    @Test
    void divide() {
        int result = calculator.divide(3,4);
        assertEquals(0, result);
    }
}
