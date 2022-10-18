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

//Import Organization
import Business.Organization.Organization;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import JPanel
import javax.swing.JPanel;

//Import DonorWorkAreaJPanel
import ui.DonorRole.DonorWorkAreaJPanel;

/**
 *
 * @author raj
 */
public class DonorRole extends Role

{

    @Override
    public JPanel createWorkArea(JPanel container,
            UserAccount account,
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem ecoSystem)
    {
        return new DonorWorkAreaJPanel(container,
                account, 
                organization, 
                enterprise,
                ecoSystem);
    }
    
    @Override
    public String toString() 
    {
        return getClass().
                getName();
    }
    
}
