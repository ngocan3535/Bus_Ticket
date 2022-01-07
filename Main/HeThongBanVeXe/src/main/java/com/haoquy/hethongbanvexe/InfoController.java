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
import javafx.scene.control.Label;

public class InfoController {

    @FXML
    private Label name;
    @FXML
    private Label nameBusFrom;
    @FXML
    private Label nameBusTo;
    @FXML
    private Label nameCar;
    @FXML
    private Label nameTime;
    @FXML
    private Label namePrice;
    @FXML
    private Label nameSeat;
    @FXML
    private Button backPage;
    @FXML
    private Button done;

    @FXML
    private void switchToManage() throws IOException {
        App.setRoot("manage");
    }
//    @FXML
//    private void switchToSeat() throws IOException {
//        App.setRoot("seat");
//    }
}
