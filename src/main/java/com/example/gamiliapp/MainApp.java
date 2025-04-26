package com.example.gamiliapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Button btnRemember;
        Button btnForgotPassword;
        Button btnLogin;
        Button btnSignUp;
        TextField username;
        TextField password;

        primaryStage.setTitle("Gamili Healthcare");
        primaryStage.setHeight(800);
        primaryStage.setWidth(600);
        primaryStage.setResizable(false);

        BorderPane mainContainer = new BorderPane();
        Scene scene = new Scene(mainContainer);
        primaryStage.setScene(scene);
        primaryStage.show();

    //---------------UserName---------------------------------
        TextField textBox1 = new TextField();
        username = new TextField();
        TextField textBox2 = new TextField();
        password = new TextField();

        VBox vBox = new VBox(textBox1, username);
        VBox vBox1 = new VBox(textBox2, password);

        mainContainer.setCenter(vBox);
        mainContainer.setCenter(vBox1);
    }

    public static void main(String[] args) {
        launch();
    }
}