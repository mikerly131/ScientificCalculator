package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.println;

public class DisplayClass {
    //trying to convert input string into ints/doubles/ and chars
   /* public static Integer stringToInt(String prompt){
        println(prompt);
        Integer strInt;
        try {
           strInt = Integer.parseInt(Console.getStringInput(System.in.toString()));
           System.out.println(strInt);
        }catch(NumberFormatException e){
        println("invalid num");
        }
        return strInt;
    }*/
    //integerExtract - converts user input into a string and then extracts the numerical values
    /*static String integerExtract(String prompt){
        prompt = Console.getStringInput(System.in.toString());
        prompt = prompt.replaceAll("\\D", " ");
        println(prompt);
        return prompt;
    }*/
    //Extracts two numerical values from string and converts to double
    public static void integerExtractor(){
        String intExtract = Console.getStringInput(System.in.toString());
        intExtract = intExtract.replaceAll("\\D", " ");
        //split string
        String[] intExtractArr = intExtract.split("\\s+", 2);
        //converts string arr values into ints
        Double givenNum = Double.parseDouble(intExtractArr[0]);
        Double givenNum2 = Double.parseDouble(intExtractArr[1]);
        System.out.println(givenNum);
        System.out.println(givenNum2);
    }
    //clears the console display
    public static void clearDisplay(){
        System.out.flush();
    }
}
