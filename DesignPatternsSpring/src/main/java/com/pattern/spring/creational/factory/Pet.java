package com.pattern.spring.creational.factory;

public interface Pet {
    void feed();
    boolean isHungry();
    void setName(String name);
    String getName();
    String getType();
}
