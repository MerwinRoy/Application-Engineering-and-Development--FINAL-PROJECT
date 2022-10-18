 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

//Network
import Business.Network.Network;

//Organization
import Business.Organization.Organization;

//Organization directory
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author raj
 */
public abstract class Enterprise extends Organization

{
    private Network network;
    
    private EnterpriseType typeOfEnterprise;
    
    private OrganizationDirectory organizationDir;
    
    
    
    
    //fetch organization directory
    public OrganizationDirectory getOrganizationDirectory() 
    {
        return organizationDir;
    }
    
    //enum of enterprise type
    public enum EnterpriseType
    
    {
        //Enterprise types
        Hospital("Hospital"),
        EmergencyHelp("EmergencyHelp"),
        NonProfit("NonProfit"),
        DrugStore("DrugStore");
        
        //value string
        private String value;
        
        //Constructor
        private EnterpriseType(String value)
        {
            this.value=value;
        }
        
        //fetch value
        public String getValue() 
        {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
    }
    
    //Constructor
    public Enterprise(String name,EnterpriseType typeOfEnterprise)
    {
        super(name);
        
        this.
                typeOfEnterprise = typeOfEnterprise;
        
        organizationDir=new OrganizationDirectory();
    }


    //fetch type of enterprise
    public EnterpriseType getTypeOfEnterprise() 
    {
        return typeOfEnterprise;
    }

    //Set type of enterprise
    public void setTypeOfEnterprise(EnterpriseType typeOfEnterprise) 
    {
        this.typeOfEnterprise = typeOfEnterprise;
    }
    

    //fetch network
    public Network getNetwork() 
    {
        return network;
    }

    //set network
    public void setNetwork(Network network) 
    {
        this.
                network = network;
    }
    
    
}
