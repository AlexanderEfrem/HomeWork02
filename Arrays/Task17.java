package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int x;
        int n;
        int min = 0;
        int c;
        int y;
        int a = 0;
        int b = 0;

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

        for (c = 0; c < array1.length; c++) {
            y = array1[0];

            if (min != 0) {
                y = min;
            }
            if (y < array1[c]) {
                min = y;
                } else {
                min = array1[c];
                }
            }

        for (c = 0; c < array1.length; c++) {
            if (array1[c] == 0) {
                if (min > 0) {
                    min = 0;
                }
            }
        }

        for (c = 0; c < array1.length; c++) {
            if (array1[c] == min) {
                a = a + 1;
            }
        }

        array2 = new int[n - a];

        for (int i = 0; i < array1.length; i++) {
            if ( array1[i] != min ) {
                for ( b = b; b < array2.length; b++) {
                    array2[b] = array1[i];
                    b++;
                    break;
                }

            }
        }

        System.out.println("Massiv 1 before changing " + Arrays.toString(array1));
        System.out.println("---------------------------");
        System.out.println("Massiv 2 after changing " + Arrays.toString(array2));
    }

}