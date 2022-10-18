/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

//import role
import Business.Role.Role;

//import employee directory
import Business.Employee.EmployeeDirectory;

//import user account directory
import Business.UserAccount.UserAccountDirectory;

//import workQueue
import Business.WorkQueue.WorkQueue;

//import arraylist
import java.util.ArrayList;

/**
 *
 * @author raj
 */
public abstract class Organization 
{
    //counter
    private static int counter=0;
    
    //Name
    private String name;
    
    //WorkQueue object
    private WorkQueue workQueue;
    
    //Organization id
    private int organizationID;
    
    //Employee directory
    private EmployeeDirectory employeeDirectory;
    
    //User account directory
    private UserAccountDirectory userAccountDirectory;
    
    
    
    //Enum type
    public enum Type
    {
        //Organizations
        Admin("Admin Organization"), 
        
        Patient("Patient Organization"),
        
        Doctor("Doctor Organization"), 
        
        DrugStore("DrugStore Organization"),
        Lab("Lab Organization"),
        
        Donor("Donor Organization"),
        
        Manager("Manager Organization");
        
        //String value
        private String value;
        
        //Type constructor
        private Type(String value) 
        {
            this.value = value;
        }
        
        //fetch value
        public String getValue()
        {
            return value;
        }
    }

    public Organization(String name) 
    {
        
        this.name = name;
        
        //New employee directory object
        employeeDirectory = new EmployeeDirectory();
        
        //New user account directory object
        userAccountDirectory = new UserAccountDirectory();
        
        //new workqueue object
        workQueue = new WorkQueue();
        
        //counter assigned to organization to increment
        organizationID = counter;
        
        //auto increment id of organization
        counter++;
    }

    //Fetch list of supported roles
    public abstract ArrayList<Role> getSupportedRole();
    
    //Fetch workqueue
    public WorkQueue getWorkQueue()
    {
        return workQueue;
    }

    //set workqueue
    public void setWorkQueue(WorkQueue workQueue)
    {
        this.
                workQueue = workQueue;
    }
    
    //fetch user account directory
    public UserAccountDirectory getUserAccountDirectory() 
    {
        return userAccountDirectory;
    }

    //fetch organization id
    public int getOrganizationID() 
    {
        return organizationID;
    }

    //fetch employee directory
    public EmployeeDirectory getEmployeeDirectory()
    {
        return employeeDirectory;
    }
    
    //fetch organization name
    public String getName() 
    {
        return name;
    }
    
    //set organization name
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
