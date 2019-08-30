package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
        int n;
        int j;
        double[][] array1;
        int z;
        double k;
        int count = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter N");
        }
        n = sc.nextInt();

        k = n;

        array1 = new double[n][n];

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-20.3f ", n, j, array1[n][j]);

            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");
        System.out.println("changing");


        for (n = 0; n < array1.length; n++) {
            for (z = 0; z < array1.length; z++) {
                array1[n][z] = Math.sin((n * n - z * z) / k);
                if (array1[n][z] > 0) {
                    count = ++count;

                }
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("After changing");

        for (n = 0; n < array1.length; n++) {
            for (j = 0; j < array1[n].length; j++) {
                System.out.printf("Mass[%d][%d]= %-20.3f ", n, j, array1[n][j]);

            }
            System.out.println("");
        }
        System.out.println("Count =" +count);
    }
}

