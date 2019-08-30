package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        int k;
        int z;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter number ");
        }
        k = sc.nextInt();

        z = Methods.task20(k);

        System.out.println("Result: Count = " + z);
    }
}


