package com.todoapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class MainMenuController {

    @FXML
    private AnchorPane mainPane;

    @FXML
    private Button newListButton;

    @FXML
    public void initialize() {

        // Sadece boyut bind ediliyor (bu sorun yaratmaz)
        newListButton.prefWidthProperty().bind(
            mainPane.widthProperty().multiply(0.3)
        );

        newListButton.prefHeightProperty().bind(
            mainPane.heightProperty().multiply(0.1)
        );

    }
}
