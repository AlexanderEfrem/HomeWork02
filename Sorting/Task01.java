package by.AlexanderEfremenko.Homework02.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int[] array1;
        int[] array2;
        int[] array3;
        int x;
        int a;
        int b;
        int k;
        int z = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        Scanner sm = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.println("Vvedite chislo k");
        while (sm.hasNextInt() == false) {
            sm.next();
            System.out.println("Vvedite chislo k");
        }
        k = sm.nextInt();


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


        array3 = new int[a + b];
        int g = k + 1;

        for (int i = 0; i < array3.length; i++) {
            if (k >= i) {
                array3[i] = array1[i];
            } else if (k < i && i < array2.length + k + 1) {
                for (z = z; z < array2.length; z++) {
                    array3[i] = array2[z];
                    z = ++z;
                    break;
                }
            } else {
                for (g = g; g < array1.length; g++) {
                    array3[i] = array1[g];
                    g = ++g;
                    break;
                }

            }
        }
        System.out.println("K " + k);
        System.out.println("Massiv 1 " + Arrays.toString(array1));
        System.out.println("Massiv 2 " + Arrays.toString(array2));
        System.out.println("Massiv 3 " + Arrays.toString(array3));

    }

}
