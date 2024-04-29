package org.example;
import org.junit.*;


import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }
    @Test
    public void testAdd(){
        assertEquals( "Regular Addition should work",
                calculator.add(4,5),9);
    }


    @Test
    public void testSubtract(){
        assertEquals( "Regular Subtraction should work",
                calculator.subtract(8,3),5);
        assertEquals( "Regular Subtraction should work",
                calculator.subtract(3,8),-5);
    }

    @Test
    public void testMultiply() {
        assertEquals( "Regular multiplication should work",
                calculator.multiply(4,5), 20);
    }

    @Test
    public void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero",0,
                calculator.multiply(0,5));
        assertEquals("Multiple with zero should be zero", 0,
                calculator.multiply(5,0));
    }

    @Test
    public void testDivide(){
        assertEquals( "Regular division should work",2.0,
                calculator.divide(10,5), 2.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideWithZero() {
        calculator.divide(10, 0);
    }

}



