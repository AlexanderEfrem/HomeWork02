package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        boolean start;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to start? (Enter true to start or false to quite) ");
        while (sc.hasNextBoolean() == false) {
            sc.next();
            System.out.println("Do you want to start? (Enter true to start or false to quite) ");
        }
        start = sc.nextBoolean();

        sum =  Methods.factorialSumTask10(start);

        System.out.println("Sum = " + sum);
    }

}
