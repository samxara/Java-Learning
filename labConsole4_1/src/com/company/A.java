package com.company;

public class A {
    int A = 10;
    int B = 29;


    public void HelloOPP() {
        System.out.println("Hello OPP");
    }

    public void PrintAFieldValue() {
        System.out.println(A);
    }

    public void PrintBFieldValue() {
        System.out.println(A);
    }

    public void PrintSumAB() {
        System.out.println(A + B);
    }

    public int ReturnSumAB() {

        return A + B;
    }

    public int ReturnMultiplyingAB() {
        return A * B;
    }

    public void AssignABValues(int a, int b) {
        A = a;
        B = b;
    }
}

