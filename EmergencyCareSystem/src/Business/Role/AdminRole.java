/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import EcoSystem
import Business.EcoSystem;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import Organization
import Business.Organization.Organization;


//Import EnterPrise
import Business.Enterprise.Enterprise;




//import JPanel
import javax.swing.JPanel;

//import AdminWorkAreaJPanel
import ui.AdminRole.AdminWorkAreaJPanel;



/**
 *
 * @author raj
 */
public class AdminRole extends Role

{

    @Override
    public JPanel createWorkArea(JPanel container, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecoSystem) 
    {
        return new AdminWorkAreaJPanel(container, enterprise);
    }

    
    
}
