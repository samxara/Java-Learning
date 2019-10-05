package com.company;

import java.util.Scanner;

import static java.lang.System.out;


public class B {
    int A = 33;
    double B = 9.7;
    String S = "#";

    public void printSValue() {
        out.println(S);
    }
    public void PrintAValue() {
        out.println(A);
    }
    public void PrintBValue(){
        out.println(B);
    }

    public void PrintDiffAB() {
        out.println(A - B);
    }

    public double ReturnDiffAB() {
        return A / B;
    }

    public void AssignRandomValues(int a, double b, String string) {
        A = a;
        B = b;
        S = string;
    }

    public void AssignAValueFromKeyBoard() {
        var input = new Scanner(System.in);

        A = input.nextInt();

    }

    public void PrintBAddTen() {
        out.println(B + 10);
    }
}

