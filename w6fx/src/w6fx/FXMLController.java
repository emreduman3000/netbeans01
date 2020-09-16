/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author emreduman
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    int x=0;
    @FXML
    private TextField txtfirst;
    @FXML
    private TextField txtsecond;
    @FXML
    private TextField txtres;
    @FXML
    private Button btnadd;
    @FXML
    private Button btnmul;
    @FXML
    private Button btnclear;
    @FXML
    private Button btnexit;
    @FXML
    private TextArea tarea;
    
    @FXML
    private void addition(ActionEvent event)
    {
        double a=Double.parseDouble(txtfirst.getText());
        double b=Double.parseDouble(txtsecond.getText());
        double c=a+b;
        //txtres.setText(String.valueOf(c));
        txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
        tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
    }
    
    @FXML
    private void multiplication(ActionEvent event)
    {
        double a=Double.parseDouble(txtfirst.getText());
        double b=Double.parseDouble(txtsecond.getText());
        double c=a*b;
        //txtres.setText(String.valueOf(c));
        txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
        tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
    }
    
    @FXML
    private void clear(ActionEvent event)
    {
        txtfirst.clear();
        txtsecond.clear();
        txtres.clear();
        tarea.clear();        
    }
    @FXML
    private void exit(ActionEvent event)
    {
      Alert a=new Alert(Alert.AlertType.CONFIRMATION);
      a.setTitle("Exit message");
      a.setHeaderText("Confirmation");
      a.setContentText("press OK if you want to exit");
      a.showAndWait().ifPresent(response -> { 
        if(response == ButtonType.OK)
            {
                System.exit(0);
            }
         });      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }        
}
