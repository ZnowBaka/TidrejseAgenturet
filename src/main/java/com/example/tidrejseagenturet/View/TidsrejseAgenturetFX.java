package com.example.tidrejseagenturet.View;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class TidsrejseAgenturetFX {

    private Parent root;
    private Stage stage;
    private Scene scene;



    @FXML
    private Label welcomeText;

    @FXML
    private Button welcomeScreenBTN;
    @FXML
    private Button reserveBTN;


    @FXML
    private TableView selectedTableView;
    @FXML
    private TableColumn selectedTimeMachineColumn;
    @FXML
    private TableColumn selectedGuideColumn;
    @FXML
    private TableColumn selectedSteatColumn;
    @FXML
    private TableView possibleTableView;
    @FXML
    private TableColumn possibleTimeMachineColumn;
    @FXML
    private TableColumn possibleGuideColumn;
    @FXML
    private TableColumn possibleSteatColumn;


    @FXML
    private ChoiceBox<Integer> seatsChoiceBox;
    @FXML
    private ChoiceBox<String> timeRangeChoiceBox;



    @FXML
    public void onWelcomeScreenBTN(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Reservation.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onReserveBTN(ActionEvent event) throws IOException {

    }

    @FXML
    public void switchToScene01(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene01.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToScene02(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene02.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToScene03(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene03.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}