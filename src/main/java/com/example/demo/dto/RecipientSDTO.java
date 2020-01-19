package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipientSDTO {
    private EmailAddressSDTO emailAddress;

    public EmailAddressSDTO getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(EmailAddressSDTO emailAddress) {
        this.emailAddress = emailAddress;
    }
}
