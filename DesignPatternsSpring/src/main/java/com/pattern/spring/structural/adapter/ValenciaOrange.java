package com.pattern.spring.structural.adapter;

public class ValenciaOrange implements Orange {

    @Override
    public String getVariety() {
        return "Valencia Orange";
    }

    @Override
    public void eat() {
        System.out.println("Valencia gets enjoyed");
    }

    @Override
    public void peel() {
        System.out.println("Valencia gets peeled");
    }

    @Override
    public void juice() {
        System.out.println("Valencia gets juiced");
    }
}
