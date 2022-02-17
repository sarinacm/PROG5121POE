/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog5121poe;

/**
 *
 * @author ctill
 */
public class Login 
{
    
    String storedUserName;
    String storedPassword;
    String storedFirstName;
    String storedLastName;
    
    public boolean checkUserName(String userName)
    {
        boolean correctUserNameFormat;
        
        if (userName.length()<=4 && userName.contains("_"))
        {
            correctUserNameFormat = true;
        }
        
        else
        {
            correctUserNameFormat = false;
        }
        
          return correctUserNameFormat;
    }
    

    public boolean checkPasswordComplexity(String password)
    {
        boolean passwordComplexity;
        if (password.length()>=8) 
        {
            passwordComplexity = true;
        }
        else
        {
          passwordComplexity = false;
        }
        
        return passwordComplexity;
    }
    
    
   
    
    public String registerUser(String userName, String password, String email,
            String firstName, String lastName)
    {
      String returnedMessage =null;
      
        if (checkUserName(userName)&& checkPasswordComplexity(password)) 
        {
             returnedMessage = "User successfully registered";
             storedUserName = userName;
             storedPassword = password;
             storedFirstName = firstName;
             storedLastName = lastName;
        }
        
        
        
        else if (!checkUserName(userName))
        
        {
                    
            returnedMessage  = "UserName is not correctly formatted, missing underscore or more than 5 characters";
        }
        
        
        else if  (!checkPasswordComplexity(password))
        {
        
            returnedMessage = "Password is not correctly formatted, please "
                    + "ensure that the password contains at least 8 characters, "
                    + "a capital letter, a number and a special character";
        
        }
        
        return  returnedMessage;
  
    }
    
    public boolean loginUser(String userName, String password)
    {
        boolean successfulLogin = false;
        
        if (storedUserName.equals(userName) && storedPassword.equals(password)) 
        {
            successfulLogin = true;
        }
        
        else 
        {
        
            successfulLogin = false;
        }
        
        return successfulLogin;
    
      }
    
    
    public String returnLoginStatus(boolean loggedIn)
    {
        String loginMessage= null;
       
        if (loggedIn) 
        {
            loginMessage = "Welcome " + storedFirstName + " " + storedLastName +
                    " " + "it is great to see you again";
        }
        
        else
        {
            loginMessage = "Username or password incorrect, please try again";
        
        }
    
          return loginMessage;
    }
    
    
}
