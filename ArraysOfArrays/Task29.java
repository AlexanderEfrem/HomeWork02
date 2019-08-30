package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        int n;
        int j;
        int[][] array1;
        int[] array2;
        int z = 0;
        int count = 0;
        int i = 0;

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

        System.out.println("-------------------------------------------------");
        System.out.println("changing");

        for (n = 0; n < array1.length; n++) {
            for (z = z; z < array1[n].length; z++) {
                if (array1[n][z] > 0) {
                    count = ++count;
                }
                z = ++z;
                break;
            }
        }

        array2 = new int[count];
        z = 0;

        for (n = 0; n < array1.length; n++) {
            for (z = z; z < array1[n].length; z++) {
                if (array1[n][z] > 0) {
                    array2[i] = array1[n][z];
                    ++i;
                }
                z = ++z;
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
        System.out.println("Positive values " + Arrays.toString(array2));
    }
}

