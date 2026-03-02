package com.mycompany.paymentfactorydemo;

public class CashPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Cash payment: $" + amount);
    }
}