package com.example.tidrejseagenturet.View;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TidsrejseAgenturetFX {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}