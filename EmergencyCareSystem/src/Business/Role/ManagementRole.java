/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import EcoSystem
import Business.EcoSystem;

//Import Enterprise
import Business.Enterprise.Enterprise;

//Import organization
import Business.Organization.Organization;

//Import managerOrganization
import Business.Organization.ManagementOrg;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import JPanel
import javax.swing.JPanel;

//Import ManagerWorkAreaJPanel
import ui.ManagementRole.ManagerWorkAreaJPanel;

/**
 *
 * @author raj
 */
public class ManagementRole extends Role

{

    @Override
    public JPanel createWorkArea(JPanel container,
            UserAccount account,
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecoSystem) 
    {
        return new ManagerWorkAreaJPanel(container,
                account, 
                (ManagementOrg)organization,
                enterprise,
                ecoSystem);
    }
    
    
}

