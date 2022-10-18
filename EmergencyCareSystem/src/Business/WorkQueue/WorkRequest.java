/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//Import user account
import Business.UserAccount.UserAccount;

//import date
import java.util.Date;

/**
 *
 * @author merwinroy
 */
public abstract class WorkRequest 

{
    //message
    private String message;
    
    //sender
    private UserAccount senderAccount;
    
    //receiver
    private UserAccount receiverAccount;
    
    //status
    private String status;
    
    //requestDate
    private Date requestDate;
    
    //resolveDate
    private Date resolveDate;
    
    //Constructor
    public WorkRequest()
    {
        requestDate = new Date();
    }

    //fetch message
    public String getMessage() {
        return message;
    }

    //set message
    public void setMessage(String message) 
    {
        this.
                message = message;
    }
    
        //fetch status
    public String getStatus() 
    {
        return status;
    }

    //set status
    public void setStatus(String status) 
    {
        this.
                status = status;
    }

    //Fetch sender
    public UserAccount getSenderAccount() 
    {
        return senderAccount;
    }

    //Set sender
    public void setSenderAccount(UserAccount senderAccount) 
    {
        this.
                senderAccount = senderAccount;
    }
    
        //set request date
    public void setRequestDate(Date requestDate)
    {
        this.
                requestDate = requestDate;
    }

    //fetch resolve date
    public Date getResolveDate() 
    {
        return resolveDate;
    }

    //set resolve date
    public void setResolveDate(Date resolveDate) 
    {
        this.
                resolveDate = resolveDate;
    }

    //fetch receiver
    public UserAccount getReceiverAccount() 
    {
        return receiverAccount;
    }

    //set receiver
    public void setReceiverAccount(UserAccount receiverAccount) 
    {
        this.
                receiverAccount = receiverAccount;
    }



    //fetch request date
    public Date getRequestDate() {
        return requestDate;
    }


    
    
    @Override
    public String toString()
    {
        return this.
                message;
    }
}
