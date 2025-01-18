# JUnit5

## Steps to write unit test
1. Create method to be tested (Method Under Test)
2. Write test method by using @Test annotation.
3. Use assertions to validate the method's output.
4. Run the test and check the result.


In Junit 5, 
we can make test methods public, protected and default.
Test class should be public or default.


JUnit5 methods:
1. assertEquals(expectedValue, actualValue); : Success when both values are same
2. assertTrue(boolean condition) : Success when condition returns True
3. assertFalse(boolean condition) : Success when condition returns False
4. assertNull(Object actualObject) : Success when object is null
5. assertNotNull(Object actualObject) : Success when object is not null
6. 
