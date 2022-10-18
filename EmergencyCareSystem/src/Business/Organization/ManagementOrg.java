/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import role
import Business.Role.Role;

//import manager role
import Business.Role.ManagementRole;

//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class ManagementOrg extends Organization
{
    //constructor
    public ManagementOrg()
    {
        super(Organization.Type.Manager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagementRole());
        return roles;
    }
     
}