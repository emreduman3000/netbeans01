/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author emreduman
 */
public class BookStore extends Application{

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
       launch(args);

        
   }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        stage.setTitle("BOOK INVENTORY");
        String css=getClass().getResource("fxml.css").toExternalForm();
        Scene scene=new Scene(root);
        scene.getStylesheets().add(css);  //add css file to scene
        stage.setScene(scene);
        stage.show();
    }    
}

