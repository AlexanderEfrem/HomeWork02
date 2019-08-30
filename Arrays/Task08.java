package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int [] array1;
        int x;
        int a = 0;
        int k;
        int b = 0;
        int c = 0;

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

            if (array1[i] > 0 ) {
                a = a + 1;
            }

            if (array1[i] < 0 ) {
                b = b + 1;
            }

            if (array1[i] == 0 ) {
                c = c + 1;
            }

        }


        System.out.println("Massiv 1 " + Arrays.toString(array1));
        System.out.println("---------------------------");
        System.out.println("Pologutelnuh " + a + " Otrucatelnuh " + b + " Nylevuh " + c);

    }

}
