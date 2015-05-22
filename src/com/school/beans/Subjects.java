/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school.beans;

import javax.persistence.Embeddable;
import javax.persistence.Table;

/**
 *
 * @author mayur
 */
@Embeddable
public class Subjects {
    private String subjectName;

    /**
     * @return the subjectName
     */
    
    public Subjects() {
    }

    public Subjects(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName the subjectName to set
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
