package com.example.tidrejseagenturet.Utilities;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class StartupLogic {
    public static void createFiles() throws IOException {
        File file1 = new File("username");
        File file2 = new File("password");
        if (!file1.exists() && !file2.exists()) {
            if (file1.createNewFile() && file2.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File Not Created");
            }
        } else {
            System.out.println("Files Already Exists");
        }
    }



}// StartupLogic End
