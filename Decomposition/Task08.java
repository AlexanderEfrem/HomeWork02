package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        int[] array1;
        int valueThatLowerThanMaxAndHigherOthers;
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number of elements in array");
        }
        n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements cannot be <= 0");
            System.exit(1);
        }

        array1 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter Value of " + i + " array element ");
            while (sc.hasNextInt() == false) {
                sc.next();
                System.out.println("Enter Value of " + i + " array element ");
            }
            array1[i] = sc.nextInt();
        }
        valueThatLowerThanMaxAndHigherOthers = Methods.findValueThatLowerMaxValueFor1Task08(array1);

        System.out.println("Result " + valueThatLowerThanMaxAndHigherOthers);
    }
}


