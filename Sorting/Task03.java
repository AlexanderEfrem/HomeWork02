package by.AlexanderEfremenko.Homework02.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        int[] array1;
        int x;
        int n;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);

        System.out.println("Vvedite kol-vo elementov posledovatelnosti n");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov posledovatelnosti n");
        }
        n = sc.nextInt();

        array1 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vvedite " + i + " element posledovatelnosti");
            while (sx.hasNextInt() == false) {
                sx.next();
                System.out.println("Vvedite " + i + "element posledovatelnosti");
            }
            x = sx.nextInt();
            array1[i] = x;

        }

        for (int i = 0; i < array1.length; i++) {
            int max = array1[i];
            int max_i = i;
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] > max) {
                    max = array1[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int b = array1[i];
                array1[i] = array1[max_i];
                array1[max_i] = b;
            }
        }
        System.out.println("Massiv 3 " + Arrays.toString(array1));
    }
}

