/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emreduman
 */
public class HockeyRegistrarValidatorTest {
    
    public HockeyRegistrarValidatorTest() {
    }
    
    @Before
    public void setUp() {
    }

   

    /**
     * Test of validateBirthYear method, of class HockeyRegistrarValidator.
     */
    @Test
    public void testValidateBirthYearGood() {
        System.out.println("validateBirthYearGood");
        int playerBirthYear = 0;
        boolean expResult = false;
        boolean result = HockeyRegistrarValidator.validateBirthYear(playerBirthYear);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
