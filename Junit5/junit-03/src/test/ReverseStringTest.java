package test;

import main.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @Test
    void reverseString() {
        ReverseString reverseString = new ReverseString();
        String actual = reverseString.reverseString("Java");
        assertEquals("avaJ",reverseString.reverseString("Java"));
        assertEquals("neilA",reverseString.reverseString("Alien"));

    }
}
