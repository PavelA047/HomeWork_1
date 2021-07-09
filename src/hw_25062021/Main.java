package hw_25062021;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X, DOTS_TO_WIN)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0, DOTS_TO_WIN)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (char[] chars : map) {
            Arrays.fill(chars, DOT_EMPTY);
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X, Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static void aiTurn() {
        int x, y;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_0;
                    if (checkWin(DOT_0, DOTS_TO_WIN)) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X, DOTS_TO_WIN)) {
                        map[i][j] = DOT_0;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_0;
                    if (checkWin(DOT_0, DOTS_TO_WIN - 1) &&
                            Math.random() < 0.5) {
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j)) {
                    map[i][j] = DOT_X;
                    if (checkWin(DOT_X, DOTS_TO_WIN - 1) &&
                            Math.random() < 0.5) {
                        map[i][j] = DOT_0;
                        return;
                    }
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_0;
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
    }

    public static boolean checkWin(char symb, int dot) {
        for (int xx = 0; xx < SIZE - dot + 1; xx++) {
            for (int yy = 0; yy < SIZE - dot + 1; yy++) {
                if (checkD(symb, xx, yy, dot) || checkL(symb, xx, yy, dot)) return true;
            }
        }
        return false;
    }

    public static boolean checkD(char symb, int xx, int yy, int dot) {
        boolean right = true;
        boolean left = true;
        for (int i = 0; i < dot; i++) {
            right &= map[i + xx][i + yy] == symb;
            left &= map[dot - 1 - i + xx][i + yy] == symb;
        }
        return right || left;
    }

    public static boolean checkL(char symb, int xx, int yy, int dot) {
        boolean line;
        boolean column;
        for (int i = xx; i < dot + xx; i++) {
            line = true;
            column = true;
            for (int j = yy; j < dot + yy; j++) {
                line &= map[i][j] == symb;
                column &= map[j][i] == symb;
            }
            if (line || column) return true;
        }
        return false;
    }
}