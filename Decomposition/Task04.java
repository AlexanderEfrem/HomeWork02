package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int nok;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite chislo 1");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite chislo 1");
        }
        x1 = sc.nextInt();

        System.out.println("Vvedite chislo 2");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite chislo 2");
        }
        x2 = sc.nextInt();

        System.out.println("Vvedite chislo 3");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite chislo 3");
        }
        x3 = sc.nextInt();

        nok = Methods.findTheMostLowestMultipleTask02(Methods.findTheMostLowestMultipleTask02(x1, x2), x3);

        System.out.println("NOK = " + nok);

    }

}