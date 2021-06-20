package hw_15062021;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColour();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = 9;
        int c = a + b;
        if(c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColour() {
        int value = 14;
        if(value <= 0) {
            System.out.println("Красный");
        } else if(0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 31;
        int b = 54;
        if(a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
