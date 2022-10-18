/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

//import authenticator
import javax.mail.Authenticator;

//import password authentication
import javax.mail.PasswordAuthentication;
/**
 *
 * @author merwinroy
 */
public class Email extends Authenticator
{
    //Authenticator user
    public static final String authenticatorUsername = "emergencyhealthcare@gmail.com"; 
    
    //Authenticator password
    public static final String authenticatorPassword  = "emergencyhealthcare";
    
    @Override
    public PasswordAuthentication getPasswordAuthentication()                                             
    {                       
        //String for authenticator username
        String user = authenticatorUsername;  
        
        //String for authenticator password
        String password = authenticatorPassword;
        
        return new PasswordAuthentication(user, password);                                             
    } 
}
