package test;

import main.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString reverseString = new ReverseString();
        String result = reverseString.reverseString("ABC");
        assertEquals("CBA",result);
    }
}

