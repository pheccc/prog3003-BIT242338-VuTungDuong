/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;
public class Ex1 {
    public static void main(String[] args) {

        // Cộng
        MathOperation add = (a, b) -> a + b;

        // Trừ
        MathOperation subtract = (a, b) -> a - b;

        // Nhân
        MathOperation multiply = (a, b) -> a * b;

        // Chia
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Khong chia đuoc cho 0");
            }
            return a / b;
        };

        int a = 10, b = 5;

        System.out.println("Cong: " + add.compute(a, b));
        System.out.println("Tru: " + subtract.compute(a, b));
        System.out.println("Nhan: " + multiply.compute(a, b));
        System.out.println("Chia: " + divide.compute(a, b));
    }
}