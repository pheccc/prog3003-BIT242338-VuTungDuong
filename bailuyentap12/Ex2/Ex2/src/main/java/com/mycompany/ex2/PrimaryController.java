/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.net.URI;

public class PrimaryController {

    @FXML private TextArea txtChatHistory; // Ô hiển thị nội dung chat
    @FXML private TextField txtInput;      // Ô nhập tin nhắn
    @FXML private Button btnSend;          // Nút gửi

    private ChatClient client;

    @FXML
    public void initialize() {
        // Kết nối tới Server (Đảm bảo Server đã chạy ở port 8080)
        client = new ChatClient(URI.create("ws://localhost:8080/chat"), message -> {
            // QUAN TRỌNG: Cập nhật UI phải nằm trong Platform.runLater
            Platform.runLater(() -> {
                txtChatHistory.appendText(message + "\n");
            });
        });
    }

    @FXML
    private void handleSendMessage() {
        String msg = txtInput.getText();
        if (msg != null && !msg.isEmpty()) {
            client.sendMessage("User: " + msg); // Gửi tin nhắn đi
            txtInput.clear(); // Xóa ô nhập sau khi gửi
        }
    }
}