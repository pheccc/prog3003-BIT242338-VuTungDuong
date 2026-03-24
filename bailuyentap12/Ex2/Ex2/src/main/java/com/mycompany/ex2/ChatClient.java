/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;


import jakarta.websocket.*;
import java.net.URI;

@ClientEndpoint
public class ChatClient {
    private Session session;
    private MessageListener listener;

    public interface MessageListener {
        void onMessage(String message);
    }

    public ChatClient(URI endpointURI, MessageListener listener) {
        try {
            WebSocketContainer container = ContainerProvider.getWebSocketContainer();
            container.connectToServer(this, endpointURI);
            this.listener = listener;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnOpen
    public void onOpen(Session session) {
        this.session = session;
        System.out.println("Connected to server");
    }

    @OnMessage
    public void onMessage(String message) {
        if (listener != null) {
            listener.onMessage(message);
        }
    }

    public void sendMessage(String message) {
        try {
            if (this.session != null && this.session.isOpen()) {
                this.session.getBasicRemote().sendText(message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}