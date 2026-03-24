/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;


import org.glassfish.tyrus.server.Server;
import java.util.Scanner;

public class ChatServerLauncher {
    public static void main(String[] args) {
        // Khởi tạo Server tại localhost, cổng 8080, đường dẫn /chat
        Server server = new Server("localhost", 8080, "/chat", null, ChatServer.class);

        try {
            server.start();
            System.out.println("--- SERVER ĐÃ CHẠY TẠI ws://localhost:8080/chat/chat ---");
            System.out.println("Nhấn Enter để dừng Server...");
            new Scanner(System.in).nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            server.stop();
        }
    }
}