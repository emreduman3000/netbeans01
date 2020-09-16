/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinflip;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author emreduman
 * @version 1.0
 * 
 */

public class CoinFlip {

    /**
     * @param args the command line arguments
     */
    static   int heads;
    static   int tails;
    static   int counter;
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        display(flipIt(store() ) );
    
    }
   
    
    private static boolean[] store()
    {  
        boolean[] array=new boolean[100];
        return array;        
    }
    
    
    public static boolean[] flipIt(boolean[]a)
    {      
        while(counter <= 99)
        {             
            if(Math.random()> 0.5)
            {
                heads++;
                a[counter]=true;
            }
            else
            {
                tails++;
                a[counter]=false;
            }
            counter++;      
        }      
        return a;
    }
     
    
    static public void display(boolean[] a)
    {
        for(int i=0 ;i<100;i++)
        {
            if(a[i]==true)
                System.out.print("Heads ");
            else
                System.out.print("Tails ");
           if(i%10==9)
           {
               System.out.println();
           }
        }       
        System.out.println("\nHeads:"+heads);
        System.out.println("Tails:"+tails);
        
        
        int[] longest_headss=new int[10];
        int[] longest_tailss=new int[10];


        int longest_heads=0;
        int longest_tails=0;
        int aa=0,bb=0;
        
        for(int i=0;i<100;i++)
        {
            if(a[i]==true)
            {
                while(a[i]==true)
                {
                    longest_heads++;
                    longest_headss[i]=longest_heads;
                    aa=longest_headss[i];
                                      
                    i++;

                }
                 
                if(longest_headss[i]<longest_headss[i+1])
                {
                    aa=longest_headss[i+1];
                }

            }
           
        
            
            if(a[i]==false)
            {
                while(a[i]==false)
                {
                    longest_tails++;
                    longest_tailss[i]=longest_tails;
                    bb=longest_tailss[i];

                   i++;
                }
                if(longest_tailss[i]<longest_tailss[i+1])
                {
                    bb=longest_tailss[i+1];
                }             
            }     
        }
            System.out.println(longest_heads);
            System.out.println(longest_tails);
            System.out.println("Longest run of heads is:"+aa);
            System.out.println("Longest run of tails is"+bb);
    }
    
}
