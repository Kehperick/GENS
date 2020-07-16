/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.register;

import com.admission.helper.Routes;
import com.registration.animations.SceneTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class RegisterController implements Initializable {

    @FXML
    private Button nextBtn;
    @FXML
    private TextField surnamefield;
    @FXML
    private TextField othernamesfield;

    /**
     * Initializes the controller class.
     */
    
    SceneTransition animate;
    @FXML
    private StackPane stackPane;
    @FXML
    private AnchorPane rootAnchorPane;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //setting cursor for nutton
        nextBtn.setCursor(Cursor.HAND);
        // TODO
    }    

    @FXML
    private void next(ActionEvent event) {
        try {
            animate = new SceneTransition();
            Parent nextScene = FXMLLoader.load(getClass().getResource(Routes.ContactForm));
            animate.pushTransitionRight(nextScene, stackPane, rootAnchorPane);
                    } catch (IOException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}











