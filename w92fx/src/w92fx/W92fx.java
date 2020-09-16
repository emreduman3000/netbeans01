/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w92fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author emreduman
 */
public class W92fx extends Application{

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        String testcss=getClass().getResource("fxml.css").toExternalForm();
        Scene scene=new Scene(root);
        scene.getStylesheets().add(testcss);  //add css file to scene
        stage.setScene(scene);
        stage.setTitle("Testing");        
        stage.show();
    }    
}