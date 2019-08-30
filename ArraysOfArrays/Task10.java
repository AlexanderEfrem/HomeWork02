package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int z = 0;
        int k;
        int p;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of lines");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number of lines");
        }
        n = sc.nextInt();

        System.out.println("Enter number of columns");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number of columns");
        }
        j = sc.nextInt();

        array1 = new int[n][j];

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.println("Enter value for " + n + " line " + j + " column");
                while (sc.hasNextInt() == false) {
                    sc.next();
                    System.out.println("Enter value for " + n + " line " + j + " column");
                }
                array1[n][j] = sc.nextInt();
            }
        }

        System.out.println("Enter line to print");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter line to print\"");
        }
        k = sc.nextInt();

        System.out.println("Enter column to print");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter column to print\"");
        }
        p = sc.nextInt();


        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);

            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("After changing");

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                if (n == k - 1 ) {
                    System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][z]);
                }
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------------------");
        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                if (j == p - 1 ) {
                    System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][z]);
                }
            }
            System.out.println("");
        }



    }
}

