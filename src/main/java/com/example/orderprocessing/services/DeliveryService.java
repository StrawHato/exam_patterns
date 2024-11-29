package com.example.orderprocessing.services;

import com.example.orderprocessing.strategies.delivery.DeliveryStrategy;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class DeliveryService {
    private final Map<String, DeliveryStrategy> deliveryStrategies;

    public DeliveryService(Map<String, DeliveryStrategy> deliveryStrategies) {
        this.deliveryStrategies = deliveryStrategies;
    }

    public void handleDelivery(String type, String addressOrPostalOffice) {
        DeliveryStrategy strategy = deliveryStrategies.get(type);
        if (strategy != null) {
            strategy.deliver(addressOrPostalOffice);
        } else {
            throw new IllegalArgumentException("Невідомий тип доставки: " + type);
        }
    }
}
