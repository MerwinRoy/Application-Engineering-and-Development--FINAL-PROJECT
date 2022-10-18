/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

//role object
import Business.Role.Role;

//Employee object
import Business.Employee.Employee;


//arrayList object
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class UserAccountDirectory 
{
    
    //ArrayList of user account
    private ArrayList<UserAccount> listOfUserAccount;

    //Constructor
    public UserAccountDirectory() 
    {
        //New arraylist of user account
        listOfUserAccount = new ArrayList();
    }

    //fetch list of user account
    public ArrayList<UserAccount> getListOfUserAccount() 
    {
        return listOfUserAccount;
    }
    
    //Function to authenticate profile
    public UserAccount authenticateProfile(String profileName, String password)
    {
        //For loop to iterate through list of user accounts
        for (UserAccount user : listOfUserAccount)
            if (user.
                    getProfileName().
                    equals(profileName) && user.
                            getPassword().
                            equals(password))
            {
                return user;
            }
        return null;
    }
    
    //Create user account
    public UserAccount createUserAccount(String profileName, String password, Employee employee, Role role)
    {
        //Useraccount object created
        UserAccount account = new UserAccount();
        
        //set profile name
        account.
                setProfileName(profileName);
        
        //set password
        account.
                setPassword(password);
        
        //set employee object
        account.
                setEmployee(employee);
        
        //set role
        account.
                setRole(role);
        
        //add account to list of user account
        listOfUserAccount.
                add(account);
        
        return account;
    }
    
    //Check Unique username
    public boolean checkUniqueProfileName(String profileName)
    {
        //for loop to iterate through list of user account
        for (UserAccount user : listOfUserAccount)
        {
            //Check for redundant username
            if (user.
                    getProfileName().
                    equals(profileName))
                
                return false;
        }
        return true;
    }
}
