package com.pattern.spring.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleAdapterTest {

    @Test
    void getVariety() {
    }

    @Test
    void eat() {
    }

    @Test
    void testAdapter(){
        Orange orange = new ValenciaOrange();
        Apple apple = new AppleAdapter(orange);
        System.out.println(apple.getVariety());
        apple.eat();
    }
}