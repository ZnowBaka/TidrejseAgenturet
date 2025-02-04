package com.example.tidrejseagenturet;

import com.example.tidrejseagenturet.Utilities.StartupLogic;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("WelcomeScreen.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        /*
        try {
            StartupLogic.createFiles();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        launch(args);
    }
}