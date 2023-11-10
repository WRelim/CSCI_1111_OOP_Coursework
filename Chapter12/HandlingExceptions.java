package com.company;
import java.util.*;

public class HandlingExceptions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] randomArray = new int[100];

        for (int loop = 0; loop < 100; loop++) {
            randomArray[loop] = (int)(Math.random() * 100);
        }

        System.out.println("Enter an integer to access an index: ");
        int user = input.nextInt();
        user--;
        try{
            System.out.println(randomArray[user]);
        } catch (RuntimeException ex) {
            System.out.println("Out of Bounds.");
        }
    }
}
