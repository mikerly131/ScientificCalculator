package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.BasicMath;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBasicMath {

    // Debugging tests, drop in method:  System.out.print("test is " + test + " and valid is" + valid);
    @Test
    public void testAddingInts() {
        int test = BasicMath.addNumbers(5, 4);
        int valid = 9;
        assertTrue(test == valid);
        return;
    }

    @Test
    public void testAddingDoubles() {
        double test = BasicMath.addNumbers(5.0, 4.3);
        double valid = 9.3;
        assertTrue(test == valid);
    }

    @Test
    public void testAddingDoubles2() {
        double test = BasicMath.addNumbers(5.37, 4.19283434);
        double valid = 9.56283434;
        assertTrue(test == valid);
    }


    @Test
    public void testDividingInts() {
        int test = BasicMath.divideNumbers(12, 4);
        int valid = 3;
        assertTrue(test == valid);
    }

    @Test
    public void testDividingDoubles() {
        double test = BasicMath.divideNumbers(9.0, 4.0);
        double valid = 2.25;
        assertTrue(test == valid);
    }

    @Test
    public void testDividingDoubles2() {
        double test = BasicMath.divideNumbers(10.0, 3.0);
        System.out.print(test);
        double valid = 3.33333333;
        assertTrue(test == valid);
    }

    @Test
    public void testMultiplyInts() {
        int test = BasicMath.multiplyNumbers(10, 4);
        int valid = 40;
        assertTrue(test == valid);
    }

    @Test
    public void testMultiplyDoubles() {
        double test = BasicMath.multiplyNumbers(9.00, 4.0);
        double valid = 36.0;
        assertTrue(test == valid);
    }

    @Test
    public void testMultiplyDoubles2() {
        double test = BasicMath.multiplyNumbers(2.25, 4.0);
        double valid = 9.0;
        assertTrue(test == valid);
    }

    @Test
    public void testMultiplyDoubles3() {
        double test = BasicMath.multiplyNumbers(3.333, 3.3333339);
        double valid = 11.11000189;
        assertTrue(test == valid);
    }

    @Test
    public void testSubtractingInts() {
        int test = BasicMath.subtractNumbers(12, 4);
        int valid = 8;
        assertTrue(test == valid);
        return;
    }

    @Test
    public void testSubtractingDoubles() {
        double test = BasicMath.subtractNumbers(12.0, 5.0);
        double valid = 7.0;
        assertTrue(test == valid);
    }

    @Test
    public void testSubtractingDoubles2() {
        double test = BasicMath.subtractNumbers(12.333, 4.0005);
        double valid = 8.3325;
        assertTrue(test == valid);
    }

}
