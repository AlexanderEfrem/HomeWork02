package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int z;
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

        z = n-1;
        for (n = 0; n < array1.length; n++) {
            for (z = z; z >=0; z--) {
                array1[n][z] = g;
                System.out.printf("Mass[%d][%d]= %-6d ", n, z, array1[n][z]);
                g = ++g;
                --z;
                break;
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

