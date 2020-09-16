/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2;

/**
 *
 * @author emreduman
 */
class Pedometer 
{
    public String appName = "steps taken: ";
    private int stepCount;
    
    private static Pedometer myInstance=null;
    
        public static Pedometer getInstance()
    {
        if(myInstance==null)
        {
            myInstance=new Pedometer();
        }
        return myInstance;
    }
    
    
    
    private Pedometer()
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
