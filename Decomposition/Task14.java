package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        int x;
        int y;
        int value;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter X");
        }
        x = sc.nextInt();

        System.out.println("Enter Y");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Y");
        }
        y = sc.nextInt();

        value = Methods.findInWhatNumberTheAreMoreValues(x, y);

        System.out.println("Number with more characters = " + value);

    }
}
