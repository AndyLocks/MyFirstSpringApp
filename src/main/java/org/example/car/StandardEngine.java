package org.example.car;

public class StandardEngine implements Engine {

    private final String name;
    private final int speed = 3000;

    public StandardEngine(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
