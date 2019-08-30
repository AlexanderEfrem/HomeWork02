package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int x;
        int n;
        int b = 0;
        int max = 0;
        int c;
        int y;
        int g;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);

        System.out.println("Vvedite kol-vo elementov posledovatelnosti ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov posledovatelnosti ");
        }
        n = sc.nextInt();

        array1 = new int[n];

        y = n - 1;

        array2 = new int [y];

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
                for ( b = b; b < array2.length; b++) {
                    array2[b] = array1[i] + array1[i+1];
                    b++;
                    break;
                }

            }

        for (c = 0; c < array2.length; c++) {
            g = array2[0];

            if (max != 0) {
                g = max;
            }
            if (g > array2[c]) {
                max = g;

            } else {
                max = array2[c];
            }
        }

        for (c = 0; c < array2.length; c++) {
            if (array1[c] == 0) {
                if (max < 0) {
                    max = 0;
                }
            }
        }

        System.out.println("Massiv 1 before changing " + Arrays.toString(array1));
        System.out.println("---------------------------");
        System.out.println("Massiv 1 after changing " + Arrays.toString(array2));
        System.out.println("---------------------------");
        System.out.println("Max = " + max);
    }

}