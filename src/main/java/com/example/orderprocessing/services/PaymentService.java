package com.example.orderprocessing.services;

import com.example.orderprocessing.strategies.payment.PaymentStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {
    private final Map<String, PaymentStrategy> paymentStrategies;

    public PaymentService(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public void handlePayment(String type) {
        PaymentStrategy strategy = paymentStrategies.get(type);
        if (strategy != null) {
            strategy.pay();
        } else {
            throw new IllegalArgumentException("Невідомий тип оплати: " + type);
        }
    }
}
