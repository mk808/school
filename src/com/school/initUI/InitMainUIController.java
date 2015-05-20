/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.initUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author mayur
 */
public class InitMainUIController implements Initializable {
    @FXML
    private Button btStudent;
    @FXML
    private Button btMarkSheet;
    @FXML
    private Button btFees;
    @FXML
    private Button btSettings;
    @FXML
    private Label info;
    @FXML
    private ImageView logo;
    @FXML
    private Label lblfooterinfo;
    @FXML
    private BorderPane bodyContent;
            
    private StackPane studentPanel,marksheetPanel,feesPanel;
    @FXML
    private StackPane stackbody;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //LOGO LOADING
        
            javafx.scene.image.Image img=new Image("house-logo-hi.png");
            ImageView im=new ImageView(img);
            logo.setImage(img);
        
        //PANELS LOADING
        try {
            studentPanel=FXMLLoader.load(com.school.studentUI.StudentController.class.getResource("Student.fxml"));
            marksheetPanel=FXMLLoader.load(com.school.marksheetUI.MarkSheetController.class.getResource("MarkSheet.fxml"));
            feesPanel=FXMLLoader.load(com.school.feesUI.FeesController.class.getResource("Fees.fxml")); 
        } catch (IOException ex) {
            Logger.getLogger(InitMainUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void btStudentHandle(ActionEvent event) {
        bodyContent.setCenter(studentPanel);
    }

    @FXML
    private void btMarkSheetHandle(ActionEvent event) {
        bodyContent.setCenter(marksheetPanel);
    }

    @FXML
    private void btFeesHandle(ActionEvent event) {
        bodyContent.setCenter(feesPanel);
    }

    @FXML
    private void btSettingsHandle(ActionEvent event) {
    }
    
}
