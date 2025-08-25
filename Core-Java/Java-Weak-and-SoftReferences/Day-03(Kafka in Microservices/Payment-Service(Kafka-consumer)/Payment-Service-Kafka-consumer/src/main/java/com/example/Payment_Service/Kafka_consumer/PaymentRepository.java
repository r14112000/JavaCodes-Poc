package com.example.Payment_Service.Kafka_consumer;

import com.example.Payment_Service.Kafka_consumer.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<Payment, String> {
}
