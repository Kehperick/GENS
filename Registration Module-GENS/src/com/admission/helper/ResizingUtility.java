/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.helper;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;

/**
 *
 * @author Keh Perick
 */
public class ResizingUtility {
    
    
    public static void defaultSize(AnchorPane pane){
        pane.setPrefSize(Screen.getPrimary().getBounds().getWidth(), Screen.getPrimary().getBounds().getHeight()-70);
        System.out.println(Screen.getPrimary().getBounds());
}
}









