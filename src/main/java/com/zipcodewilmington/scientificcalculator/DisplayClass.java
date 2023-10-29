package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.print;
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
    static String integerExtract(String prompt){
        prompt = Console.getStringInput(System.in.toString());
        prompt = prompt.replaceAll("\\D", " ");
        println(prompt);
        return prompt;
    }

    //clears the console display
    public static void clearDisplay(){
        System.out.flush();
    }
}
