package com.mycompany.paymentfactorydemo;

public class Main {

    public static void main(String[] args) {

        Payment p1 = PayMentFactory.createPayment("credit");
        p1.processPayment(1000);

        Payment p2 = PayMentFactory.createPayment("paypal");
        p2.processPayment(2000);

        Payment p3 = PayMentFactory.createPayment("cash");
        p3.processPayment(500);
    }
}