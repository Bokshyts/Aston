package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Sotrudnik sotrudnik = new Sotrudnik();
        sotrudnik.someinfo();

        System.out.println();
        System.out.println("Задание 2:");

        Person [] persarr = new Person[5];
        persarr [0] = new Person ("Иван Иванов", "Менеджер", "ivanov@mail.ru", "3689582", "635000.00", "26");
        persarr [1] = new Person ("Сергей Сергеев", "Уборщик", "sergeev@mail.ru", "6927136", "30000.35", "48");
        persarr [2] = new Person ("Вячеслав Вячеславов", "Водитель", "Vyacheslavov@mail.ru", "32649832", "120000.99", "35");
        persarr [3] = new Person ("Виктор Викторов", "Директор", "victorov@mail.ru", "32469731", "1236000.00", "50");
        persarr [4] = new Person ("Леонид Леонидов", "Секретарь", "leonidov@mail.ru", "1384628", "128000.00", "36");

        for (Person person : persarr)
            person.printinfo();

        System.out.println();
        System.out.println("Задание 3:");

        Park park = new Park("Колесо обозрения", "с 9.00-22.00", "5 рублей");
        park.someinfo3();
    }
}