/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.hethongbanvexe;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class AddInfoController {

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtCmnd;
    @FXML
    private TextField txtPhone;
    @FXML
    private TextField txtYear;
    @FXML
    private Button nextPage;
    @FXML
    private Button backPage;

    @FXML
    private void switchToManage() throws IOException {
        App.setRoot("manage");
    }
    @FXML
    private void switchToChooseBus() throws IOException {
        App.setRoot("chooseBus");
    }
}
