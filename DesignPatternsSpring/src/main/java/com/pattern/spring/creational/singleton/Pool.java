package com.pattern.spring.creational.singleton;

public interface Pool {

    default String getPoolName(){
        return "No name to this Pool";
    }
}
