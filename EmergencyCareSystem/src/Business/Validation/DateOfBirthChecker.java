/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;


//Input verifier
import javax.swing.InputVerifier;

//JTextField
import javax.swing.JTextField;

//JComponent
import javax.swing.JComponent;

//JOptionPane
import javax.swing.JOptionPane;



//regex matcher and pattern
import java.util.regex.Pattern;

import java.util.regex.Matcher;

/**
 *
 * @author merwinroy
 */
public class DateOfBirthChecker extends InputVerifier

{
    
    @Override
    public boolean verify(JComponent input) 
    {
        //Text object
        
        String object = ((JTextField) input).
                getText();
        
        //Pattern for comparison
        String pat = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$" ;
        
        //Date of birth pattern object to compile pattern permitted
        Pattern dateOfBirthPat = Pattern.
                compile(pat);
        
        //Matcher object to match pattern with object(text)
        Matcher mat = dateOfBirthPat.
                matcher(object);
        
        if (object.length() > 0) 
        {
            if (mat.matches() != true) 
            {
                //Prompt error
                JOptionPane.
                        showMessageDialog(input, "(MM/DD/YYYY) format permitted", "Error", JOptionPane.ERROR_MESSAGE);
                
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