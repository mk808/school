/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.initUI;

import java.awt.Image;
import java.awt.Toolkit;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mayur
 */
public class MainUI extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
        //////MAIN BODY CONTENTS
        
//STUDENT FXML
        StackPane bodyStudent=FXMLLoader.load(com.school.studentUI.StudentController.class.getResource("Student.fxml"));
        
        
        
        
        
        
        
        
//TOP MENU BAR STACKPANE
        StackPane topcontent=FXMLLoader.load(com.school.top.TopMenuController.class.getResource("TopMenu.fxml"));
        
//LEFT MENU BAR VBOX
        VBox leftMenuContent=FXMLLoader.load(com.school.left.LeftMenuController.class.getResource("LeftMenu.fxml"));
        
//BOTTOM MENU BAR
        HBox bottomContent=FXMLLoader.load(com.school.bottom.BottomPanelController.class.getResource("BottomPanel.fxml"));
        
//RIGHT MENU BAR
        VBox rightContent=FXMLLoader.load(com.school.right.RightPanelController.class.getResource("RightPanel.fxml"));
        
        
        javafx.scene.image.Image img=new javafx.scene.image.Image("house-logo-hi.png");
        ImageView im=new ImageView(img);
        
//tOPmenu bar
        HBox topMenuBar=new HBox(im);
        topMenuBar.setAlignment(Pos.CENTER);
        
//left panel
        VBox leftMenuBox=new VBox(leftMenuContent);
        leftMenuBox.setAlignment(Pos.CENTER);
        
//center panel(main Body)
        StackPane centerBody=new StackPane(bodyStudent);
        centerBody.setAlignment(Pos.CENTER);
        
//right panel
        VBox rightVBox=new VBox(rightContent);
        rightVBox.setAlignment(Pos.CENTER);
        
//footer
        HBox bottomHBox=new HBox(bottomContent);
        bottomHBox.setAlignment(Pos.CENTER);
        
        BorderPane mainlayout=new BorderPane();
        mainlayout.setTop(topMenuBar);
        mainlayout.setLeft(leftMenuBox);
        mainlayout.setCenter(centerBody);
        mainlayout.setRight(rightVBox);
        mainlayout.setBottom(bottomHBox);
        */
        
        BorderPane mainlayout=FXMLLoader.load(com.school.initUI.InitMainUIController.class.getResource("initMainUI.fxml"));
        
        Scene mainScene=new Scene(mainlayout);
        primaryStage.setWidth(Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        primaryStage.setHeight(Toolkit.getDefaultToolkit().getScreenSize().getHeight());
        
        primaryStage.setScene(mainScene);
        primaryStage.show();
        
                
    }
    
    public static void main(String args[])
    {
        launch(args);
    }
    
}
