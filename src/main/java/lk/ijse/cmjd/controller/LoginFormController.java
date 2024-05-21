package lk.ijse.cmjd.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public Button LoginButton;
    public TextField textUser;
    public TextField textPw;
    public AnchorPane root;

    public void LoginAction(ActionEvent actionEvent) throws IOException {
      /*  String user = textUser.getText();
        String pw = textPw.getText();

        if (user.equals("User") && pw.equals("Password")) {
            navigate();
        } else {
            new Alert(Alert.AlertType.ERROR, "Credential Invalid").show();
        }*/
        navigate();
    }

    private void navigate() throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/main_form.fxml"));

        Scene scene = new Scene(root);

        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }
}