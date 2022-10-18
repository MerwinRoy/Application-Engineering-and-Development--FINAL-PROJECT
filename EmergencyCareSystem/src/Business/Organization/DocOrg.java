/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import role
import Business.Role.Role;

//import doctor role
import Business.Role.DocRole;



//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class DocOrg extends Organization
{

    //constructor
    public DocOrg() 
    {
        super(Organization.Type.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DocRole());
        return roles;
    }
     
}