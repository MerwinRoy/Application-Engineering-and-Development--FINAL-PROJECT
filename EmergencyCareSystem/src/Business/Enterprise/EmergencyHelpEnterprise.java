/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

//Import Role
import Business.Role.Role;

//Import ArrayList
import java.util.ArrayList;

/**
 *
 * @author raj
 */

public class EmergencyHelpEnterprise extends Enterprise

{
    //Constructor
     public EmergencyHelpEnterprise(String name)
     {
         
        super(name,EnterpriseType.EmergencyHelp);
        
     }
     
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        return null;
    }
    
    
}
