/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registration.animations;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author Keh Perick
 */
public class SceneTransition {
    
    private Timeline timeline;
    public void pushTransitionRight(Parent nextScene, StackPane parentContainer, AnchorPane previousScene){
        Scene scene = previousScene.getScene();
        
        //set the x property of second  scene to  width of window
        nextScene.translateXProperty().set(previousScene.getPrefWidth());
        
        //add second scene. both first and second scenes are now available on the scenegraph
        parentContainer.getChildren().add(nextScene);
        
        //create a new timeline 
        timeline = new Timeline();
        
        //animate the x property
        KeyValue keyValue = new KeyValue(nextScene.translateXProperty(), 0, Interpolator.EASE_BOTH);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(.05), keyValue);
        
        timeline.getKeyFrames().add(keyFrame);
        //after completing animation
        timeline.setOnFinished((event) -> {
            parentContainer.getChildren().remove(previousScene);
        });
        
        timeline.play();
    }
    
    public void pushTransitionLeft(Parent nextScene, StackPane parentContainer, AnchorPane previousScene){
         Scene scene = previousScene.getScene();
        
        //set the x property of second  scene to  width of window
        nextScene.translateXProperty().set(0);
        
        //add second scene. both first and second scenes are now available on the scenegraph
        parentContainer.getChildren().add(nextScene);
        
        //create a new timeline 
        timeline = new Timeline();
        
        //animate the x property
        KeyValue keyValue = new KeyValue(nextScene.translateXProperty(), previousScene.getWidth(), Interpolator.EASE_BOTH);
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(.05), keyValue);
        
        timeline.getKeyFrames().add(keyFrame);
        //after completing animation
        timeline.setOnFinished((event) -> {
            parentContainer.getChildren().remove(previousScene);
        });
        
        timeline.play();
        
    }
}













