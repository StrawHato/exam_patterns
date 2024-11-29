package com.example.orderprocessing.controllers;

import com.example.orderprocessing.models.Order;
import com.example.orderprocessing.services.DeliveryService;
import com.example.orderprocessing.services.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final DeliveryService deliveryService;
    private final PaymentService paymentService;

    public OrderController(DeliveryService deliveryService, PaymentService paymentService) {
        this.deliveryService = deliveryService;
        this.paymentService = paymentService;
    }

    @PostMapping
    public String processOrder(@RequestBody Order order) {
        // Перевірка товарів
        System.out.println("Перевірка товарів у замовленні: " + order.getProduct());

        // Обробка оплати
        paymentService.handlePayment(order.getPaymentType());

        // Вибір методу доставки
        if ("courier".equals(order.getDeliveryType())) {
            deliveryService.handleDelivery(order.getDeliveryType(), order.getAddress());
        } else if ("post".equals(order.getDeliveryType())) {
            deliveryService.handleDelivery(order.getDeliveryType(), order.getPostalOffice());
        }

        // Завершення замовлення
        System.out.println("Замовлення завершено. Підтвердження надано.");
        return "Замовлення успішно оброблено!";
    }
}
