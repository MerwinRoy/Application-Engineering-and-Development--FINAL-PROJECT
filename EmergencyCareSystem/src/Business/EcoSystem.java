/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//Import Role
import Business.Role.Role;

//Import SystemAdminRole
import Business.Role.SystemAdminRole;

//Import NEtwork
import Business.Network.Network;

//Import Organization
import Business.Organization.Organization;


//Import ArrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class EcoSystem extends Organization

{
    
    //ArrayList of network
    private ArrayList<Network> networkList;
    
    //Ecosystem object
    private static EcoSystem ecoSystem;
    
    
    
    //Function to fetch instance
    public static EcoSystem getInstance()
    {
        //check if ecosystem exists, if it doesnt then create new object
        if(ecoSystem==null)
        {
            //New Ecosystem object is created
            ecoSystem=new EcoSystem();
        }
        
        return ecoSystem;
    }
    
    //EcoSystem default constructor
    private EcoSystem()
    {
        super(null);
        
        //new arraylist
        networkList=new ArrayList();
    }
    
    //Function to create and add network to network list
    public Network createAndAddNetwork()
            
    {
        //new network object
        Network network=new Network();
        
        //add network object to list
        networkList.add(network);
        
        return network;
    }
    

    


    //fetch a list of network
    public ArrayList<Network> getNetworkList() 
    {
        
        return networkList;
    }

    //Set a list of network
    public void setNetworkList(ArrayList<Network> networkList) 
    {
        this.networkList = networkList;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole()
    {
        //Create an arraylist of roles
        ArrayList<Role> roleList=new ArrayList();
        
        //add new roles to list
        roleList.add(new SystemAdminRole());
        
        return roleList;
        
    }
    
    //Function to check if user is unique in user account directory
    public boolean checkUniqueProfile(String profileName)
    {
        //checks if user exists in account directory
        if(!this.getUserAccountDirectory().checkUniqueProfileName(profileName))
        {
            return false;
        }
        
        
        for(Network network:networkList)
        {
            
        }
        
        return true;
    }
}
