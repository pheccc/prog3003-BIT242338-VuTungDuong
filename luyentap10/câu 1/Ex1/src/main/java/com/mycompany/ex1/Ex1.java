/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {

      
        HashMap<Integer, String> employees = new HashMap<>();

       
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");


        String name = employees.get(102);
        System.out.println("Nhan vien ID 102: " + name);


        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        // In toàn bộ danh sách
        System.out.println("Danh sach nhan vien:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " - " + employees.get(id));
        }
    }
}