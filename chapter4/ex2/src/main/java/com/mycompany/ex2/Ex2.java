/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

import java.util.*;

public class Ex2 {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Hanoi", "Ho Chi Minh", "Da Nang", "Hue"
        );

        Collections.sort(cities, (a, b) -> a.length() - b.length());

        System.out.println(cities);
    }
}
