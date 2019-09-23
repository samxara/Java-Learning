package com.company;

import java.util.*;

public class FirstclassWork {


    // სათითაოდ განაკომენტარეთ გამოძახების მხარე. :)
    public static void main(String[] args) {
        //ClassWorkNumberOne();
        //ClassWorkNumberTwo();
        //ClassWorkNumberThree();
        //ClassWorkNumberFour();
        //ClassWorkNumberFive();
        //ClassWorkNumberSix();
        //ClassWorkNumberSeven();
        //ClassWorkNumberEight(0,100);
        //ClassWorkNumberNine(100);
        //ClassWorkNumberTen(100);
        //ClassWorkNumberEleven(100);
        //ClassWorkNumberTwelve(100);

    }

    static void ClassWorkNumberOne() {
        var allWordsCombined = new String[]{"C++", "C#", "java", "pascal", "php", "JavaScript"};
        for (var word : allWordsCombined) {
            System.out.println(word);
        }

    }

    static void ClassWorkNumberTwo() {
        var input = new Scanner(System.in);
        System.out.print("enter two integers separated with ';'");
        var twoNumbers = input.next().split(";");
        List<Integer> intArray = new ArrayList<Integer>();
        for (var number :
                twoNumbers) {
            var parsedNumber = Integer.parseInt(number);
            intArray.add(parsedNumber);
        }
        System.out.println(intArray.get(0) / intArray.get(1));

    }

    static void ClassWorkNumberThree() {
        var input = new Scanner(System.in);
        System.out.print("enter three integers separated with ';': ");
        var threeNumbers = input.next().split(";");
        List<Integer> intArray = new ArrayList<Integer>();
        for (var number :
                threeNumbers) {
            var parsedNumber = Integer.parseInt(number);
            intArray.add(parsedNumber);
        }
        System.out.println(intArray.get(0) * intArray.get(1) * intArray.get(2));
        System.out.println(intArray.get(0) + intArray.get(1) + intArray.get(2));
    }

    static void ClassWorkNumberFour() {
        var input = new Scanner(System.in);
        System.out.print("enter 3-digit integer: ");
        var stringInput = input.next();
        if (stringInput.length() > 3) {
            System.out.println("Three digit number only!");
        } else {
            var result = new Integer[stringInput.length()];
            for (var i = 0; i < stringInput.length(); i++) {
                result[i] = Integer.parseInt(stringInput.charAt(i) + "");
                System.out.println(result[i]);
            }
        }
    }

    static void ClassWorkNumberFive() {
        var input = new Scanner(System.in);
        System.out.print("enter 4-digit integer: ");
        var stringInput = input.next();
        if (stringInput.length() != 4) {
            System.out.println("Four digit number only!");
        } else {
            var intArray = new Integer[stringInput.length()];
            for (var i = 0; i < stringInput.length(); i++) {
                intArray[i] = Integer.parseInt(stringInput.charAt(i) + "");
            }
            var Sum = 0;
            for (var number :
                    intArray) {
                Sum += number;

            }
            System.out.println(Sum);
        }
    }

    static void ClassWorkNumberSix() {
        var input = new Scanner(System.in);
        System.out.print("enter any integer: ");
        var stringInput = input.next();
        var intArray = new Integer[stringInput.length()];
        for (var i = 0; i < stringInput.length(); i++) {
            intArray[i] = Integer.parseInt(stringInput.charAt(i) + "");
        }
        var Sum = 0;
        for (var number :
                intArray) {
            Sum += number;
        }
        System.out.println("Total sum: " + Sum);
    }

    static void ClassWorkNumberSeven() {
         // Euclidean Algorith,, :D
    }

    static void ClassWorkNumberEight(int startNumber, int EndNumber) {

        for (var i = startNumber; i < EndNumber ; i ++ ) System.out.println(i);
    }

    static void ClassWorkNumberNine(int maxArrayNumberLimitToBeBound) {
        var intArray = new Integer[8];
        var random = new Random();


        for (var i = 0; i < intArray.length ; i++) intArray[i] = random.nextInt(maxArrayNumberLimitToBeBound);
        var biggestNumberFromArray  = intArray[0];
        var smallestNumberFromArray = intArray[0];
        for(var i = 1; i < intArray.length; i++) {
            if(intArray[i] > biggestNumberFromArray)
                biggestNumberFromArray = intArray[i];
            else if (intArray[i] < smallestNumberFromArray) {
                smallestNumberFromArray = intArray[i];
            }
        }
        System.out.println("Biggest number from array: " + biggestNumberFromArray);
        System.out.println("Smallest number from array: " + smallestNumberFromArray);
    }
    static void ClassWorkNumberTen(int maxArrayNumberLimitToBeBound) {
        var intArray = new Integer[8];
        var random = new Random();
        for (var i = 0; i < intArray.length ; i++) intArray[i] = random.nextInt(maxArrayNumberLimitToBeBound);
        Arrays.sort(intArray);

        System.out.println("Ascending order : " + intArray);
    }
    static void ClassWorkNumberEleven(int maxArrayNumberLimitToBeBound) {
        var intArray = new Integer[8];
        var random = new Random();
        for (var i = 0; i < intArray.length ; i++) intArray[i] = random.nextInt(maxArrayNumberLimitToBeBound);
    }
    static void ClassWorkNumberTwelve(int maxArrayNumberLimitToBeBound) {
        var intArray = new Integer[8];
        var random = new Random();
        for (var i = 0; i < intArray.length ; i++) intArray[i] = random.nextInt(maxArrayNumberLimitToBeBound);

        Arrays.sort(intArray, Comparator.reverseOrder());
    }
}
