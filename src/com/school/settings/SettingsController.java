/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.settings;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author mayur
 */
public class SettingsController implements Initializable {
    @FXML
    private ListView<?> listClass;
    @FXML
    private TextField txtClass;
    @FXML
    private Button btAdd;
    @FXML
    private Button btDel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList items=FXCollections.observableArrayList("A","B","C","D");
        listClass.setItems(items);
        
    }    

    @FXML
    private void btAddHandle(ActionEvent event) {
        listClass.getSelectionModel().
    }

    @FXML
    private void btDelHandle(ActionEvent event) {
    }
    
}
