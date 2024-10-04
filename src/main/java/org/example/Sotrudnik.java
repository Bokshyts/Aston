package org.example;

public class Sotrudnik {
    public String name;
    public String doljnost;
    public String email;
    public int phone;
    public double zarplata;
    public int age;

    public Sotrudnik(){
        name = "Bokshyts Oleg";
        doljnost = "drive";
        email = "bokshyts@gmail.com";
        phone = 6982649;
        zarplata = 120.20;
        age = 25;
    }

    public void someinfo(){
        System.out.println("ФИО: " + name + "   Должность: " + doljnost + "   Email: " + email + "   Телефон: " + phone + "   Зарплата: " + zarplata + "   Возраст: " + age);
    }
}
