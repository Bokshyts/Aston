package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = "Aston";
        int num = 6;

        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
        metod1 ();
        metod2 (8);
        boolean metod3 = metod3 (-6);
        System.out.println(metod3);
        metod4 (word, num);
        metod5 ();
        metod6 ();
        metod7 ();
        metod8 ();
        metod9 ();
        metod10 ();
    }

    static void printThreeWords () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №1:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        }

    static void checkSumSign () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №2:");
        int a = 3;
        int b = 2;
        int res = a + b;
        if (res >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №3:");
        int value = 8;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №4:");
        int a = 8;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

   static void metod1 () {
       System.out.println();
        System.out.println("ЗАДАНИЕ №5:");
       Scanner scanner = new Scanner(System.in);
           System.out.print("Введите число 1:");
       int num1 = scanner.nextInt();
           System.out.print("Введите число 2:");
       int num2 = scanner.nextInt();
       int res = num1 + num2;
       boolean b = (res >= 10) && (res <= 20);
           System.out.println("Результат: " + b);
   }

    static void metod2 (int res) {
        System.out.println();
        System.out.println("ЗАДАНИЕ №6:");

        if (res >= 0) {
            System.out.println("Число " + res + " положительное");
        } else {
            System.out.println("Число " + res + " отрицательное");
        }
    }

    static boolean metod3 (int res) {
        System.out.println();
        System.out.println("ЗАДАНИЕ №7:");

        return res < 0;
    }

    static void metod4 (String word, int num) {
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ №8:");

        for (int i  = 0; i < num; i++) {
            System.out.print(word + " , ");
        }
    }

    static void metod5 () {
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ №9:");

        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите год:");
        int num = scanner.nextInt();
        boolean b = (num %4 == 0) && (num % 100 != 0) | (num % 400 == 0);
            System.out.println(b);
    }

    static void metod6 () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №10:");

        int[] arr = {0, 1, 1, 0, 1, 1, 0, 0, 0, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void metod7 () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №11:");

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(i + 1 + " ");
        }
    }

    static void metod8 () {
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ №12:");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arr));
            System.out.println("Результат:");

        boolean firstElement = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                if (!firstElement) {
                    System.out.print(", ");
                }

                System.out.print(arr[i] * 2);
                firstElement = false;
            }
        }
    }

    static void metod9 () {
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ №13:");

        int n = 5;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
            arr[i][n - i - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void metod10 () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №14:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива:");
        int len = scanner.nextInt();

        System.out.print("Введите число:");
        int initialValue = scanner.nextInt();

        int [] arr = new int [len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;

        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}