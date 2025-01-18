package test.com.demo.learning;

import main.com.demo.learning.ReverseString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    void reverseStringTestOneWord() {

        assertEquals("avaJ",reverseString.reverseString("Java"));
        assertEquals("neilA",reverseString.reverseString("Alien"),"not matching");
    }

    @Test
    void reverseStringTestMultipleWords(){
        assertEquals("ysaE si AVAJ", reverseString.reverseString("JAVA is Easy"));
    }
}
