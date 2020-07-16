/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.model;

import com.admission.enums.StudentState;
import java.time.LocalDate;
import java.util.Date;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Keh Perick
 */
public abstract class Student {
    private StringProperty firstName;
    private StringProperty otherNames;
    private ObjectProperty<Date> dateOfBirth;
    private StringProperty fathersName;
    private StringProperty mothersName;
    private StringProperty address;
    private StringProperty fatherphoneNumber;
    private StringProperty motherPhoneNumber;
    private StringProperty contact;
    private IntegerProperty age;
    private StringProperty formerClass;
    private LongProperty studentId;
    
    private StudentState studentState;
    
    //creating a studentmodel constuctor to initialize all attributes and fields
    public Student(long studentId,String firstname, String othernames, Date dob, String fathername, String fathersphonenumber, String mothername, String motherphonenumber, String contact, String address, String formerClass){
        
        //setting the default values after initializing the properties
        firstName = new SimpleStringProperty(firstname);
        otherNames = new SimpleStringProperty(othernames);
        dateOfBirth = new SimpleObjectProperty<>(dob);
        fathersName = new SimpleStringProperty(fathername);
        mothersName = new SimpleStringProperty(mothername);
        this.address = new SimpleStringProperty(address);
        fatherphoneNumber = new SimpleStringProperty(fathersphonenumber);
        motherPhoneNumber = new SimpleStringProperty(motherphonenumber);
        this.contact = new SimpleStringProperty(contact);
        this.formerClass = new SimpleStringProperty(formerClass);
        this.studentId = new SimpleLongProperty(studentId);
//        setAge(dob);
    }

    public final String getFirstName() {
        return firstName.get();
    }

    public final void setFirstName(String value) {
        firstName.set(value);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public final String getOtherNames() {
        return otherNames.get();
    }

    public final void setOtherNames(String value) {
        otherNames.set(value);
    }

    public StringProperty otherNamesProperty() {
        return otherNames;
    }

    public final Date getDateOfBirth() {
        return dateOfBirth.get();
    }

    public final void setDateOfBirth(Date value) {
        dateOfBirth.set(value);
    }

    public ObjectProperty<Date> dateOfBirthProperty() {
        return dateOfBirth;
    }

    public final String getFathersName() {
        return fathersName.get();
    }

    public final void setFathersName(String value) {
        fathersName.set(value);
    }

    public StringProperty fathersNameProperty() {
        return fathersName;
    }

    public final String getMothersName() {
        return mothersName.get();
    }

    public final void setMothersName(String value) {
        mothersName.set(value);
    }

    public StringProperty mothersNameProperty() {
        return mothersName;
    }

    public final String getAddress() {
        return address.get();
    }

    public final void setAddress(String value) {
        address.set(value);
    }

    public StringProperty addressProperty() {
        return address;
    }

    public final String getFatherphoneNumber() {
        return fatherphoneNumber.get();
    }

    public final void setFatherphoneNumber(String value) {
        fatherphoneNumber.set(value);
    }

    public StringProperty fatherphoneNumberProperty() {
        return fatherphoneNumber;
    }

    public final String getMotherPhoneNumber() {
        return motherPhoneNumber.get();
    }

    public final void setMotherPhoneNumber(String value) {
        motherPhoneNumber.set(value);
    }

    public StringProperty motherPhoneNumberProperty() {
        return motherPhoneNumber;
    }

    public final String getContact() {
        return contact.get();
    }

    public final void setContact(String value) {
        contact.set(value);
    }

    public StringProperty contactProperty() {
        return contact;
    }

    public final int getAge() {
        
        return age.get();
    }

    public final void setAge(int yearOfBirth) {
        LocalDate currentDate = LocalDate.now();
        currentDate.getYear();
        age.set(currentDate.getYear()-yearOfBirth);
    }

    public IntegerProperty ageProperty() {
        return age;
    }
    
    
    
    public void setState(StudentState state) {
        studentState = state;
        
    }
    
    public StudentState getState(){
        return studentState;
    }
   
}













