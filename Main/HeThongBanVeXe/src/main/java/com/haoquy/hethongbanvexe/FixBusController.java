/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.haoquy.hethongbanvexe;

import com.haoquy.pojo.Bus;
import com.haoquy.services.Admin.*;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author AnNgocLocal1
 */
public class FixBusController {
    SearchBusController sc = new SearchBusController();
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
//    @FXML
//    private TextField txtTime2;
//    @FXML
//    private TextField txtTime3;
    @FXML
    private Button nextPage;
    @FXML
    private Button backPage;

    boolean flag = true;
    @FXML
    private void showInfo() throws SQLException
    {
       
         Find f = new Find();
        List<Bus> buses = f.FindBus(sc.a);
        for(var a : buses)
        {
            if(flag == true)
            {
                txtDate.setText(a.getDate());
                txtBusFrom.setText(a.getFrom());
                txtBusTo.setText(a.getTo());
                txtNumb.setText(a.getId());
                txtTime1.setText(a.getTime());
                flag = false;
            }
        }
    }
    @FXML
    private void switchToManageBusFixed() throws IOException, SQLException {
        Bus bus = new Bus();
        Update u = new Update();      
        bus.setDate(txtDate.getText());
        bus.setId(txtNumb.getText());      
        bus.setTime(txtTime1.getText());
        if (u.UpdateDateTime(bus))
            App.setRoot("manageBus");
        else 
        {
           
        }
    }
    @FXML
    private void switchToManageBusNonFixed() throws IOException, SQLException {
        App.setRoot("manageBus");
    }
    
}
