package com.company;
import java.io.*;
import java.util.*;

public class Exercise12_15 {
    public static void main(String[] args) throws Exception {
        int[] arrayInt = new int[100];
        java.io.File file = new java.io.File("Exercise12_15");

        try (
            java.io.PrintWriter output = new java.io.PrintWriter("Exercise12_15");
        ){
            for (int loop = 0; loop < 100;loop++) {
                output.print((int) (Math.random() * 100) + " ");
            }
        }
        Scanner input = new Scanner(new File("Exercise12_15"));
        for (int loop = 0; input.hasNext(); loop++) {
            int displayFile = input.nextInt();
            arrayInt[loop] = displayFile;
        }
        input.close();
        Arrays.sort(arrayInt);
        for (int loop = 0; loop < 100; loop++) {
            System.out.print(arrayInt[loop] + " ");
            if (loop % 10 == 0 && loop != 0) {
                System.out.println();
            }
        }
    }
}
