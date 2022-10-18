/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import EcoSystem
import Business.EcoSystem;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import EnterPrise
import Business.Enterprise.Enterprise;


//Import Organization
import Business.Organization.Organization;

//Import DocOrg
import Business.Organization.DocOrg;




//Import JPanel
import javax.swing.JPanel;

//Import DoctorWorkAreaJPanel
import ui.DocRole.DoctorWorkAreaJPanel;



/**
 *
 * @author raj
 */
public class DocRole extends Role

{

    @Override
    public JPanel createWorkArea(JPanel container, 
            UserAccount account, 
            Organization organization,
            Enterprise enterprise,
            EcoSystem ecoSystem) 
    {
        return new DoctorWorkAreaJPanel(container, account, (DocOrg)organization, enterprise);
    }
    
    
}
