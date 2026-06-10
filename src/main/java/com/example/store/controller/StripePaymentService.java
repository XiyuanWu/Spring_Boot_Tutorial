package com.example.store.controller;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {
    
    public String Pay() {
        return "Pay with Stripe";
    }
}
