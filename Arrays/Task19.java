package by.AlexanderEfremenko.Homework02.Arrays;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * + - 2 - 3 chasa na algoritm;
 * + - 8 chasov na realizatsuy;
 *
 * Primer rabotu :
 *
 * massiv 1 [1, 2, 2, 3, 4, 4]  <- elementu
 *
 * massiv 2 [1, 2, 2, 1, 2, 2] <- kol-vo povtorenui kagdogo elementa
 *
 * massiv 3 [1, 1, 2, 0, 4, 5] <- Indexi maximalnuh pvtorenuy elementa  (Perviu element = 1; tak kak esli bu on bul 0, to bul bu indeksom elementa
 *
 * kotoruy povtoryaetsya chasche vsego, a 1 povtoryaetsya 1 paz (eslu pervui element massiva 1  vstrechaetsya maximalnoe kol-vo paz, to massiv 3 nachinalsya bu s 0)
 *
 *
 * massiv 4 [1, 2, 4, 5, 0, 0] <- indeksu elementov iz massiva 1 kotorue povtoryautsa chasche vseh
 *
 *
 * massiv 5 [2, 2, 4, 4] <- elementu massiva 1 kotorue povtoryautsa chasche vsego
 *
 * sortirovka + ydalenie dublikatov + nahogdenie min i max
 *
 * izmenenie min u max elementa massiva 1
 *
 *
 */
public class Task19 {
    public static void main(String[] args) {
        int[] array1;
        int x;
        int n;
        int c;
        int count;
        int io = 0;
        int countElement = 0;
        int superElement;
        int min = 0;
        int max = 0;

        Scanner sc = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);

        System.out.println("Vvedite kol-vo elementov massiva ");
        while (sc.hasNextInt() == false) {
            sc.next();
            System.out.println("Vvedite kol-vo elementov massiva ");
        }
        n = sc.nextInt();

        array1 = new int[n];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vvedite " + i + " element  massiva");
            while (sx.hasNextInt() == false) {
                sx.next();
                System.out.println("Vvedite " + i + "element  massiva");
            }
            x = sx.nextInt();
            array1[i] = x;

        }

        if (n == 1) {
            System.out.println("Element kotoruy povtoryaetsya bolshe drygih = " + array1[0]);
        }

//      Kol-vo povtorenui elementa v massive
        int[] array2 = new int[array1.length];

        for (c = 0; c < array1.length; c++) {
            for (int j = 0; j < array1.length; j++) {
                count = 0;
                if (array1[c] == array1[j]) {
                    for (int g = 0; g < array1.length; g++) {
                        if (array1[c] == array1[g]) {
                            count = count + 1;
                            array2[c] = count;
                        }
                    }
                }
            }
        }

//      Nahodim maximalnoe znachenue povtoreniu
        int maxcount = 0;
        for (int h = 0; h < array1.length; h++) {
            if (array2[h] > maxcount)
                maxcount = array2[h];
        }

//      Indexi elementov povtoreniu iz massiva 2
        int[] array3 = new int[array1.length];

        for (int g = 0; g < array2.length; g++) {
//          izmenenue indexa pervogo elementa esli y nego kol-vo povtorenuy menshe chem u drugih elementov massiva 2
            if (array2[0] != maxcount) {
                array3[0] = 1;
            }
            if (array2[g] == maxcount) {
                array3[g] = g;
            }
        }

        int[] array4 = new int[array1.length];

        for (int g = 0; g < array1.length; g++) {
            if (array3[g] == g) {
                for (io = io; io < array1.length; io++) {
                    array4[io] = g;
                    io++;
                    break;
                }
            }
        }

        for (int g = 0; g < array1.length; g++) {
            if (g == 0 || array4[g] != 0) {
                countElement = countElement + 1;
            }
        }


        int[] array5 = new int[countElement];

        for (superElement = 0; superElement < countElement; superElement++) {
            array5[superElement] = array1[array4[superElement]];
        }

        for (int g = 0; g < array5.length; g++) {
            if (array5[0] != array5[g]) {
                System.out.println("Odunakovoe kol-vo povtorenui y paznuh elementov");

                // sortiruem resultat
                for (int i = 0; i < array5.length; i++) {
                    for (int j = i; j < array5.length; j++) {
                        if (array5[i] > array5[j]) {
                            int ae = array5[i];
                            array5[i] = array5[j];
                            array5[j] = ae;
                        }
                    }
                }
//              ydalyaem elementu kotorue povtoryautsa

                int b = 0;
                array5[b] = array5[0];
                for (int i = 1; i < array5.length; i++) {
                    if (array5[b] != array5[i]) {
                        b++;
                        array5[b] = array5[i];
                    }
                }
                for (int i = 0; i <= b; i++) {
                    System.out.println("Element kotoru vstrechautsya chasche vsego: " + array5[i]);
                }

//                find max and min values
                for (c = 0; c < array5.length; c++) {
                    int y = array5[0];
                    int u = array5[0];

                    // this is used to not override min value every iteration
                    if (min != 0) {
                        y = min;
                    }
                    // this is used to not override max value every iteration
                    if (max != 0) {
                        u = max;
                    }

                    // find max value
                    if (u > array5[c]) {
                        max = u;

                    } else {
                        max = array5[c];
                    }

                    // find min value
                    if (y < array5[c]) {
                        min = y;

                    } else {
                        min = array5[c];
                    }

                }

                System.out.println("max value " + max);
                System.out.println("min value " + min);

                System.out.println("Massiv 1 before changing " + Arrays.toString(array1));
                System.out.println("---------------------------");
                for (g = 0; g < array1.length; g++) {
                    if (array1[g] == min) {
                        array1[g] = max;
                    } else if (array1[g] == max) {
                        array1[g] = min;
                    }
                }
                System.out.println("Massiv 1 after changing " + Arrays.toString(array1));
                System.exit(1);
            }

        }

        System.out.println("Element kotoruy povtoryaetsya bolshe drygih = " + array5[0]);

        System.out.println("Massiv 1 before changing " + Arrays.toString(array1));
        System.out.println("---------------------------");
        System.out.println("Kol-vo povtorenui elementa v massive " + Arrays.toString(array2));
        System.out.println("---------------------------");
        System.out.println("Indexi maximalnuh pvtorenuy elementa " + Arrays.toString(array3));
        System.out.println("---------------------------");
        System.out.println("indeksu elementov iz massiva 1 kotorue povtoryautsa chasche vseh " + Arrays.toString(array4));
        System.out.println("---------------------------");
        System.out.println("elementu massiva 1 kotorue povtoryautsa chasche vsego " + Arrays.toString(array5));

    }
}