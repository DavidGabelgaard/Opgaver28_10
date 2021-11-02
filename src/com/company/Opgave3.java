package com.company;
import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave3 {

    public void lavFile() {


        File myObj3 = new File("MinFil3.dat");

        try {

            File myFile = new File ("src/com/company/filename.txt");
            Scanner input = new Scanner(myFile);

            if (myObj3.createNewFile()) {
                System.out.println("File created " + myObj3.getName());
            } else {
                System.out.println("File already exist");
            }

            int []  fileNum  = new int [10];

            int i = 0;

            while (input.hasNextInt()) {
                fileNum[i] = input.nextInt();
                i++;
            }

            FileOutputStream foul = new FileOutputStream("MMinFil3.dat");

            for (int k : fileNum) {
                foul.write(k);
            }
            foul.close();

        } catch (IOException e ) {
            e.printStackTrace();
        }

    }

    public void readFile() {

        int[] array = new int[10];

        try {

            FileInputStream fileInputStream = new FileInputStream("MMinFil3.dat");

            int value;
            int i = 0;
            value = fileInputStream.read();

            while (value!= -1) {

                array[i] = value;
                i++;
                value = fileInputStream.read();
            }
            fileInputStream.close();

            System.out.println(Arrays.toString(array));

        }  catch (Exception e) {
            e.printStackTrace();
        }

    }



}
