/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

//Import random
import java.util.Random;


/**
 *
 * @author merwinroy
 */
public class EmailPrompt {
    
    //Hostname
    private static final String hostName = "smtp.gmail.com";
    
     //Email sender
    private static String emailSenderAddress = "emergency_sender123@gmail.com";
    
    //Email message
    private static StringBuilder emailMessage ;
        
    //Email Subject
    private static String emailSubject = "Thank you!";
    
    //port number
    private static final String portNumber = "587"; 
    
    
    
   
    
    public static String generatePassword(String profileName)
    {
        try
        {
            Random r = new Random();
            
            String val = String.valueOf(r.nextInt(10000));
            
            String val2 = String.valueOf(r.nextInt(100));
            
            StringBuilder stringBuilder = new StringBuilder();
            
            stringBuilder.append(val2);
            
            stringBuilder.append(profileName);
            
            stringBuilder.append(val);
            
            System.out.println("Password: " + stringBuilder.toString());
            
            return stringBuilder.toString();
        }
        catch(Exception e)
        {
          
        }
        return null;
    }
    
    public static String generateProfileName(String profileName)
    {
        try
        {
            Random rand = new Random();
            
            String firstVal = String.
                    valueOf(rand.nextInt(100));
            
            StringBuilder stringBuilder = new StringBuilder();
            
            stringBuilder.append(firstVal);
            
            stringBuilder.append(profileName);
            
            System.out.println("Profile name: " + stringBuilder.toString());
            
            return stringBuilder.toString();
        }
        catch(Exception e)
        {
            
        }
        return null;
    }
    
}
