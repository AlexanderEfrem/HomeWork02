package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        int x;
        int y;
        int z;
        int t;
        double s;

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

        System.out.println("Enter Z");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter Z");
        }
        z = sc.nextInt();

        System.out.println("Enter T");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Enter T");
        }
        t = sc.nextInt();

        s = Methods.findSquareOfQuadrangleTask12(x, y, z, t);

        System.out.println("S = " + s);
    }
}

