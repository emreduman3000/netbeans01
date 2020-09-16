/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author kantaria
 */
public class W9multiplescene extends Application{

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        launch(args);
    }
    static Stage stage1=new Stage();
    @Override    
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLone.fxml"));
        stage1.setTitle("First scene");
        Scene scene=new Scene(root);
        stage1.setScene(scene);
        stage1.show();
    }    
    public static void stage1hide()
    {
        stage1.hide();
    }
    public static void stage1show()
    {
        stage1.show();
    }
}
