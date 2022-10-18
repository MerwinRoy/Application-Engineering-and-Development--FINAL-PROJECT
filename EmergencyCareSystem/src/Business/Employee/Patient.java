/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

//import arraylist
import java.util.ArrayList;

/**
 *
 * @author pradyumnareddy
 */

public class Patient extends Employee
{
    
    //ID String
    private String patientId;
    
    //Counter
    private static int counter = 001;
    
    // New arraylist of vitalSigns
    private ArrayList<VitalSign> vitalSignList;
    
    //Constructor
    public Patient()
    {
        //Stringbuffer object created
        StringBuffer stringBuffer = new StringBuffer();
        
        //appends to stringbuffer object
        stringBuffer.append("APP");
        
        stringBuffer.append(counter);
        
        //Converted to String to obtain patient id which is auto-incremented
        patientId = stringBuffer.toString();
        
        counter++;
        
        //New arraylist of vital signs created
        vitalSignList = new ArrayList();
    }
    
    //Constructor
    public Patient(Employee e)
    {
        super(e);
    }
    
    //fetch list of vital signs
    public ArrayList<VitalSign> getVitalSignList() 
    {
        return vitalSignList;
    }

    //Set list of vitalsigns
    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) 
    {
        this.vitalSignList = vitalSignList;
    }
    


    //fetch patient id
    public String getPatientId() 
    {
        return patientId;
    }

    //set patient id
    public void setPatientId(String patientId) 
    {
        this.patientId = patientId;
    }

    
    //Add vitals to list
    public VitalSign addVital()
    {
        VitalSign vs=new VitalSign();
        
        vitalSignList.add(vs);
        
        return vs;
    }
    
    //Delete vitals from list
    public void removeVital(VitalSign v)
    {
        vitalSignList.remove(v);
        
    }
    
    //ArrayList of abnormalList
    public ArrayList<VitalSign> getAbnormalList(double maxBloodPressure , double minBloodPressure)
    {
        //Arraylist of abnormal case created
        ArrayList<VitalSign> abnormalList = new ArrayList<>();
        
        //For loop to iterate through vital signs list
        for(VitalSign vitalSigns : vitalSignList)
        {
            //Checks blood pressure levels for abnormal cases and adds to list
            if(vitalSigns.getBloodPressure() > maxBloodPressure || vitalSigns.getBloodPressure() < minBloodPressure)
            {
                abnormalList.add(vitalSigns);
            }
        }
        return abnormalList;
    }
    

    
    
    public String patientCondition( VitalSign patientVitalSign)
    {
        
        
        //patient status
        String patientStatus = null;
     
        
         //Blood pressure
        double bloodPressure;
        
        //Pulse
        int pulse;
        
        //Pulse
        double weight;
        
        //Heart rate 
        double heartRate;
       
        
         //Pulse fetched
        pulse=patientVitalSign.
                getPulse();
        
        //Heart rate fetched
        heartRate = patientVitalSign.getHeartRate();
        
        //Blood pressure fetched
        bloodPressure=patientVitalSign.
                getBloodPressure();
        
       
        
        //Weight fetched
        weight=patientVitalSign.
                getWeight();
     
        //If condition for normal status
        if(pulse >= 20 && pulse <=30 && heartRate >= 80 && heartRate <= 130 && bloodPressure >= 80 && bloodPressure <= 110 && weight >= 22 && weight <= 31)
        {
            patientStatus = "NORMAL";
        }
        
        //else abnormal status
        else
        {
            
            patientStatus = "ABNORMAL";
        }
        
        return patientStatus;
            
    }
    
    @Override
    public String toString() 
    {
        return this.getName();
    }

}
