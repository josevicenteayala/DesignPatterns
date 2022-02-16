package com.pattern.spring.controller.factory;

import com.pattern.spring.beans.PetBean;
import com.pattern.spring.creational.factory.Pet;
import com.pattern.spring.creational.factory.PetFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetFactory petFactory;

    @GetMapping("welcome")
    public PetBean getWelcomePetMessage() {
        return new PetBean("Welcome to the factory pets solution");
    }

    @PostMapping("adoptPet/{type}/{name}")
    public Pet adoptPet(@PathVariable("type") String type, @PathVariable("name") String name){
        Pet pet = this.petFactory.createPet(type);
        pet.setName("Json");
        pet.feed();
        return pet;
    }
}
