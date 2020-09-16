/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author emreduman
 */
public class JavaApplication24 {

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
    }
    
}
