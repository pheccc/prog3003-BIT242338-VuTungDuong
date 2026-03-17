/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer vlcPlayer;

    public MediaAdapter() {
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        }
    }
}