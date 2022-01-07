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
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
public class SeatController {

    @FXML
    private RadioButton a1;
    @FXML
    private RadioButton a2;
    @FXML
    private RadioButton a3;
    @FXML
    private RadioButton a4;
    @FXML
    private RadioButton a5;
    @FXML
    private RadioButton a6;
    @FXML
    private RadioButton a7;
    @FXML
    private RadioButton a8;
    @FXML
    private RadioButton a9;
    @FXML
    private RadioButton a10;
    @FXML
    private RadioButton b1;
    @FXML
    private RadioButton b2;
    @FXML
    private RadioButton b3;
    @FXML
    private RadioButton b4;
    @FXML
    private RadioButton b5;
    @FXML
    private RadioButton b6;
    @FXML
    private RadioButton b7;
    @FXML
    private RadioButton b8;
    @FXML
    private RadioButton b9;
    @FXML
    private RadioButton b10;
    @FXML
    private Button backPage;
    @FXML
    private Button nextPage;

    @FXML
    private void switchToChooseBus() throws IOException {
        App.setRoot("chooseBus");
    }
    @FXML
    private void switchToInfo() throws IOException {
        App.setRoot("info");
    }
}
