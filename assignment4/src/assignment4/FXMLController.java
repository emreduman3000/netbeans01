/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

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
    private TextField startValue;
    @FXML
    private TextField endValue;  
    @FXML
    private TextArea tarea;

    @FXML
    private Button display;
    @FXML
    private Button btnclear;
    @FXML
    private Button btnexit;
        
    @FXML
    private void display(ActionEvent event)
    {
        double a=Double.parseDouble(startValue.getText());
        double b=Double.parseDouble(endValue.getText());
                        double a2=a;

        tarea.appendText("Celsius         Fahrenheit\n--------------------------\n");

        if(startValue.getText() == null || endValue.getText() == null)
        {
            System.out.println("");
        }
        
        if (a<b)//5-10
        {
            for(int i=0;i<b-a;i++)//0<5
            {
                double fahrenheit=(a2*1.8) + 32;

                tarea.appendText(String.format("%.2f         %.2f\n",a2,fahrenheit));
                a2++;
            }
        }
        else if(a>b)//10-5
        {
            
            for(int i=0;i<a-b;i++)//0<5
            {
                double fahrenheit=(a2*1.8) + 32;

                tarea.appendText(String.format("%.2f         %.2f\n",a2,fahrenheit));
                a2--;
            }
        }
        else
        {
            double fahrenheit=(a*1.8) + 32;
                tarea.appendText(String.format("%.2f         %.2f\n",a2,fahrenheit));
        }

        
    }
    
    @FXML
    private void clear(ActionEvent event)
    {
        startValue.clear();
        endValue.clear(); 
        tarea.clear();  
        
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
