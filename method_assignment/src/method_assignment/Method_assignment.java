/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_assignment;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author emreduman
 */
public class Method_assignment
{
    static float scale=5000,com1=400,com2=500,salesrate1=0.08f,salesrate2=0.10f,salesrate3=0.12f,comrate1=12.5f,comrate2=10f,comrate3=8.3333f;
    static String  option1="click OK to get commission", option2="click OK to get sales amount";
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Object[ ] options = {option1, option2};
        Object selection = JOptionPane.showInputDialog(null, "Do your transaction?",//!!!!!!!!!!!!!1
        "MENU", JOptionPane.QUESTION_MESSAGE,null,options,option1);
        
        if(selection==option1) question1();
        if(selection==option2) question2(); }
    
    static private void question1(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER SALES AMOUNT:");
        float sales_amount=scan.nextFloat(), commission=0;
        while(sales_amount<1) {
             System.out.println("ENTER SALES AMOUNT AGAIN:");
             sales_amount=scan.nextFloat();  }
        if (sales_amount<=scale){
            commission=sales_amount*salesrate1; 
            System.out.printf("THE COMMISSION IS %.2f FOR SALES AMOUNT OF %.1f %n",commission,sales_amount); }       
        else if(sales_amount<=2*scale && sales_amount>=scale+1){
            commission=(scale*salesrate1)+(sales_amount-scale)*salesrate2;
            System.out.printf("THE COMMISSION IS %.1f FOR SALES AMOUNT OF %.1f %n",commission,sales_amount); }       
        else{
            commission=(scale*salesrate1)+(scale*salesrate2)+(sales_amount-(2*scale))*salesrate3;
            System.out.printf("THE COMMISSION IS %.1f FOR SALES AMOUNT OF %.1f %n",commission,sales_amount); } } //method1 End  
    
    static public void question2(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER COMMISSION AMOUNT:");
        float commission=scan.nextFloat(),sales_amount=0;      
        if(commission>=0 && commission<1) {
            sales_amount=commission*comrate1;
            System.out.printf("THE SALES AMOUNT IS %.2f IS NEEDED TO MAKE A COMMISSION OF %.2f",sales_amount,commission); }
        if(commission>=1){            
            if(commission>=1 && commission<=com1)sales_amount=commission*comrate1;
            if(commission>com1 && commission<=com1+com2)sales_amount=scale+(commission-com1)*comrate2;
            if(commission>com1+com2)sales_amount=2*scale+(commission-(com1+com2))*comrate3;
            System.out.printf("THE SALES AMOUNT IS %.1f IS NEEDED TO MAKE A COMMISSION OF %.1f",sales_amount,commission);}               
    }//method2 end
}//class end
