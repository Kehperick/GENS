/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dategram;

/**
 *
 * @author Keh Perick
 */
public class DataVerifier {

    private int day = 0;
    private int month = 0 ;
    private int year = 0;
    private boolean isValidFormat;

    private static final int[] daysPerMonth
            = // days in each month
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DataVerifier(String date) {
        if(validateDate(date)){
            System.out.println(validateDate(date));
            String[] dateParts =date.split("/");
            day = Integer.parseInt(dateParts[0]);
            month = Integer.parseInt(dateParts[1]);
            year = Integer.parseInt(dateParts[2]);
        }
        else
            throw new CPSC1181Exception("invalid date format");
    }

    public boolean validateDate(String date) {
        return date.matches("[0-9]{1,2}[/]{1}[0-9]{1,2}[/][0-9]{4}");
    }

    public int validateDay() {
        // check if day in range for month
        if (day > 0 && day <= daysPerMonth[month]) {
            return day;
        }

        // check for leap year
        if (month == 2 && day == 29 && (year % 400 == 0
                || (year % 4 == 0 && year % 100 != 0))) {
            return day;
        }

        throw new IllegalArgumentException(
                "day out-of-range for the specified month and year");
    }
    
    // utility method to confirm proper month value
    public int validateMonth() {
        if (month > 0 && month <= 12) // validate month
        {
            return month;// utility method to confirm proper month value
        } else // month is invalid
        {
            throw new IllegalArgumentException("month must be 1-12");
        }
    } // end method checkMonth
    
     public int getDay(){
         return day;
     }
     
     public int getMonth(){
         return month;
     }
     
     public int getYear(){
         return year;
     }

}












