package com.mycompany.javafxmysqlapp;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("JavaFX MySQL App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
