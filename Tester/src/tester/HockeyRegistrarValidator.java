/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * A utility class to verify that players on 
 * a hockey team meet certain criteria with respect
 * to their age for an 'under 10' team. Used for final
 * exam review.
 * @author Megha Patel
 */
public class HockeyRegistrarValidator 
{

    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
       boolean isValid=false;
       do
       {
           System.out.println("Birthday Year must after 2010");
          
           
           Scanner userInput=new Scanner(System.in);
           int birthdayYear =userInput.nextInt();
           
           if(validateBirthYear(birthdayYear))          
               isValid=true;
                             
       }
       
       while(!isValid);
       System.out.println("YOUR AGE APPROVED :)");
        
    }
    /**
     * A method that validates that players are eligible for '10 and under' meaning they must be born in 2009 or later .
     * @param playerBirthYear, the player's year of birth
     * @return true if the player was born in 2009 or later, false otherwise. 
     */
    public static boolean validateBirthYear(int playerBirthYear)
    {
        if(playerBirthYear>=2009)
        {
            return true;
        }
        return false;
    }
    
}
