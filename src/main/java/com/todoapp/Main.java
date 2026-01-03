package com.todoapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

import java.util.Objects;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/main_view.fxml")));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("To Do Application");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}