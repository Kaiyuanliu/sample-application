/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author liu.k
 */
public class SampleApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        StagePaneUtil.createStage(primaryStage, new LoginControl(), "Custom UserControl sample", true, StageStyle.DECORATED, true);
//        Scene scene = new Scene(new LoginControl(), 1020, 800);
//        primaryStage.setTitle("Custom UserControl sample");
//        primaryStage.setScene(scene);
//        primaryStage.setMinWidth(1020);
//        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
