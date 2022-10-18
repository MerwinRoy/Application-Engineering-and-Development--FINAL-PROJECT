/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


//Import arraylist
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class EnterpriseDirectory 
{
    //enterprise list
    private ArrayList<Enterprise> listOfEnterprise;
   

    //fetch list of enterprise
    public ArrayList<Enterprise> getListOfEnterprise() 
    {
        return listOfEnterprise;
    }

    //set list of enterprise
    public void setListOfEnterprise(ArrayList<Enterprise> listOfEnterprise)
    {
        this.listOfEnterprise = listOfEnterprise;
    }
    
    //constructor
    public EnterpriseDirectory()
    {
        listOfEnterprise=new ArrayList();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String enterpriseName,Enterprise.EnterpriseType enterpriseType)
            
    {
        //Enterprise object
        Enterprise ep=null;
        
        //If condition to check if enterprise is hospital
        if(enterpriseType==Enterprise.EnterpriseType.Hospital)
        {
            //new enterprise
            ep=new HospitalEnterprise(enterpriseName);
            
            //add enterprise to list
            listOfEnterprise.
                    add(ep);
        }
        
        //enterprise is non profit
        else if(enterpriseType==Enterprise.EnterpriseType.NonProfit)
        {
            //new enterprise
            ep=new NonProfitEnterprise(enterpriseName);
            
            //add enterprise to list
            listOfEnterprise.
                    add(ep);
        }
        
        //enterprise is child help
        else if(enterpriseType==Enterprise.EnterpriseType.DrugStore)
        {
            //new enterprise
            ep=new DrugStoreEnterprise(enterpriseName);
            
            //add enterprise to list
            listOfEnterprise.
                        add(ep);
        }
        
        //enterprise is accident
        else if(enterpriseType==Enterprise.EnterpriseType.EmergencyHelp)
        {
            //new enterprise
            ep=new EmergencyHelpEnterprise(enterpriseName);
            
            //add enterprise to list
            listOfEnterprise.
                    add(ep);
        }


        
        return ep;
    }
}
