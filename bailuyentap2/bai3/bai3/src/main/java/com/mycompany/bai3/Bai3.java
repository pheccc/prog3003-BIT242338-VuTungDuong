/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3;

import java.util.concurrent.CompletableFuture;

public class Bai3 {

    public static void main(String[] args) {

        CompletableFuture<String> task1 =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                    }

                    System.out.println("Xac thuc khach hang xong");
                    return "Customer Valid";
                });

        CompletableFuture<String> task2 =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                    }

                    System.out.println("Xuat ve xem phim xong");
                    return "Ticket Printed";
                });

        CompletableFuture<String> result =
                task1.thenCombine(task2, (a, b) -> a + " & " + b);

        System.out.println("Ket qua: " + result.join());
    }
}