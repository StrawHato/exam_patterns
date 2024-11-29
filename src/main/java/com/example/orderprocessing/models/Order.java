package com.example.orderprocessing.models;

import lombok.Data;

@Data
public class Order {
    private Long id;
    private String product;
    private String deliveryType;
    private String paymentType;
    private String address;
    private String postalOffice;
    private boolean isConfirmed;
}