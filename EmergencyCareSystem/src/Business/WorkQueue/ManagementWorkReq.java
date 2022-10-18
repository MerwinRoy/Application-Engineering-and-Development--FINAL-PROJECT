/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author merwinroy
 */
public class ManagementWorkReq extends WorkRequest

{
    
    //Request messages
    
    //Request pending
    public static String REQUEST_PENDING = "Request Pending";
    
    
    //Request approved
    public static String REQUEST_APPROVED = "Request Approved";
    
    
   
    //Request sent
    public static String REQUEST_SENT = "Request Sent";
    
    //Request completed
    public static String REQUEST_COMPLETED = "Request Completed";
    
    //Request accepted
    public static String REQUEST_ACCEPT = "Request Accepted";
    
    //Request approval
    public static String REQUEST_APPROVAL = "Request Approval";
    
    //Request reject
    public static String REQUEST_REJECT = "Request Declined";
    
    
    
    
    //Result
    private String result;
    
    //Feedback
    private String feedback;
    
    public String getResult() 
    {
        return result;
    }

    public void setResult(String result) 
    {
        this.
                result = result;
    }

    public String getFeedback() 
    {
        return feedback;
    }

    public void setFeedback(String feedback)
    {
        this.
                feedback = feedback;
    }
    
    
}
