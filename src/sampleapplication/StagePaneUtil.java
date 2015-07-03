/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Created by liu.k on 25/06/2015.
 */
public class StagePaneUtil {

    public static void createStage(
            Stage currentStage,
            UserControl userControl,
            String title,
            boolean resizable,
            StageStyle stageStyle,
            boolean maximized) {

        Stage newStage = new Stage();
        Scene scene = new Scene(userControl);
        stageStyle = stageStyle != null ? stageStyle : StageStyle.DECORATED;
        newStage.initStyle(stageStyle);

        newStage.setTitle(title);
        newStage.setResizable(resizable);
//        newStage.setMaximized(maximized);
        newStage.setScene(scene);
        
        newStage.setMinWidth(1020);
        newStage.setMinHeight(700);

        
        userControl.setStage(currentStage, newStage);
        newStage.show();
        currentStage.close();
    }
    
    public static void loadPane(Pane currentPane, Region newPane) {
        currentPane.getChildren().setAll(newPane);
    }
}

