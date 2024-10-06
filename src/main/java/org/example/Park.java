package org.example;

public class Park {
    class Attraction {
        private String name;
        private String grafic;
        private double stoimost;

        public Attraction(String name, String grafic, double stoimost) {
            this.name = name;
            this.grafic = grafic;
            this.stoimost = stoimost;
        }

        public void someinfo1() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Режим работы: " + grafic);
            System.out.println("Стоимость: " + stoimost + " руб.");
            System.out.println();
        }
    }
}
