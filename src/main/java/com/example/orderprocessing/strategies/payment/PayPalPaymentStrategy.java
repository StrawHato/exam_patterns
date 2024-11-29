package com.example.orderprocessing.strategies.payment;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Оплата через PayPal виконана.");
    }
}
