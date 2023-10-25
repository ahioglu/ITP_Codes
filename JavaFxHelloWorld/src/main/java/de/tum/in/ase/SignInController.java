package de.tum.in.ase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
public class SignInController {

    @FXML private PasswordField passwordField;
    @FXML private TextField usernameField;
    @FXML private Text text;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        text.setText("Sign in button pressed");
}
}