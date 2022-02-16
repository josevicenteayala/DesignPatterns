package com.pattern.spring.controller.builder;

import com.pattern.spring.creational.builder.Contact;
import com.pattern.spring.creational.builder.ContactBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @GetMapping("presidents")
    public List<Contact> getPresidents() {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new ContactBuilder().setFirstName("Donald").setLastName("Trump").setEmailAddress("donalT@email.com").buildContact());
        contacts.add(new ContactBuilder().setFirstName("George").setLastName("Bush").setEmailAddress("georgeB@email.com").buildContact());
        contacts.add(new ContactBuilder().setFirstName("Barack").setLastName("Obama").setEmailAddress("barackO@email.com").buildContact());
        return contacts;
    }

}
