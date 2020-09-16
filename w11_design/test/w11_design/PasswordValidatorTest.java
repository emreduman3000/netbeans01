/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w11_design;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author emreduman
 */
public class PasswordValidatorTest 
{
    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLengthGood() {
        System.out.println("checkLengthGood");
        String password="MyPassword123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCheckLengthBad() {
        System.out.println("checkLengthBad");
        String password="passwor";
        boolean expResult = false;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testCheckLengthBoundary() {
        System.out.println("checkLengthBoundary");
        String password="Password";
        boolean expResult = true;
        boolean result = PasswordValidator.checkLength(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }


    /**
     * Test of checkUpperCharacter method, of class PasswordValidator.
     */
    @Test
    public void testCheckUpperCharacterGood() {
        System.out.println("checkUpperCharacterGood");
        String password = "Aa";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpperCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    
    /**
     * Test of checkUpperCharacter method, of class PasswordValidator.
     */
    @Test
    public void testCheckUpperCharacterBad() {
        System.out.println("checkUpperCharacterBad");
        String password = "aa";
        boolean expResult = false;
        boolean result = PasswordValidator.checkUpperCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkUpperCharacter method, of class PasswordValidator.
     */
    @Test
    public void testCheckUpperCharacterBoundary() {
        System.out.println("checkUpperCharacterBoundary");
        String password = "A";
        boolean expResult = true;
        boolean result = PasswordValidator.checkUpperCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of checkSpecialCharacter method, of class PasswordValidator.
     */
    @Test
    public void testCheckSpecialCharacterGood() {
        System.out.println("checkSpecialCharacterGood");
        String password = "!234-/";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
     /**
     * Test of checkSpecialCharacter method, of class PasswordValidator.
     */
    @Test
    public void testCheckSpecialCharacterBad() {
        System.out.println("checkSpecialCharacterBad");
        String password = "Aa12";
        boolean expResult = false;
        boolean result = PasswordValidator.checkSpecialCharacter(password);
        assertEquals(expResult, result);
        //fail("the test failed!!!");
        // TODO review the generated test code and remove the default call to fail.
    }

     /**
     * Test of checkSpecialCharacter method, of class PasswordValidator.
     */
    @Test
    public void testCheckSpecialCharacterBoundary() {
        System.out.println("checkSpecialCharacterBoundary");
        String password = "!123";
        boolean expResult = true;
        boolean result = PasswordValidator.checkSpecialCharacter(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

   

 
}
