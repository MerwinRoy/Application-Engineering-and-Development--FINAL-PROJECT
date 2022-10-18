/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

//import arrayList
import java.util.ArrayList;

/**
 *
 * @author merwinroy
 */
public class WorkQueue 
{
    //Arraylist of work requests
    private ArrayList<WorkRequest> listOfWorkRequest;

    public WorkQueue() 
    {
        //list of work requests
        listOfWorkRequest = new ArrayList();
    }

    //fetch list of work requests
    public ArrayList<WorkRequest> getListOfWorkRequest() 
    {
        return listOfWorkRequest;
    }
}