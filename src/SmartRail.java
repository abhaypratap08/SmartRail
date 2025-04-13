package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class SmartRail extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml")); // relative to /view/
        primaryStage.setTitle("SmartRail - Login");
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
