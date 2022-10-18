/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//Import Organization type
import Business.Organization.Organization.Type;

//Import Arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class OrganizationDirectory 
{
    
    //organization list
    private ArrayList<Organization> listOfOrganization;

    //Organization directory constructor
    public OrganizationDirectory() 
    {
        //new organization list
        listOfOrganization = new ArrayList();
    }

    //Fetch organization list
    public ArrayList<Organization> getListOfOrganization() 
    {
        return listOfOrganization;
    }
    
    //New organization
    public Organization createOrganization(Type type)
    {
        //Organization object
        Organization org = null;
        if (type.
                getValue().
                equals(Type.Doctor.getValue()))
        {
            //New doctor organization
            org = new DocOrg();
            listOfOrganization.
                    add(org);
        }
        

        
        else if (type.
                getValue().
                equals(Type.DrugStore.getValue()))
        {
            //new pharmacy organization
            org = new DrugStoreOrg();
            
            //add organization to list
            listOfOrganization.
                    add(org);
        }
        
        
        else if (type.
                getValue().
                equals(Type.Donor.getValue()))
        {
            //New Donor organization
            org = new DonorOrg();
            
            //add organization to list
            listOfOrganization.
                    add(org);
        }
        
        else if (type.
                getValue().
                equals(Type.Manager.getValue()))
        {
            //new manager organization
            org = new ManagementOrg();
            
            //add organization to list
            listOfOrganization.
                    add(org);
        }
        
        else if (type.
                getValue().
                equals(Type.Patient.getValue()))
        {
            //New applicant organization
            org = new PatientOrg();
            
            //add organization to list
            listOfOrganization.
                    add(org);
        }

        
        else if (type.
                getValue().
                equals(Type.Lab.getValue()))
        {
            //New lab organization
            org = new LabOrg();
            
            //add organization to list
            listOfOrganization.
                    add(org);
        }

        return org;
    }
}