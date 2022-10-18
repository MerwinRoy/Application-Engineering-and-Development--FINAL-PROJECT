/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

//import role
import Business.Role.Role;

//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public class NonProfitEnterprise extends Enterprise
{
    //Constructor
     public NonProfitEnterprise(String name)
     {
        
        super(name,EnterpriseType.NonProfit);
     }
     
    @Override
    public ArrayList<Role> getSupportedRole() 
    {
        return null;
    }
    
    
}
