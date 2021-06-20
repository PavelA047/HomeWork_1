package hw_18062021;

public class Main {
    public static void main(String[] args) {
        System.out.println(test(8, 9));
        methodPrint(30);
        System.out.println(methodNew(-9));
        methodString(5, "Я ненавижу свою работу:) поэтому стану программистом!");
        System.out.println(year(400));
    }

    public static boolean test(int a, int b) {
        int c = a + b;
        return c > 10 && c <= 20;
    }

    public static void methodPrint(int a) {
        if (a >= 0) {
            System.out.println(a + " - число положительное");
        } else {
            System.out.println(a + " - число отрицательное");
        }
    }

    public static boolean methodNew(int a) {
        return a < 0;
    }

    public static void methodString(int a, String str) {
        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }
    }

    public static boolean year(int a) {
        if (a % 4 == 0 && a % 100 != 0) {
            return true;
        } else {
            return a % 400 == 0;
        }
    }
}
