package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ShapeTest {
    Shapes shape = new Shapes();

    @Test
    void computeSquareArea() {
        assertEquals(576, shape.computeSquareArea(24));
        assertNotEquals(577, shape.computeSquareArea(24));
    }

    @Test
    void computeCircleArea() {
        assertEquals(78.5, shape.computeCircleArea(5),"Area of circle calculation is wrong.");
        assertNotEquals(78.5, shape.computeCircleArea(5),"Area of circle calculation is not wrong.");
    }
    @Test
    void computeCircleAreaByUsingSupplier() {
        assertEquals(78.5, shape.computeCircleArea(5),()->"Area of circle calculation is wrong.");
        assertNotEquals(78.5, shape.computeCircleArea(5),()->"Area of circle calculation is not wrong.");

    }
}
