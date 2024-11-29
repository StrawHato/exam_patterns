package com.example.orderprocessing.strategies.payment;

import org.springframework.stereotype.Component;

@Component("card")
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Оплата банківською карткою виконана.");
    }
}
