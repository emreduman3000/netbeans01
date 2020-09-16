/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication97;

import static java.lang.Integer.reverse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class JavaApplication97 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        
        Scanner sc = new Scanner(System.in);
        int[] numbers=new int[10];
                ArrayList<Integer> numberr = new ArrayList<>();

        
        for(int i=0; i<10;i++)
        {
            numberr.add((int)(Math.random()*100+1));
            System.out.println(numberr.get(i));
        }
        
        
        Collections.sort(numberr);
        
        ArrayList<Integer> numberr2 = new ArrayList<>();
        for(int i=0; i<numbers.length;i++)
        {
           numberr2.add(numberr.get(i%10));
                   
        }
        
        for(int j=0 ; j<10; j++)
        {
            System.out.println("the new arraylist:"+numberr2.get(j));
        }
    
    
    
    
    
        try
        {
            return;
        }
        finally
        {
            System.out.println("good");
        }
        
        System.out.println("btt");
    
    
    
    }
    
    

    
    
}
 
