package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

            int n;
            int k;
            int m;
            int[] array1;
            int sum = 0;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of array elements");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter number of array elements");
            }
            n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of array elements cannot be <= 0");
            System.exit(1);
        }

        array1 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter x" + i + " value");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter x" + i + " value");
            }
            array1[i] = sc.nextInt();

        }

        System.out.println("Enter K");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter K");
        }
        k = sc.nextInt();

        System.out.println("Enter M");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter M");
        }
        m = sc.nextInt();

        if (k > m || m > array1.length || m - k > 3) {
            System.out.println("Something went wrong");
            System.exit(1);
        }

        sum = Methods.SumOf3NearestElementsTask11(array1, k, m);
        System.out.println("Sum = " + sum);

    }
}