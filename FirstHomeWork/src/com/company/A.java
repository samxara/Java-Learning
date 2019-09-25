package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class A {
    int x;

    public A(){ out.println("Hello");}

    public void AssignValueToX() {
        out.println("Enter any integer: ");
        x = new Scanner(System.in).nextInt();
    }
    public void AddTwelveToFieldX() {
        var value = x + 12;
        out.println("Adding 12 to " + x + " is " + value);
    }
    public void DefineIfXIsEvenOrOdd() {

        if(x % 2 == 0) out.println("X is even");
        else{out.println("X is Odd");}
    }
}

