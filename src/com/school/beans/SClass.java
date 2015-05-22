/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.beans;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author mayur
 */
@Entity 
public class SClass {
    @Id
    @GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
    @Column(name = "ID", unique = true, nullable = false, precision = 15, scale = 0)
    private long id;
    @Column(name="className",unique=true,nullable=false,updatable = true)
    private String className;
    
    @ElementCollection
    @JoinTable (name = "subjects")
    private Set<Subjects> listOfSubjects=new HashSet();
    
    
    /**
     * @return the className
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className the className to set
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the listOfSubjects
     */
    public Set<Subjects> getListOfSubjects() {
        return listOfSubjects;
    }

    /**
     * @param listOfSubjects the listOfSubjects to set
     */
    public void setListOfSubjects(Set<Subjects> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }
}
