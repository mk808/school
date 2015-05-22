/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.settings;

import com.school.beans.SClass;
import com.school.beans.Subjects;
import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * FXML Controller class
 *
 * @author mayur
 */
public class SettingsController implements Initializable {
    @FXML
    private ListView<?> listClass,listSubjects;
    @FXML
    private TextField txtClass;
    @FXML
    private Button btAdd;
    @FXML
    private Button btDel,btDeleteSubject,btSaveSubjects;
    @FXML
    private ChoiceBox comboClass;
            

    SessionFactory factory;
    Session session;
    private com.school.beans.SClass sclass=new SClass();
    ObservableList items,subjectsItem;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            factory=new Configuration().configure().buildSessionFactory();
            
        items=FXCollections.observableArrayList();
        subjectsItem =FXCollections.observableArrayList();
        
        //LISTS CLASSES IN EDIT CLASS
        listEmployees();
        listClass.setItems(items);
        
        //LISTS SUBJECTS IN EDIT SUBJECTS
        listAllSubjects();
        listSubjects.setItems(subjectsItem);
        
    }    

    @FXML
    private void btAddHandle(ActionEvent event) {
        try
        {
            session=factory.openSession();
            session.beginTransaction();
            //sclass.setId(2);
            sclass.setClassName(txtClass.getText());
            session.save(sclass);
            session.getTransaction().commit();
            listEmployees();
         }catch(HibernateException e)
        {
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally
        {
            session.close();
        }
    }

    @FXML
    private void btDelHandle(ActionEvent event) {
        sclass=null;
        session=factory.openSession();
        sclass=(SClass)session.get(SClass.class, Long.parseLong(listClass.getSelectionModel().getSelectedItem().toString()));
        Subjects subs1=new Subjects("English");
        Subjects subs2=new Subjects("Maths");
        
        sclass.getListOfSubjects().add(subs1);
        sclass.getListOfSubjects().add(subs2);
        
        session.beginTransaction();
        session.update(sclass);
   session.getTransaction().commit();
   
    }
    
    private void listEmployees()
    {
        Session session=factory.openSession();
        try
        {items.clear();
            session.beginTransaction();
            java.util.List empList=session.createQuery("from SClass").list();
            for(Iterator iterator=empList.iterator();iterator.hasNext();)
            {
                com.school.beans.SClass st=(com.school.beans.SClass)iterator.next();
                items.add(st.getClassName());
                
                /*                System.out.println("First Name "+st.getName());
                Systemem.out.println("First Name "+st.getSalary());
  */          }
            session.getTransaction().commit();
        }catch(HibernateException e)
        {
            if(session.getTransaction()!=null)
            {
                session.getTransaction().rollback();
                e.printStackTrace();
            }
        }finally
        {
            session.close();
        }
    }

    @FXML
    private void btDeleteSubjectHandle(ActionEvent event)
    {
        
    }
    
    @FXML
    private void btSaveSubjectsHandle(ActionEvent event)
    {
        
    }

    private void listAllSubjects() {
        Session session=factory.openSession();
        try
        {subjectsItem.clear();
            session.beginTransaction();
            java.util.List empList=session.createQuery("from subjects").list();
            for(Iterator iterator=empList.iterator();iterator.hasNext();)
            {
                com.school.beans.Subjects st=(com.school.beans.Subjects)iterator.next();
                subjectsItem.add(st.getSubjectName());
                
    
    }
            session.getTransaction().commit();
        }catch(HibernateException e)
        {
            if(session.getTransaction()!=null)
            {
                session.getTransaction().rollback();
                e.printStackTrace();
            }
        }finally
        {
            session.close();
        }
    }
    
}
