/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

//import enterprise directory
import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author merwinroy
 */
public class Network 
{
    
    //Enterprise directory object
    private EnterpriseDirectory enterpriseDir;
    
    //name string object
    private String name;
    
   
    
    //constructor
    public Network()
    {
        enterpriseDir=new EnterpriseDirectory();
    }
    
    //fetch enterprise directory
    public EnterpriseDirectory getEnterpriseDirectory()
    {
        return enterpriseDir;
    }
    
    //fetch name
    public String getName()
    {
        return name;
    }

    //set name
    public void setName(String name)
    {
        this.
                name = name;
    }


    
    @Override
    public String toString()
    {
        return name;
    }
    
}
