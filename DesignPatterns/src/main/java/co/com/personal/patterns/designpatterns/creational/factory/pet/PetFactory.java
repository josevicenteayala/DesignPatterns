package co.com.personal.patterns.designpatterns.creational.factory.pet;

public class PetFactory {

    public static final String UNKNOWN_ANIMAL_TYPE = "Unknown animal type %s ";

    public Pet createPet(String animalType){
        switch (animalType.toLowerCase()){
            case "cat": return new Cat();
            case "dog": return new Dog();
            default: throw new UnsupportedOperationException(String.format(UNKNOWN_ANIMAL_TYPE, animalType));
        }
    }
}
