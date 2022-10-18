/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

//Import Input verifier
import javax.swing.InputVerifier;

//Import JComponent
import javax.swing.JComponent;

//Import JOption Pane
import javax.swing.JOptionPane;

//Import JTextField
import javax.swing.JTextField;

/**
 *
 * @author merwinroy
 */
public class StringValidation extends InputVerifier

{
    
    @Override
    public boolean verify(JComponent input) 
    {
        //Pattern string
        String pat = "^[A-Za-z ]+[A-Za-z ]++$";
        
        //String object text
        String obj = ((JTextField) input).getText();
     
        
        
        if (obj.length() > 0) 
        {
            if (obj.toLowerCase().startsWith(" ") || obj.length() == 0 || obj.matches(pat) != true) 
            {
                JOptionPane.
                        showMessageDialog(input, "Invalid String!", "Error", JOptionPane.ERROR_MESSAGE);
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
