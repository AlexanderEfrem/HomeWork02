package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int y1;
        int y2;
        int y3;


        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite koordinaty x tochki 1");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite koordinaty x tochki 1");
        }
        x1 = sc.nextInt();

        System.out.println("Vvedite koordinaty y tochki 1");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite koordinaty y tochki 1");
        }
        y1 = sc.nextInt();

        System.out.println("Vvedite koordinaty x tochki 2");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite koordinaty x tochki 2");
        }
        x2 = sc.nextInt();

        System.out.println("Vvedite koordinaty y tochki 2");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite koordinaty y tochki 2");
        }
        y2 = sc.nextInt();

        System.out.println("Vvedite koordinaty x tochki 3");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite koordinaty x tochki 3");
        }
        x3 = sc.nextInt();

        System.out.println("Vvedite koordinaty y tochki 3");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite koordinaty y tochki 3");
        }
        y3 = sc.nextInt();

        Methods.findSquareTask01(x1, x2, x3, y1, y2, y3);

    }

}

