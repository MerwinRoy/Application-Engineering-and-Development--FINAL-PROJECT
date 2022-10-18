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
public class Donation 

{
    //Receiver account number
    public static String receiverAccNo = "8577865926";
    
    //Donation invoice amount
    private String donationInvoice;
    
    //Date of donation
    private String dateOfDonation;
    
    //Donor account number
    private String donorAccNo;
    
    //Donor account name
    private String donorAccName;
   
    //fetch date of donation
    public String getDateOfDonation() 
    {
        return dateOfDonation;
    }

    //set date of donation
    public void setDateOfDonation(String dateOfDonation) 
    {
        this.dateOfDonation = dateOfDonation;
    }

    //fetch donation invoice
    public String getDonationInvoice() 
    {
        return donationInvoice;
    }

    //set donation invoice
    public void setDonationInvoice(String donationInvoice) 
    {
        this.donationInvoice = donationInvoice;
    }
    
    //fetch receiver account number
    public static String getReceiverAccNo() 
    {
        return receiverAccNo;
    }
    
    //fetch donor account name
    public String getDonorAccName() 
    {
        return donorAccName;
    }

    //set donor account name
    public void setDonorAccName(String donorAccName) 
    {
        this.donorAccName = donorAccName;
    }


    //fetch donor account number
    public String getDonorAccNo() 
    {
        return donorAccNo;
    }

    //set donor account number
    public void setDonorAccNo(String donorAccNo) 
    {
        this.donorAccNo = donorAccNo;
    }





    
    
    @Override
    public String toString()  
    {
        return donationInvoice;
    }
    
}
