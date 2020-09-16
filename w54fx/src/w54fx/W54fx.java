/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w54fx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
/**
 *
 * @author emreduman
 */
public class W54fx extends Application{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        stage.setTitle("Gridpane");
        stage.setScene(new Scene(root));
        stage.show();




//        Label lbladd=new Label("Address:");
//        Label lblcity=new Label("City:");
//        Label lblprov=new Label("Province:");
//        Label lblpostal=new Label("Postal:");
//        TextField txtadd=new TextField();
//        TextField txtcity=new TextField();
//        TextField txtprov=new TextField();
//        TextField txtpostal=new TextField();
//        Button btn1=new Button("Submitaaaa");
//        Button btn2=new Button("Clear");
//        ColumnConstraints cs1=new ColumnConstraints();
//        ColumnConstraints cs2=new ColumnConstraints();
//        cs1.setPercentWidth(20);
//        cs2.setPercentWidth(30);
//        GridPane gp=new GridPane();
//        gp.getColumnConstraints().addAll(cs1,cs2,cs2,cs1);
//        gp.add(lbladd, 0, 0, 1, 1); //start col,start row,colspan,rowspan
//        gp.add(txtadd, 1, 0, 3, 1);
//        gp.add(lblcity, 0, 1, 1, 1);
//        gp.add(txtcity, 1, 1, 2, 1);
//        gp.add(lblprov, 0, 2, 1, 1);
//        gp.add(txtprov, 1, 2, 1, 1);
//        gp.add(lblpostal, 2, 2, 1, 1);
//        gp.add(txtpostal, 3, 2, 1, 1);
//        gp.add(btn1, 1, 3, 1, 1);
//        gp.add(btn2, 2, 3, 1, 1);
//        Scene sc=new Scene(gp,350,300);
//        stage.setTitle("Gridpane");
//        stage.setScene(sc);
//        stage.show();
    }    
}
