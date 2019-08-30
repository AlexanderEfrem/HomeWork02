package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int  z = 0;

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
            for (z = z; z < array1[n].length; z = z++) {
                System.out.printf("Mass[%d][%d]= %-6d ", n, z, array1[n][z]);
                z = ++z;
                break;
            }
        }
    }
}

