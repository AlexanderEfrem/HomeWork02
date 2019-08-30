package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task06 {

    public static void main (String[] args) {

        int x1;

        double square;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite storony a");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite storony a");
        }
        x1 = sc.nextInt();

        square = Methods.findSquareOfSexangleTask06(x1);

        System.out.println("Square = " + square);

    }

}
