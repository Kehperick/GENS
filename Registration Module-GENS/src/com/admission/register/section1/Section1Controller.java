/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admission.register.section1;

import com.admission.helper.Routes;
import com.admission.register.RegisterController;
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
public class Section1Controller implements Initializable {

    @FXML
    private Button nextBtn;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField emailField;
    @FXML
    private Button backBtn;

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
        // TODO
    }    

    @FXML
    private void next(ActionEvent event) {
        try {
            animate = new SceneTransition();
            Parent nextScene = FXMLLoader.load(getClass().getResource(Routes.VERIFICATIONFORM));
            animate.pushTransitionRight(nextScene, stackPane, rootAnchorPane);
                    } catch (IOException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void back(ActionEvent event) {
    }
    
}






