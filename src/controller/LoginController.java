package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    // Called when login button is clicked
    @FXML
private void handleLogin() {
    String username = usernameField.getText();
    String password = passwordField.getText();

    if ("admin".equals(username) && "admin123".equals(password)) {
        try {
            Parent dashboard = FXMLLoader.load(getClass().getClassLoader().getResource("view/Dashboard.fxml"));
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(new Scene(dashboard, 500, 400));
            stage.setTitle("SmartRail Dashboard");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } else {
        messageLabel.setText("Invalid credentials.");
    }
}

}
