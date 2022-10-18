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
public class OrganWorkReq extends WorkRequest

{
    
    private static int counter = 1;
    private String organsRequestId;
    
    private String feedback;
    
    private String organRequestResult;

    public OrganWorkReq()
    {
        //StringBuffer object created
        StringBuffer stringBuffer = new StringBuffer();
        
        //StringBuffer append
        stringBuffer.append("ORGANS");
        
        stringBuffer.append(counter);
        
        //organRequestId fetched
        organsRequestId = stringBuffer.toString();
        
        //counter auto-increment
        counter++;
    }
    
    //fetch Organs request id
    public String getOrgansRequestId() 
    {
        return organsRequestId;
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

    //fetch Organs Request result
    public String getOrganRequestResult() 
    {
        return organRequestResult;
    }

    //Set organs request result
    public void setOrganRequestResult(String organRequestResult) 
    {
        this.
                organRequestResult = organRequestResult;
    }
    
    @Override
    public String toString() 
    {
        return this.
                organsRequestId;
    }
    
}
