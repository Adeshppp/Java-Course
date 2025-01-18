# JUnit5

## Steps to write unit test
1. Create method to be tested (Method Under Test)
2. Write test method by using @Test annotation.
3. Use assertions to validate the method's output.
4. Run the test and check the result.


In Junit 5, 
we can make test methods public, protected and default.
Test class should be public or default.


## JUnit5 methods:
1. assertEquals(expectedValue, actualValue); : Success when both values are same
2. assertNotEquals(expectedValue, actualValue); : Success when both values are not same
3. assertTrue(boolean condition) : Success when condition returns True
4. assertFalse(boolean condition) : Success when condition returns False
5. assertNull(Object actualObject) : Success when object is null
6. assertNotNull(Object actualObject) : Success when object is not null
7. assertThrows() : Success when code throws an exception
8. assertDoesNotThrows() : 


## JUnit5 Annotations:
1. @DisplayName("new Name of a method or class") : change the name of a function and class by using this annotarion
2. @Disabled : disables the test fucntion or a class

### JUnit Lifecycle Annotations 
1. @BeforeEach : marks a method to execute before each test method
2. @AfterEach : marks a method to execute after each test method
3. @BeforeAll : marks a method to execute before all test methods
4. @AfterAll : marks a method to execute after all test methods

