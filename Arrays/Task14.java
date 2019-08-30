package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        int[] array1;
        int x;
        int n;
        int b;
        int min = 0;
        int max = 0;
        int c;
        int y;
       int sum = 0;

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

            if (c % 2 == 0 || c == 0){
                if (max != 0) {
                    b = max;
                }
                if (b > array1[c]) {
                    max = b;

                } else {
                    max = array1[c];
                }
            } else {
                if (min != 0) {
                    y = min;
                }
                if (y < array1[c]) {
                    min = y;

                } else {
                    min = array1[c];
                }
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
        sum = max + min;

        System.out.println("Massiv 1 before changing " + Arrays.toString(array1));
        System.out.println("---------------------------");
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
    }

}