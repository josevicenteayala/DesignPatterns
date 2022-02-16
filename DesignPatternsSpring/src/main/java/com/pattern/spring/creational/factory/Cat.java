package com.pattern.spring.creational.factory;

public class Cat implements Pet {
    private String name;
    private final String type;
    private boolean isHungry;

    public Cat(String type){
        this.type = type;
    }

    @Override
    public void feed() {
        isHungry = true;
    }

    @Override
    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
}
