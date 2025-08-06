package com.example.Order_Service.Kafka_producer.controller;


import com.example.Order_Service.Kafka_producer.dto.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;

    @PostMapping
    public String placeOrder(@RequestBody OrderEvent orderEvent) {
        kafkaTemplate.send("order-topic", orderEvent);
        return "Order Placed Successfully!";
    }
}
