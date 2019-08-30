package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Random;

public class Task31 {

    public static void main(String[] args) {

        int[][] array1;
        int count = 0;

        array1 = new int[30][30];

        Random rand = new Random();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = rand.nextInt(999);
                System.out.printf("Mass[%d][%d]= %-6d ", i, j, array1[i][j]);
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] / 10 < 10 && array1[i][j] > 1 )
                    count = ++count;
                    System.out.printf("Mass[%d][%d]= %-6d ", i, j, array1[i][j]);

            }
            System.out.println("");
        }
        System.out.println("Count = " +count);
    }

}

