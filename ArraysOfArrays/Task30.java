package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int[] array2;
        int count;
        int counter = 0;
        int i= 0;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        array1 = new int[10][20];

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                array1[n][j] = rand.nextInt(16);
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);

            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("changing");


        for (n = 0; n < array1.length; n++) {
            count = 0;
            for (j = 0; j < array1[n].length; j++) {
                if (array1[n][j] == 5) {
                    count = ++count;
                }
            }
            if (count >= 3) {
                counter = ++counter;
            }
        }

        array2 = new int[counter];

        for (n = 0; n < array1.length; n++) {
            count = 0;
            for (j = 0; j < array1[n].length; j++) {
                if (array1[n][j] == 5) {
                    count = ++count;
                }
            }
            if (count >= 3) {
                array2[i] = n;
                ++i;
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("After changing");

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);

            }
            System.out.println("");
        }
        System.out.println("Line Numbers where 5 occur more than 3 times " + Arrays.toString(array2));
    }
}

