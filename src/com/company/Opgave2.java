package com.company;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Opgave2 {

        public void readFile()  {

            int[] tal = new int[10];

            try{
                File myObj = new File("src/com/company/filename.txt");
                Scanner in = new Scanner(myObj);

                int count = 0;

                while (in.hasNext()) {
                    tal[count] = in.nextInt();
                    count ++;
                }
            in.close();

            } catch (FileNotFoundException e ) {
                e.printStackTrace();
            }

            System.out.println(Arrays.toString(tal));

            Main.printArray(tal , tal.length);

            System.out.println(Main.average(tal, tal.length));

            try {

            File myObj2 = new File("MinFil1.txt");

            if (myObj2.createNewFile()) {
                System.out.println("File created " + myObj2.getName());
            } else {
                System.out.println("File already exist");
            }

            FileWriter writer = new FileWriter("MinFil1.txt");

                for (int j : tal) {
                    writer.write(j + 10 + "\n");
                }

                writer.close();

            } catch (IOException  e ) {
                System.err.println("Error");
                e.printStackTrace();
            }
        }







}
