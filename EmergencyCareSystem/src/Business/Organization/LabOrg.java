/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import role
import Business.Role.Role;

//import lab role
import Business.Role.LabRole;



//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class LabOrg extends Organization
{
    //constructor
    public LabOrg() 
    {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LabRole());
        return roles;
    }
     
   
    
    
}
