package com.example.tidrejseagenturet.View;

import com.example.tidrejseagenturet.Main;
import com.example.tidrejseagenturet.Model.DatabaseHandler;
import javafx.application.Application;
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
    DatabaseHandler databaseHandler = new DatabaseHandler();
    Parent root;
    Stage stage;
    Scene scene;

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
    protected void onWelcomeScreenBTN(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Reservation.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}