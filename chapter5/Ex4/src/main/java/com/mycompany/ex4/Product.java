package com.mycompany.ex4;

public class Product {

    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}