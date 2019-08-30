package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        int n;
        int z;
        int[] array1;
        double[] distanceArray;
        double max;
        int j = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of dots groups");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number of dots groups");
        }
        n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Number of dots groups cannot be <= 1");
            System.exit(1);
        }

        array1 = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {

            if (i % 2 == 0) {
                System.out.println("Enter x" + i + " value");
                while (sc.hasNextInt() == false) {
                    sc.next();
                    System.out.println("Enter x" + i + " value");
                }
                array1[i] = sc.nextInt();
            } else {
                z = i - 1;
                System.out.println("Enter y" + z + " value");
                while (sc.hasNextInt() == false) {
                    sc.next();
                    System.out.println("Enter y" + z + " value");
                }
                array1[i] = sc.nextInt();
            }
        }

        System.out.println("Massiv 1 " + Arrays.toString(array1));

        distanceArray = new double[((n - 1) * (n))/2];

        for (int i = 0; i < array1.length - 3; i =  i + 2) {
            for (int k = i + 2; k < array1.length - 1; k = k + 2) {

                double distance = Methods.findDistanceBetweenDotsTask07(array1[i], array1[i + 1], array1[k], array1[k + 1]);

                for (j= j; j <distanceArray.length; j++) {
                    distanceArray[j] = distance;
                    j = j + 1;
                    break;
                }
            }
        }

        System.out.println("Massiv 2 (Distanses between dots) " + Arrays.toString(distanceArray));

        max = distanceArray[0];

        for (int i = 0; i < distanceArray.length; i++) {
            if (distanceArray[i] > max) {
                max = distanceArray[i];
            }
        }

        System.out.println("Max distance is " + max);

    }
}
