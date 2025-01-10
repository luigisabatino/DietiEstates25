package com.dietiestates25.dietiestates25;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("LoginView.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("DietiEstates25");
        stage.setScene(new Scene(fxmlLoader.load()));
        stage.setMaximized(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}