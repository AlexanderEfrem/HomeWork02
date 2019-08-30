package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        int[] array1;
        int x;
        int n;
        int b;
        int min = 0;
        int max = 0;
        int c;
        int y;

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
            b = array1[0];
            // this is used to not override min value every iteration
            if (min != 0) {
                y = min;
            }
            // this is used to not override max value every iteration
            if (max != 0) {
                b = max;
            }
            // find max value
            if (b > array1[c]) {
                max = b;

            } else {
                max = array1[c];
            }
            // find min value
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
            if (array1[c] == 0) {
                if (max < 0) {
                    max = 0;
                }
            }
        }


        System.out.println("Posledovatelnost' ot " + min + " do " + max );

    }

}