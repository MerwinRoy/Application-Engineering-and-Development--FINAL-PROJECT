/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

//Import arraylist
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class EmployeeDirectory 
{
    
    //ArrayList of employee
    private ArrayList<Employee> listOfEmployee;

    //Constructor
    public EmployeeDirectory() 
    {
        //new list of employee create
        listOfEmployee = new ArrayList();
    }


    
    //Function to add employee to list
    public Employee addEmployee()
    {
        //New employee object created
        Employee emp = new Employee();
        
        //employee object added to list
        listOfEmployee.add(emp);
        
        return emp;
    }
    
    //create new employee and add to list
    public Employee createEmployee(String name)
    {
        //New employee object
        Employee emp = new Employee();
        
        //name set to employee object
        emp.setName(name);
        
        //employee object added to list
        listOfEmployee.add(emp);
        
        return emp;
    }
    

    
    //Function to remove Employee from list
    public void removeEmployee(Employee emp)
    {
        //Employee object removed from list
        listOfEmployee.remove(emp);
    }
    
    //fetch list of employee
    public ArrayList<Employee> getListOfEmployee() 
    {
        return listOfEmployee;
    }
}