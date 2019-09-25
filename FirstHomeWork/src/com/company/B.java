package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class B extends A {
    int y;

    public void AssignValueToFieldY() {
        y = new Scanner(System.in).nextInt();
    }
    public int SumOfXAndY(){
        var value = x + y;
        out.println("Sum of X and Y is: " + value);
        return value;
    }
}
