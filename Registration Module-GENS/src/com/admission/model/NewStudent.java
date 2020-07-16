/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.model;

import com.admission.enums.StudentState;
import java.util.Date;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Keh Perick
 */
public class NewStudent extends Student{
    
    private StringProperty previousSchool;//holds the previous school of student
    private StudentState studentState;
    private DoubleProperty thirdTermAverage;//holds new student third term average
    private DoubleProperty classAverage;//holds the class average of the student's former class
    private DoubleProperty averageOfFirstStudent;//first in class average;

    public NewStudent(long studentId, String firstname, String othernames, Date dob, String fathername, String fathersphonenumber, String mothername, String motherphonenumber, String contact, String address, String formerClass, String previousSchool, double classAverage, double averageOfFirstStudent, double thirdTermAverage) {
        super(studentId,firstname, othernames, dob, fathername, fathersphonenumber, mothername, motherphonenumber, contact, address, formerClass);
        
       
    }

    

    
    
    //gett setter and property object for old students

    public final String getPreviousSchool() {
        return previousSchool.get();
    }

    public final void setPreviousSchool(String value) {
        previousSchool.set(value);
    }

    public StringProperty previousSchoolProperty() {
        return previousSchool;
    }

    public final double getThirdTermAverage() {
        return thirdTermAverage.get();
    }

    public final void setThirdTermAverage(double value) {
        thirdTermAverage.set(value);
    }

    public DoubleProperty thirdTermAverageProperty() {
        return thirdTermAverage;
    }

    public final double getClassAverage() {
        return classAverage.get();
    }

    public final void setClassAverage(double value) {
        classAverage.set(value);
    }

    public DoubleProperty classAverageProperty() {
        return classAverage;
    }

    public final double getAverageOfFirstStudent() {
        return averageOfFirstStudent.get();
    }

    public final void setAverageOfFirstStudent(double value) {
        averageOfFirstStudent.set(value);
    }

    public DoubleProperty averageOfFirstStudentProperty() {
        return averageOfFirstStudent;
    }
}






