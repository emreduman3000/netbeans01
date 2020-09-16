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
class HeartRateMonitor 
{
    public String appName = "avergae heart rate: ";
    public int averagePulse;
    private static HeartRateMonitor myInstance=null;
    
    
    public static HeartRateMonitor getInstance()
    {
        if(myInstance==null)
        {
            myInstance=new HeartRateMonitor();
        }
        return myInstance;
    }
    
    
    private HeartRateMonitor()
    {
        averagePulse=80;
    }
    
    public String reportHeartRate()
    {
        return appName + averagePulse;
    }
}
