/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai2;



public class bai2 {

    public static void main(String[] args) {

        Computer c1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetooth(true)
                .build();

        Computer c2 = new Computer.ComputerBuilder("512GB", "8GB")
                .build();

        c1.showInfo();
        c2.showInfo();
    }
}