/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;


/**
 *
 * @author pradyumnareddy
 */
public class Donor extends Employee

{
    //Counter object creation
    private static int counter = 1;
    
    //Donor id
    private String id_donor;
    

    //constructor
    public Donor()
    {
        //Stringbuffer object created
        StringBuffer stringBuffer = new StringBuffer();
        
        //appends to stringbuffer object
        stringBuffer.append("DONOR");
        
        stringBuffer.append(counter);
        
        //donor id string 
        id_donor = stringBuffer.toString();
        
        //counter to auto-increment donor id after donor object creation
        counter++;
    }
    

    
    //fetch donor id
    public String getId_donor() 
    {
        return id_donor;
    }
    
        @Override
    public String toString() {
        return this.getName();
    }
    
}

    
