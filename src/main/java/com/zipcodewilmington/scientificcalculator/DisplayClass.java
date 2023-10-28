package com.zipcodewilmington.scientificcalculator;

import static com.zipcodewilmington.scientificcalculator.Console.print;
import static com.zipcodewilmington.scientificcalculator.Console.println;

public class DisplayClass {
    public static Integer stringToInt(String prompt){
        println(prompt);
        Integer strInt;
        try {
           strInt = Integer.parseInt(Console.getStringInput(System.in.toString()));
           System.out.println(strInt);
        }catch(NumberFormatException e){
        println("invalid num");
        }
        return strInt;
    }
}
