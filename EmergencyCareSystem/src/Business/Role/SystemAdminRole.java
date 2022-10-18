/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import EcoSystem
import Business.EcoSystem;

//Import EnterPrise
import Business.Enterprise.Enterprise;

//Import Organization
import Business.Organization.Organization;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import Jpanel
import javax.swing.JPanel;

//Import SystemAdminWorkAreaJPanel
import ui.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;



/**
 *
 * @author raj
 */
public class SystemAdminRole extends Role

{

    @Override
    public JPanel createWorkArea(JPanel container,
            UserAccount account,
            Organization organization, 
            Enterprise enterprise,
            EcoSystem ecoSystem) 
    {
        return new SystemAdminWorkAreaJPanel(container, ecoSystem);
    }
    
}
