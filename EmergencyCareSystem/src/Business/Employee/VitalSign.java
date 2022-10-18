/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;


//Import date
import java.util.Date;

/**
 *
 * @author merwinroy
 */
public class VitalSign 
        
{
    //TimeStamp
    private Date timeStamp;
    
    //Blood Pressure
    private double bloodPressure;
    
    //Pulse
    private int pulse;
    
    //Heart Rate
    private double heartRate;
    

    
    //Weight
    private double weight;
    
    //fetch time stamp
    public Date getTimeStamp() 
    {
        
        return timeStamp;
        
    }

    //set time stamp
    public void setTimeStamp(Date timeStamp) 
    {
        
        this.
                timeStamp = timeStamp;
        
    }

            


    //Fetch heart rate
    public double getHeartRate() 
    {
        
        return heartRate;
        
    }

    //Set hear rate
    public void setHeartRate(double heartRate) 
    {
        
        this.
                heartRate = heartRate;
        
    }

    //fetch weight
    public double getWeight() 
    {
        
        return weight;
        
    }

    //set weight
    public void setWeight(double weight) 
    {
        
        this.
                weight = weight;
        
    }

    
    
    

    //fetch blood pressure
    public double getBloodPressure() 
    {
        
        return bloodPressure;
        
    }

    //set blood pressure
    public void setBloodPressure(double bloodPressure) 
    {

        this.
                bloodPressure = bloodPressure;
        
    }

    //fetch pulse
    public int getPulse() 
    {
        
        return pulse;
        
    }

    //set pulse
    public void setPulse(int pulse) 
    {
        
        this.
                pulse = pulse;
        
    }


   
    @Override
    public String toString() 
    {
        
        return Double.
                toString(bloodPressure);
        
    }
    
}
