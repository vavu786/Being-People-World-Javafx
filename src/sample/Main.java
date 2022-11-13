package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            AnchorPane root = new AnchorPane();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation( getClass().getResource("view/sample.fxml") );
            root = (AnchorPane) loader.load();
            Scene scene = new Scene( root );
            primaryStage.setScene( scene );
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
