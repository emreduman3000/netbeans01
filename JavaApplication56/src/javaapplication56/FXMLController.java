/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

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
    private Label lblOutput1;
    
    
  
    
     
    @FXML
    public void click(ActionEvent event) 
    {
        lblOutput1.setText("Hello, World!");
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    
    
}