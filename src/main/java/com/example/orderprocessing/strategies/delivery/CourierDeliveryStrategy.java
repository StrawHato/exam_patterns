package com.example.orderprocessing.strategies.delivery;

import org.springframework.stereotype.Component;

@Component("courier")
public class CourierDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver(String address) {
        System.out.println("Доставка кур'єром на адресу: " + address);
    }
}
