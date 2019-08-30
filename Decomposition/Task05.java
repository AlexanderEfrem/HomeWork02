package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        int a1;
        int a2;
        int a3;

        int sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite chislo 1");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite chislo 1");
        }
        a1 = sc.nextInt();

        System.out.println("Vvedite chislo 2");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite chislo 2");
        }
        a2 = sc.nextInt();

        System.out.println("Vvedite chislo 3");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite chislo 3");
        }
        a3 = sc.nextInt();

        sum = Methods.findSumOfMaxAndMinValues(a1, a2, a3);

        System.out.println("Sum = " + sum);

    }

}