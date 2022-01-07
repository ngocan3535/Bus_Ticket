package com.haoquy.hethongbanvexe;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
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
public class LoginController {

    @FXML
    private TextField txtName;
    @FXML
    private PasswordField txtPass;
    @FXML
    private Button Login;
    @FXML
    private Label notif;
    @FXML
    private Button back;

    @FXML
    private void switchToManageBus() throws IOException {
        if(txtName.getText().trim().equals("root")&& txtPass.getText().equals("1234"))
        {
            App.setRoot("manageBus");

        }
        else
        {
            notif.setText("ERROR!");
       }
        }
    @FXML
    private void switchToManage() throws IOException {
        App.setRoot("manage");
    }
        
    }
