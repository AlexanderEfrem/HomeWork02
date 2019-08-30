package by.AlexanderEfremenko.Homework02.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        int [] array1;
        int k;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Vvedite element k");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite element k");
        }
        k = sc.nextInt();

        array1 = new int[5];

        for (int i =0; i <array1.length; i++) {
            array1[i] = i;
            if (i % k == 0) {
                sum = sum + i;

            }
        }
        if (sum > 0) {
            System.out.println("Summa elementov = " +sum);

        } else {
            System.out.println("Net elementov kratnuh K");
        }

    }

}
