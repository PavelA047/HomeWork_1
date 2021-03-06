package hw_22062021;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(firstMethod(first)));
        int[] second = new int[100];
        System.out.println(Arrays.toString(secondMethod(second)));
        int[] third = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(thirdMethod(third)));
        int[][] forth = new int[5][5];
        printArr(forthMethod(forth));
        System.out.println(Arrays.toString(fifthMethod(5, 6)));
        int[] sixth = {6, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        sixthMethod(sixth);
        int[] seven = {10, 4, 6, 3, 3, 2};
        System.out.println(seventhMethod(seven));
        int[] eight = new int[]{3, 5, 6, 7, 8};
        System.out.println(Arrays.toString(eightMethod(eight, -2)));
    }

    public static int[] firstMethod(int[] first) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] == 1) {
                first[i] = 0;
            } else {
                first[i] = 1;
            }
        }
        return first;
    }

    public static int[] secondMethod(int[] second) {
        for (int i = 0; i < second.length; i++) {
            second[i] = i + 1;
        }
        return second;
    }

    public static int[] thirdMethod(int[] third) {
        for (int i = 0; i < third.length; i++) {
            if (third[i] < 6) {
                third[i] *= 2;
            }
        }
        return third;
    }

    public static int[][] forthMethod(int[][] forth) {
        for (int i = 0; i < forth.length; i++) {
            for (int j = 0; j < forth[i].length; j++) {
                if (i == j || i + j == forth.length - 1) {
                    forth[i][j] = 1;
                } else {
                    forth[i][j] = 0;
                }
            }
        }
        return forth;
    }

    public static void printArr(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static int[] fifthMethod(int len, int initialValue) {
        int[] mass = new int[len];
        for (int i = 0; i < len; i++) {
            mass[i] = initialValue;
        }
        return mass;
    }

    public static void sixthMethod(int[] sixth) {
        int min = sixth[0];
        int max = sixth[0];
        for (int i : sixth) {
            if (i < min) {
                min = i;
            }
        }
        for (int i : sixth) {
            if (i > max) {
                max = i;
            }
        }
        /*Arrays.sort(sixth);
        int max = sixth[sixth.length - 1];
        int min = sixth[0];*/
        System.out.println("???????????????????? ??????????: " + min);
        System.out.println("???????????????????? ??????????: " + max);
    }

    public static boolean seventhMethod(int[] seven) {
        int sum = 0;
        int sumStep = 0;
        for (int j : seven) {
            sum += j;
        }
        if (sum % 2 != 0) {
            return false;
        }
        int i = 0;
        while (sumStep < sum / 2) {
            sumStep += seven[i];
            i++;
        }
        return sumStep == sum / 2;
    }

    public static int[] eightMethod(int[] eight, int n) {
        int k = n % eight.length + eight.length;
        for (int i = 0; i < k; i++) {
            int tmp = eight[eight.length - 1];
            for (int j = eight.length - 1; j > 0; j--) {
                eight[j] = eight[j - 1];
            }
            eight[0] = tmp;
        }
        return eight;
    }
}
