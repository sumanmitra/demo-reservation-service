package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailAddressSDTO {
    private String name;

    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public EmailAddressSDTO clone() {
        EmailAddressSDTO temp = new EmailAddressSDTO();
        temp.setAddress(this.getAddress());
        temp.setName(this.getName());
        return temp;
    }
}
