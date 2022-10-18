/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

//Import input verifier
import javax.swing.InputVerifier;

//Import JTextField
import javax.swing.JTextField;

//Import JComponent
import javax.swing.JComponent;

//Import JOptionPane
import javax.swing.JOptionPane;


/**
 *
 * @author merwinroy
 */
public class PasswordChecker extends InputVerifier

{
    @Override
    public boolean verify(JComponent input) 
    {
        //Object String
        String object = ((JTextField) input).
                getText();
        
        //Pattern String
        String pat = "^([a-zA-Z+]+[@#]+[0-9+]+)$";  
        
        
        if (object.length() > 0) 
        {
            if (object.toLowerCase().
                    startsWith(" ") || object.
                            length() == 0 || object.
                                    matches(pat) != true) 
            {
                //Prompt error
                JOptionPane.
                        showMessageDialog(input, "Invalid Password", "Error", JOptionPane.ERROR_MESSAGE);
                
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
