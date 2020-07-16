/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.helper;

import com.jfoenix.controls.JFXButton;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;

/**
 *
 * @author Keh Perick
 */
public class TooltipUtility {
    
    //setting tooltip for button
    public static void setTooltip(Button button, String value){
        Tooltip tooltip= new Tooltip(value);
       button.setTooltip(tooltip);
       tooltip.setStyle(globalTooltipStyle());
    }
    
    private static String globalTooltipStyle(){
        return ""
                + "-fx-text-fill: white;"
                + "-fx-background-color: #202020;"
                + "-fx-background-radius: 5px;"
                + "-fx-font-size: 13px;";
    }
    
    //tooltip for jfoenix button
    public static void setTooltip(JFXButton button, String value){
        Tooltip tooltip = new Tooltip(value);
        button.setTooltip(tooltip);
        tooltip.setStyle(globalTooltipStyle());
    }
}




