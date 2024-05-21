package lk.ijse.cmjd.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class RentFormController {
    public AnchorPane root;
    public TextField rentdText;
    public TextField custIdText;
    public TextField advanceAmount;
    public Button deleteButton;
    public Button updateButton;
    public Button saveButton;
    public TableView customerTable;
    public TextField carIdText;
    public DatePicker fromDate;
    public DatePicker toDate;
    public RadioButton isReturnedButton;
    public TextField RefDepositAmount;
    public Button searchButton;
    public Label CustName_Label;
    public Label CarNum_Label;
    public Label TotalAmount;
    public Label BalanceAmount;
    public Label PerDayAmount;

    public void isReturned(ActionEvent actionEvent) {
    }

    public void searchRent(ActionEvent actionEvent) {
    }
}