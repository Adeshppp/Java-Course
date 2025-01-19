package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAfter {
    Shapes shapes;

    // constructor
    TestBeforeAfter() {
        System.out.println("Test object created");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        shapes = new Shapes();
        System.out.println("Before test");
    }

    @Test
    void testComputeSquareArea() {
        assertEquals(25, shapes.computesquareArea(5));
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(78.5, shapes.computeCircleArea(5));
    }

    @AfterEach
    void destroy() {
        System.out.println("After test clean up");
    }

    @AfterAll
    void afterAll() {
        System.out.println("After all tests");
    }
}

