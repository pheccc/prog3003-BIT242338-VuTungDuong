/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;


import java.util.function.Predicate;

public class Ex3 {
    public static void main(String[] args) {

        Predicate<Integer> laSoChan = n -> n % 2 == 0;

        System.out.println(laSoChan.test(10));
        System.out.println(laSoChan.test(7));
    }
}
