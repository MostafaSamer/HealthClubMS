package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Member extends Application {



    //Panes
    public Pane Profile_data_Pane ;
    public Pane Attendance_Pane ;
    public Pane My_coach_Pane ;
    public Pane See_Messages_Pane ;
    public Pane Confirm_Password_Pane ;
    public Pane Next_setting_Pane ;




    //Screens methods
    public void profile_data_method(){
        Profile_data_Pane.setVisible(true);
        Attendance_Pane.setVisible(false);
        My_coach_Pane.setVisible(false);
        See_Messages_Pane.setVisible(false);
        Confirm_Password_Pane.setVisible(false);
        Next_setting_Pane.setVisible(false);

    }
    public void Attendance_method(){
        Profile_data_Pane.setVisible(false);
        Attendance_Pane.setVisible(true);
        My_coach_Pane.setVisible(false);
        See_Messages_Pane.setVisible(false);
        Confirm_Password_Pane.setVisible(false);
        Next_setting_Pane.setVisible(false);

    }
    public void My_coach_method(){
        Profile_data_Pane.setVisible(false);
        Attendance_Pane.setVisible(false);
        My_coach_Pane.setVisible(true);
        See_Messages_Pane.setVisible(false);
        Confirm_Password_Pane.setVisible(false);
        Next_setting_Pane.setVisible(false);

    }
    public void See_Messages_method(){
        Profile_data_Pane.setVisible(false);
        Attendance_Pane.setVisible(false);
        My_coach_Pane.setVisible(false);
        See_Messages_Pane.setVisible(true);
        Confirm_Password_Pane.setVisible(false);
        Next_setting_Pane.setVisible(false);
    }
    public void Confirm_Password_method(){
        Profile_data_Pane.setVisible(false);
        Attendance_Pane.setVisible(false);
        My_coach_Pane.setVisible(false);
        See_Messages_Pane.setVisible(false);
        Confirm_Password_Pane.setVisible(true);
        Next_setting_Pane.setVisible(false);
    }
    public void Setting_confirm_next(){
        Profile_data_Pane.setVisible(false);
        Attendance_Pane.setVisible(false);
        My_coach_Pane.setVisible(false);
        See_Messages_Pane.setVisible(false);
        Confirm_Password_Pane.setVisible(false);
        Next_setting_Pane.setVisible(true);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        launchWindow();
    }
    public void launchWindow() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Member.fxml"));
            Scene scene = new Scene(root, 600, 400);
            Stage stage = new Stage();
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
