/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration.module.gens;

import com.admission.helper.Routes;
import com.admission.helper.ValidationUtility;
import java.util.Calendar;
import java.util.Date;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Keh Perick
 */
public class RegistrationModuleGENS extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        int year = Calendar.getInstance().get(Calendar.YEAR);
         System.out.println(year);
        Parent root = FXMLLoader.load(getClass().getResource("/com/admission/form/newstudent/new student.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
       
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        launch(args);
        ValidationUtility validate= new ValidationUtility();
        
        System.out.println(validate.validateEmail("kehperick@gmail.com"));
        System.out.println(validate.validateCode("93231"));
    }
    
}























