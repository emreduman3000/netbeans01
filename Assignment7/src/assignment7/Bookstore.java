/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author emreduman
 */
public class Bookstore extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);      
    }
    
    
    @Override
    public void start(Stage stage) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("Book.fxml"));
        stage.setTitle("BOOK STORE");
        String css=getClass().getResource("Book.css").toExternalForm();
        Scene scene=new Scene(root);
        scene.getStylesheets().add(css);  //add css file to scene
        stage.setScene(scene);
        stage.show();
    }   
    
}
