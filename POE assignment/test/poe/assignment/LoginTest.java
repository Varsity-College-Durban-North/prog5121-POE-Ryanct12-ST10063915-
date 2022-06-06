/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe.assignment;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author fshai
 */
public class LoginTest {
    
    public LoginTest() 
    {}
    //Step 1 - Create an object from the class in question 
    Login login = new Login();
    
    //check to see if the username entered is correct for the criteria that's outlined in POE document 
    @Test
    public void testCheckUserNameCorrectlyFormatted() 
    { boolean actual = login.checkUserName("kyl_1");
        assertTrue(actual);
    }
    
    //check to see if the username entered is incorrect for the criteria that's outlined in POE document 
    @Test
    public void testCheckUserNamePoorlyFormatted() 
    { boolean actual = login.checkUserName("kyle!!!!!");
        assertFalse(actual);
    }

    //check to see is the password entered meets the criteria that's outlined in the POE document 
    @Test
    public void testCheckPasswordComplexitySuccess() 
    { boolean actual = login.checkPasswordComplexity("Ch&&sec@ke9");
        assertTrue(actual);
    }
    
    //check to see is the password entered does not meet the criteria that's outlined in the POE document 
    @Test
    public void testCheckPasswordComplexityFailure() 
    { boolean actual = login.checkPasswordComplexity("password");
        assertFalse(actual);
    }
    
}