/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//Import VitalSign
import Business.Employee.VitalSign;

//Import ArrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class DocWorkReq extends WorkRequest
{
    
    //Count
    private static int count = 000;
    //sdr
    private String sdrId;
    
    // diagnosis
    private String diagnosis;
    
    //Treatment
    private String treatment;
    
    //New treatment
    private String newTreatment;
    
    
    
    //ArrayList of vitalSigns
    private ArrayList<VitalSign> vitalSignList;

    public ArrayList<VitalSign> getVitalSignList() 
    {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) 
    {
        this.vitalSignList = vitalSignList;
    }
    
    public static int getCount() 
    {
        return count;
    }

    public static void setCount(int count) 
    {
        DocWorkReq.count = count;
    }

    
    
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.
                diagnosis = diagnosis;
    }
    
    //Add Vitals to list
    public VitalSign addVital()
    {
        //New VitalSign object
        VitalSign vitalSign=new VitalSign();
        
        //object added to arraylist
        vitalSignList.add(vitalSign);
        
        return vitalSign;
    }
    
    //Delete vitals from list
    public void removeVital(VitalSign vitalSign)
    {
        //object removed from list
        vitalSignList.remove(vitalSign);
        
    }
    
    //fetch treatment
    public String getTreatment() 
    {
        return treatment;
    }

    //set treatment
    public void setTreatment(String treatment) 
    {
        this.
                treatment = treatment;
    }

    //fetch new treatment
    public String getNewTreatment() 
    {
        return newTreatment;
    }

    
    //set new treatment
    public void setNewtreatment(String newtreatment) 
    {
        this.
                newTreatment = newTreatment;
    }

    //fetch send data request id
    public String getSdrId()
    {
        return sdrId;
    }

    //set send data request id
    public void setSdrId(String sdrId) 
    {
        this.
                sdrId = sdrId;
    }

 


    
    
}