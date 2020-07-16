/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.helper;

/**
 *
 * @author Keh Perick
 */
public class ValidationUtility {
    
    public boolean validateTelephoneNumber( String tel){
        
        return tel.matches("[6]{6}[0-9]{8}");
    }
    
    public boolean validateCode(String code){
        return code.matches("\\d{5}");
    }
    
    public boolean validateEmail(String email){
        return email.matches("[a-zA-Z]+[@]{1}[a-zA-Z]+[.]{1}[a-zA-Z]+");
    }
    
}





