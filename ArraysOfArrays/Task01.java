package by.AlexanderEfremenko.Homework02.ArraysOfArrays;

public class Task01 {

    public static void main(String[] args) {

        int[][] array1;

        array1 = new int[3][4];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (j == 0) {
                    array1[i][j] = 1;
                    break;
                }
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

