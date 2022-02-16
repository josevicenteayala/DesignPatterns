package com.pattern.spring.creational.builder;

public class Contact {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Contact(String firstName, String lastName, String emailAddress){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmailAddress(emailAddress);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
