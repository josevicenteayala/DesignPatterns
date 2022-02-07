package co.com.personal.patterns.designpatterns.creational.factory.pet;

public interface Pet {
    void setName();
    String getName();
    String getType();
    boolean isHungry();
    void feed();
}
