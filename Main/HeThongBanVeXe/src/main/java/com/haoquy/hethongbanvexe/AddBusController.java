/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.hethongbanvexe;

import com.haoquy.pojo.Bus;
import com.haoquy.services.Admin.Add;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.Scene;
import javafx.scene.control.Label;
/**
 * FXML Controller class
 *
 * @author AnNgocLocal1
 */
public class AddBusController {
@FXML
    private TextField txtDate;
    @FXML
    private TextField txtNumb;
    @FXML
    private TextField txtBusFrom;
    @FXML
    private TextField txtBusTo;
    @FXML
    private TextField txtTime1;
    @FXML
    private Label check;
//    @FXML
//    private TextField txtTime2;
//    @FXML
//    private TextField txtTime3;
    @FXML
    private Button nextPage;
    @FXML
    private Button backPage;

    @FXML
    private void switchToManageBus() throws IOException, SQLException {
        Bus bus = new Bus();
        Add a = new Add();
        
        bus.setDate(txtDate.getText());
        bus.setFrom(txtBusFrom.getText());
        bus.setId(txtNumb.getText());
        bus.setTo(txtBusTo.getText());
        bus.setTime(txtTime1.getText());
        if (a.addJourney(bus))
            App.setRoot("manageBus");
        else 
        {
           check.setText("Không hợp lệ!");
        }
    }
     @FXML
     private void switchToManageBusBack() throws IOException, SQLException {
         App.setRoot("manageBus");
     }
}
