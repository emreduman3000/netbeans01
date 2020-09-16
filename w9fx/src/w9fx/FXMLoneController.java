/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9fx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kantaria
 */
public class FXMLoneController implements Initializable {
    /**
     * Initializes the controller class.
     */
    @FXML Button btnone;
    @FXML TextField txtmath;
    @FXML TextField txtenglish;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btnone.setOnAction(event -> { 
            loadscene();
        });
    } 
    static Stage stage2=new Stage();
    private void loadscene()
    {
        try{
             FXMLLoader loader=new FXMLLoader(getClass().getResource("FXMLtwo.fxml")); 
             Parent root2=loader.load();
             FXMLtwoController scene2controller=loader.getController();
             scene2controller.transfermath(txtmath.getText());
             scene2controller.transferenglish(txtenglish.getText());
             stage2.setScene(new Scene(root2));
             stage2.setTitle("second window");
             stage2.show();
             W9multiplescene.stage1hide();
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
    }
    public static void hidestage2()
    {
        stage2.hide();
    }
}
