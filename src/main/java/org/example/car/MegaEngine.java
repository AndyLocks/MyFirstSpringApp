package org.example.car;

public class MegaEngine implements Engine {

    private final String name;
    private final int peed = 5000;

    public MegaEngine(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.peed;
    }
}
