package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Scanner;

public class Task03 {
    public  static  void main(String[] args) {
        int x1;
        int x2;
        int x3;
        int x4;
        int nod;

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

        System.out.println("Vvedite chislo 4");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite chislo 4");
        }
        x4 = sc.nextInt();

       nod = Methods.findTheMostBiggestDividerTask02( Methods.findTheMostBiggestDividerTask02(x1, x2), Methods.findTheMostBiggestDividerTask02(x3,x4));

       System.out.println("NOD = " + nod);

    }

}
