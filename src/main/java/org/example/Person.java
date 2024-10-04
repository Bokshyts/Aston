package org.example;

public class Person {
    String name;
    String doljnost;
    String email;
    String phone;
    String zarplata;
    String age;

    public Person(String _name, String _doljnost, String _email, String _phone, String _zarplata, String _age){
        name = _name;
        doljnost = _doljnost;
        email = _email;
        phone = _phone;
        zarplata = _zarplata;
        age = _age;
    }

    public void printinfo(){
        System.out.println("ФИО: " + name + "   Должность: " + doljnost + "   Email: " + email + "   Телефон: " + phone + "   Зарплата: " + zarplata + "   Возраст: " + age);
    }
}
