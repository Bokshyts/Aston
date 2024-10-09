package org.example;

import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Person person1 = new Person("Бокшиц Олег", "QA Engineer", "o.bokshyts@gmail.com", "+375(29)623-79-02", 320000.36, 29);
        person1.printInfo();

        System.out.println();
        System.out.println("Задание 2:");

        Person [] persarr = new Person[5];
        persarr [0] = new Person ("Иван Иванов", "Менеджер", "ivanov@mail.ru", "+375(29)368-95-82", 635000.00, 26);
        persarr [1] = new Person ("Сергей Сергеев", "Уборщик", "sergeev@mail.ru", "+375(33)692-71-36", 30000.35, 48);
        persarr [2] = new Person ("Вячеслав Вячеславов", "Водитель", "Vyacheslavov@mail.ru", "+375(44)326-49-32", 120000.99, 35);
        persarr [3] = new Person ("Виктор Викторов", "Директор", "victorov@mail.ru", "+375(29)324-69-31", 1236000.00, 50);
        persarr [4] = new Person ("Леонид Леонидов", "Секретарь", "leonidov@mail.ru", "+375(44)138-46-28", 128000.00, 36);

        for (Person person : persarr)
            person.printInfo();

        System.out.println();
        System.out.println("Задание 3:");

        Park park = new Park();
        Park.Attraction attraction = park.new Attraction("Колесо обозрения", "9.00-22.00", 8.54);
        attraction.printInfo2();
    }
}

