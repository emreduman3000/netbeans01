/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

    @FXML private Button write;
    @FXML private Button read;
    @FXML private Button clear;
    @FXML private Button delete;
    @FXML private TextField BookName;
    @FXML private TextField UnitPrice;
    @FXML private TextField Description;
    @FXML private TextField NoOfCopy;
    @FXML private TextArea InformationScreen;
 
    
    String Book_Name, DEscription;
    Double Unit_Price, Total;    
    int No_Of_Copy,i=0;

    File textfile;
    
   
    
    @FXML
    private void delete(javafx.event.ActionEvent event) throws FileNotFoundException
    {
        //this method is to delete all inputs in text file
        textfile.delete();
    }
    
    @FXML
    private void clear(javafx.event.ActionEvent event)
    {
        //this method is for to clear the input in textfields
        BookName.clear();
        Description.clear();
        UnitPrice.clear();
        NoOfCopy.clear();     
        InformationScreen.clear();
    }
 
    
    @FXML
    private void write(javafx.event.ActionEvent event) throws FileNotFoundException
    {
        //this  method is to save inputs which a user enters into textfields
        try
        {
            textfile=new File("bookStore.txt");//File is a class just refer the path ,in the project source folder
            PrintWriter output = new PrintWriter(textfile);//opening write mode
            
            Book_Name   =BookName.getText();
            DEscription =Description.getText();
            No_Of_Copy  =Integer.parseInt(UnitPrice.getText());
            Unit_Price  =Double.parseDouble(NoOfCopy.getText());
            Total       =Unit_Price*No_Of_Copy;
            
            
            
            output.println(Book_Name+" "+DEscription+" "+Unit_Price+" "+No_Of_Copy+" "+Total);
            output.close();

        }
        catch(IOException e)
        {
            System.out.println("Error in the file!!!");

        }
        
        
    }
    
    @FXML
    private void read(javafx.event.ActionEvent event)
    {
        //this method is to read/display the saved information in text file
        try
        {
            if(i==0)
            {
                InformationScreen.appendText("Titles\t\t\tDescription\t\t\tPrice\t\t\tCopies\t\t\tTotal\n");
                i++;
            }
            
            Scanner input = new Scanner(textfile);//open the file in read mode
            while(input.hasNext())
            {
                input.useDelimiter(",");
                System.out.println(input.next());
                
           
                InformationScreen.appendText(Book_Name+"\t\t\t"+DEscription+"\t\t\t"+Unit_Price+"\t\t\t"+No_Of_Copy+"\t\t\t"+Total+"\n");

            }
            input.close();
        }
        catch(IOException e)
        {
            System.out.println("Error in the file!!!");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

 
}
