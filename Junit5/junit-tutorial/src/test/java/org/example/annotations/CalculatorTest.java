package org.example.annotations;

import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Calculator operations test")
class CalculatorTest {

    @DisplayName("Addition operation")
    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5,6);
        assertEquals(11, result);
    }

    @DisplayName("Subtraction operation I can put emojis as a name \uD83D\uDE01")
    @Test
    void subtract() {
    }

    @DisplayName("Multiply operation")
    @Test
    void multiply() {
    }

    @DisplayName("Divide operation")
    @Test
    void divide() {
    }
}
