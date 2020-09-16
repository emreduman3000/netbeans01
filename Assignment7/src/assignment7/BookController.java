/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;


/**
 * FXML Controller class
 *
 * @author emreduman
 */
public class BookController implements Initializable {

    
    ArrayList<Book> list=new ArrayList<>();
    static int record=0;
    int preNextRecord=0;
    PrintWriter output;
    Scanner input;
    File myfile;
    
    @FXML private Button add;
    @FXML private Button save;
    @FXML private Button write;
    @FXML private Button next;
    @FXML private Button previous;
    @FXML private Button edit;
    @FXML private Button UNedit;
    @FXML private Button exit;
    @FXML private Button clear;
    @FXML private Button display;
    @FXML private Button search;
    @FXML private TextField bookk;
    @FXML private TextField author;
    @FXML private TextField price;
    @FXML private TextField quantity;
    @FXML private TextField searchText;
    @FXML TextArea tarea;
    /**
     * Initializes the controller class.
     */
    
    
    @FXML
    private void search (javafx.event.ActionEvent event)
    {     
        tarea.setText(" ");
        tarea.appendText("------------------------------------------\n");
        tarea.appendText("SEARCHING RESULT:\n");
        double total1;
        int b=0;
        String searchValue=searchText.getText();

        for(int i=0 ; i< list.size();i++)
        {
            if(list.get(i).getBookname().equals(searchValue)==true)
            {
                tarea.appendText("Name\t\t\tAuthor\t\tPrice\t\tQuantity\t\tTOTAL\n");
                total1=list.get(i).getPrice()*list.get(i).getQuantity();
                 //System.out.println(list.get(i).getBookname()+" "+list.get(i).getAuthor()+" "+String.valueOf(list.get(i).getPrice())+","+String.valueOf(list.get(i).getQuantity()));           
                tarea.appendText(list.get(i).getBookname() + "\t\t" + list.get(i).getAuthor() + "\t\t" + list.get(i).getPrice() + "\t\t\t" + list.get(i).getQuantity()+"\t\t\t"+total1+"\n"); 
                b++;
            }
        }

        if(b==0)
        {
            //System.out.println("The book is not available");
            tarea.appendText(String.valueOf(searchValue)+" is not available.\n");
        }       
       
    }
          
    @FXML
    private void clear_textArea(javafx.event.ActionEvent event)
    {
        tarea.setText(" ");
        searchText.clear();
    }
    
    @FXML
    private void display_textArea(javafx.event.ActionEvent event)
    {          
        tarea.setText(" ");
        tarea.appendText("Book name \t\t Authorname \t\t Book Price \t\t Book Quantity \t\t Total  \n");

        try 
        {
            if(myfile.exists())
            {
                Scanner input= new Scanner(myfile);//open file in read mode
                while(input.hasNext())
                {
                    String s=input.nextLine();
                    Scanner sc=new Scanner(s);
                    sc.useDelimiter(",");
                    Book bkk=new Book();
                    bkk.setBookname(sc.next());
                    bkk.setAuthor(sc.next());
                    bkk.setPrice(sc.nextDouble());
                    bkk.setQuantity(sc.nextInt());
                    list.add(bkk);
                    

                    double total=list.get(record).getPrice()*list.get(record).getQuantity();

                    tarea.appendText(list.get(record).getBookname() +  " \t\t\t\t" + list.get(record).getAuthor() + "\t\t\t\t" + list.get(record).getPrice() + "\t\t\t\t" + list.get(record).getQuantity() + "\t\t\t\t" + total + "\n");
                }
            }
            
            else
            {
                System.err.println("file not exists add record first");
            }
            input.close();           
        }  
        
        catch (Exception e) 
        {
            String aa = null;
            for(int i=0;i<list.size();i++)
            {
                double total2=list.get(i).getPrice()*list.get(i).getQuantity();

                //arraylistten okuduk verileri dosyanını içine yaazıyoruz.
                aa=list.get(i).getBookname()+"\t\t\t\t"+list.get(i).getAuthor()+"\t\t\t\t "+String.valueOf(list.get(i).getPrice())+"\t\t\t\t"+String.valueOf(list.get(i).getQuantity()+"\t\t\t\t "+String.valueOf(total2)+"\n");
                tarea.appendText(aa);  
            }
        }      
    }
    
