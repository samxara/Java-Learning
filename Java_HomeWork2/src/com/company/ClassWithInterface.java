package com.company;

public class ClassWithInterface implements SimpleInterface {
    int a;
    int b;

    @Override
    public void PrintAllNumbersBetweenAandB(int a, int b) {
            for (var i = a; i < b; i++) {
                System.out.println(i);
            }
    }

    @Override
    public void AllDivisibleNumbers(int a) {
        for(var i = 1; i <= a; i++) {
            if(a % i == 0) {
                System.out.println(i);
                i++;
            }
        }
    }

    @Override
    public void AllEasyDivisibleNumbers(int b) {

        int i =0;
        int num =0;
        String  primeNumbers = "";
        for (i = 1; i <= b; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println(primeNumbers);
    }

    @Override
    public int NumberThatRepeatsTheMost() {
        return 0;
    }
}

