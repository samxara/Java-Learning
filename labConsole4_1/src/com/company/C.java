package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class C {
    int A = 10;
    int B = 9;
    String S1 = "#";
    String S2 = "@";

    public void PrintABValues() {
        out.println(A + ";" + B);
    }

    public void PrintS1S2Values() {
        out.println(S1 + ";" + S2);
    }

    public void AssignS1S2ValuesFromKeyBoard() {
        var input = new Scanner(in);
        S1 = input.next();
        S2 = input.next();
    }

}
