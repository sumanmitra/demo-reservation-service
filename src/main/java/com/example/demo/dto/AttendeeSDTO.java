package com.example.demo.dto;

public class AttendeeSDTO {

    private EmailAddressSDTO emailAddress;

    private String type;

    public EmailAddressSDTO getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddressSDTO emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
