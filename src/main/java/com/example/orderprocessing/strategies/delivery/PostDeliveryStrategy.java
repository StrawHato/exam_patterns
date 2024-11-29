package com.example.orderprocessing.strategies.delivery;

import org.springframework.stereotype.Component;

@Component("post")
public class PostDeliveryStrategy implements DeliveryStrategy {
    @Override
    public void deliver(String postalOffice) {
        System.out.println("Доставка на поштове відділення: " + postalOffice);
    }
}
