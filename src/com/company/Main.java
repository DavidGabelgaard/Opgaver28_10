package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);

        int [] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        printArray(numbers , numbers.length);

        System.out.println(average(numbers , numbers.length));

        Opgave2 opgave2 = new Opgave2();

        opgave2.readFile();

        Opgave3 opgave3 = new Opgave3();

        opgave3.lavFile();

        opgave3.readFile();

    }


    public static void printArray(int[] array, int arrayLength ) {

            System.out.println(Arrays.toString(array));

    }

    public static double average(int[] array , int arrayLength) {
        double totalValue = 0;
        for (int i = 0; i < arrayLength; i++) {
            totalValue += array[i];
        }

        return totalValue / arrayLength;

    }


}
