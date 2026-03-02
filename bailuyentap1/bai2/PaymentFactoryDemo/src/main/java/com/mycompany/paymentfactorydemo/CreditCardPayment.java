package com.mycompany.paymentfactorydemo;

public class CreditCardPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card payment: $" + amount);
    }
}