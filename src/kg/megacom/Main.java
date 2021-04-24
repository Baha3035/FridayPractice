package kg.megacom;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Parent;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/authorization.fxml"));
        primaryStage.setTitle("Authorization");
        primaryStage.setScene(new Scene(root, 600, 420));

        primaryStage.show();
    }


    public static void main(String[] args) { launch(args);}
}
