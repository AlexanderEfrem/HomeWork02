package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter N");
        }
        n = sc.nextInt();


        array1 = new int[n][n];

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);

            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("changing");


        int f = array1.length - 1;
        int k = array1.length - 1;
        for (n = 0; n < array1.length; n++) {
            for (z = f; z >=k ; z--) {
                array1[n][z] = 1;
            }
            k = --k;
            if ( k < array1.length / 2) {
                break;
            }
        }

        f = array1.length - 1;
        k = array1.length - 1;
        for (n = array1.length - 1; n >= 0; n--) {
            for (z = f; z >=k ; z--) {
                array1[n][z] = 1;
            }
            k = --k;
            if ( k < array1.length / 2) {
                break;
            }
        }



        k = 0;
        for (n = 0; n < array1.length; n++) {
            for (z = 0; z <= k ; z++) {
                array1[n][z] = 1;
            }
            k = ++k;
            if ( k > array1.length / 2) {
                break;
            }
        }

        k = 0;
        for (n = array1.length - 1; n >= 0; n--) {
            for (z = 0; z <= k ; z++) {
                array1[n][z] = 1;
            }
            k = ++k;
            if ( k > array1.length / 2) {
                break;
            }
        }



        System.out.println("k        " + k);
        System.out.println("-------------------------------------------------");
        System.out.println("After changing");

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);

            }
            System.out.println("");
        }
    }
}

