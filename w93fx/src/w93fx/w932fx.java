/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w93fx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class w932fx {
       public static void main(String[] args)
    {
        File myfile=new File("c:\\file2.txt");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter emp name");
        String name=sc.next();
        System.out.println("enter number of weeks for emp");
        double nw=sc.nextDouble();
        System.out.println("enter hourly rate for emp");
        double hr=sc.nextDouble();
        try
        {
            FileWriter fw=new FileWriter(myfile,true); //append mode
            PrintWriter output=new PrintWriter(fw);
            output.println(name+","+nw+","+hr);
            output.close();
            System.out.println("file created");
        }
        catch(IOException e)
        {
            System.out.println("error in file write");
        }
       
        
        
        
        
        
        try
        {
            Scanner input=new Scanner(myfile); //open read mode
            while(input.hasNext())
            {
                String s=input.next();
                //System.out.println(s);
                Scanner scn=new Scanner(s);
                scn.useDelimiter(",");
                String n=scn.next();
                double w=scn.nextDouble();
                double h=scn.nextDouble();
                double sl=w*h;
                System.out.println("emp name="+n);
                System.out.println("emp no of weeks="+w);
                System.out.println("emp houly rate="+h);
                System.out.println("emp salary="+sl);
            }
            input.close();
        }
        catch(IOException e)
        {
            System.out.println("error in file read");
        }
    }    

}