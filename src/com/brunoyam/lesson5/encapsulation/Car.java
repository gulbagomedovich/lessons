package com.brunoyam.lesson5.encapsulation;

public class Car {
    private Engine engine = new Engine();

    void start() {
        // Сначала заводится двигатель, затем машина
        engine.start();

        System.out.println("Starting car");
    }

    /*void setEngine(Engine e) {
        engine = e;
    }*/
}
