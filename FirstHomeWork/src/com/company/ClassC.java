package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class ClassC {
    int a;
    int b;
    int c;

    public void AssignValuesToClassFields() {
        var userInput  =  new Scanner(System.in);
        out.println("Enter three numbers separated with ';': ");
        String[] userInputSplitArray = userInput.next().split(";");
        Integer[] toIntegerArray = new Integer[3];
        for (var i =0; i < toIntegerArray.length; i++ ) {

            toIntegerArray[i] = Integer.parseInt(userInputSplitArray[i]);
        }
        a = toIntegerArray[0];
        b = toIntegerArray[1];
        c = toIntegerArray[2];

    }

    public int  LastNumberFromAField() {
            var intToStringValues = Integer.toString(a).split("");
            out.println("Last Value from Field A is : " + intToStringValues[intToStringValues.length -1]);
        return Integer.parseInt(intToStringValues[intToStringValues.length - 1]);
    }
    public int  FirstNumberFromBField() {
        var intToStringValues = Integer.toString(b).split("");
        out.println("First Value from Field B is : " + intToStringValues[0]);
        return Integer.parseInt(intToStringValues[0]);
    }
    public void  SumOfIntegerValuesFromCField() {
        var intToStringValues = Integer.toString(c).split("");
        var Sum = 0;
        for (var i =0; i < intToStringValues.length; i++) {
            Sum += Integer.parseInt(intToStringValues[i]);
        }
        out.println("Sum Of Values from Field C is: " + Sum);
    }

    public int MultiplicationOfReturnedValues(int x, int y) {
        var value = x * y;
        out.println("Multiplication of returned Values is : " + value);
        return value;
    }

    public int SumOfReturnedValues(int x, int y) {
        var value = x  + y;
        out.println("Sum of returned values is : " + value);
        return value;
    }
}

