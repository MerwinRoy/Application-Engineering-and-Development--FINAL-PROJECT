/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DonorRole;

//Import Employee
import Business.Employee.Employee;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import DateOfBirthChecker
import Business.Validation.DateOfBirthChecker;

//Import EmailChecker
import Business.Validation.EmailChecker;

//Import NumberChecker
import Business.Validation.NumberChecker;

//Import PhoneNo checker
import Business.Validation.PhoneNoChecker;

//Import String validation
import Business.Validation.StringValidation;

//Import cardLayout
import java.awt.CardLayout;

//import date format
import java.text.DateFormat;

//import parse exception
import java.text.ParseException;

//import simple date format
import java.text.SimpleDateFormat;

//import date
import java.util.Date;

//import input verifier
import javax.swing.InputVerifier;

//import JOptionPane
import javax.swing.JOptionPane;

//import JPanel
import javax.swing.JPanel;

/**
 *
 * @author pradyumnareddy
 */
public class AddDonorProfileJPanel extends javax.swing.JPanel
{
    //UserAccount object
    private UserAccount account;
    
    //JPanel object
    private JPanel container;
    
    /**
     * Creates new form CreateDonorProfileJPanel
     */
    public AddDonorProfileJPanel(JPanel container, 
            UserAccount account) 
    {
        //Initialize components
        initComponents();
        
        this.
                account = account;
        this.
                container = container;
        
        //set text to get employee name
        txtFullName.setText(account.getEmployee().getName());
        
        //set access to name
        lblFullName.setVisible(true);
        
        //validation function
        inputVerifier();
    }

    
    private void inputVerifier() 
    
    {
        //InputVerifier function for string validation
        InputVerifier stringVal = new StringValidation();
        
        //set input verifier to a textfield
        txtFullName.
                setInputVerifier(stringVal);
        
        //set input verifier to a textfield
        txtAddress.
                setInputVerifier(stringVal);
        
        //set input verifier to a textfield
        txtCity.
                setInputVerifier(stringVal);
        
        //set input verifier to a textfield
        txtOccupation.
                setInputVerifier(stringVal);
        
        //Input verifier to validate date of birth
        
        InputVerifier dateOfBirthValidation = new DateOfBirthChecker();
        
        txtDateOfBirth.
                setInputVerifier(dateOfBirthValidation);
        
        //Input verifier to validate number 
        InputVerifier numberValidation = new NumberChecker();
        
        
        txtZip.
                setInputVerifier(numberValidation);
        
        //Input verifier to validate phone number
        InputVerifier phoneNoValidation = new PhoneNoChecker();
        
        txtPhoneNumber.
                setInputVerifier(phoneNoValidation);
         
        //Input verifier to validate email 
        InputVerifier emailVal = new EmailChecker();
        
        txtEmail.
                setInputVerifier(emailVal);
     
        
    }
    
    //function to reset fields
    public void resetFields()
    {
        txtPhoneNumber.
                setText("");  
        
        txtOccupation.
                setText("");
        
        txtFullName.
                setText("");
        
        txtDateOfBirth.
                setText("");
        
        txtAddress.
                setText("");
        
        txtCity.
                setText("");
        
        txtZip.
                setText("");
        
        txtEmail.
                setText("");
        
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblOccupation = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblDonorProfile = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFullName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFullName.setText("Full Name:");
        add(lblFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 194, 28));

        txtFullName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 180, -1));

        txtAddress.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 180, -1));

        lblAddress.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 194, 28));

        txtDateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 180, -1));

        lblEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 194, 28));

        txtOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });
        add(txtOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 180, -1));

        lblDateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblDateOfBirth.setText("Date Of Birth:");
        add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 194, 28));

        txtEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 180, -1));

        lblOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblOccupation.setText("Occupation:");
        add(lblOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 194, 28));

        lblCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCity.setText("City:");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 194, 28));

        lblZip.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblZip.setText("Zip Code:");
        add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 194, 28));

        txtCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 180, -1));

        txtZip.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 180, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 180, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 194, 28));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 800, 60, 60));

        btnCreate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_create.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 610, 130, 40));

        lblDonorProfile.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblDonorProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDonorProfile.setText("DONOR PROFILE");
        add(lblDonorProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, 320, 52));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1378, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //remove container
        container.
                remove(this);
        
        //Create cardLayout object
        CardLayout cardLayout = (CardLayout)container.
                getLayout();
        
        //load previous container
        cardLayout.
                previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        
        Employee emp = account.getEmployee();

        if( txtAddress.
                getText().trim().
                isEmpty() ||
                
            txtCity.
                    getText().trim().
                    isEmpty() ||
                
            txtOccupation.
                    getText().trim().
                    isEmpty() ||
                
            txtDateOfBirth.
                    getText().
                    trim().
                    isEmpty() ||
                
            txtEmail.
                    getText().
                    trim().
                    
                    isEmpty() ||
                
            txtZip.
                    getText().
                    trim().
                    isEmpty() ||
                
            txtPhoneNumber.
                    getText().
                    trim().
                    isEmpty()
           
             )
        {
            
            //Prompt error since not all details are filled
            JOptionPane.
                    showMessageDialog(null, "Entry of all textfields are mandatory!");
            return;
        }

        try
        {
            //new date format object
            DateFormat df =  new SimpleDateFormat("MM/dd/yyyy");
            
            //New date object
            Date date = new Date();
            
            //Parse date of birth with given format
            Date dateOfBirth =  df.
                    parse(txtDateOfBirth.getText());
            
            if(dateOfBirth.after(date) || dateOfBirth.equals(date))
            {
                //Prompts error
                JOptionPane.
                        showMessageDialog(null, "Date of Birth is invalid");
                return;
            }
            
            //set employee details from text fields
            
            //set date of birth
            emp.setDateOfBirth(df.
                    parse(txtDateOfBirth.
                            getText()));
            
            //set email id
            emp.
                    setEmailId(txtEmail.
                            getText());
            //set phone number
            emp.
                    setPhoneNo(txtPhoneNumber.
                            getText());
            
            //set profession
            emp.
                    setProfession(txtOccupation.
                            getText());
            
            //set address
            emp.
                    setAddress1(txtAddress.
                            getText());
            
            //set city
            emp.
                    setCity(txtCity.
                    getText());
            
            //set zip
            emp.
                    setZip(txtZip.
                    getText());
            
            
            
            
            
            
            
            //prompts error
            JOptionPane.
                    showMessageDialog(null, "Details have been entered into the system successfully", "success", JOptionPane.
                            PLAIN_MESSAGE);
            
            //function to reset text fields
            resetFields();
        }
        
        //Parse Exception
        catch(ParseException pe)
        {
            //Exception message
            JOptionPane.
                    showMessageDialog(null, "Invalid date of birth!");
            return;
        }
        
        //Exception
        catch(Exception e)
        {
            //Exception message
            JOptionPane.
                    showMessageDialog(null, "Invalid data entry!");
            return;
        }
    }//GEN-LAST:event_btnCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDonorProfile;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}