package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        double [] array1;
        int x;
        int a = 0;
        int k;
        int m;
        int l;
        int n;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        Scanner sm = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);

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

        System.out.println("Vvedite chislo N");
        while (sn.hasNextInt() == false) {
            sn.next();
            System.out.println("Vvedite chislo N");
        }
        n = sn.nextInt();

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

            if ( array1[i] % m == 0  && array1[i] > l && array1[i] < n) {
                a = a + 1;
            }
        }

        System.out.println("Massiv 1 " + Arrays.toString(array1));
        System.out.println("Kol-vo elementov ot l do n =  " + a);
    }

}
