/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w82fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author emreduman
 */
public class W82fx extends Application{

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        stage.setTitle("Testing");
        stage.setScene(new Scene(root));
        stage.show();
    }    
}
