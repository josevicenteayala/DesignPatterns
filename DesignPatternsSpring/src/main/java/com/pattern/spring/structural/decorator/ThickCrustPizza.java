package com.pattern.spring.structural.decorator;

import java.math.BigDecimal;

public class ThickCrustPizza extends Pizza{

    public ThickCrustPizza() {
        super();
        this.description = "Thick Crust Pizza";
    }
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
}
