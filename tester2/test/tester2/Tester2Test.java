/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester2;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;
import org.junit.Test;


/**
 *
 * @author emreduman
 */
public class Tester2Test {
    
  



    /**
     * Test of randomAnswers method, of class Tester2.
     */
    @Test
    public void testRandomAnswers() {
        System.out.println("randomAnswers");
        char answers []={'A','B','C','D','E'};
        char result = Tester2.randomAnswers();

        for(int i=0;i<answers.length;i++)
        {
            char expResult = answers[i] ;
            if(expResult==result)
                assertEquals(expResult, result);
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
