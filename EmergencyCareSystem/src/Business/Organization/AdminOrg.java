/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import role
import Business.Role.Role;

//import admin role
import Business.Role.AdminRole;



//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class AdminOrg extends Organization
{
    //constructor
    public AdminOrg() 
    {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AdminRole());
        return roles;
    }
     
}
