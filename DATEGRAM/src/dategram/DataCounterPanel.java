/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dategram;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Keh Perick
 */
public class DataCounterPanel {
    
    private LocalDate date1;
    private LocalDate date2;
    public DataCounterPanel(String date1, String date2){
        
        //change format and layout of string
        String refinedDate = date1.replace("/", "-");
        String refinedDate1 = date2.replace("/", "-");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            this.date1 = LocalDate.parse(refinedDate, formatter);
            this.date2 = LocalDate.parse(refinedDate1, formatter);
        } catch (DateTimeException | NullPointerException e) {
            System.out.println("exception occured");
        }
    }
   
   
    
    public long countDaysBetween(){
        long daysBetween =ChronoUnit.DAYS.between(date2, date1);
        return daysBetween;
    }
    
    public long countMonthsBetween(){
        return ChronoUnit.MONTHS.between(date2, date1);
    }
    
    public long countYearsBetween(){
        return ChronoUnit.YEARS.between(date2, date1);
    }
    
    public boolean validateDifference(int year1, int year2){
        if(year2< year1)
            return true;
        else
            throw new CPSC1181Exception("The year for the second date must be less than or equal to that of the first date");
    }
}















