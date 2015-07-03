/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapplication;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 *
 * @author Benjamin Gale
 */
public abstract class UserControl extends Region {

    protected Stage prevStage;
    protected Stage newStage;

    protected String loginUser;
    
    private final String resourcePath = "/sampleapplication/fxml/%s.fxml";
    
    private FXMLLoader currentLoader;

    public UserControl() {
        this.setSnapToPixel(true);
        this.getStyleClass().add("UserControl");
        this.loadView();
    }

    private void loadView() {
        FXMLLoader loader = new FXMLLoader();

        loader.setController(this);
        loader.setLocation(this.getViewURL());
        this.currentLoader = loader;
        try {
            Node root = (Node) loader.load();
            setMaxSize(root);

            this.getChildren().add(root);
        } catch (IOException ex) {
            Logger.getLogger(UserControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String getViewPath() {
        return String.format(resourcePath, this.getClass().getSimpleName());
    }

    private URL getViewURL() {
        return this.getClass().getResource(this.getViewPath());
    }

    @Override
    protected void layoutChildren() {
        List<Node> managed = getManagedChildren();
            double width = getWidth();
            ///System.out.println("width = " + width);
            double height = getHeight();
            ///System.out.println("height = " + height);
            System.out.println("width: " + getWidth());
            System.out.println("height: " + getHeight());
            System.out.println("insets: " + getInsets());
            double top = getInsets().getTop();
            double right = getInsets().getRight();
            double left = getInsets().getLeft();
            double bottom = getInsets().getBottom();
            for (int i = 0; i < managed.size(); i++) {
                Node child = managed.get(i);
                layoutInArea(child, 0, 0,
                               width - left - right, height - top - bottom,
                               0, Insets.EMPTY, true, true, HPos.LEFT, VPos.TOP);
            }
//        getChildren().stream().forEach((node) -> {
//            System.out.println(getWidth());
//            layoutInArea(node, 0, 0, getWidth(), getHeight(), 0, HPos.LEFT, VPos.TOP);
//        });
    }

    private void setMaxSize(Node node) {
        if (node != null && node instanceof Region) {
            Region region = (Region) node;
            region.setMaxWidth(Double.MAX_VALUE);
            region.setMaxHeight(Double.MAX_VALUE);
        }
    }
    
    public FXMLLoader getFxmlLoader() {
        return this.currentLoader;
    }
    
    public void setStage(Stage prevStage, Stage newStage) {
        this.prevStage = prevStage;
        this.newStage = newStage;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }
}
