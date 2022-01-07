/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.hethongbanvexe;

import com.haoquy.pojo.Bus;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.haoquy.services.Admin.*;
import java.sql.SQLException;
import java.util.List;
/**
 * FXML Controller class
 *
 * @author AnNgocLocal1
 */

public class SearchBusController {
    @FXML
    private TextField txtId;
    @FXML
    private Label txtNameBus;
    @FXML
    private Label busFrom;
    @FXML
    private Label busTo;
    @FXML
    private Button delete;
    @FXML
    private Button backPage;
    @FXML
    private Button fix;
    @FXML
    private Button search;
    @FXML
    private Label info;
     static String a;
    public String search(){
        a = txtId.getText();
        return txtId.getText();
    }
    Boolean flag = false;
    @FXML
    private void showInfo() throws SQLException
    {
        info.setText(" ");
        Find f = new Find();
        List<Bus> buses = f.FindBus(search());
        if (f.checkFind(search()))
            flag = true;
        else 
        {
            flag = false;
            busFrom.setText("NULL");
            busTo.setText("NULL");
            txtNameBus.setText("NULL");
        }
        for(var a : buses)
        {
                busFrom.setText(a.getFrom());
                busTo.setText(a.getTo());
                txtNameBus.setText(a.getId());
        }
    }
    
    @FXML
    private void switchToManageBus() throws IOException {
        App.setRoot("manageBus");
    }
    @FXML
    private void switchToFixBus() throws IOException {
        if (flag == true)
        {
            a = txtId.getText();
            App.setRoot("fixBus");
        }
        else
            info.setText("FAIL!");
    }
    
    @FXML
    private void DeleteBus() throws SQLException
    {
        Delete d = new Delete();
        if (d.DeleteBus(search()))
            info.setText("SUCCESS!");
        else
            info.setText("FAIL!");  
    }
    
}
