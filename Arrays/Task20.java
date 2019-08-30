package by.AlexanderEfremenko.Homework02.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        int n;
        int[] array1;


        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);

        System.out.println("Vvedite kol-vo elementov massiva ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov massiva ");
        }
        n = sc.nextInt();


        array1 = new int[n];

        int x;
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vvedite " + i + " element  massiva");
            while (sx.hasNextInt() == false) {
                sx.next();
                System.out.println("Vvedite " + i + "element  massiva");
            }
            x = sx.nextInt();
            array1[i] = x;

        }

        System.out.println("array 1 " + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 != 0) {
                array1[i] = 0;

            }
        }
        System.out.println("array 1 before changing " + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                if (i < 1) {
                    System.out.print("Array 1 after changing [ ");
                }
                System.out.print(array1[i] + " ");

            }
        }
        System.out.print("]");
    }
}
