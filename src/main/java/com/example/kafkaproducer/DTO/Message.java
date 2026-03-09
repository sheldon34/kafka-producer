package com.example.kafkaproducer.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Message {
   private String title;
   private String content;


}
