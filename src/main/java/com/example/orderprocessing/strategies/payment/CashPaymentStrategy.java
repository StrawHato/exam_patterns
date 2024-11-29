package com.example.orderprocessing.strategies.payment;

import org.springframework.stereotype.Component;

@Component("cash")
public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Оплата готівкою при доставці підтверджена.");
    }
}
