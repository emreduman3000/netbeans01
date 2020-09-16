/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w93fx;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class W93fx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File myfile= new File("c:\\w93fx.txt");//File is a class just refer the path(C:\)
        File m= new File("temp.txt");//relative path(C:\Users\emreduman\Documents\NetBeansProjects\w93fx)
        try
        {
            PrintWriter output = new PrintWriter(myfile);//opening write mode
            PrintWriter pw = new PrintWriter(m);//opening write mode
            pw.println("This is java class");
            pw.close();
            pw.println("This is java class");
            output.println("java,1234,567");
            output.println("hello; good ;morning");
            output.print("this is line1");
            output.print("this is line2");
            output.printf("%d %f %s",200,50.5,"java");
            output.close();
            System.out.println("File created");
        }
        catch(IOException e)
        {
            System.out.println("Error in the file!!!");
        }
        
        try
        {
            Scanner input = new Scanner(myfile);//open the file in read mode
            Scanner i=new Scanner(m);
            while(input.hasNext())
            {
                input.useDelimiter(",");
                System.out.println(input.next());
            }
            input.close();
        }
        catch(IOException e)
        {
            System.out.println("Error in the file!!!");
        }
    }
    
}
