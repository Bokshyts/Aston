package org.example;

public class Park {
    class Attraction {
        private String name;
        private String timeWork;
        private double price;

        public Attraction(String name, String timeWork, double price) {
            this.name = name;
            this.timeWork = timeWork;
            this.price = price;
        }

        public void printInfo2() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Режим работы: " + timeWork);
            System.out.println("Стоимость: " + price + " руб.");
        }
    }
}
