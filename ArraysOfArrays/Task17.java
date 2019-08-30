package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int z = 0;
        int g = 1;

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

        for (n = 0; n < array1.length; n++) {
            for (z = 0; z < array1[n].length; z++) {
                if (n == 0 || z == 0 || n == array1.length -1 || z == array1[n].length -1)
                array1[n][z] = 1;
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
    }
}

