package com.pattern.spring.structural.adapter;

public class AppleAdapter implements Apple {
    private final Orange orange;

    public AppleAdapter(Orange orange){
        this.orange = orange;
    }

    @Override
    public String getVariety() {
        return orange.getVariety();
    }

    @Override
    public void eat() {
        orange.peel();
        orange.eat();
    }
}
