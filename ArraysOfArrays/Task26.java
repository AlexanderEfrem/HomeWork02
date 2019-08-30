package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int b = 0;
        int g = 0;
        int l = 0;
        int t = 0;
        int countneg;
        int max;
        int minmatrix = 0;
        int maxmatrix = 0;

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


        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);
            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("After changing");


        for (n = 0; n < array1.length; n++) {
            countneg = 0;
            max = 0;
            for (j = 0; j < array1[n].length; j++) {
                int y = array1[0][0];
                int u = array1[0][0];

                // this is used to not override min value every iteration
                if (minmatrix != 0) {
                    y = minmatrix;
                }

                if (maxmatrix != 0) {
                    u = maxmatrix;
                }

                if (array1[n][j] < 0) {
                    ++countneg;
                }
                if (array1[n][j] > max) {
                    max = array1[n][j];
                }

                // find max value
                if (u > array1[n][j]) {
                    maxmatrix = u;

                } else {
                    maxmatrix = array1[n][j];
                }

                // find min value
                if (y < array1[n][j]) {
                    minmatrix = y;

                } else {
                    minmatrix = array1[n][j];
                }

            }
            System.out.println("");
            System.out.println("Quantity of negative values in line " + n + " = " + countneg);
            System.out.println("Max value in line " + n + " = " + max);
        }


        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                if (array1[n][j] == maxmatrix) {
                    b = n;
                    g = j;
                }
                if (array1[n][j] == minmatrix) {
                    l = n;
                    t = j;
                }
            }
        }

        array1[b][g] = minmatrix;
        array1[l][t] = maxmatrix;

        System.out.println("");
        System.out.println("max value " + maxmatrix);
        System.out.println("min value " + minmatrix);

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-6d ", n, j, array1[n][j]);
            }
            System.out.println("");
        }
    }
}
