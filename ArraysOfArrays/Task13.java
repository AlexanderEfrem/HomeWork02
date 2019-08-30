package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int z = 0;
        int g = 0;
        int i = 1;
        int l = 0;

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

        for (l = 0; l < array1.length; l++) {
            if (l % 2 == 0) {
                i = 1;
                for (z = 0; z < array1[l].length; z++) {
                    for (i = i; i <= n; i++) {
                        array1[l][z] = i;
                        i = ++i;
                        break;
                    }
                }
            } else {
                i = 1;
                for (z = array1[l].length -1; z >= 0; z--) {
                    for (i = i; i <= n; i++) {
                        array1[l][z] = i;
                        i = ++i;
                        break;
                    }
                }
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


