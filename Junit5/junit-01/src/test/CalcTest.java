package test;

import Main.Calc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalcTest {

    @Test
    void divide() {
        Calc calc = new Calc();
        int actualAns = calc.divide(10, 2);
        assertEquals(5,actualAns);
    }
}
