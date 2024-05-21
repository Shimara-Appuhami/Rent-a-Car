package lk.ijse.cmjd.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {
    public Button customerButton;
    public AnchorPane node;
    public Button userButton;
    public Button carButton;
    public Button rentButton;
    public Button logoutButton;
    public AnchorPane root;


    public void customerAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/Customer_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);

    }

    public void userAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/user_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

    public void carAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/car_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

    public void rentAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/rent_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

    public void logoutAction(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));

        Scene scene = new Scene(root);

        Stage stage = (Stage) this.root.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }
}