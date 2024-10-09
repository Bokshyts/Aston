package org.example;

public class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private double salary;
    private int age;

    public Person(String name, String position, String email, int phone, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("ФИО: " + name + "\n" + "Должность: " + position + "\n" + "Email: " + email + "\n" + "Телефон: " + phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age + "\n");
    }
}
