/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author merwinroy
 */
public class Employee 

{
    //String name
    private String name;
    
    //first name
    private String firstName;
    
    //last name
    private String lastname;
    
    
    //Date of birth
    private Date dateOfBirth;
    

    
    //phone number
    private String phoneNo;
    
    //email id
    private String emailId;
    
    //occupation
    private String profession;
    

    
    //gender
    private String gender;
    
    //address lines
    private String address1;
    
    private String address2;
    
    //city
    private String city;
    
    //zipcode
    private String zip;
    
    //country
    private String country;
    
    //state
    private String state;
    

    
    //Employeeid
    private int id_emp;
    
    //Counter
    private static int counter = 1;
    
    //ArrayList of donation
    private ArrayList<Donation> donationList ;
    
public Employee( Employee employee)
{
    this.name=employee.name;
    
    this.firstName=employee.firstName;
    
    this.lastname=employee.lastname;
    
    this.dateOfBirth=employee.dateOfBirth;
     
    this.address1=employee.address1;
     
    this.address2=employee.address2;
    
    this.city=employee.city;
     
    this.zip=employee.zip;
     
    this.country=employee.country;
    
    this.state=employee.state;
     
    this.phoneNo=employee.phoneNo;
     
    this.emailId=employee.emailId;
    
    this.profession=employee.profession;
     
    
    this.gender=employee.gender;
     

    
    this.id_emp=employee.id_emp;
}

//Constructor
    public Employee() 
    {
        //Stringbuffer object created
        StringBuffer stringBuffer = new StringBuffer();
        
        //Stringbuffer object appends
        stringBuffer.append("PER");
        stringBuffer.append(counter);
        
        //counter increment for employee id
        counter++;  
        
        //New arrayList created
        donationList = new ArrayList<>();
    }

    //fetch id
    public int getId() 
    {
        return id_emp;
    }
    
    //set name
    public void setName(String name) 
    {
        this.name = name;
    }

    //fetch name
    public String getName() 
    {
        
        return name;
    }






    //fetch first name
    public String getFirstName() 
    {
        return firstName;
    }

    //set first name
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    //fetch last name
    public String getLastname() 
    {
        return lastname;
    }

    //set last name
    public void setLastname(String lastname) 
    {
        this.lastname = lastname;
    }


    
    //fetch gender
    public String getGender() 
    {
        return gender;
    }

    //set gender
    public void setGender(String gender) 
    {
        this.gender = gender;
    }
    
        //fetch date of birth
    public Date getDateOfBirth() 
    {
        return dateOfBirth;
    }

    //set date of birth
    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    //fetch first address line
    public String getAddress1() 
    {
        return address1;
    }



    //fetch phone no
    public String getPhoneNo() 
    {
        return phoneNo;
    }

    //set phone number
    public void setPhoneNo(String phoneNo) 
    {
        this.phoneNo = phoneNo;
    }

    //fetch email id
    public String getEmailId() 
    {
        return emailId;
    }

    //set email id
    public void setEmailId(String emailId) 
    {
        this.emailId = emailId;
    }

    //fetch profession
    public String getProfession() 
    {
        return profession;
    }

    //set profession
    public void setProfession(String profession) 
    {
        this.profession = profession;
    }
    
    //set second address line
    public void setAddress1(String address1) 
    {
        this.address1 = address1;
    }

    //fetch second address line
    public String getAddress2() 
    {
        return address2;
    }

    //set second address line
    public void setAddress2(String address2) 
    {
        this.address2 = address2;
    }

    //fetch city
    public String getCity() 
    {
        return city;
    }

    //set city
    public void setCity(String city) 
    {
        this.city = city;
    }

    //fetch zip
    public String getZip() 
    {
        return zip;
    }

    //set zip
    public void setZip(String zip) 
    {
        this.zip = zip;
    }
    
        //fetch country
    public String getCountry() 
    {
        return country;
    }

    //set country
    public void setCountry(String country) 
    {
        this.country = country;
    }

    //fetch state
    public String getState() 
    {
        return state;
    }

    //set state
    public void setState(String state) 
    {
        this.state = state;
    }





    //fetch counter
    public static int getCounter() 
    {
        return counter;
    }

    //set counter
    public static void setCounter(int counter) 
    {
        Employee.counter = counter;
    }
    
    //fetch arraylist of donations
    public ArrayList<Donation> getDonationList() 
    {
        return donationList;
    }

    //set arraylist of donations
    public void setDonationList(ArrayList<Donation> donationList) 
    {
        this.donationList = donationList;
    }
    
    //add donation to arraylist
    public Donation addDonation()
    {
        Donation donation=new Donation();
        
        donationList.add(donation);
        
        return donation;
    }
    
    @Override
    public String toString() 
    {
        return this.getName();
    }
    
}
