package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        double [] array1;
        double [] array2;
        int x;
        int a = 0;
        int k;
        int b = 0;
        int m;
        int l;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        Scanner sm = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        System.out.println("Vvedite chislo M");
        while (sm.hasNextInt() == false) {
            sm.next();
            System.out.println("Vvedite chislo M");
        }
        m = sm.nextInt();

        System.out.println("Vvedite chislo L");
        while (sl.hasNextInt() == false) {
            sl.next();
            System.out.println("Vvedite chislo L");
        }
        l = sl.nextInt();

        System.out.println("Vvedite kol-vo elementov posledovatelnosti k");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov posledovatelnosti k");
        }
        k = sc.nextInt();

        array1 = new double[k];

        for (int i = 0; i <array1.length; i++) {
            System.out.println("Vvedite " + i + " element posledovatelnosti");
            while (sx.hasNextInt() == false) {
                sx.next();
                System.out.println("Vvedite " + i + "element posledovatelnosti");
            }
            x = sx.nextInt();
            array1[i] = x;

            if ( array1[i] % m ==  l ) {
                a = a + 1;
            }
        }

        array2 = new double[a];

        for (int i = 0; i < array1.length; i++) {
            if ( array1[i] % m ==  l ) {
                for ( b = b; b < array2.length; b++) {
                    array2[b] = array1[i];
                    b++;
                    break;
                }

            }
        }
        System.out.println("Massiv 1 " + Arrays.toString(array2));
    }

}
