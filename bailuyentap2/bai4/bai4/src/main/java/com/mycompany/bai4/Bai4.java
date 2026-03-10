/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4;


import javax.swing.*;

public class Bai4 extends JFrame {

    JTextField txtC;
    JButton btn;
    JLabel result;

    public Bai4() {

        setTitle("Temperature Converter");

        txtC = new JTextField(10);
        btn = new JButton("Convert");
        result = new JLabel("Result: ");

        btn.addActionListener(e -> {

            double c = Double.parseDouble(txtC.getText());
            double f = c * 9 / 5 + 32;

            result.setText("Fahrenheit: " + f);
        });

        setLayout(new java.awt.FlowLayout());

        add(new JLabel("Celsius:"));
        add(txtC);
        add(btn);
        add(result);

        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Bai4();
    }
}