/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("----- WELCOME TO MY GROCERY STORE ----- ");

        System.out.print("Please Enter Number of items in Store: ");
        int ItemNumber =scan.nextInt();
        String ItemNames[]      =   new String[ItemNumber];
        double ItemQuantities[] =   new double[ItemNumber];
        double ItemPrices[]     =   new double[ItemNumber];
        double Total[]          =   new double[ItemNumber];
        double FinalTotal=0;

        
        for(int a=0 ; a<ItemNumber ; a++)
        {
            System.out.print("Please Enter an Item Name: ");
            String ItemName =scan.next();
            ItemNames[a]=ItemName;

            System.out.print("Please Enter Quantity of "+ItemNames[a]+":" );
            double ItemQuantity =scan.nextDouble();
            ItemQuantities[a]=ItemQuantity;

            System.out.print("Please Enter Price of "+ItemNames[a]+":" );
            double ItemPrice =scan.nextDouble();
            ItemPrices [a]= ItemPrice;
            
            Total[a]=ItemQuantities[a]*ItemPrices[a];
            FinalTotal += Total[a];
            System.out.println("------------------------------");
        }
        

        System.out.println("ITEM NAME\tQUANTITY\tPRICE\t\tTOTAL");
        for(int a=0 ; a<ItemNumber ; a++)
        {
            System.out.println(ItemNames[a]+"\t\t"+ItemQuantities[a]+"\t\t"+ItemPrices[a]+"\t\t"+Total[a]);                       
        }
        System.out.println("Final Total:\t\t\t\t\t"+FinalTotal);  
       
    }
}
