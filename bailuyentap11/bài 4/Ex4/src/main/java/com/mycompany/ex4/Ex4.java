/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex4 extends Application {

    @Override
    public void start(Stage stage) {

        TextField num1 = new TextField();
        TextField num2 = new TextField();
        Label result = new Label("Kết quả:");

        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");

        add.setOnAction(e -> calculate(num1, num2, result, "+"));
        sub.setOnAction(e -> calculate(num1, num2, result, "-"));
        mul.setOnAction(e -> calculate(num1, num2, result, "*"));
        div.setOnAction(e -> calculate(num1, num2, result, "/"));

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(new Label("Số 1:"), 0, 0);
        grid.add(num1, 1, 0);
        grid.add(new Label("Số 2:"), 0, 1);
        grid.add(num2, 1, 1);

        grid.add(add, 0, 2);
        grid.add(sub, 1, 2);
        grid.add(mul, 0, 3);
        grid.add(div, 1, 3);

        grid.add(result, 0, 4, 2, 1);

        Scene scene = new Scene(grid, 250, 200);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    private void calculate(TextField n1, TextField n2, Label result, String op) {
        try {
            double a = Double.parseDouble(n1.getText());
            double b = Double.parseDouble(n2.getText());
            double res = 0;

            switch (op) {
                case "+": res = a + b; break;
                case "-": res = a - b; break;
                case "*": res = a * b; break;
                case "/": res = a / b; break;
            }

            result.setText("Kết quả: " + res);

        } catch (Exception e) {
            result.setText("Lỗi nhập!");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}