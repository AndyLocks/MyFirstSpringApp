package org.example.car;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    private void init() {
        System.out.println("Car init");
    }

    private void destroy() {
        System.out.println("Car is destroyed");
    }
}
