/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

/**
 *
 * @author emreduman
 */
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
public class Assignment5 extends Application
{

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
        
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        
        stage.setTitle("Testing");
        stage.setScene(new Scene(root));
        stage.show();
    }    
}

