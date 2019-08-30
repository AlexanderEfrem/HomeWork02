package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Arrays;
import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        int k;
        int[] array1;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter K");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter K");
        }
        k = sc.nextInt();

        array1 = Methods.task17(k);
        System.out.println("Massiv 1 " + Arrays.toString(array1));
    }
}
