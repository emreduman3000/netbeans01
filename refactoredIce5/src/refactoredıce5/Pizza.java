/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoredıce5;


import java.util.ArrayList;

/**
 * A class that represents a basic pizza
 *
 * @author emreduman
 */
public class Pizza
{
    public int bakeTemperature = 100;//temp to bake at
    private static ArrayList<String> ingredients = new ArrayList();

    private static Pizza onlyObject = null;

    
    public Pizza()
    {
        
    }

    public void bake(int temp)
    {
        bakeTemperature = temp;
        //do some baking here, code not implemented yet
        //not necessary for the review
    }


    public Pizza(String topping)
    {
        addTopping(topping);
    }

    public static Pizza getInstance(String topping)
    {
        if (onlyObject == null)
        {
            onlyObject = new Pizza(topping);
        }

        return onlyObject;
    }

    /**
     * A method to add toppings to the ingredients list
     *
     * @param topping
     */
    public static void addTopping(String topping)
    {
        ingredients.add(topping);
    }
}
