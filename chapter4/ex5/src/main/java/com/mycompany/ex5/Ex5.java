/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ex5 {
    public static void main(String[] args) {

        Supplier<Integer> randomEven =
                () -> (int)(Math.random() * 50) * 2;

        Consumer<Integer> print =
                n -> System.out.println("So may man: " + n);

        Integer value = randomEven.get();
        print.accept(value);
    }
}
