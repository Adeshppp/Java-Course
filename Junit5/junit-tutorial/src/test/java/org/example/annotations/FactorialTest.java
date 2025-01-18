package org.example.annotations;

import org.example.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void factorial() {
        Factorial fact = new Factorial();
        int actualResult = fact.factorial(5);
        assertEquals(120, actualResult);
    }
}
