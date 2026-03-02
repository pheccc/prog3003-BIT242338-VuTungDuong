package com.mycompany.paymentfactorydemo;

public class PayMentFactory {

    public static Payment createPayment(String type) {

        if (type.equalsIgnoreCase("credit")) {
            return new CreditCardPayment();
        } 
        else if (type.equalsIgnoreCase("paypal")) {
            return new PayPalPayment();
        } 
        else if (type.equalsIgnoreCase("cash")) {
            return new CashPayment();
        } 
        else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}