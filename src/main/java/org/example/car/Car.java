package org.example.car;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void init() {
        System.out.println("Car init");
    }

    public void destroy() {
        System.out.println("Car is destroyed");
    }
}
