/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JComboBox;

/**
 * FXML Controller class
 *
 * @author emreduman
 */
public class FXMLController implements Initializable 
{
    /**
     * Initializes the controller class.
     */
    @FXML private Button submit;
    @FXML private Button clear;
    @FXML private Button exit;

    @FXML private TextField courseName;
    @FXML private TextField assignGrade;
    @FXML private TextField quizGrade;
    @FXML private TextField finalGrade;
    
    @FXML private TextArea InformationScreen;
    
    @FXML private ComboBox savedCourses;

    String Course_Name;
    Double Assign_Grade, Quiz_Grade , Final_Grade , Total ,grade; 
    int courseNumber=0 , comboBox_indexNumber=0 , submitNumber=0, dataFileNumber=0;
    
    double GradeList [] = new double [3];//This array stored  grade inputs
    double GradeListt [][] = new double [5][3];//This array stored  grade inputs
    double totalGrade[]= new double[5];

    
    String GradeTypes []={"Assignment", "Quiz" ,"Final"};
    String CourseList []= new String [5];
    
    File DataFile;
    
    
    @FXML
    private void ReadComboBoxCourses(javafx.event.ActionEvent event)
    {       
        switch(savedCourses.getSelectionModel().getSelectedIndex())
        {                
            case 0:  read(event,0); readTeaxtArea(event,0);  break;
            case 1:  read(event,1); readTeaxtArea(event,1); break;
            case 2:  read(event,2); readTeaxtArea(event,2);  break;
            case 3:  read(event,3); readTeaxtArea(event,3);  break;
            case 4:  read(event,4); readTeaxtArea(event,4);  break;
        }     
    }
       
    @FXML
    private void submit_write_addCourseInComboBox (javafx.event.ActionEvent event) throws FileNotFoundException
    {
        //this method is to display inputs which are taken from textboxes 
        if(submitNumber < 5)
        {
            Course_Name        =courseName.getText();
            Assign_Grade       =Double.parseDouble(assignGrade.getText());
            Quiz_Grade         =Double.parseDouble(quizGrade.getText());
            Final_Grade        =Double.parseDouble(finalGrade.getText());


            CourseList[courseNumber] = Course_Name;
            courseNumber++;
 
            ObservableList<String> lst=FXCollections.observableArrayList(CourseList);
            savedCourses.setItems(lst);
             
            for(int i=0;i<3;i++)
            {
                switch(i)
                {
                    case 0: GradeListt[submitNumber][i]=Assign_Grade;break;
                    case 1: GradeListt[submitNumber][i]=Quiz_Grade ;break;
                    case 2: GradeListt[submitNumber][i]=Final_Grade;break;
                }
            }
            
            for(int i=0 ; i<3 ; i++)
            {
                totalGrade[submitNumber]+=GradeListt[submitNumber][i];
            }
                 

            // IN THE METHOD , CODES UNDER THIS LINE ARE FOR WRITING INPUTS INTO DATA FILE. 
            try
            {
                DataFile=new File(CourseList[submitNumber] + "GradeInformation.txt");//File is a class just refer the path ,in the project source folder
                PrintWriter output = new PrintWriter(DataFile);//opening write mode
                
                for(int i= 0; i < 3; i++)
                {
                    output.println(CourseList[submitNumber]+" , " +GradeTypes [i]+" : "+GradeListt[submitNumber][i]+"\n");
                }
                output.println("TOTAL:"+totalGrade[submitNumber]+"\n");

                output.close();
            }

            catch(IOException e)
            {
                System.out.println("Error in the file!!!");
            } 
                  
            for(int i= 0; i < 3; i++)
            {
                InformationScreen.appendText(CourseList[submitNumber]+" , " +GradeTypes [i]+GradeListt[submitNumber][i]+"\n");
            }
            
            if(submitNumber==4)
            {
            submit.setDisable(true);
            }
            
            submitNumber++;         
        }
        
    }

    
    @FXML
    private void clear_Inputs(javafx.event.ActionEvent event)
    {
        //this method is for to clear the input in textfields
        courseName.clear();
        assignGrade.clear();
        quizGrade.clear();
        finalGrade.clear();     
        InformationScreen.clear();
    }
    
    @FXML
    private void clear_comboBoxCourses_AND_DataFile(javafx.event.ActionEvent event)
    {
        DataFile.delete();
    }
 
    @FXML
    private void exit(javafx.event.ActionEvent event)
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
    
    
    @FXML
    private void read(javafx.event.ActionEvent event,int a)
    {
         //this method is to read/display the saved information in text file
        try
        {   
            FileReader fr = new FileReader(CourseList[a] +"GradeInformation.txt");
             int i; 
                while ((i=fr.read()) != -1) 
                {
                  System.out.print((char) i); 
                          
            }
            fr.close();       
        }
        
        catch(IOException e)
        {
            System.out.println("Error in the file!!!");
        }
    }
    
    @FXML
    private void readTeaxtArea(javafx.event.ActionEvent event,int a)
    {
         for(int i= 0; i < 3; i++)
        {
            InformationScreen.appendText(CourseList[a]+" , " +GradeTypes [i]+GradeListt[a][i]+"\n");
        }
        InformationScreen.appendText("TOTAL:"+totalGrade[a]+"\n");

    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
    }
 
}
