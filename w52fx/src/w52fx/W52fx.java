/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w52fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author emreduman
 */
public class W52fx extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        stage.setTitle("Testing");
        stage.setScene(new Scene(root));
        stage.show();



//        Button btn1=new Button("one");
//        Label lbl1=new Label("this is test application");
//        TextField txt1=new TextField();
//        Button btn2=new Button("two");
//        Button btn3=new Button("three");
//        Button btn4=new Button("four");
//        Button btn5=new Button("five");
//        FlowPane fp=new FlowPane();
//        fp.setAlignment(Pos.TOP_LEFT);
//        //fp.setHgap(10);
//        //fp.setVgap(10);
//        Insets i=new Insets(10,15,10,20); //top bottom left right
//        FlowPane.setMargin(btn2, i);
//        FlowPane.setMargin(btn5, i);
//        fp.getChildren().addAll(btn1,lbl1,txt1,btn2,btn3,btn4,btn5);       
//        Scene sc=new Scene(fp,300,300);
//        stage.setScene(sc);        
//        stage.setTitle("fxpane Application");
//        stage.show();


//        Button btn1=new Button("one");
//        Label lbl1=new Label("this is test application");
//        TextField txt1=new TextField();
//        Button btn2=new Button("two");
//        Button btn3=new Button("three");
//        Button btn4=new Button("four");
//        Button btn5=new Button("five");
//        HBox hb=new HBox();
//        hb.getChildren().addAll(btn1,lbl1,txt1,btn2,btn3,btn4,btn5);       
//        Scene sc=new Scene(hb,300,300);
//        stage.setScene(sc);        
//        stage.setTitle("fxpane Application");
//        stage.show();


//        Button btn1=new Button("one");
//        Label lbl1=new Label("this is test application");
//        TextField txt1=new TextField();
//        Button btn2=new Button("two");
//        Button btn3=new Button("three");
//        Button btn4=new Button("four");
//        Button btn5=new Button("five");
//        VBox vb=new VBox();
//        vb.setFillWidth(false);
//        vb.getChildren().addAll(btn1,lbl1,txt1,btn2,btn3,btn4,btn5);       
//        Scene sc=new Scene(vb,300,300);
//        stage.setScene(sc);        
//        stage.setTitle("fxpane Application");
//        stage.show();


    }   
    
}
