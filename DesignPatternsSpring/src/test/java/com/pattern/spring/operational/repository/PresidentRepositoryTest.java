package com.pattern.spring.operational.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PresidentRepositoryTest {

    @Autowired
    private PresidentRepository presidentRepository;

    @Test
    void findByEmailAddress() {
        PresidentEntity president = presidentRepository.findByEmailAddress("Calvin.Coolidge@wh.gov");
        assertAll(
                () -> assertEquals("Calvin",president.getFirstName()),
                () -> assertEquals("",president.getMiddleInitial()),
                () -> assertEquals("Coolidge",president.getLastName())
        );
    }
}