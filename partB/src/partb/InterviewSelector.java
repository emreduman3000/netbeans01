/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb;

/**
 *
 * @author emreduman
 */
public class InterviewSelector {

    /**
     * Following methods return whether or not a candidate is qualified for
     * a job interview.
     * @param yearsExperience - how many years work experience
     * * @return true if their experience >7, false otherwise
     */
    public static boolean checkExperience(int yearsExperience)
    {
        boolean qualified = false;
        if(yearsExperience >7)
        {
            qualified = true;
        }
        return qualified;
    }
    
    /**
     *
     * * @param transcriptAverage - their average from their college transcript
     * @return true if their transcriptAverage >=80, false otherwise
     */
    
    public static boolean checkTranscriptAverage(double transcriptAverage)
    {
        boolean qualified = false;
        if(transcriptAverage >=80)
        {
            qualified = true;
        }
        return qualified;
    }
}