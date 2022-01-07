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

/**
 * FXML Controller class
 *
 * @author AnNgocLocal1
 */
public class ManageBusController {

    @FXML
    private Button addBus;
    @FXML
    private Button searchAndFix;
    @FXML
    private Button backPage;
    
    @FXML
    private void switchToManage() throws IOException {
        App.setRoot("manage");
    }
    @FXML
    private void switchToAddBus() throws IOException {
        App.setRoot("addBus");
    }
    @FXML
    private void switchToSearchAndFix() throws IOException {
        App.setRoot("searchBus");
    }   
    
}
