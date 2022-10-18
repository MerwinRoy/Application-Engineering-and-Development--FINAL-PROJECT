/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import EcoSystem
import Business.EcoSystem;

//Import EnterPrise
import Business.Enterprise.Enterprise;

//Import  Patient Organization
import Business.Organization.PatientOrg;

//Import Organization
import Business.Organization.Organization;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import JPanel
import javax.swing.JPanel;

//Import PatientFrontJPanel
import ui.PatientRole.PatientFrontJPanel;

/**
 *
 * @author raj
 */
public class PatientRole extends Role

{

    @Override
    public JPanel createWorkArea(JPanel container, 
            UserAccount account,
            Organization organization, 
            Enterprise enterprise,
            EcoSystem ecoSystem)
    {
        return new PatientFrontJPanel(container,
                account,
                (PatientOrg)organization, 
                enterprise, 
                ecoSystem);
    }
    
    
}

