package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

import java.util.Random;

public class Task02 {

    public static void main(String[] args) {

        int[][] array1;

        array1 = new int[2][3];

        Random rand = new Random();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = rand.nextInt(10);
            }
        }

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.printf("Mass[%d][%d]= %-6d ", i, j, array1[i][j]);

            }
            System.out.println("");
        }
    }

}

