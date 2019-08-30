package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task28 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int[] array2;
        int sum;
        int max = 0;
        int columnid = 0;

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter N");
        }
        n = sc.nextInt();


        array1 = new int[n][n];
        array2 = new int[n];

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                array1[n][j] = rand.nextInt(100);
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);

            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("changing");


        for (j = 0; j < array1.length; j++) {
            sum = 0;
            for (n = 0; n < array1[j].length; n++) {
                sum = sum + array1[n][j];
            }
            array2[j] = sum;
        }

        for (int i = 0; i < array2.length; i ++) {
            if (i == 0) {
                max = array2[0];
                columnid = 0;
            }
            if (array2[i] > max) {
                max = array2[i];
                columnid = i;
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
        System.out.println("Values sum in the columns  " + Arrays.toString(array2));
        System.out.println("max " + max);
        System.out.println("Column with max value = " + columnid);
    }
}

