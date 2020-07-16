/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.model;

import com.admission.enums.StudentState;
import java.util.Date;



/**
 *
 * @author Keh Perick
 */
public class OldStudent extends Student {

    private StudentState studentState;
    public OldStudent(long studentId,String firstname, String othernames, Date dob, String fathername, String fathersphonenumber, String mothername, String motherphonenumber, String contact, String address, String formerClass) {
        super(studentId, firstname, othernames, dob, fathername, fathersphonenumber, mothername, motherphonenumber, contact, address, formerClass);
    }

}






