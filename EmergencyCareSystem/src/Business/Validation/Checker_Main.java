/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

//Import EcoSystem
import Business.EcoSystem;

//Import Enterprise
import Business.Enterprise.Enterprise;

//Import network
import Business.Network.Network;

//Import Applicant organization
import Business.Organization.PatientOrg;

//Import Doctor organization
import Business.Organization.DocOrg;

//Import donor organization
import Business.Organization.DonorOrg;

//import manager organization
import Business.Organization.ManagementOrg;

//import organization
import Business.Organization.Organization;

//import user account
import Business.UserAccount.UserAccount;

/**
 *
 * @author merwinroy
 */
public class Checker_Main 

{
    //Function to validate string
    public static boolean validateString(String name)
    {
        return true;
    }
    
    //Fetch doctor organization
    public static DocOrg getDoctorOrg(EcoSystem ecoSystem, UserAccount account)
    {
        //doctor organization object
        DocOrg doctorOrg = null;
        
        try
            {
                //iterate through list of network
                for(Network ntw : ecoSystem.
                        getNetworkList())
                {
                    if(ntw.
                            equals(ntw))
                    {
                        //iterate through list of enterprise
                        for(Enterprise ep : ntw.
                                getEnterpriseDirectory().
                                getListOfEnterprise())
                        {
                            if(("Hospital").
                                    equals("Hospital"))
                            {
                                //iterate through list of organization
                                for(Organization org : ep.
                                        getOrganizationDirectory().
                                        getListOfOrganization())
                                {
                                   if(org instanceof DocOrg)
                                    {
                                        doctorOrg = (DocOrg)org; 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        
        //Catch NullPointerException
        catch(NullPointerException e)
        {
            
            e.printStackTrace();
          
            return null;
        }
        
        return doctorOrg;
        
    }   
    
    //Fetch Manager organization
    public static ManagementOrg getManagerOrg(EcoSystem ecoSystem, UserAccount account)
    {
        ManagementOrg managerOrganization = null;
        
        try
        {
            //iterate through list of network
            for(Network ntw : ecoSystem.getNetworkList())
                {
                    if(ntw.
                            equals(ntw))
                        {
                            //iterate through list of enterprise
                            for(Enterprise ep : ntw.
                                    getEnterpriseDirectory().
                                    getListOfEnterprise())
                                {
                                    if("EmergencyHelp".equals("EmergencyHelp"))
                                        {
                                            //iterate through list of organization
                                            for(Organization org : ep.
                                                    getOrganizationDirectory().
                                                    getListOfOrganization())
                                                {
                                                    if(org instanceof ManagementOrg)
                                                        {
                                                            managerOrganization = (ManagementOrg)org; 
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        catch(NullPointerException e)
        {
            e.printStackTrace();
            return null;
        }
        return managerOrganization;
    }
    
    
    //Fetch Patient Organization
    public static PatientOrg getPatientOrg(EcoSystem ecoSystem, UserAccount account)
    {
        //Patient Organization object
        PatientOrg patientOrg = null;
        
        try
        {
            //iterate through list of network
            for(Network ntw : ecoSystem.
                    getNetworkList())
            {
                if(ntw.
                        equals(account.
                        getNetwork()))
                {
                    //iterate through list of enterprise
                    for(Enterprise ep : ntw.
                            getEnterpriseDirectory().
                            getListOfEnterprise())
                    {
                        if(("EmergencyHelp").
                                equals("EmergencyHelp"))
                        {
                            //iterate through list of organization
                            for(Organization org : ep.
                                    getOrganizationDirectory().
                                    getListOfOrganization())
                            {
                                if(org instanceof PatientOrg)
                                {
                                    patientOrg = (PatientOrg)org; 
                                }
                            }
                        }
                    }
                }
            }
        }
        
        catch(NullPointerException e)
        {
            
            e.printStackTrace();
            return null;
        }
        
        return patientOrg;
        
    }   
    
    //Fetch Donor Organization
    public static DonorOrg getDonorOrg(EcoSystem ecoSystem, UserAccount account)
    {
        //Donor Organization object
        DonorOrg donorOrg = null;
        
        //iterate through list of network
        for(Network ntw : ecoSystem.
                getNetworkList())
        {
            if(ntw.equals(ntw))
            {
                //iterate through list of enterprise
                for(Enterprise ep : ntw.
                        getEnterpriseDirectory().
                        getListOfEnterprise())
                {
                    if("NonProfit".equals("NonProfit"))
                    {
                        //iterate through list of organization
                        for(Organization org : ep.
                                getOrganizationDirectory().
                                getListOfOrganization())
                        {
                            if(org instanceof DonorOrg)
                            {
                                donorOrg = (DonorOrg)org; 
                            }
                        }
                    }
                }
            }
        }
        
        
        return donorOrg;
        
    }
    

    

    
}
