/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;


import java.util.*;
import java.util.function.Function;

public class Ex4 {
    public static void main(String[] args) {

        List<String> moneyStr = Arrays.asList("$10", "$20", "$50");

        Function<String, Integer> convert =
                s -> Integer.parseInt(s.replace("$", ""));

        List<Integer> result = new ArrayList<>();

        for (String s : moneyStr) {
            result.add(convert.apply(s));
        }

        System.out.println(result);
    }
}
