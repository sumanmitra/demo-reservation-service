package com.example.demo.service;

import java.util.function.Function;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.example.demo.controller.WebController;
import com.example.demo.dto.EventSDTO;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;


@Slf4j
@Service
public class ReservationService {
    
    public ResponseEntity<EventSDTO> createEvent(EventSDTO event) {
        log.info("Starting NON-BLOCKING Controller!");
        
        Mono<EventSDTO> response =   WebClient.create()
          .post()
          .uri(getServiceUri())
          .body( BodyInserters.fromValue(event))
          .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
          .retrieve()
                .onStatus(HttpStatus::is4xxClientError, resp -> {
                    return Mono.error(new Throwable());  // replace Throwable with your custom exception handler.
                })
          .onStatus(HttpStatus::is5xxServerError, resp -> {
              return Mono.error(new Throwable());  // replace Throwable with your custom exception handler.
          })
          .bodyToMono(EventSDTO.class);
        
        response.subscribe(eventDto ->{
            saveEvent(eventDto);
        });
       
        log.info("Exiting NON-BLOCKING Controller!");
        
        return new ResponseEntity<EventSDTO>(event,HttpStatus.CREATED);
    }
    

    private void saveEvent(EventSDTO returnedEvent) {
        log.info(returnedEvent.getId());;
        
    }

    private String getServiceUri() {
        return "http://localhost:8090/v1/calendar/events";
    }
    
    
    

}
