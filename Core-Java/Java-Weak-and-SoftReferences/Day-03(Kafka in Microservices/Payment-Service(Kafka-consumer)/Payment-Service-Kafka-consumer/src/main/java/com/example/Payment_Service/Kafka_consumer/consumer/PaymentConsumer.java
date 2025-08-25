package com.example.Payment_Service.Kafka_consumer.consumer;


import com.example.Payment_Service.Kafka_consumer.Entity.Payment;
import com.example.Payment_Service.Kafka_consumer.PaymentRepository;
import com.example.Payment_Service.Kafka_consumer.dto.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {

    @Autowired
    private PaymentRepository repository;

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void consume(OrderEvent orderEvent) {
        Payment payment = new Payment(
                orderEvent.getOrderId(),
                orderEvent.getCustomerName(),
                orderEvent.getItemName(),
                orderEvent.getAmount()
        );
        repository.save(payment);
        System.out.println("Payment received and saved: " + payment);
    }
}
