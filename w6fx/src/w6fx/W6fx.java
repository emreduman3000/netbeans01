/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w6fx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
/**
 *
 * @author emreduman
 */
public class W6fx extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        stage.setTitle("Event Handling!!");
        stage.setScene(new Scene(root));
        stage.show();
        
//        Label lbl1=new Label("Enter first number:");
//        Label lbl2=new Label("Enter second number:");
//        Label lbl3=new Label("   Result:   ");
//        Label lbl4=new Label("Text Area:");        
//        TextField txt1=new TextField();
//        TextField txt2=new TextField();
//        TextField txt3=new TextField();
//        TextArea tarea=new TextArea();
//        tarea.setPrefColumnCount(15);
//        tarea.setPrefRowCount(10);
//        Button btnadd=new Button("Addition");
//        Button btnmul=new Button("Multiplication"); 
//        Button btnclear=new Button("clear");
//        Button btnexit=new Button("Exit");
////        btnadd.setOnAction(new EventHandler<ActionEvent>(){ 
////            public void handle(ActionEvent event)
////            {
////               double a=Double.parseDouble(txt1.getText());
////               double b=Double.parseDouble(txt2.getText());
////               double c=a+b;
////               //txt3.setText(String.valueOf(c));
////               txt3.setText(String.format("%.2f",c)); //it display 2 decimal point
////               tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
////            }
////        });
//        
//        //this is lambda expression syntax
//        btnadd.setOnAction(e -> { 
//            double a=Double.parseDouble(txt1.getText());
//               double b=Double.parseDouble(txt2.getText());
//               double c=a+b;
//               //txt3.setText(String.valueOf(c));
//               txt3.setText(String.format("%.2f",c)); //it display 2 decimal point
//               tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
//        });       
//        
//        
//        btnmul.setOnAction(new EventHandler<ActionEvent>(){ 
//            public void handle(ActionEvent event)
//            {
//               double a=Double.parseDouble(txt1.getText());
//               double b=Double.parseDouble(txt2.getText());
//               double c=a*b;
//               //txt3.setText(String.valueOf(c));
//               txt3.setText(String.format("%.2f",c)); //it display 2 decimal point
//               tarea.appendText("a="+a+" b="+b+" c="+c+"\n");
//            }
//        });
//        
//        btnclear.setOnAction(new EventHandler<ActionEvent>(){ 
//            public void handle(ActionEvent event)
//            {
//               txt1.clear();
//               txt2.clear();
//               txt3.clear();
//               tarea.clear();
//            }
//        });
//        
//        btnexit.setOnAction(new EventHandler<ActionEvent>(){ 
//            public void handle(ActionEvent event)
//            {
//               Alert a=new Alert(Alert.AlertType.CONFIRMATION);
//               a.setTitle("Exit message");
//               a.setHeaderText("Confirmation");
//               a.setContentText("press OK if you want to exit");
//               a.showAndWait().ifPresent(response -> { 
//                   if(response == ButtonType.OK)
//                   {
//                       System.exit(0);
//                   }
//               });
//            }
//        });
//        
//        FlowPane fp=new FlowPane();
//        fp.getChildren().addAll(lbl1,txt1,lbl2,txt2,lbl3,txt3,btnadd,btnmul,btnclear,btnexit,lbl4,tarea);
//        Scene sc=new Scene(fp,350,300);
//        stage.setTitle("Event Handling");
//        stage.setScene(sc);
//        stage.show();

    }     
}