    @FXML
    private void UNedit(javafx.event.ActionEvent event)
    {
        record=list.size();//TO KEEP RECORD IF YOU 

        
        next.setDisable(true);
        previous.setDisable(true);
        UNedit.setDisable(true);
        bookk.clear();
        author.clear();
        price.clear();
        quantity.clear();

    }
    
    @FXML
    private void exit1(javafx.event.ActionEvent event)
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
    private void edit1(ActionEvent event)
    {
        preNextRecord=record;
        UNedit.setDisable(false);
        if(record==0)
            previous.setDisable(true);
        else
            previous.setDisable(false);
   
        if(record==list.size())
            next.setDisable(true);
        else
            next.setDisable(false);
        
    }
    @FXML
    private void previous1(ActionEvent event)
    {
        record--;
        bookk.setText(list.get(record).getBookname());
        author.setText(list.get(record).getAuthor());
        price.setText(String.valueOf(list.get(record).getPrice()));
        quantity.setText(String.valueOf(list.get(record).getQuantity()));
        if(record==0)
            previous.setDisable(true);
        else
            previous.setDisable(false);
        
        if(record==list.size()-1)
                next.setDisable(true);
        else
                next.setDisable(false);
    }
    @FXML
    private void next1(ActionEvent event)
    {
        record++;
        bookk.setText(list.get(record).getBookname());
        author.setText(list.get(record).getAuthor());
        price.setText(String.valueOf(list.get(record).getPrice()));
        quantity.setText(String.valueOf(list.get(record).getQuantity()));
        if(record==list.size()-1)
                next.setDisable(true);
        else
                next.setDisable(false);
        
        if(record==0)
            previous.setDisable(true);
        else
            previous.setDisable(false);
        
    }
    @FXML
    private void add1(ActionEvent event)
    {
        record=list.size();//to increase record
        System.out.println("add1 record="+record+"size="+list.size());
        bookk.clear();
        author.clear();
        price.clear();
        quantity.clear();   
        
       
        
        add.setDisable(true);

    }
    @FXML
    private void save1(ActionEvent event)
    {//
        Book s= new Book();
        s.setBookname(bookk.getText());
        s.setAuthor(author.getText());
        s.setPrice(Double.parseDouble(price.getText()));
        s.setQuantity(Integer.parseInt(quantity.getText()));
       
        if(record==list.size())
        {
            list.add(s);
            System.out.println("save1 if record="+record+"size="+list.size());
        }
        else//listin ilk elemanını yeni yazılan bilgileri yap
        {
            list.set(record, s);
            System.out.println("save1 if record="+record+"size="+list.size());
        }
        
        
        edit.setDisable(false);
        add.setDisable(false);



    }
    
     @FXML
    private void write1(ActionEvent event)
    {
        try
        {      
            
            PrintWriter pr=new PrintWriter(myfile);
            System.out.println("printwiter pr empty file");
            pr.print("");
            pr.close();
            
            
            FileWriter fw=new FileWriter(myfile,true); //AYNI DOSYA FARKLI sınıf ve nesne ile cagırıp olusturma-append mode
/*PrintWriter*/      output=new PrintWriter(fw);//baska sınfla ve nesnesiyle append modda olusturdugum dosyayı output nesnesi ile cagırıma
//printwriter ile append mode yok
            System.out.println("printwriter output append mode");
            for(int i=0;i<list.size();i++)
            {
                //arraylistten okuduk verileri dosyanını içine yaazıyoruz.
                output.println(list.get(i).getBookname()+","+list.get(i).getAuthor()+","+list.get(i).getPrice()+","+list.get(i).getQuantity());
            }
            output.close();//dosyayı kapadık
        }
        catch(Exception e)
        {
            System.out.println("error in write1");
        }
        
       
        
        add.setDisable(true);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
        
        myfile=new File("BookStore.txt"); //İSİM VERDİM
        
       
    }    
    
}
