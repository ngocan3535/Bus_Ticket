package com.haoquy.hethongbanvexe;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ManageController {

    @FXML
    private Button addTicket;
    @FXML
    private Button history;
    @FXML
    private Button manage;
    
    
    @FXML
    private void switchToChooseTicket() throws IOException {
        App.setRoot("chooseTicket");
    }
    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }
    @FXML
    private void switchToSearchHistory() throws IOException {
        App.setRoot("searchHistory");
    }
}