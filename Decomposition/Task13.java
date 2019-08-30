package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        int x;
        int[] array1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter X");
        }
        x = sc.nextInt();

        array1 = Methods.createArrayFromNumber(x);

        System.out.println("Massiv 1 " + Arrays.toString(array1));
    }
}
