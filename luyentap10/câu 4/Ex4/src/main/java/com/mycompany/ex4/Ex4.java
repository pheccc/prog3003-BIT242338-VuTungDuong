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

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label lbl1 = new Label("Số thứ nhất:");
        Label lbl2 = new Label("Số thứ hai:");
        Label result = new Label("Kết quả");

        TextField txt1 = new TextField();
        TextField txt2 = new TextField();

        Button btn = new Button("Tính tổng");

        btn.setOnAction(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());

                double sum = a + b;

                result.setText("Kết quả: " + sum);

            } catch (Exception ex) {
                result.setText("Lỗi!");
            }
        });

        grid.add(lbl1, 0, 0);
        grid.add(txt1, 1, 0);

        grid.add(lbl2, 0, 1);
        grid.add(txt2, 1, 1);

        grid.add(btn, 1, 2);
        grid.add(result, 1, 3);

        Scene scene = new Scene(grid, 300, 200);

        stage.setTitle("Máy tính cộng");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}