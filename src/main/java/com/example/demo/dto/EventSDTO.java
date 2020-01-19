package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventSDTO {
    private String id;

    private String subject;

    private RecipientSDTO organizer;

    private DateTimeTimeZoneSDTO start;

    private DateTimeTimeZoneSDTO end;

    private ItemBodySDTO body;

    private LocationSDTO location;

    private List<AttendeeSDTO> attendees;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public RecipientSDTO getOrganizer() {
        return organizer;
    }
    public void setOrganizer(RecipientSDTO organizer) {
        this.organizer = organizer;
    }
    public DateTimeTimeZoneSDTO getStart() {
        return start;
    }
    public void setStart(DateTimeTimeZoneSDTO start) {
        this.start = start;
    }
    public DateTimeTimeZoneSDTO getEnd() {
        return end;
    }
    public void setEnd(DateTimeTimeZoneSDTO end) {
        this.end = end;
    }
    public void setBody(ItemBodySDTO body) {

        this.body = body;

    }

    public ItemBodySDTO getBody() {

        return this.body;

    }
    public LocationSDTO getLocation() {
        return location;
    }
    public void setLocation(LocationSDTO location) {
        this.location = location;
    }
    public List<AttendeeSDTO> getAttendees() {
        return attendees;
    }
    public void setAttendees(List<AttendeeSDTO> attendees) {
        this.attendees = attendees;
    }

}
