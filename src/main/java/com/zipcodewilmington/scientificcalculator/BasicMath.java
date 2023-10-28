package com.zipcodewilmington.scientificcalculator;

public class BasicMath {

    // Overloaded Method to add two numbers:  ints, doubles, or mixed with either return
    public static int addNumbers(int displayNumber, int givenNumber) {
        int addNumbers = displayNumber + givenNumber;
        return addNumbers;
    }

    public static double addNumbers(double displayNumber, double givenNumber) {
        double addNumbers = displayNumber + givenNumber;
        return addNumbers;
    }

    /*  additional adding methods if inputs are mixed
    public static double addNumbers(double displayNumber, int givenNumber) {
        double addNumbers = displayNumber + givenNumber;
        return addNumbers;
    }

    public static double addNumbers(int displayNumber, double givenNumber) {
        double addNumbers = displayNumber + givenNumber;
        return addNumbers;
    }
*/


    // Method to divide two ints, one from display and one from input.  Should we display remainders?
    public static int divideNumbers(int displayNumber, int givenNumber) {
        int divideNumbers = displayNumber / givenNumber;
        return divideNumbers;
    }

    public static double divideNumbers(double displayNumber, double givenNumber) {
        double divideNumbers = displayNumber / givenNumber;
        divideNumbers = Math.round(divideNumbers * 100000000) / 100000000.0;
        return divideNumbers;
    }

    public static int multiplyNumbers(int displayNumber, int givenNumber) {
        int multiplyNumbers = displayNumber * givenNumber;
        return multiplyNumbers;
    }

    public static double multiplyNumbers(double displayNumber, double givenNumber) {
        double multiplyNumbers = displayNumber * givenNumber;
        multiplyNumbers = Math.round(multiplyNumbers * 100000000) / 100000000.0;
        return multiplyNumbers;
    }


    public static int subtractNumbers(int displayNumber, int givenNumber) {
        int subtractedNumbers = displayNumber - givenNumber;
        return subtractedNumbers;
    }

    public static double subtractNumbers(double displayNumber, double givenNumber) {
        double subtractedNumbers = displayNumber - givenNumber;
        return subtractedNumbers;
    }

}
