package com.example.tidrejseagenturet;


import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FXController {
    private Parent root;
    private Stage stage;
    private Scene scene;


    //region WelcomeScreen Ids & Actions
    @FXML
    public void onWelcomeScreenBTN(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("BookingScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //endregion





    //region BookingScene Ids & Actions
    @FXML
    public void onReserveBTN(ActionEvent event) throws IOException {


    }
    //endregion













    //region TestScenes
    @FXML
    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene01.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene02.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    //endregion


}// FXController End
