package com.example.tidrejseagenturet;


import com.example.tidrejseagenturet.Controller.CustomerController;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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
    CustomerController customerController = new CustomerController();

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
    @FXML
    private Label welcomeText;

    @FXML
    private Button welcomeScreenBTN;
    @FXML
    private Button reserveBTN;
    @FXML
    private Button loginBTN;


    @FXML
    private TextField firstNameTF;
    @FXML
    private TextField lastNameTF;
    @FXML
    private TextField phoneTF;
    @FXML
    private TextField emailField;

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
    public void onReserveBTN(ActionEvent event) throws IOException {

    }

    @FXML
    public void switchToConfirmationScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ConfirmationScene.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToLoginScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene02.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onLoginBTN(ActionEvent event) throws IOException {

        if(phoneTF.getText().length() < 8 || phoneTF.getText().length() > 8) {
            System.out.println("Phone number is unavailable");
        } else if (emailField.getText().contains("@gmail.com") || emailField.getText().contains("@yahoo.com") || emailField.getText().contains("@hotmail.com")) {
            customerController.newCustomer(firstNameTF.getText().toString(), lastNameTF.getText().toString(), emailField.getText().toString(), phoneTF.getText().toString());
        } else {
            System.out.println("Email is unavailable");
        }
    }

/*
    @FXML
    public void switchToScene03(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene03.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
*/

    //region BookingScene Ids & Actions
    //endregion


    //region TestScenes
    /*
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
     */
    //endregion


}// FXController End
