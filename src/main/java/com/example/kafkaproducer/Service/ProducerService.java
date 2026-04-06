package com.example.kafkaproducer.Service;

import com.example.kafkaproducer.DTO.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class ProducerService {
    private final KafkaTemplate<String, Message> kafkaTemplate;
 public void sendMessage( Message message){
     kafkaTemplate.send("newt",message);
     System.out.println("Message sent "+ message);
 }

}
