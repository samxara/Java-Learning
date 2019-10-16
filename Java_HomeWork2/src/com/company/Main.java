package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        //var generatedValues = GenerateRandomNumbers(10);
        //WriteOneByOne("/home/fluffybunny/function.txt", generatedValues);
        //var allInfo = ReadAllInfo("/home/fluffybunny/function.txt");
        //System.out.println("Max: " + findMax(allInfo));
        //System.out.println("Min: " + findMin(allInfo));
        //var classWithInterface = new ClassWithInterface();
        //classWithInterface.PrintAllNumbersBetweenAandB(1,12);
        //classWithInterface.AllDivisibleNumbers(12);
        //classWithInterface.AllEasyDivisibleNumbers(12);

    }
    public static double findMin(Double[] list){
        Arrays.sort(list);
        return list[0];
    }
    public static double findMax(Double[] list)
    {
        Arrays.sort(list);
        return list[list.length -1];
    }

    public static Double[] FindMaxAndMinNumberFromArray(Double[] array) {
        var toBeReturnedArray = new Double[array.length];
        Arrays.sort(array);
        toBeReturnedArray[1] = array[0];
        toBeReturnedArray[2] = array[array.length -1];

        return toBeReturnedArray;

    }

    public static Double[] ReadAllInfo(String path) throws IOException {
        var allText = Files.readAllLines(Paths.get(path));
        var doubleArray = new Double[allText.size()];


            for(var i=0; i<allText.size(); i++) {
                doubleArray[i] = Double.parseDouble(allText.get(i));
                System.out.println(allText.get(i));
            }
        return doubleArray;
    }
    public static void WriteOneByOne(String path, Double[] array) {
        try {
            var writer = new FileWriter(path);

            for (var i=0; i < array.length; i++) {
                writer.write(array[i] + "\n");
            }
            writer.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static Double[] GenerateRandomNumbers(int times) {

        var array = new Double[times];
        for (var i =0; i < times; i++) {
            var randomValue = randomWithRange(1,2);
            array[i] = Math.round((randomValue * randomValue + 2 * randomValue + 3) * 100.0) / 100.0;

        }
        return array;

    }
    public static double randomWithRange(double min, double max)
    {
        double range = (max - min);
        return (Math.random() * range) + min;
    }


}
