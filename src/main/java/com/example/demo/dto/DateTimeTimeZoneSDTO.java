package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DateTimeTimeZoneSDTO {
    private String dateTime;

    private String timeZone;

    public String getDateTime() {
        return dateTime;
    }
    public void setDateTime(String string) {
        this.dateTime = string;
    }
    public String getTimeZone() {
        return timeZone;
    }
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;

    }
}
