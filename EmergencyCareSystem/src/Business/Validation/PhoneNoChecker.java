/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;


//Import input verifier
import javax.swing.InputVerifier;

//import JTextfield
import javax.swing.JTextField;

//Import JComponent
import javax.swing.JComponent;

//Import JOptionPane
import javax.swing.JOptionPane;



//Regex pattern and matcher
import java.util.regex.Pattern;

import java.util.regex.Matcher;

/**
 *
 * @author merwinroy
 */
public class PhoneNoChecker extends InputVerifier

{
    @Override
    public boolean verify(JComponent input) 
    {
        //String object
        String obj = ((JTextField) input).
                getText();
        
        //Pattern string
        String pat = "^[1-9]{1}+[0-9]{9}$" ;
         
        //Phone number pattern object
        Pattern phoneNoPat = Pattern.
                 compile(pat);
        
        //Matcher object to match pattern with text
        Matcher mat = phoneNoPat.
                    matcher(obj);
        
        if (obj.length() > 0) 
        {
               if (obj.
                       toLowerCase().
                       startsWith(" ") || obj.
                               length() == 0 || mat.
                                       matches() != true) 
                {
                    //Prompt error message
                    JOptionPane.
                        showMessageDialog(input, "Invalid phone number", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                } 
               else 
                {
                    return true;
                }
        }    
        else 
        {
            return true;
        }
    
   
    }
}
