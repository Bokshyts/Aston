package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();
        metod1 ();
        metod2 ();
        metod3 ();
        metod4 ();
        metod5 ();
        metod6 ();
        metod7 ();
        metod8 ();
    }

    static void printThreeWords () {
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
        if (value < 0) {
            System.out.println("Красный");
        } else if (0 <= value) {
            System.out.println("Желтый");
        } else if (0 > 100) {
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

    static void metod2 () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №6:");

        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число:");
        int res = scanner.nextInt();
        if (res >= 0) {
            System.out.println("Число " + res + " положительное");
        } else {
            System.out.println("Число " + res + " отрицательное");
        }
    }

    static void metod3 () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №7:");

        boolean a = true;
        boolean b = false;
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число:");
        int res = scanner.nextInt();
        if (res >= 0) {
            System.out.print("Результат: " + b);
        } else {
            System.out.println("Результат: " + a);
        }
    }

    static void metod4 () {
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ №8:");

        Scanner Scanner = new Scanner(System.in);
            System.out.print("Введите слово: ");

        String word = Scanner.nextLine();
            System.out.print("Введите число: ");

        int num = Scanner.nextInt();
        String repeated = word.repeat(num);
            System.out.println(repeated);
    }

    static void metod5 () {
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
        for (int i = 0; i <= 9; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.println(Arrays.toString(arr));
        }
        // Как вывести одной строкой замененный массив не нашел
    }

    static void metod7 () {
        System.out.println();
        System.out.println("ЗАДАНИЕ №11:");

        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.print(i + " ");
        }
    }

    static void metod8 () {
        System.out.println();
        System.out.println();
        System.out.println("ЗАДАНИЕ №12:");

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arr));
            System.out.println("Результат:");
        for (int i = 0; i <= 11; i++) {
            if (arr[i] < 6) {
                System.out.print(arr[i] * 2 + ", ");
            }
        }
    }
}