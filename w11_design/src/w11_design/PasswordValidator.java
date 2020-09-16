/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w11_design;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author emreduman
 */
public class PasswordValidator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
       boolean isValid=false;
       do
       {
           System.out.println("Please enter a VALID password, password must have:");
           System.out.println("A lenght of at least 8");
           System.out.println("At least one speacial character");
           System.out.println("At least one uppercase letter");
           
           Scanner userInput=new Scanner(System.in);
           String password =userInput.nextLine();
           
           if(checkLength(password))
                if(checkSpecialCharacter(password))
                    if(checkUpperCharacter(password))
                        isValid=true;
                  
       }
       
       while(!isValid);
       System.out.println("Valid Password, ACCEPTED!");
        
    }
    
    /**
     * 
     * @param password
     * @return 
     */
    public static boolean checkLength(String password)
    {
        boolean length=false;
        if(password.length()>=8)
        {
            length=true;
        }
        return length;
    }
    
    /**
     * 
     * @param password
     * @return 
     */
    public static boolean checkUpperCharacter(String password)
    {
        boolean isUpperCase=false;
        for(int i=0; i<password.length() ; i++)
        {
            if(Character.isUpperCase(password.charAt(i))) 
            {
                isUpperCase=true;
            }            
        }
        return isUpperCase;

    }
    
    /**
     * 
     * @param password
     * @return 
     */
    public static boolean checkSpecialCharacter(String password)
    {
        boolean isSpecialChar=false;
        
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(password);

        if (!matcher.matches())
        {
            isSpecialChar=true;              
        }
  
        return isSpecialChar;
    }

}
