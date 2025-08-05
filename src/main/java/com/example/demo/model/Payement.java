package com.example.demo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payement {
    private String id;
    private String date;
    private double amount;
    private String paymentMethod;
    private PaymentStatus status;
}
