package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactSDTO {
    private String id;

    private String givenName;

    private String surname;

    private String companyName;

    private EmailAddressSDTO[] emailAddresses;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getGivenName() {
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public EmailAddressSDTO[] getEmailAddresses() {
        return emailAddresses;
    }
    public void setEmailAddresses(EmailAddressSDTO[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }
}
