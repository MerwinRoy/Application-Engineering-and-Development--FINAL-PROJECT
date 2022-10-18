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

public class DonorWorkReq extends WorkRequest
{
    private static int counter = 1;
    
    private String organRequestId;
    
    private String feedback;
    
    private String result;
    
    //Constructor
    public DonorWorkReq()
    {
        //New Stringbuffer
        StringBuffer stringBuffer = new StringBuffer();
 
        counter++;
    }
    
    //fetch feedback
    public String getFeedback() 
    {
        return feedback;
    }

    //set feedback
    public void setFeedback(String feedback) 
    {
        this.
                feedback = feedback;
    }
    
    //fetch organ request id
    public String getOrgansRequestId() 
    {
        return organRequestId;
    }

    //get donor test result
    public String getResult() 
    {
        return result;
    }

    //Set donor test result
    public void setResult(String result) 
    {
        this.
                result = result;
    }
    
    @Override
    public String toString() {
        return this.organRequestId;
    }
    
}
