package GUI;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.application.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Admin extends Application {

    public static Stage stage;
/*
    @FXML
    public Button Coaches_Button ;
    public Button See_Coaches_Button ;
    public Button Add_Coaches_Button ;
    public Pane See_Coaches_Pane ;
    public Pane Add_Coaches_Pane ;

    public void Add_Coaches_method() {
        See_Coaches_Pane.setVisible(false);
        Add_Coaches_Pane.setVisible(true);
    }

    public void See_Coaches_method() {

    }*/


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        launchWindow();
    }

    public void launchWindow() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));
            Scene scene = new Scene(root, 600, 400);
            stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        catch (NullPointerException n ){
            System.out.println(n);

        }

        catch (IOException e){
            System.out.println(e);
        }




    }

}



