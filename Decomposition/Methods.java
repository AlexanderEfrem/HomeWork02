package by.AlexanderEfremenko.Homework02.Decomposition;

import java.util.Arrays;

public class Methods {

    public static void findSquareTask01(int x1, int x2, int x3, int y1, int y2, int y3) {

        double square;

        square = 0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1));

        System.out.println("Square = " + square);

    }

    public static int findTheMostBiggestDividerTask02(int x1, int x2) {   //Also task 03 and 04
        int min;
        int nod = 0;

        if (x1 < x2) {
            min = x1;
        } else {
            min = x2;
        }

        for (int i = 1; i <= min; i++) {
            if (x1 % i == 0 && x2 % i == 0) {
                nod = i;
            }
        }

        return nod;
    }

    public static int findTheMostLowestMultipleTask02(int x1, int x2) { //Also task 03 and 04

        int nok;

        nok = (x1 * x2) / findTheMostBiggestDividerTask02(x1, x2);

        return nok;
    }

    public static int findMinimalValueTask05(int x1, int x2, int x3) {

        int min;

        if (x1 <= x2) {
            min = x1;
        } else {
            min = x2;
        }

        if (x3 <= min) {
            min = x3;
        }
        return min;
    }

    public static int findMaximalValueTask05(int x1, int x2, int x3) {

        int max;

        if (x1 >= x2) {
            max = x1;
        } else {
            max = x2;
        }

        if (x3 >= max) {
            max = x3;
        }
        return max;
    }

    public static int findSumOfMaxAndMinValues(int x1, int x2, int x3) {

        int sum;

        sum = findMaximalValueTask05(x1, x2, x3) + findMinimalValueTask05(x1, x2, x3);

        return sum;

    }

    public static double findSquareOfTriangleTask06(int x1) {

        double s;

        s = ((x1 * x1 * Math.sqrt(3)) / 4);

        return s;
    }

    public static double findSquareOfSexangleTask06(int x1) {

        double s;

        s = findSquareOfTriangleTask06(x1) * 6;

        return s;
    }

    public static double findDistanceBetweenDotsTask07(int x1, int y1, int x2, int y2) {

        double distance;

        distance = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));

        return distance;

    }

    public static int findMaxValueInArrayTask08(int[] x1) {

        int max;

        max = x1[0];

        for (int i = 0; i < x1.length; i++) {

            if (x1[i] > max) {
                max = x1[i];
            }
        }
        return max;
    }

    public static int findValueThatLowerMaxValueFor1Task08(int[] x1) {

        int valueThatWeNeed;
        int max;

        max = findMaxValueInArrayTask08(x1);

        valueThatWeNeed = x1[0];

        for (int i = 0; i < x1.length; i++) {
            if (x1[i] < max && x1[i] > valueThatWeNeed) {
                valueThatWeNeed = x1[i];
            }
        }
        return valueThatWeNeed;
    }

    public static boolean task09(int x1, int x2, int x3) {
        boolean z = false;
        int[] array1 = new int[3];
        int count = 0;

        array1[0] = x1;
        array1[1] = x2;
        array1[2] = x3;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 1) {
                for (int g = 2; g < array1[i]; g++) {
                    if (array1[i] % g != 0) {
                        z = true;
                    } else {
                        z = false;
                        count = ++count;
                        break;
                    }
                }
            } else {
                z = false;
                count = ++count;
            }

        }
        if (count != 0) {
            z = false;
        }
        return z;
    }

    public static int[] factorialFrom1To9Task10(boolean x1) {

        int[] array1;
        int i;
        int j = 0;
        array1 = new int[9];

        if (x1 == true) {

            for (i = 1; i < 10; i++) {
                for (j = j; j < 10; j++) {
                    if (i >= 2) {
                        array1[j] = array1[j - 1] * i;
                        j = ++j;
                        break;
                    } else if (array1[j] < 2) {
                        array1[0] = i;
                        j = ++j;
                        break;
                    }
                }
            }
        }
        System.out.println("Massiv 1 before changing " + Arrays.toString(array1));
        return array1;
    }

    public static int factorialSumTask10(boolean x2) {

        int[] array1;
        int sum = 0;

        boolean start = true;

        if (x2 == true) {
            array1 = factorialFrom1To9Task10(start);

            for (int i = 0; i < array1.length; i++) {
                if (i % 2 == 0) {
                    sum = sum + array1[i];
                }
            }
        }
        return sum;
    }

    public static int SumOf3NearestElementsTask11(int[] x1, int x2, int x3) {

        int sum = 0;

        for (x2 = x2; x2 < x3; x2++) {
            sum = sum + x1[x2];

        }
        return sum;
    }

    public static double findSquareOfTriangleTask12(int x1, int x2, int x3) {

        double p;
        double s_tr;

        p = (x1 + x2 + x3) / 2;
        s_tr = Math.sqrt(p * (p - x1) * (p - x2) * (p - x3));

        return s_tr;
    }

    public static double findSquareOfRectangleTask12(int x1, int x2) {

        double s;

        s = x1 * x2 / 2;

        return s;
    }

    public static double findSquareOfQuadrangleTask12(int x1, int x2, int x3, int x4) {

        double d;
        double s = 0;

        d = Math.sqrt(x1 * x1 + x2 * x2);

        if (x3 + x4 > d) {
            s = findSquareOfRectangleTask12(x1, x2) + findSquareOfTriangleTask12(x3, x4, (int) d);
        } else {
            System.out.println("Quadrangle unreal");
        }
        return s;
    }

    public static int[] createArrayFromNumber(int x1) {

        int count = 0;
        int x2 = x1;
        int[] array1;

        while (x2 >= 1) {
            x2 = x2 / 10;
            count = ++count;
        }
        array1 = new int[count];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = x1 % 10;
            x1 = x1 / 10;
        }
        return (array1);
    }

    public static int findInWhatNumberTheAreMoreValues(int x1, int x2) {
        int count1 = 0;
        int count2 = 0;
        int x3 = x1;
        int x4 = x2;

        while (x3 >= 1) {
            x3 = x3 / 10;
            count1 = ++count1;
        }

        while (x4 >= 1) {
            x4 = x4 / 10;
            count2 = ++count2;
        }

        if (count1 > count2) {
            return x1;
        } else {
            return x2;
        }
    }

    public static int[] createArrayforTask15(int x1, int x2) {
        int[] array1;
        int[] array2;
        int sum;
        int count = 0;
        int n = 0;

        for (int i = 1; i < x2; i++) {
            array1 = createArrayFromNumber(i);
            sum = Arrays.stream(array1).sum();
            if (sum == x1) {
                count = ++count;
            }
        }

        array2 = new int[count];

        for (int i = 1; i < x2; i++) {
            array1 = createArrayFromNumber(i);
            sum = Arrays.stream(array1).sum();
            if (sum == x1) {
                for (n = n; n < count; n++) {
                    array2[n] = i;
                    n = ++n;
                    break;
                }
            }
        }
        return array2;
    }

    public static int[] task16(int x1) {
        int[] array1;
        int z;
        int count = 0;
        int g = 0;
        int newg;

        for (int i = x1; i <= x1 * 2; i++) {
            z = Math.abs(i + 2 - i);
            if (z == 2) {
                count = ++count;
                System.out.println("Count" + count);
            }
        }

        array1 = new int[count];
        for (int i = x1; i <= x1 * 2; i++) {
            z = Math.abs(i - i + 2);
            if (z == 2) {
                for (g = g; g < array1.length; g++) {
                    array1[g] = i;
                    g = ++g;
                    array1[g] = i + 2;
                    g = ++g;
                    break;
                }
            }
        }
        return (array1);
    }

    public static int[] task17(int x) {

        int[] array1;
        int[] array2;
        int count = 0;
        int g = 0;
        int sum;

        for (int i = 1; i < x; i++) {
            array1 = createArrayFromNumber(i);
            sum = Arrays.stream(array1).sum();
            if (sum * sum == i) {
                count = ++count;
            }
        }

        array2 = new int[count];
        for (int i = 1; i < x; i++) {
            array1 = createArrayFromNumber(i);
            sum = Arrays.stream(array1).sum();
            if (sum * sum == i) {
                for (g = g; g < array2.length; g++) {
                    array2[g] = i;
                    g = ++g;
                    break;
                }
            }
        }
        return array2;
    }

    public static int[] task18(int x) {
        double z;
        int[] array1;
        int[] array2;
        int count = 0;
        int count2 = 0;
        int l = 0;

        z = Math.pow(10, x - 1);

        for (int i = (int) z; i < Math.pow(10, x); i++) {
            array1 = createArrayFromNumber(i);
            count = 0;
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] - array1[j + 1] == 1 && array1[j + 1] != 0) {
                    count = ++count;
                    if (count == array1.length - 1) {
                        count2 = ++count2;
                        break;
                    }
                }
            }
        }

        array2 = new int[count2];
        for (int i = (int) z; i < Math.pow(10, x); i++) {
            array1 = createArrayFromNumber(i);
            count = 0;
            for (int j = 0; j < array1.length - 1; j++) {
                if (array1[j] - array1[j + 1] == 1 && array1[j + 1] != 0) {
                    count = ++count;
                    if (count == array1.length - 1) {
                        for (l = l; l < array2.length; l++) {
                            array2[l] = i;
                            l = ++l;
                            break;
                        }
                    }
                }
            }
        }
        return array2;
    }

    public static int[] task19(int x1) {

        double z;
        int[] array1;
        int[] array2;
        int count = 0;
        int count2 = 0;
        int l = 0;

        z = Math.pow(10, x1 - 1);

        for (int i = (int) z; i < Math.pow(10, x1); i++) {
            array1 = createArrayFromNumber(i);
            count = 0;
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] % 2 != 0) {
                    count = ++count;
                    if (count == array1.length) {
                        count2 = ++count2;
                        break;
                    }
                }
            }
        }

        array2 = new int[count2];
        for (int i = (int) z; i < Math.pow(10, x1); i++) {
            array1 = createArrayFromNumber(i);
            count = 0;
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] % 2 != 0) {
                    count = ++count;
                    if (count == array1.length) {
                        for (l = l; l < array2.length; l++) {
                            array2[l] = i;
                            l = ++l;
                            break;
                        }
                    }
                }
            }
        }
        return array2;
    }

    public static int task20(int x) {

        int[] array1;
        int count = 0;
        int sum;

        while (x > 0) {
            array1 = createArrayFromNumber(x);
            sum = Arrays.stream(array1).sum();
            x = x - sum;
            count = ++count;


        }
        return count;
    }

}




