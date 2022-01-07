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
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author AnNgocLocal1
 */
public class SearchHistoryController {

    @FXML
    private TextField txtId;
    @FXML
    private Label txtName;
    @FXML
    private Label busFrom;
    @FXML
    private Label busTo;
    @FXML
    private Button delete;
    @FXML
    private Button backPage;
    @FXML
    private Button more;
    @FXML
    private Button seach;
    @FXML
    private void switchToInfo() throws IOException {
        App.setRoot("info");
    }
    @FXML
    private void switchToManage() throws IOException {
        App.setRoot("manage");
    }
}
