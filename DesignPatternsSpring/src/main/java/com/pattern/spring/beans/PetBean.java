package com.pattern.spring.beans;

public class PetBean {
    private String welcomeMessage;

    public PetBean(String welcomeMessage) {
        this.setWelcomeMessage(welcomeMessage);
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }
}
