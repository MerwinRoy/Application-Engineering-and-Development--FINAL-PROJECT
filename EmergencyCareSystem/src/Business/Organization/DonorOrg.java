/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import role
import Business.Role.Role;

//import donor role
import Business.Role.DonorRole;

//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class DonorOrg extends Organization
{
    //Constructor
    public DonorOrg() 
    {
        super(Organization.Type.Donor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonorRole());
        return roles;
    }
     
}
