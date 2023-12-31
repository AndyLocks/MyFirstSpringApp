package org.example.car;

public class StandardEngine implements Engine {

    private final String name;
    private final int speed = 3000;
    private String id;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

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
