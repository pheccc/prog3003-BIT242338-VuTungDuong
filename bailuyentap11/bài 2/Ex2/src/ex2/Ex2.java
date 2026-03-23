/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author ADMIN
 */
public class Ex2 {
    public static void main(String[] args) {

        Notification notification = new Notification();

        // Dùng Email
        notification.setMessageService(new EmailService());
        notification.notifyUser("Xin chao qua Email!");

        // Dùng SMS
        notification.setMessageService(new SMSService());
        notification.notifyUser("Xin chao qua SMS!");
    }
}