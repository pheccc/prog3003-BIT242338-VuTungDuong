package com.mycompany.ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> list = new ArrayList<>();

        // Nhập 3 sản phẩm
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = Double.parseDouble(sc.nextLine());

            list.add(new Product(name, price));
        }

        // Xuất danh sách
        System.out.println("\nProduct List:");
        for (Product p : list) {
            System.out.println(p);
        }

        sc.close();
    }
}