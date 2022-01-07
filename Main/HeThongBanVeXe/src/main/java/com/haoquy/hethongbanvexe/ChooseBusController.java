/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.hethongbanvexe;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class ChooseBusController {

    @FXML
    private ComboBox NameTripFrom;//SQL
    @FXML
    private ComboBox NameTripTo;//SQL
    @FXML
    private TextField Date;//SQL
    @FXML
    private TextField Month;//SQL
    @FXML
    private TextField Year;//SQL
    @FXML
    private Label NameCar1;
    @FXML
    private Label NamePrice1;
    @FXML
    private Label NameCar2;
    @FXML
    private Label NamePrice2;
    @FXML
    private Label NameCar3;
    @FXML
    private Label NamePrice3;
//    @FXML
//    private Label NameCar4;
//    @FXML
//    private Label NamePrice4;
    @FXML
    private Button BackPage;
    @FXML
    private Button NextPage;
    @FXML
    private Button Back;
    @FXML
    private Button Next;
    @FXML
    private RadioButton time1;
    @FXML
    private RadioButton time2;
    @FXML
    private RadioButton time3;
//    @FXML
//    private RadioButton time4;
    

    @FXML
    private void switchToSeat() throws IOException {
        App.setRoot("seat");
    }
    @FXML
    private void switchToAddInfo() throws IOException {
        App.setRoot("addInfo");
    }
    
}
