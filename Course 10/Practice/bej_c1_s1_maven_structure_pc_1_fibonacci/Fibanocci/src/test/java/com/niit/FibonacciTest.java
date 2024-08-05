package com.niit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class FibonacciTest {
    private Fibonacci fibonacci;
    int[] expectedOutput;
    int[] result;
    @Before
    public void setUp() {
        // Initialize the instance before each test
        fibonacci = new Fibonacci();
        expectedOutput = new int[]{0, 1, 1, 2, 3, 5};
    }
    @Test
    public void testGenerateSeries() {
       result = fibonacci.generateSeries(6);
       assertArrayEquals(expectedOutput, result);
    }



}
