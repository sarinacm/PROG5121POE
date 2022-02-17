/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121poe;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 *
 * @author ctill
 */
public class LoginTest {
    
    public LoginTest() {
    }

    Login login  = new Login ();

    @Test
    public void testCheckUserNameCorrectlyFormatted() 
    {
        boolean actual = login.checkUserName("mi_1");
        assertTrue(actual);
    }
    
      @Test
    public void testCheckUserNamePoorlyFormatted() 
    {
        boolean actual = login.checkUserName("mi_1!!!!!!");
        assertFalse(actual);
    }

    @Test
    public void testCheckPasswordComplexitySuccess() 
    {
        boolean actual = login.checkPasswordComplexity("123456789");
        assertTrue(actual);
    }
    
      @Test
    public void testCheckPasswordComplexityFailure() 
    {
        boolean actual = login.checkPasswordComplexity("1234");
        assertFalse(actual);
    }

    @Test
    public void testRegisterUser() 
    {
    }

    @Test
    public void testLoginUser() {
    }
    
   
    
}
