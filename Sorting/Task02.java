package by.AlexanderEfremenko.Homework02.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        int x;
        int a;
        int b;
        int j = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);


        System.out.println("Vvedite kol-vo elementov Massiva 1");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov Massiva 1");
        }
        a = sc.nextInt();

        array1 = new int[a];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vvedite " + i + " element Massiva 1");
            while (sx.hasNextInt() == false) {
                sx.next();
                System.out.println("Vvedite " + i + " element Massiva 1");
            }
            x = sx.nextInt();
            array1[i] = x;
        }

        System.out.println("Vvedite kol-vo elementov Massiva 2");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov Massiva 2");
        }
        b = sc.nextInt();

        array2 = new int[b];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Vvedite " + i + " element Massiva 2");
            while (sx.hasNextInt() == false) {
                sx.next();
                System.out.println("Vvedite " + i + " element Massiva 2");
            }
            x = sx.nextInt();
            array2[i] = x;

        }

        array3 = new int[b + a];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = array1.length; i < array3.length; i++) {
            for (j = j; j < array2.length; ) {
                array3[i] = array2[j];
                ++j;
                break;
            }
        }

        Arrays.sort(array3);
        System.out.println("Massiv 3 " + Arrays.toString(array3));
    }
}
