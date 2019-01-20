package GUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class Login {

    public static void launchWindow() {

        try {
            Parent root = FXMLLoader.load(Login.class.getResource("Login.fxml"));
            Scene scene = new Scene(root , 400  , 600);
            Stage s = new Stage();
            s.setTitle("Login") ;
            s.setScene(scene);
            s.setResizable(false);
            s.show();
        }
        catch (IOException e){
            Alert a = new Alert(Alert.AlertType.ERROR, "file not found !");
            a.showAndWait();
        }


    }

}