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

@PostMapping("/{topic}")
    public ResponseEntity<Message> send(
            @PathVariable String topic,
            @RequestBody Message message
){
    producerService.sendMessage(topic, message);
    return new ResponseEntity<>(message, HttpStatus.OK);
}
}
