/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

//Import WorkQueue
import Business.WorkQueue.WorkQueue;

//Import role
import Business.Role.Role;

//Import network
import Business.Network.Network;

//Import Patient
import Business.Employee.Patient;

//Import employee
import Business.Employee.Employee;

//Import Donor
import Business.Employee.Donor;





/**
 *
 * @author merwinroy
 */
public class UserAccount 
{
    //User account enabler
    private boolean accountActive = true;
    
    //Username
    private String profileName;
    
    //Password
    private String password;
    
    //Network object
    private Network network;
    
    //WorkQueue object
    private WorkQueue workQueue;
    
    //Role object
    private Role role;
    
    //Employee object
    private Employee employee;
    
    //Donor object
    private Donor donor;
    
    //Patient object
    private Patient applicant;
    
    
    

    
    
    //Constructor
    public UserAccount() 
    {
        //WorkQueue object
        workQueue = new WorkQueue();
    }
    
    //fetch network
    public Network getNetwork() {
        return network;
    }
    
    //fetch workQueue
    public WorkQueue getWorkQueue()
    {
        return workQueue;
    }


    //set network
    public void setNetwork(Network network) {
        this.network = network;
    }
    
    //Fetch donor
    public Donor getDonor() 
    {
        return donor;
    }

    //Set donor
    public void setDonor(Donor donor) 
    {
        this.
                donor = donor;
    }
    
    //Set account active
    public void setAccountActive(boolean accountActive) 
    {
        this.
                accountActive= accountActive;
    }

    //is account active
    public boolean isAccountActive() 
    {
        return accountActive;
    }
    
    //Fetch user profile name
    public String getProfileName() 
    {
        return profileName;
    }

    //set profile name
    public void setProfileName(String profileName) 
    {
        this.
                profileName = profileName;
    }

    //fetch password
    public String getPassword() 
    {
        return password;
    }

    //set password
    public void setPassword(String password)
    {
        this.password = password;
    }

    //fetch role
    public Role getRole() 
    {
        return role;
    }
    
    //set role
    public void setRole(Role role) 
    {
        this.
                role = role;
    }

    //set employee
    public void setEmployee(Employee employee) 
    {
        this.
                employee = employee;
    }



    //fetch employee
    public Employee getEmployee() 
    {
        return employee;
    }


    
    
  



    //fetch patient
    public Patient getApplicant() {
        return applicant;
    }

    //set patient
    public void setApplicant(Patient applicant) {
        this.applicant = applicant;
    }
    
    @Override
    public String toString() 
    {
        return profileName;
    }
    
    
    
}