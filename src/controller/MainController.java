package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    // Navigate to Booking Screen
    @FXML
    private void goToBooking(ActionEvent event) throws Exception {
        loadScene("view/Booking.fxml", "Booking Ticket");
    }

    // Navigate to Cancellation Screen
    @FXML
    private void goToCancellation(ActionEvent event) throws Exception {
        loadScene("view/Cancellation.fxml", "Cancel Ticket");
    }

    // Navigate to Train List
    @FXML
    private void viewTrains(ActionEvent event) throws Exception {
        loadScene("view/TrainList.fxml", "Train List");
    }

    // Logout - Go back to Login
    @FXML
    private void logout(ActionEvent event) throws Exception {
        loadScene("view/Login.fxml", "SmartRail - Login");
    }

    // Utility to switch scenes
    private void loadScene(String fxmlPath, String title) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(fxmlPath));
        Stage stage = (Stage) Stage.getWindows().filtered(Window::isShowing).get(0);
        stage.setTitle(title);
        stage.setScene(new Scene(root, 400, 300));
    }
}
