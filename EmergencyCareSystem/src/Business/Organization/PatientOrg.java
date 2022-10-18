/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import role
import Business.Role.Role;

//import appicant role
import Business.Role.PatientRole;



//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class PatientOrg extends Organization
{

    //Constructor
    public PatientOrg() 
    {
        super(Organization.Type.Patient.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PatientRole());
        return roles;
    }
     
}