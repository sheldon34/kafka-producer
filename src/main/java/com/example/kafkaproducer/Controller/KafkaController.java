package com.example.kafkaproducer.Controller;

import com.example.kafkaproducer.DTO.Message;
import com.example.kafkaproducer.Service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/messages")
public class KafkaController {
private final ProducerService producerService;

@PostMapping("/newt")
    public ResponseEntity<Message> send(
            @RequestBody Message message
){
    producerService.sendMessage( message);
    return new ResponseEntity<>(message, HttpStatus.OK);
}
}
