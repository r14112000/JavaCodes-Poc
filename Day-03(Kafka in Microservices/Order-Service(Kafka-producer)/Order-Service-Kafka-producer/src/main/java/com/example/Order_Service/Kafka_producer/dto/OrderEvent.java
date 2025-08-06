package com.example.Order_Service.Kafka_producer.dto;

//import lombok.*;


public class OrderEvent {
    private String orderId;
    private String customerName;
    private String itemName;
    private double amount;

    public OrderEvent() {
    }

    public OrderEvent(String orderId, String customerName, String itemName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.itemName = itemName;
        this.amount = amount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}