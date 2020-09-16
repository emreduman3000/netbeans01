/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author emreduman
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
   
    @FXML
    private TextField txtfirst;
    @FXML
    private TextField txtsecond;
    @FXML
    private TextField txtthird;
    @FXML
    private TextField txtfourth;
    @FXML
    private TextArea tarea;
    
    @FXML
    private CheckBox chkmouse;
    @FXML
    private CheckBox chkusb ; 
    @FXML
    private CheckBox chkcharger;
   
    
    @FXML
    private Button total;
    @FXML
    private Button btnclear;
    @FXML
    private Button btnexit;
        
    
    double a,b,c,d,e,f,g,h;     

    @FXML 
    private void chkmouse(ActionEvent event)
    {
        if(chkmouse.isSelected()==true)
        {
            txtfirst.setDisable(false);
        } 
        if(chkmouse.isSelected()==false)
        {
            a=0;
            txtfirst.clear();
            txtfirst.setDisable(true);
        }
    }
    
    @FXML 
    private void chkusb(ActionEvent event)
    {
        if(chkusb.isSelected()==true)
        {
            txtsecond.setDisable(false);
        }
        if(chkusb.isSelected()==false)
        {
            b=0;
            txtsecond.clear();
            txtsecond.setDisable(true);
        }
      
    }
    @FXML 
    private void chkcharger(ActionEvent event)
    {
        if(chkcharger.isSelected()==true)
        {
            
            txtthird.setDisable(false);

        }
        if(chkcharger.isSelected()==false)
        {
            c=0;
            txtthird.clear();
            txtthird.setDisable(true);
        }
    }
    
   


    @FXML
    private void addition(ActionEvent event)
    {   
            if(chkmouse.isSelected()==true){
                a=Double.parseDouble(txtfirst.getText());
            }

            if(chkusb.isSelected()==true){
                b=Double.parseDouble(txtsecond.getText());
            }

            if(chkcharger.isSelected()==true){
                c=Double.parseDouble(txtthird.getText());
            }

            d=Double.parseDouble(txtfourth.getText());
           

            e=a*10;
            f=b*20;
            g=c*15;
            h=e+f+g-d;
            tarea.appendText("Mouse=$"+e+"\n"+"USB=$"+f+"\n"+"Charger=$"+g+"\n"+"Discount:$"+d+"\n"+"--------------"+"\n" +"Total:"+h+"\n");
        
   
    }
    
    @FXML
    private void clear(ActionEvent event)
    {
        a=0;b=0;c=0;d=0;
        txtfirst.clear();
        txtsecond.clear();
        txtthird.clear();
        txtfourth.setText("0");
        
        tarea.clear();  
        
        chkmouse.setSelected(false);
        chkusb.setSelected(false);
        chkcharger.setSelected(false);
        
        txtfirst.setDisable(true);
        txtsecond.setDisable(true);
        txtthird.setDisable(true);

    }
    @FXML
    private void exit(ActionEvent event)
    {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Exit message");
        alert.setHeaderText("Confirmation");
        alert.setContentText("press OK if you want to exit");
        alert.showAndWait().ifPresent(response ->
        { 
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
