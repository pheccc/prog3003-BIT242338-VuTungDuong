/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

public class Ex2 {
    public static void main(String[] args) {
        // Giả sử đây là ứng dụng nghe nhạc của bạn
        System.out.println("=== Ung dung Media Player ===");
        
        // Chạy file MP3 thông thường
        System.out.println("Dang phat file MP3: nhac_tre.mp3");

        // Sử dụng Adapter để chạy file VLC
        MediaAdapter adapter = new MediaAdapter();
        adapter.play("vlc", "phim_hanh_dong.vlc");
    }
}