package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {

    public static void main (String[] args) {
        int k;
        int n;
        int[] array2;
        int value;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter K");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter K");
        }
        k = sc.nextInt();

        System.out.println("Enter N");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter N");
        }
        n = sc.nextInt();


        array2 = Methods.createArrayforTask15(k, n);
        System.out.println("Massiv 1 " + Arrays.toString(array2));


    }
}
