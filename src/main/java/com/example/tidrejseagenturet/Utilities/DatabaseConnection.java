package com.example.tidrejseagenturet.Utilities;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/tra";
    private static String USER = "";
    private static String PASSWORD = "";

    public static Connection getConnection() throws SQLException{
        try{
            getLogin();
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }// GetConnection End

    public static void getLogin() throws FileNotFoundException {
        BufferedReader userReader = new BufferedReader(new FileReader("username"));
        BufferedReader passReader = new BufferedReader(new FileReader("password"));
        try {
            USER = userReader.readLine();
            PASSWORD = passReader.readLine();
            userReader.close();
            passReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }







}// DatabaseConnection End
