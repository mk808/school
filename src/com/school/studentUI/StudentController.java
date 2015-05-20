/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.studentUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * FXML Controller class
 *
 * @author mayur
 */
public class StudentController implements Initializable {
    @FXML
    private TextField admissionno;
    @FXML
    private DatePicker admissiondate;
    @FXML
    private TextField name;
    @FXML
    private TextField fname;
    @FXML
    private TextField mname;
    @FXML
    private DatePicker dob;
    @FXML
    private TextField bloodgrp;
    @FXML
    private TextField category;
    @FXML
    private ComboBox<?> gender;
    @FXML
    private ComboBox<?> batch;
    @FXML
    private TextArea address;
    @FXML
    private TextField pincode;
    @FXML
    private TextField phoneno;
    @FXML
    private Button btUpload;
    @FXML
    private Button btSave;
    @FXML
    private Button btClear;

    StudentBean student=new StudentBean();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btUploadHandle(ActionEvent event) {
    }

    @FXML
    private void btSaveHandle(ActionEvent event) {
        Validate();
        
        student.setAdmissionNo(Integer.parseInt(admissionno.getText()));
        student.setAdmissionDate(java.sql.Date.valueOf(admissiondate.getValue()));
        System.out.println(java.sql.Date.valueOf(admissiondate.getValue())+"  date");
        student.setAddress(address.getText());
        student.setName(name.getText());
        student.setFathername(fname.getText());
        student.setMothername(mname.getText());
        student.setBloodGrp(bloodgrp.getText());
//        student.setBatch(batch.getSelectionModel().getSelectedItem().toString());
        student.setBatch("2009");
        student.setGender("male");
        student.setCategory(category.getText());
        student.setPincode(Integer.parseInt(pincode.getText()));
        student.setPhoneno(phoneno.getText());
        //student.setGender(gender.getSelectionModel().getSelectedItem().toString());
        student.setDob(java.sql.Date.valueOf(dob.getValue()));
        
         SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
         Session session=sessionfactory.openSession();
         
         try{
         session.beginTransaction();    
         session.save(student);
         session.getTransaction().commit();
         System.out.println("Student Added");
         }catch(Exception e)
         {
             session.getTransaction().rollback();
             e.printStackTrace();
         }finally
         {
             session.close();
         }
         
       
        
    }

    @FXML
    private void btClearHandle(ActionEvent event) {
    }
    
    private void Validate()
    {
        
    }
    
}
