/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex2 extends Application {

@Override
public void start(Stage stage) throws Exception {
    // Thêm dấu / để tìm từ root của classpath
    java.net.URL fxmlLocation = getClass().getResource("/com/mycompany/ex2/primary.fxml");
    if (fxmlLocation == null) {
        throw new RuntimeException("Không tìm thấy file primary.fxml! Hãy kiểm tra lại thư mục resources.");
    }
    
    FXMLLoader loader = new FXMLLoader(fxmlLocation);
    Parent root = loader.load();
    stage.setScene(new Scene(root));
    stage.show();
}
    public static void main(String[] args) {
        launch(args);
    }
}