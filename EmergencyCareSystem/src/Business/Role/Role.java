/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import JPanel
import javax.swing.JPanel;

//Import EcoSystem
import Business.EcoSystem;

//Import Organization
import Business.Organization.Organization;

//Import Enterprise
import Business.Enterprise.Enterprise;



//Import UserAccount
import Business.UserAccount.UserAccount;



/**
 *
 * @author raj
 */
public abstract class Role 
{
    
    //Role types enum
    public enum RoleType
    {
        Admin("Admin"),
        
        Doctor("Doctor"),
        
        Patient("Patient"),
        
        Donor("Donor"),

        Driver("Driver"),
        
        Supervisor("Supervisor"),
        
        LabAssistant("Lab Assistant");
        
        
        private String value;
        
        private RoleType(String value)
        {
            this.
                    value = value;
        }

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
    
    public abstract JPanel createWorkArea(JPanel container, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecoSystem);

    @Override
    public String toString() 
    {
        return this.
                getClass().
                getName();
    }
    
    
}