/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;


//Import Input verifier
import javax.swing.InputVerifier;

//Import Textfield
import javax.swing.JTextField;

//Import JComponent
import javax.swing.JComponent;

//Import JOptionPane
import javax.swing.JOptionPane;



//Import Regex matcher and pattern
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 *
 * @author merwinroy
 */
public class EmailChecker extends InputVerifier
{

 
    @Override
    public boolean verify(JComponent input) 
    {
        
        //Object String text
        String object = ((JTextField) input)
                .getText();
        
        //Pattern string
        String pat = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" ;
        
        //Pattern object for email compiled with pattern string
        Pattern emailPat = Pattern.compile(pat);
        
        //Matcher object to match the pattern with text
        Matcher mat = emailPat.matcher(object);
        
        if (object.length() > 0) 
        {
            if (!mat.matches()) 
            {
                //Prompt error message
                JOptionPane.
                        showMessageDialog(input, "Invalid Email", "Error", JOptionPane.ERROR_MESSAGE);
                
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
