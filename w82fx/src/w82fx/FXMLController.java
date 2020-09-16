/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w82fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    private Button btnadd;
     @FXML
    private TextField txtfirst;
    @FXML
    private TextField txtsecond;
    @FXML
    private TextField txtres;
    @FXML
    private TextArea tarea;
    @FXML
    private Button btnmul;
    @FXML
    private Button btnclear;
    @FXML
    private Button btnexit;
    @FXML
    private CheckBox chkadd;
    @FXML
    private RadioButton radadd;
    @FXML
    private RadioButton radmul;
    @FXML private ComboBox cmb;
    @FXML private ListView lview;
    @FXML Button btnimg;
    @FXML ImageView imgview;
    
    ToggleGroup grp=new ToggleGroup();
    String[] name={"ADdition","Subtraction","Multiplication","Division"};
    ObservableList<String> lst=FXCollections.observableArrayList(name);
    
    String[] name1={"ADDITION","Subtraction","Multiplication","Division"};
    ObservableList<String> lst1=FXCollections.observableArrayList(name);
    @FXML
    private void btnimgchange(ActionEvent event)
    {
       imgview.setImage(new Image(getClass().getResource("sm4.png").toExternalForm()));
    }    
    @FXML
    private void cmbevent(ActionEvent event)
    {
        if(cmb.getSelectionModel().getSelectedIndex()==0)
        {
            double a=Double.parseDouble(txtfirst.getText());
            double b=Double.parseDouble(txtsecond.getText());
            double c=a+b;
            //txtres.setText(String.valueOf(c));
            txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
            tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
        }
        else if(cmb.getSelectionModel().getSelectedIndex()==1)
        {
            double a=Double.parseDouble(txtfirst.getText());
            double b=Double.parseDouble(txtsecond.getText());
            double c=a-b;
            //txtres.setText(String.valueOf(c));
            txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
            tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
        }
    }
    @FXML
    private void radaddition(ActionEvent event)
    {
        double a=Double.parseDouble(txtfirst.getText());
        double b=Double.parseDouble(txtsecond.getText());
        double c=a+b;
        //txtres.setText(String.valueOf(c));
        txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
        tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
    }
     @FXML
    private void radmultiplication(ActionEvent event)
    {
        double a=Double.parseDouble(txtfirst.getText());
        double b=Double.parseDouble(txtsecond.getText());
        double c=a*b;
        //txtres.setText(String.valueOf(c));
        txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
        tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
    }
    @FXML
    private void chkaddition(ActionEvent event)
    {
        if(chkadd.isSelected()==true)
        {
        double a=Double.parseDouble(txtfirst.getText());
        double b=Double.parseDouble(txtsecond.getText());
        double c=a+b;
        //txtres.setText(String.valueOf(c));
        txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
        tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
        }
        //else if(chkadd.isSelected()==false)
        else
        {
            txtfirst.clear();
            txtsecond.clear();
            txtres.clear();
        }
    }    
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
        radadd.setToggleGroup(grp);
        radmul.setToggleGroup(grp);
        cmb.setItems(lst);
        lview.setItems(lst1);
        lview.getSelectionModel().selectedIndexProperty().addListener((Observable name2) -> {
            if(lview.getSelectionModel().getSelectedIndex()==0)
            {
                double a=Double.parseDouble(txtfirst.getText());
                double b=Double.parseDouble(txtsecond.getText());
                double c=a+b;
                //txtres.setText(String.valueOf(c));
                txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
                tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
            }
            else if(lview.getSelectionModel().getSelectedIndex()==1)
            {
                double a=Double.parseDouble(txtfirst.getText());
                double b=Double.parseDouble(txtsecond.getText());
                double c=a-b;
                //txtres.setText(String.valueOf(c));
                txtres.setText(String.format("%.2f",c)); //it display 2 decimal point
                tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
            }
        });
    }    
    
}
