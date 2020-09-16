/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w9fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kantaria
 */
public class FXMLtwoController implements Initializable {
    @FXML Button btntwo;
    @FXML Button btnadd;
    @FXML TextField txtm;
    @FXML TextField txte;
    @FXML TextArea tarea;
    public double a,b;
    /**
     * Initializes the controller class.
     */
    public void transfermath(String msg)
    {
        txtm.setText(msg);
        a=Double.parseDouble(msg);
    }
    public void transferenglish(String msg)
    {
        txte.setText(msg);
        b=Double.parseDouble(msg);
    }
    @FXML
    private void add(ActionEvent e)
    {
        double c=a+b;
        tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        btntwo.setOnAction(event -> { 
            W9multiplescene.stage1show();
            FXMLoneController.hidestage2();
        });
    }    
    
}
