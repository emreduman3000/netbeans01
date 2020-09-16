/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class Exceptions 
{

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) 
    {
        // TODO code application logic here
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter two integer number");
        int a=input.nextInt();
        int b=input.nextInt();
        
        int c=division(a,b);
        System.out.println("division c="+c);
       
    }
    
    public static int division(int a,int b)
    {
        if(b==0)
        {
            System.out.println("divisior can not be zero");
            System.exit(0);
        }
        return (a/b);
    }
    
}

//<editor-fold defaultstate="collapsed" desc="circle class">


class circle 
{
    private double radius;
    
    public circle() 
    {
        this(0.0);
    }
    
    public circle(double radius) 
    {
        setRadius(radius);
    }
    
    public void setRadius(double radius) throws IllegalArgumentException
    {
        if(radius>=0)
             this.radius = radius;
        else 
            throw new IllegalArgumentException("radius can not be negative value");
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double area()
    {
        return 3.14*radius*radius;
    }  
}
        // </editor-fold>   

//<editor-fold defaultstate="collapsed" desc="circleex class">

class circleex
{
     public static void main(String[] args) 
     {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        try
        {
          circle c1=new circle(2.5); 
          System.out.println("radius="+c1.getRadius()+" area="+c1.area());
         
          circle c2=new circle(); 
          System.out.println("radius="+c2.getRadius()+" area="+c2.area());
          
          circle c3=new circle(-3.5); 
          System.out.println("radius="+c1.getRadius()+" area="+c1.area());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("-ve radius not allowed");
        }
     }
}
        // </editor-fold>   

//<editor-fold defaultstate="collapsed" desc="ex2 class">

class ex2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("enter two integer number");
        int a=input.nextInt();
        int b=input.nextInt();
        try
        {
            int c=a/b;
            System.out.println("division="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("divisior can not be zero");
        }
    }
}
        // </editor-fold> 

//<editor-fold defaultstate="collapsed" desc="ex3 class">
class ex3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("enter two integer number");
        int a=input.nextInt();
        int b=input.nextInt();
        try
        {
            int d=check(b);
            System.out.println("b="+b);
            
            int c=division(a,b);
            System.out.println("division c="+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("integer can not be divide by zero"+e);
        }
        catch(Exception e)
        {
            System.out.println("catch number can not be -ve"+e);
        }
        finally
        {
            System.out.println("this is finally stat");
        }
    } 
    public static int division(int a,int b) throws ArithmeticException
    {
        if(b==0)
            throw new ArithmeticException("divisior can not be zero");
        
        return (a/b);   
    }
    public static int check(int b) throws Exception
    {
        if(b<0)
            throw new ArithmeticException("integer can not be -ve");
        return b;
    }
}

// </editor-fold>   
