package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.example.demo.dto.EventSDTO;
import com.example.demo.service.ReservationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class WebController {
    
    
    @Autowired
    private ReservationService reservationService;


    @PostMapping(value = "v1/calendar/events")
    public ResponseEntity<EventSDTO> createEvent(@RequestBody EventSDTO event) {

        return reservationService.createEvent(event);
    }
    
    @ExceptionHandler(WebClientResponseException.class)
    public void handleWebClientResponseException(WebClientResponseException ex) {
        log.error("Error from WebClient - Status {}, Body {}", ex.getRawStatusCode(), ex.getResponseBodyAsString(), ex);
    }



    


}
