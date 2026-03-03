/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.qlsv;

public class main {

    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV01", "Dang Tuan Dung", 3.9));
        manager.add(new Student("SV02", "Vu Tung Duong", 4.0));
        manager.add(new Student("SV03", "Bui Minh Tu", 3.9));

        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}