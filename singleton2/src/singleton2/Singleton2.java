/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton2;

/**
 *
 * @author emreduman
 */
public class Singleton2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
             //Singleton s1=new Singleton(); //we can not instantiate Singleton class
        
        Singleton s1=Singleton.getInstance(); //s1 will point to an instance
        Singleton s2=Singleton.getInstance();// all three obects are pointing to same instance
        Singleton s3=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
    
}


class Singleton{
    
    private static Singleton myInstance=null;
    
    private Singleton()//private constructor
    {
        System.out.println("Inside Singleton Constructor");
    }
    
    //class itself will create an instance through this method
    public static Singleton getInstance()
    {
        if(myInstance==null)
        {
            myInstance=new Singleton();
        }
        return myInstance;
    }
}
