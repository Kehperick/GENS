/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.module.gens;

import com.admission.helper.ResizingUtility;
import com.admission.helper.TextFieldUtility;
import com.admission.helper.TooltipUtility;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Keh Perick
 */
public class loginController implements Initializable {

    @FXML
    private AnchorPane main;
    @FXML
    private Button mainPageBtn;
    @FXML
    private Button registrationBtn;
    @FXML
    private TextField passcodeField;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //setting the default size;
        ResizingUtility.defaultSize(main);
        mainPageBtn.setCursor(Cursor.HAND);
        registrationBtn.setCursor(Cursor.HAND);
        
        //setting the global tooltip stule
        TooltipUtility.setTooltip(mainPageBtn, "resume work");
        TextFieldUtility.setDefaultBehavior(passcodeField);
    }    

    @FXML
    private void gotoHome(ActionEvent event) {
    }

    @FXML
    private void gotoRegistration(ActionEvent event) {
    }
    
}








