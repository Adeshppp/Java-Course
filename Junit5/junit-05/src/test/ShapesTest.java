package test;

import main.Shapes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapesTest {

    @Test
    void testComputesquareArea() {
        Shapes shapes = new Shapes();
        assertEquals(25,shapes.computesquareArea(5));
    }


    @Test
    void computeCircleArea() {
        Shapes shapes = new Shapes();
        double actual = shapes.computeCircleArea(5);
        assertEquals(78.5, actual);
    }
}
