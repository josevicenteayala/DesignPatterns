package com.pattern.spring.creational.factory;

import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class PetFactory {
    public Pet createPet(String animalType){
        switch (animalType.toLowerCase(Locale.ROOT)){
            case "dog": return new Dog("Bulldog");
            case "cat": return new Cat("Tiger");
            default: throw new UnsupportedOperationException("Unknown animal type");
        }
    }
}
