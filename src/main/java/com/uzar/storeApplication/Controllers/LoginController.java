package com.uzar.storeApplication.Controllers;

import javafx.fxml.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class LoginController {

    @FXML
    private Label  chooseAccountLabel;
    @FXML
    private ChoiceBox  choiceAccountBox;
    @FXML
    private Button  loginButton;


    //choice's in the account choice box
    ObservableList<String> accountTypeList = FXCollections.observableArrayList("Manager","Customer");

    private void initialize(){
        choiceAccountBox.setValue("Customer");
        choiceAccountBox.setItems(accountTypeList);
    }


}
