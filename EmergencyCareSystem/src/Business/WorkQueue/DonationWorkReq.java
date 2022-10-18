/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//Import Donation
import Business.Employee.Donation;

//Import ArrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class DonationWorkReq extends WorkRequest

{
    
    //counter
    private static int counter = 0;
    
    
    //Donated by - donor
    private String assignedDonor;
    
    
    //Request ID
    private String requestId;
    
    //Donation object
    private Donation donation;
    
    //ArrayList of donation
    private ArrayList<Donation> donationList;
    
    //Constructor
    public DonationWorkReq()
    {
        //new string buffer
        StringBuffer stringBuffer = new StringBuffer();
        
        
        // append string buffer object
        stringBuffer.append("Donation");
        
        stringBuffer.append(counter);
        
        //fetch requestid
        requestId.toString();
        
        //auto-increment
        counter++;
    }
    
    //fetch donation
    public Donation getDonation() 
    {
        return donation;
    }

    //set donation
    public void setDonation(Donation donation)
    {
        this.
                donation = donation;
    }

    //fetch assigned donor
    public String getAssignedDonor() {
        return assignedDonor;
    }

    //set assignedDonor
    public void setAssignedDonor(String assignedDonor)
    {
        this.
                assignedDonor = assignedDonor;
    }


    


    //get arraylist of donations
    public ArrayList<Donation> getDonationList() 
    {
        return donationList;
    }

    //set arraylist of donations
    public void setDonationList(ArrayList<Donation> donationList)
    {
        this.
                donationList = donationList;
    }
    
    @Override
    public String toString()
    {
        return this.
                requestId;
    }
    
    
}
