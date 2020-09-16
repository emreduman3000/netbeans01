/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoredıce5;

import java.util.Scanner;

/**
 *
 * @author emreduman
 */
public class PizzaShop
{
    public static PizzaCutter pizzaCutter = new PizzaCutter();
   
        
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the pizza shop");
        System.out.println("What kind of pizza do you want?");
        System.out.println("Please enter exactly cheese or pepperoni:");
        String typeofPizza = scan.nextLine();
        PizzaFactory pfactory = new PizzaFactory();
        
        
        if ((typeofPizza.equalsIgnoreCase("cheese")) || (typeofPizza.equalsIgnoreCase("pepperoni")))
        {   
            Pizza pizza = pfactory.createPizza(typeofPizza);
            System.out.println("how many slices would you like?");
            int SliceNumber = scan.nextInt();
            pizzaCutter.Slice_Number = SliceNumber;
            if (pizza!=null)
            {
                System.out.println("Great job, here is your pizza in " + SliceNumber + " slices");

            }
            else
            {
                System.out.println("Please , enter a valid pizza type so that we can cut it!");
            }
        }
        
        else
        {
            System.out.println("You typed an unvalid kind of Pizza - Program is not being executed");

        }
    }//end main
    

}
    
