/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.RegRole;

//Import EcoSystem
import Business.EcoSystem;

//Import Employee
import Business.Employee.Employee;

//Import EmployeeDirectory
import Business.Employee.EmployeeDirectory;

//Import EmergencyHelpEnterprise
import Business.Enterprise.EmergencyHelpEnterprise;

//Import Enterprise
import Business.Enterprise.Enterprise;

//Import HospitalEnterprise
import Business.Enterprise.HospitalEnterprise;

//Import Network
import Business.Network.Network;

//Import Doctor ORganization
import Business.Organization.DocOrg;

//Import patient organization
import Business.Organization.PatientOrg;

//Import organization
import Business.Organization.Organization;

//Import doctor role
import Business.Role.DocRole;

//Import patient role
import Business.Role.PatientRole;

//import user account
import Business.UserAccount.UserAccount;

//Import date of birth checker
import Business.Validation.DateOfBirthChecker;

//Import email checker
import Business.Validation.EmailChecker;

//Import Number checker
import Business.Validation.NumberChecker;

//Import password checker
import Business.Validation.PasswordChecker;

//Import phone number checker
import Business.Validation.PhoneNoChecker;

//Import string validation
import Business.Validation.StringValidation;

//Import simple date format
import java.text.SimpleDateFormat;

//Import date
import java.util.Date;

//Import verifier
import javax.swing.InputVerifier;

//import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

/**
 *
 * @author merwinroy
 */

