package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
        int chislo1;
        int chislo2;
        int chislo3;
        boolean condition;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number#1 ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number#1" );
        }
        chislo1 = sc.nextInt();

        System.out.println("Enter number#2 ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number#2");
        }
        chislo2 = sc.nextInt();

        System.out.println("Enter number#3 ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number#3");
        }
        chislo3 = sc.nextInt();

        condition = Methods.task09(chislo1, chislo2, chislo3);

        System.out.println("Result " + condition);
    }

}