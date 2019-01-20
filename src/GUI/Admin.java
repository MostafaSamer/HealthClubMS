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

    public void launchWindow() {

        Scene s1 = null;


         try {
               Parent root = FXMLLoader.load(getClass().getResource("Admin.fxml"));

                s1 = new Scene(root, 400, 600);
                Stage s = new Stage();
                s.setScene(s1);
                s.show();

            }
            catch (NullPointerException n ){
                System.out.println(n);

            }
            
            catch (IOException e){
                System.out.println(e);
            }

      
        

    }
    @Override
    public void start(Stage primaryStage) {
        launchWindow();

    }

    public static void main(String[] args) {


        launch(args);




    }


    Button  Coaches_Button ;
    @FXML
    Button  See_Coaches_Button ;
    Button  Add_Coaches_Button ;

    Pane See_Coaches_Pane ;
    Pane Add_Coaches_Pane ;


    public void Add_Coaches_method() {
        See_Coaches_Pane.setVisible(false);
        Add_Coaches_Pane.setVisible(true);


    }
    public void See_Coaches_method() {

    }
}



