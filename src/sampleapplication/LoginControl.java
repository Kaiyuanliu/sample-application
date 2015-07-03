/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author liu.k
 */
public class LoginControl extends UserControl implements Initializable{

    @FXML
    private TextField username;
    
    @FXML
    private TextField password;
    
    @FXML
    private Button login;
    
    @FXML
    private StackPane paneData;
    
    private Pane pageArea;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
    @FXML
    private void handleLogin() {
        pageArea = new Pane() {
            @Override protected void layoutChildren() {
                for (Node child:pageArea.getChildren()) {
                    child.resizeRelocate(0, 0, pageArea.getWidth(), pageArea.getHeight());
                }
            }
        };
        paneData.getChildren().add(pageArea);
        FullNameControl fullName = new FullNameControl();
//        StagePaneUtil.createStage((Stage)login.getScene().getWindow(), fullName, "Full Name Control", true, StageStyle.DECORATED, true);
        StagePaneUtil.loadPane(pageArea, fullName);
    }
    
}
