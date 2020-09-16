/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author emreduman
 */
public class InterviewSelectorTest {
    
    /**
     * Test of checkExperience method, of class InterviewSelector.
     */
    @Test
    public void testCheckExperienceGood() {
        System.out.println("checkExperienceGood");
        int yearsExperience =10 ;
        boolean expResult = true;
        boolean result = InterviewSelector.checkExperience(yearsExperience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    } 
  
        @Test
    public void testCheckExperienceBad() {
        System.out.println("checkExperienceBad");
        int yearsExperience =5;
        boolean expResult = false;
        boolean result = InterviewSelector.checkExperience(yearsExperience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    } 
    
        @Test
    public void testCheckExperienceBoundary() {
        System.out.println("checkExperienceBoundary");
        int yearsExperience = 8;
        boolean expResult = true;
        boolean result = InterviewSelector.checkExperience(yearsExperience);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    
    
    
    
    /**
     * Test of checkTranscriptAverage method, of class InterviewSelector.
     */
    @Test
    public void testCheckTranscriptAverageGood() {
        System.out.println("checkTranscriptAverageGood");
        double transcriptAverage = 90;
        boolean expResult = true;
        boolean result = InterviewSelector.checkTranscriptAverage(transcriptAverage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckTranscriptAverageBad() {
        System.out.println("checkTranscriptAverageBad");
        double transcriptAverage = 60;
        boolean expResult = false;
        boolean result = InterviewSelector.checkTranscriptAverage(transcriptAverage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testCheckTranscriptAverageBoundary() {
        System.out.println("checkTranscriptAverageBoundary");
        double transcriptAverage = 80;
        boolean expResult = true;
        boolean result = InterviewSelector.checkTranscriptAverage(transcriptAverage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
