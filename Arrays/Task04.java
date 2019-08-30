package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int[] array1;
        int x;
        int n;
        int b = 0;
        int a = 1;

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

        for (int i = 0; i < array1.length - 1; i++) {
            b = i + 1;
            if (array1[i] < array1[b]) {
                a = a + 1;
            }
        }
        if ( a == array1.length) {
            System.out.println("Posledovatelnost' vozrostauschaya");
        } else {
            System.out.println("Posledovatelnost' ne vozrostauschaya");
        }
    }

}