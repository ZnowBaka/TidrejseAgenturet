package com.example.tidrejseagenturet;

import com.example.tidrejseagenturet.Utilities.StartupLogic;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("WelcomeScene.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("TidrejseAgenturet");
            primaryStage.setWidth(640);
            primaryStage.setHeight(460);
            primaryStage.show();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }// start End

    /* // Basic startup works overall, still cant get the switch to work
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Scene01.fxml"));
        Scene startScene = new Scene(fxmlLoader.load(), 600, 460);
        primaryStage.setTitle("Start Screen!");
        primaryStage.setScene(startScene);
        primaryStage.show();
    }
    */

    public static void main(String[] args) {
        /*
        try {
            StartupLogic.createFiles();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */

        launch();

    }// main End
}// MAIN End