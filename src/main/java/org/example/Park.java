package org.example;

public class Park {
    String atraction;
    String grafic;
    String stoimost;

    public Park(String atraction, String grafic, String stoimost) {
        this.atraction = atraction;
        this.grafic = grafic;
        this.stoimost = stoimost;
    }

    public void someinfo3() {
        System.out.println("Название аттракциона: " + atraction + "   График работы: " + grafic + "   Стоимость: " + stoimost);
    }
}
