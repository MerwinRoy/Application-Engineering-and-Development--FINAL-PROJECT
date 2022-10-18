/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//Role
import Business.Role.Role;

//DrugStore role
import Business.Role.DrugStoreRole;



//Arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class DrugStoreOrg extends Organization
{

    //Constructor
    public DrugStoreOrg() 
    {
        super(Organization.Type.DrugStore.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DrugStoreRole());
        return roles;
    }
     
}
