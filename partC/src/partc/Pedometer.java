/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partc;

/**
 * A class that counts how many steps a person takes
 * @author Megha Patel,2020
 */
public class Pedometer 
{
    public String appName = "steps taken: ";
    private int stepCount;
    public Pedometer()
    {
        stepCount=0;
    }
    
    /**
     * A method that returns a report
     * on the number of steps taken
     * @return the step count
     */
    public String reportStepsTaken()
    {
        return appName + stepCount;
    }
}
