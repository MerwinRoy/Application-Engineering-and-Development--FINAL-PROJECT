/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

//Import InputVerifier
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
public class NumberChecker extends InputVerifier
{
    
    @Override
    public boolean verify(JComponent input) 
    {
        //String object for text
        String object = ((JTextField) input).getText();
        
        if (object.length() > 0)
        {
            try 
            {
                //Parse String object into integer
                int o=Integer.parseInt(object);
                
                if(o<=0)
                {
                    //Prompts error message
                    JOptionPane.
                            showMessageDialog(input, "Enter positive numbers only!", "Error", JOptionPane.ERROR_MESSAGE);
                    
                    return false;
                    
                }
                return true;
            } 
            catch (NumberFormatException ex) 
            {
                //Prompts error message
                JOptionPane.
                        showMessageDialog(input, "Enter numeric values only!", "Error", JOptionPane.ERROR_MESSAGE);
                
                return false;
            }
        } 
        else 
        {
           
            return true;
        }
    }
}
