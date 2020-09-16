/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partc;

/**
 *
 * @author emreduman
 *
 * A class that monitors the pulse rate
 * and reports its data over time
 */
public class HeartRateMonitor 
{
    public String appName = "avergae heart rate: ";
    public int averagePulse;
    public HeartRateMonitor()
    {
        averagePulse=80;
    }
    
    public String reportHeartRate()
    {
        return appName + averagePulse;
    }
}
