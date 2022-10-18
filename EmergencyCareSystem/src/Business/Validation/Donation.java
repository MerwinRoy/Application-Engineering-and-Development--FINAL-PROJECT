/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validation;

/**
 *
 * @author merwinroy
 */
public class Donation 
{    
    public static String receiverAccNo = "8577865926";
    
    private String donationInvoice;
    
    private String dateOfDonation;
    
    private String donorAccNo;
    
    private String donorAccName;
    
    
    private static int counter = 0;
    private int id_donation;
    
    public Donation()
    {
        counter++;
        id_donation = counter;
    }
    
    public int getId_donation() {
        return id_donation;
    }

    public void setId_donation(int id_donation) {
        this.id_donation = id_donation;
    }
    
    public static String getReceiverAccNo() {
        return receiverAccNo;
    }



    public String getDateOfDonation() {
        return dateOfDonation;
    }

    public void setDateOfDonation(String dateOfDonation) {
        this.dateOfDonation = dateOfDonation;
    }

    public String getDonorAccNo() {
        return donorAccNo;
    }

    public void setDonorAccNo(String donorAccNo) {
        this.donorAccNo = donorAccNo;
    }

    public String getDonorAccName() {
        return donorAccName;
    }

    public void setDonorAccName(String donorAccName) {
        this.donorAccName = donorAccName;
    }
    
    public String getDonationInvoice() {
        return donationInvoice;
    }

    public void setDonationInvoice(String donationInvoice) {
        this.donationInvoice = donationInvoice;
    }

    @Override
    public String toString()  {
        return String.valueOf(id_donation);
    }
    
}
