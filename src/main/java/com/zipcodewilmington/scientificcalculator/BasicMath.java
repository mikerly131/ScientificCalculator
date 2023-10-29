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

    // Method to divide two ints, one from display and one from input.  Should we display remainders?
    public static int divideNumbers(int displayNumber, int givenNumber) {
        int divideNumbers = displayNumber / givenNumber;
        return divideNumbers;
    }

    public static int getRemainders(int displayNumber, int givenNumber) {
        int remainders = displayNumber % givenNumber;
        return remainders;
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

    public static int square(int displayNumber) {
        int sq = displayNumber * displayNumber;
        return sq;
    }

    public static double square(double displayNumber) {
        double sq = displayNumber * displayNumber;
        return sq;
    }

    public static double squareRoot(int displayNumber) {
        double squareRoot = Math.sqrt((double)displayNumber);
        return squareRoot;
    }

    public static double squareRoot(double displayNumber) {
        double squareRoot = Math.sqrt((double)displayNumber);
        squareRoot = Math.round(squareRoot * 10000000) / 10000000.0;
        return squareRoot;
    }



}
