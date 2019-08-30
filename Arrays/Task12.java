package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int [] array1;
        int x;
        int k;
        int sum = 0;
        int g;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);

        System.out.println("Vvedite kol-vo elementov posledovatelnosti k");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov posledovatelnosti k");
        }
        k = sc.nextInt();

        array1 = new int[k];

        for (int i = 0; i <array1.length; i++) {
            System.out.println("Vvedite " + i + " element posledovatelnosti");
            while (sx.hasNextInt() == false) {
                sx.next();
                System.out.println("Vvedite " + i + "element posledovatelnosti");
            }
            x = sx.nextInt();
            array1[i] = x;

            if (i > 1) {
                for (g = 2; g < i; g++) {
                    if ( i % g != 0) {
                        sum = sum + array1[i];
                        System.out.println("sum " + sum);
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        sum = sum + array1[2];

        System.out.println("sum " + sum);

    }

}
