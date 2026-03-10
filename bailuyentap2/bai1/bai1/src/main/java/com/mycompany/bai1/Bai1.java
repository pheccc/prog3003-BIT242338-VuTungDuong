/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;



import java.util.TreeSet;

public class Bai1 {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sach sau khi sap xep:");
        System.out.println(names);

        System.out.println("Phan tu nho nhat: " + names.first());
        System.out.println("Phan ta lon nhat: " + names.last());
    }
}