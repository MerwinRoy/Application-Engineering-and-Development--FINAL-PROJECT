package Business;

//Import Employee
import Business.Employee.Employee;

//Import SystemAdminRole
import Business.Role.SystemAdminRole;

//Import UserAccount
import Business.UserAccount.UserAccount;

/**
 *
 * @author merwinroy
 */
public class ConfigureASystem 
{
    //Configure function
    public static EcoSystem configure()
            
    {
        //Ecosystem object
        EcoSystem ecoSystem = EcoSystem.getInstance();
        
        //Employee object
        Employee employee = ecoSystem.getEmployeeDirectory().createEmployee("sysadmin");
        
        //UserAccount object
        UserAccount user = ecoSystem.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        //Return ecosystem object
        return ecoSystem;
    }
    
}
