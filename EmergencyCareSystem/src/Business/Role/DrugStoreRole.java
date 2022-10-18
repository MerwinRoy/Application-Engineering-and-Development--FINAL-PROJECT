/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

//Import EcoSystem
import Business.EcoSystem;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import Organization
import Business.Organization.Organization;

//Import Enterprise
import Business.Enterprise.Enterprise;




//Import Jpanel
import javax.swing.JPanel;

//import DrugStoreWorkAreaJPAnel
import ui.DrugStoreRole.DrugStore;

/**
 *
 * @author raj
 */
public class DrugStoreRole extends Role

{
    
    @Override
    public JPanel createWorkArea(JPanel container, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise,
            EcoSystem ecoSystem) 
    {
        return new DrugStore(container, 
                account, 
                organization, 
                enterprise);
    }
}
