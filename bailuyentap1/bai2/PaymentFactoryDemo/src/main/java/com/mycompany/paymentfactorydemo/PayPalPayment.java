package com.mycompany.paymentfactorydemo;

public class PayPalPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment: $" + amount);
    }
}