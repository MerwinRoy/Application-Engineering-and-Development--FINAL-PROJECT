/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import EcoSystem
import Business.EcoSystem;

//Import Enterprise
import Business.Enterprise.Enterprise;

//Import Organization
import Business.Organization.Organization;

//Import UserAccount
import Business.UserAccount.UserAccount;

//LabWorkAreaJPanel
import ui.LabRole.LabAssistantWorkAreaJPanel;

//Import JPanel
import javax.swing.JPanel;

/**
 *
 * @author raj
 */
public class LabRole extends Role 

{

    @Override
    public JPanel createWorkArea(JPanel container, 
            UserAccount account,
            Organization organization,
            Enterprise enterprise, 
            EcoSystem ecoSystem)
    {
        return new LabAssistantWorkAreaJPanel(container,
                account, 
                organization, 
                enterprise);
    }
    
}
