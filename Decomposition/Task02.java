package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        int x1;
        int x2;
        int nod;
        double nok;

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


        nod = Methods.findTheMostBiggestDividerTask02(x1, x2);
        System.out.println("NOD = " + nod);

        nok = Methods.findTheMostLowestMultipleTask02(x1, x2);
        System.out.println("NOK = " + nok);

    }

}
