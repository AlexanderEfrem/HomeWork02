package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        int n;
        int[] array1;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter N");
        }
        n = sc.nextInt();

        array1 = Methods.task16(n);
        System.out.println("Massiv 1 " + Arrays.toString(array1));
    }
}
