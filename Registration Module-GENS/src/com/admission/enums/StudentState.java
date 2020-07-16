/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.enums;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Keh Perick
 */
public enum StudentState {
    OLD(2012), NEW(2020);
    
    private IntegerProperty year;
    
    StudentState(int YEAR) {  
        year = new SimpleIntegerProperty(YEAR);
    }

    public final int getYear() {
        return year.get();
    }

    public final void setYear(int value) {
        year.set(value);
    }

    public IntegerProperty yearProperty() {
        return year;
    }
    
    
    
    
}





