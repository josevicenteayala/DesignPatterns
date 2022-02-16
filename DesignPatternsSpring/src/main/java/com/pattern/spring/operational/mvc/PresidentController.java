package com.pattern.spring.operational.mvc;

import com.pattern.spring.creational.builder.Contact;
import com.pattern.spring.creational.builder.ContactBuilder;
import com.pattern.spring.operational.repository.PresidentEntity;
import com.pattern.spring.operational.repository.PresidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(path = "/presidents")
public class PresidentController {

    @Autowired
    private PresidentRepository presidentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/{id}")
    public PresidentEntity getPresidentById(@PathVariable Long id) {
        return presidentRepository.findById(id).get();
    }

    @GetMapping(path = "/presidentContact/{id}")
    public Contact getPresidentContactById(@PathVariable Long id) {
        PresidentEntity president = restTemplate.getForEntity("http://localhost:8080/presidents/{id}", PresidentEntity.class, id).getBody();
        return new ContactBuilder()
                .setFirstName(president.getFirstName())
                .setLastName(president.getLastName())
                .setEmailAddress(president.getEmailAddress())
                .buildContact();
    }


}