public class RegistrationWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegistrationworkAreaJPanel
     */
    private JPanel container;
    private EmployeeDirectory empDirectory;
    private EcoSystem business; 
    private Enterprise enterprise;
    private Organization organization;
    public RegistrationWorkAreaJPanel(JPanel container, EcoSystem business) 
    {
        
        //Initialize components
        
        initComponents();
        
        this.
                container = container;
        
       this.
               business = business;
       
       //input verifier
       inputVerifier();
       
       //populate country combo box function
       populateCountryComboBox();
    }
    
    // input verifier
    public void inputVerifier()
    {
        //Input verifier object forv string validation
        InputVerifier stringVal = new StringValidation();
        
        
        txtFirstName.
                setInputVerifier(stringVal);
        txtLastName.
                setInputVerifier(stringVal);
        txtUsername.
                setInputVerifier(stringVal);
       
        txtCity.
                setInputVerifier(stringVal);
        txtOccupation.
                setInputVerifier(stringVal);
        
         txtAddr1.
                setInputVerifier(stringVal);
        txtAddr2.
                setInputVerifier(stringVal);
        
        
        InputVerifier numberValidation = new NumberChecker();
        txtZip.
                setInputVerifier(numberValidation);
        
        InputVerifier phoneNoValidation = new PhoneNoChecker();
        txtPhoneNumber.
                setInputVerifier(phoneNoValidation);
        
        InputVerifier emailVal = new EmailChecker();
        
        txtEmail.
                setInputVerifier(emailVal);
        txtConfirmEmail.
                setInputVerifier(emailVal);
        
        InputVerifier dateOfBirthValidation = new DateOfBirthChecker();
        
        txtDateOfBirth.
                setInputVerifier(dateOfBirthValidation);
        
        InputVerifier passwordValidation = new PasswordChecker();
        
        txtPassword.setInputVerifier(passwordValidation);
        
        txtReenterPassword.setInputVerifier(passwordValidation);
    }
    
    //Function combo box
    private void populateCountryComboBox()
        {
            cmbCountry.
                    removeAllItems();
            cmbCountry.
                    addItem("Please select a country");
            cmbCountry.
                    addItem("United States");
        }   
        
    private void populateNetworkComboBox()
    {
        cmbNetworkCity.
                removeAllItems();
        if(business.
                getNetworkList().
                isEmpty())
        {
        JOptionPane.
                showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        cmbNetworkCity.
                addItem("Please Select a Network");
        for(Network network : business.
                getNetworkList()){
             cmbNetworkCity.
                     addItem(network);
         }
    }
    
     public void getEnterprise(Network network)
    {
     try
                {
                 for (Network net : business.getNetworkList())
                    {
                    if(net.getName().
                            equals(network.
                                    getName()))   
                    {     
                        for(Enterprise ep : net.
                                getEnterpriseDirectory().
                                getListOfEnterprise())
                      {
                           if(ep instanceof EmergencyHelpEnterprise && rbPatient.
                                   isSelected())
                           {
                                this.enterprise = ep;
                                network = net;
                            }
                           
                           if(ep instanceof HospitalEnterprise && rbDoctor.
                                   isSelected())
                           {
                                this.enterprise = ep;
                                network = net;
                            }
                    }
    }
                    }
                }
     catch(Exception e)
                {
                    //Error prompt
                    JOptionPane.
                         showMessageDialog(null, "Please create Enterprise","warning", JOptionPane.
                                 WARNING_MESSAGE);
                    return;    
                }
    }
     
     
     //Fetch organization
     public void getOrganization(String orgName, Enterprise ep){
     
        try
        {
     for (Organization organization : ep.
             getOrganizationDirectory().
             getListOfOrganization())
     {
         if(orgName.
                 equals("HelpSeeker") && organization instanceof PatientOrg)
             
             {
               this.organization = organization;
               this.empDirectory = organization.
                       getEmployeeDirectory();
             }  
       
       else if(orgName.equals("Doctor") && organization instanceof DocOrg)
             {
               this.
                       organization = organization;
               this.
                       empDirectory = organization.
                               getEmployeeDirectory();
             } 
             }
        }
        
        catch(Exception ex)
        {
         return;     
        }
     }
     
     //reset textfields
     public void resetFields()
     {
         txtCity.
                setText("");
        txtZip.
                setText("");
        txtOccupation.
                setText("");
        txtEmail.
                setText("");
        txtConfirmEmail.
                setText("");
        txtPhoneNumber.
                setText("");
         txtPassword.
             setText("");
        txtReenterPassword.
                setText("");
        txtFirstName.
                setText("");
        txtLastName.
                setText("");
        txtDateOfBirth.
                setText("");
        txtAddr1.
                setText("");
        txtAddr2.
                setText("");
        
        //radiobutton set to false
        rbPatient.
                setSelected(false);
        
        //radiobutton set to false
        rbDoctor.
                setSelected(false);
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblAddr2 = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox();
        txtAddr1 = new javax.swing.JTextField();
        cmbCountry = new javax.swing.JComboBox();
        lblAddr1 = new javax.swing.JLabel();
        lblReenterPassword = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtReenterPassword = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtAddr2 = new javax.swing.JTextField();
        cmbGender = new javax.swing.JComboBox();
        rbDoctor = new javax.swing.JRadioButton();
        lblPhoneNumber = new javax.swing.JLabel();
        rbPatient = new javax.swing.JRadioButton();
        lblGender = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtConfirmEmail = new javax.swing.JTextField();
        lblConfirmEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblUserAccountCreation = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        lblNetworkCity = new javax.swing.JLabel();
        cmbNetworkCity = new javax.swing.JComboBox();
        lblOccupation = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddr2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAddr2.setText("ADDRESS LINE 2 :");
        add(lblAddr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        cmbState.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateActionPerformed(evt);
            }
        });
        add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 144, -1));

        txtAddr1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAddr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddr1ActionPerformed(evt);
            }
        });
        add(txtAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 144, -1));

        cmbCountry.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryActionPerformed(evt);
            }
        });
        add(cmbCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 144, -1));

        lblAddr1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAddr1.setText("ADDRESS LINE 1 :");
        add(lblAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        lblReenterPassword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblReenterPassword.setText("RE-ENTER PASSWORD :");
        add(lblReenterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, -1, -1));

        lblState.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblState.setText("STATE :");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txtReenterPassword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtReenterPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReenterPasswordActionPerformed(evt);
            }
        });
        add(txtReenterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 150, -1));

        lblCountry.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCountry.setText("COUNTRY :");
        add(lblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        lblPassword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPassword.setText("PASSWORD :");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        txtPassword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 240, 150, -1));

        txtUsername.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, 150, -1));

        txtZip.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 144, -1));

        lblZip.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblZip.setText("ZIP CODE:");
        add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        txtCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, 144, -1));

        lblCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCity.setText("CITY :");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 130, 30));

        txtAddr2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAddr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddr2ActionPerformed(evt);
            }
        });
        add(txtAddr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 144, -1));

        cmbGender.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 590, 144, -1));

        buttonGroup1.add(rbDoctor);
        rbDoctor.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbDoctor.setText("Doctor");
        rbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDoctorActionPerformed(evt);
            }
        });
        add(rbDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 96, 170, 20));

        lblPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPhoneNumber.setText("PHONE NUMBER :");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, -1));

        buttonGroup1.add(rbPatient);
        rbPatient.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rbPatient.setText("Patient");
        rbPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPatientActionPerformed(evt);
            }
        });
        add(rbPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 30));

        lblGender.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblGender.setText("GENDER :");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        lblTitle.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("REGISTRATION PANEL");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 570, -1));

        txtConfirmEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtConfirmEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmEmailActionPerformed(evt);
            }
        });
        add(txtConfirmEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 144, -1));

        lblConfirmEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblConfirmEmail.setText("CONFIRM E-MAIL ADDRESS :");
        add(lblConfirmEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, -1, -1));

        txtEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 510, 144, -1));

        lblEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblEmail.setText("E-MAIL ADDRESS :");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        txtDateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 144, -1));

        lblDateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblDateOfBirth.setText("DATE OF BIRTH (MM/DD/YYY) :");
        add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtLastName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 144, -1));

        lblUsername.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblUsername.setText("USERNAME :");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, -1, -1));

        lblLastName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLastName.setText("LAST NAME :");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblUserAccountCreation.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblUserAccountCreation.setText("Create your user account here:");
        add(lblUserAccountCreation, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, -1, -1));

        txtFirstName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 144, -1));

        lblFirstName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFirstName.setText("FIRST NAME :");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 144, -1));

        btnRegister.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_register (2).png"))); // NOI18N
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 210, 60));

        lblNetworkCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblNetworkCity.setText("PLEASE SELECT NETWORK CITY:");
        add(lblNetworkCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, -1));

        cmbNetworkCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(cmbNetworkCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 320, 150, -1));

        lblOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblOccupation.setText("OCCUPATION:");
        add(lblOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, -1, -1));

        txtOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });
        add(txtOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 670, 144, 30));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1378, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddr1ActionPerformed

    private void txtReenterPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReenterPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReenterPasswordActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtAddr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddr2ActionPerformed

    private void txtConfirmEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmEmailActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:

        try
        {
            if(cmbCountry.
                    getSelectedIndex()<1 || 
                    cmbState.
                            getSelectedIndex()<1)
            {
                JOptionPane.
                        showMessageDialog(null, "Please Enter valid data for country and state ","warning", JOptionPane.
                                WARNING_MESSAGE);
                return;
            }
            if(cmbGender.
                    getSelectedIndex()<1 )
            {
                JOptionPane.
                        showMessageDialog(null, "Please Enter valid gender ","warning", JOptionPane.
                                WARNING_MESSAGE);
                return;
            }

            Date dobVal = new SimpleDateFormat("MM/dd/yyyy").
                    parse(txtDateOfBirth.
                            getText()) ;
            
            String firstName =   txtFirstName.
                    getText();
            
            String lastName = txtLastName.
                    getText();
            
            String name = firstName+" "+lastName;
            
            String address1 = txtAddr1.
                    getText();
            
            String address2 = txtAddr2.
                    getText();
            String city = txtCity.
                    getText();
            String zipCode = txtZip.
                    getText();
            String emailId = txtEmail.
                    getText();
            String confirmEmail = txtConfirmEmail.
                    getText();
            String gender = (String)cmbGender.
                    getSelectedItem();
            String country = (String)cmbCountry.
                    getSelectedItem();
            String state = (String)cmbState.
                    getSelectedItem();
            String phoneNumber = txtPhoneNumber.
                    getText();
            String occupation = txtOccupation.
                    getText();
            
            
            
            if(firstName != null 
                    && !firstName.
                            isEmpty() &&
                    
                lastName!= null 
                    && !lastName.
                            isEmpty() 
                    &&
                    occupation!= null && 
                    !occupation.
                            isEmpty() &&
                address1!=null && !address1.
                        isEmpty() &&
                address2!=null && !address2.
                        isEmpty() &&
                city!=null && !city.
                        isEmpty() &&
                emailId!=null && !emailId.
                        isEmpty() &&
                confirmEmail!=null && !confirmEmail.
                        isEmpty() &&
                zipCode != null && !zipCode.
                        isEmpty() &&
                gender!=null && !gender.
                        isEmpty() && !phoneNumber.
                                isEmpty()
                &&  country!=null && !country.
                        isEmpty()
                &&  state!=null && !state.
                        isEmpty()
            )

            {
                if(buttonGroup1.
                        getSelection()==null)
                {
                    //Error prompt
                    JOptionPane.
                            showMessageDialog(null, "Please select radio button to know if you are applicant or a doctor ","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if(!(confirmEmail.
                        equals(emailId)))
                {
                    //Error prompt
                    JOptionPane.
                            showMessageDialog(null, "Invalid email address","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                                Employee employee = null;

                if(rbDoctor.
                        isSelected())
                {
                    
   
                 
                  if(cmbNetworkCity.
                          getSelectedIndex()<1)
                  {
                      
                      //Error prompt
                        JOptionPane.
                                showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                        return;     
                   }
                
                String uName = txtUsername.
                        getText();
                
                String password = String.
                        valueOf(txtPassword.
                                getText());
                
                String cPassword =String.
                        valueOf(txtReenterPassword.
                                getText());
                
                Network network = (Network)cmbNetworkCity.
                        getSelectedItem();
                
                if(!(password.
                        equals(cPassword)))
                {
                    //error prompt
                    JOptionPane.
                            showMessageDialog(null, "Incorrect password, try again","warning", JOptionPane.WARNING_MESSAGE);
                    
                    organization.
                            getEmployeeDirectory().
                            getListOfEmployee().
                            remove(employee);
                    
                    return;
                }
                
                
                getEnterprise(network);
                
                
                if(enterprise==null)
                {
                        //error prompt
                     JOptionPane.
                             showMessageDialog(null, "Enterprise does not exist for the network! "+network.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                }
                
                
                getOrganization("Doctor",enterprise);
                
                
                if(organization==null)
                {
                    
                    //Error prompt
                     JOptionPane.
                             showMessageDialog(null, "Doctor Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                } 
                
                //employee object
                employee = organization.
                        getEmployeeDirectory().
                        addEmployee();
                   
                    for(Enterprise ent : network.getEnterpriseDirectory().getListOfEnterprise())
                    {
                     for(UserAccount account : ent.getUserAccountDirectory().getListOfUserAccount())
                    {
                        
                        if(account.
                                getProfileName().
                                equals(uName))
                            
                        {
                            
                         JOptionPane.
                                 showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        
                        else
                            
                        {
                        for(Organization org : ent.
                                getOrganizationDirectory().
                                getListOfOrganization())
                        {  
                            
                         for(UserAccount user1 : org.
                                 getUserAccountDirectory().
                                 getListOfUserAccount())
                            {  
                            if(user1.
                                    getProfileName().
                                    equals(uName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    
                    if(!organization.
                            getUserAccountDirectory().
                            checkUniqueProfileName(uName))
                    {
                        JOptionPane.
                                showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.
                                        WARNING_MESSAGE);
                        
                        
                        organization.
                                getEmployeeDirectory().
                                getListOfEmployee().
                                remove(employee);
                        return;
                    }
                    
                    
                    UserAccount uAccount = organization.
                            getUserAccountDirectory().
                            createUserAccount(uName, password, employee, new DocRole());
                    uAccount.
                            setEmployee(employee);
                    uAccount.
                            setNetwork(network);
                }
                
                else if(rbPatient.
                        isSelected())
                {
                    
   
                 
                  if(cmbNetworkCity.
                          getSelectedIndex()<1)
                    {
                    JOptionPane.
                            showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.
                                    WARNING_MESSAGE);
                    return;     
                    }
                
                    
               
                Network net = (Network)cmbNetworkCity.
                        getSelectedItem();
                
                
                String userName = txtUsername.
                        getText();
                
                
                String password = String.
                        valueOf(txtPassword.
                                getText());
                
                //
                String cPassword =String.valueOf(txtReenterPassword.
                        getText());
                if(!(password.
                        equals(cPassword)))
                {
                    
                    //Error message
                    JOptionPane.
                            showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.
                                    WARNING_MESSAGE);
                    organization.
                            getEmployeeDirectory().getListOfEmployee().remove(employee);
                    return;
                }
                getEnterprise(net);
                if(enterprise==null)
                    {
                     JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+net.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    }
                
                getOrganization("HelpSeeker",enterprise);
                if(organization==null)
                    {
                     JOptionPane.showMessageDialog(null, "HelpSeeker Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                  employee = organization.getEmployeeDirectory().addEmployee();
                   
                    for(Enterprise ent : net.getEnterpriseDirectory().getListOfEnterprise())
                    {
                     for(UserAccount account : ent.getUserAccountDirectory().getListOfUserAccount())
                    {
                        if(account.getProfileName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.
                                 WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization org : ent.
                                getOrganizationDirectory().
                                getListOfOrganization())
                        {  
                            
                            
                         for(UserAccount user1 : org.
                                 getUserAccountDirectory().
                                 getListOfUserAccount())
                            {  
                            if(user1.
                                    getProfileName().
                                    equals(userName))
                            {
                             JOptionPane.
                                     showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.
                                             WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.
                            getUserAccountDirectory().
                            checkUniqueProfileName(userName))
                    {
                        JOptionPane.
                                showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.
                                        WARNING_MESSAGE);
                        
                        
                        organization.
                                getEmployeeDirectory().
                                getListOfEmployee().
                                remove(employee);
                        
                        return;
                    }
                    
                    
                    UserAccount userAccount1 = organization.
                            getUserAccountDirectory().
                            createUserAccount(userName, password, employee, new PatientRole());
                    userAccount1.
                            setEmployee(employee);
                    userAccount1.
                            setNetwork(net);
                    
                   /* if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }*/
                }
            
                employee.
                        setFirstName(firstName);
                employee.
                        setLastname(lastName);
                employee.
                        setEmailId(emailId);
                employee.
                        setDateOfBirth(dobVal);
                employee.
                        setPhoneNo(phoneNumber);
                employee.
                        setAddress2(address2);
                employee.
                        setAddress1(address1);
                employee.
                        setCity(city);
                employee.
                        setCountry(country);
                employee.
                        setState(state);
                employee.
                        setName(name);
                employee.
                        setZip(zipCode);
                employee.
                        setProfession(occupation);
  
                employee.
                        setGender(gender);
                
                JOptionPane.
                        showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.
                                PLAIN_MESSAGE);
                
                resetFields();
            }
        }
        catch(Exception ex)
        {
            return;
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cmbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStateActionPerformed

    private void cmbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryActionPerformed
        // TODO add your handling code here:
        
        //remove items from combo box
        cmbState.
                removeAllItems();
       
        
      if(cmbCountry.
              getSelectedIndex()>0)
      {
          //add item to combo box
          cmbState.
                  addItem("Please select a State");
          
          //add item to combo box

          
          cmbState.
                  addItem("Massachusatts");
      }
    }//GEN-LAST:event_cmbCountryActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void rbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDoctorActionPerformed
        // TODO add your handling code here:
        populateNetworkComboBox();
    }//GEN-LAST:event_rbDoctorActionPerformed

    private void rbPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPatientActionPerformed
        // TODO add your handling code here:
        populateNetworkComboBox();
    }//GEN-LAST:event_rbPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbCountry;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JComboBox cmbNetworkCity;
    private javax.swing.JComboBox cmbState;
    private javax.swing.JLabel lblAddr1;
    private javax.swing.JLabel lblAddr2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmEmail;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNetworkCity;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblReenterPassword;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserAccountCreation;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZip;
    private javax.swing.JRadioButton rbDoctor;
    private javax.swing.JRadioButton rbPatient;
    private javax.swing.JTextField txtAddr1;
    private javax.swing.JTextField txtAddr2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtConfirmEmail;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtReenterPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
