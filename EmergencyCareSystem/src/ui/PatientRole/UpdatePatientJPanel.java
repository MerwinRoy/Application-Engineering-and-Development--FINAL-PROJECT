/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientRole;


import Business.Validation.DateOfBirthChecker;
import Business.Validation.EmailChecker;

import Business.Validation.NumberChecker;
import Business.Validation.PhoneNoChecker;
import Business.Validation.StringValidation;

import Business.Employee.Employee;
import java.awt.CardLayout;
import Business.UserAccount.UserAccount;

import Business.UserAccount.UserAccountDirectory;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

import java.text.DateFormat;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author raj
 */
public class UpdatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePatientJPanel
     */
    
    //JPanel object
    private JPanel container;
    
    //UserAccount object
    private UserAccount account; 
    
    //Employee object
    private Employee emp;
    
    //UserAccountDirectory object
    private UserAccountDirectory uaDirectory;
    
    //constructor
    public UpdatePatientJPanel(JPanel container, 
            UserAccount account,
            UserAccountDirectory uaDirectory) 
    {
        //initialize components
        initComponents();
        
        
        this.
                container = container;
        this.
                account = account;
        this.
                uaDirectory = uaDirectory;
        emp = account.
                getEmployee();
        
        try
        {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        inputVerifiers();    
                cmbGender.
                setSelectedItem(emp.
                        getGender());
        txtFirstName.
                setText(emp.
                        getFirstName());
        txtLastName.
                setText(emp.
                        getLastname());
        txtUserName.
                setText(account.
                getProfileName());
        txtDateOfBirth.
                setText(df.
                format(emp.
                        getDateOfBirth()));

        txtAddr1.
                setText(emp.
                getAddress1());
        txtAddr2.
                setText(emp.
                        getAddress2());
        cityText.
                setText(emp.
                getCity());
        txtCity.
                setText(emp.
                        getZip());
        txtPhoneNumber.
                setText(String.valueOf(emp.
                        getPhoneNo()));
               txtEmail.
                
                setText(emp.getEmailId());
        txtOccupation.
                setText(emp.
                getZip());
 
        
        
        }
        catch(Exception e)
        {
            //Prompt message
            JOptionPane.
                showMessageDialog(null, "Please Update Profile ","Success", JOptionPane.PLAIN_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtDateOfBirth = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox();
        lblGender = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtAddr2 = new javax.swing.JTextField();
        lblAddr2 = new javax.swing.JLabel();
        txtAddr1 = new javax.swing.JTextField();
        lblAddr1 = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblOccupation = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFirstName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFirstName.setText("FIRST NAME :");
        add(lblFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 110, 30));

        txtFirstName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 144, -1));

        txtDateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });
        add(txtDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, 144, -1));

        lblDateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblDateOfBirth.setText("DATE OF BIRTH :");
        add(lblDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        txtLastName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 144, -1));

        lblLastName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLastName.setText("LAST NAME :");
        add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 110, 30));

        cmbGender.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        add(cmbGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 144, -1));

        lblGender.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblGender.setText("GENDER :");
        add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        txtEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 190, 144, -1));

        lblEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblEmail.setText("E-MAIL :");
        add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, -1, -1));

        txtCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 144, -1));

        lblZip.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblZip.setText("ZIP CODE:");
        add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, -1));

        cityText.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextActionPerformed(evt);
            }
        });
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 144, -1));

        lblCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCity.setText("CITY :");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 381, 50, 30));

        txtAddr2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAddr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddr2ActionPerformed(evt);
            }
        });
        add(txtAddr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 144, -1));

        lblAddr2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAddr2.setText("ADDRESS LINE 2 :");
        add(lblAddr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        txtAddr1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAddr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddr1ActionPerformed(evt);
            }
        });
        add(txtAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 144, -1));

        lblAddr1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAddr1.setText("ADDRESS LINE 1 :");
        add(lblAddr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        lblPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPhoneNumber.setText("PHONE NUMBER :");
        add(lblPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, -1, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 144, -1));

        lblOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblOccupation.setText("OCCUPATION:");
        add(lblOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 291, 120, 30));

        txtOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOccupationActionPerformed(evt);
            }
        });
        add(txtOccupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 144, -1));

        lblUsername.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblUsername.setText("USERNAME :");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 151, 100, 30));

        txtUserName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 150, 144, -1));

        btnUpdate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_update.png"))); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 540, 130, 40));

        btnSave.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 130, 40));

        btnBack.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 820, 60, 40));

        lblTitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitle.setText("UPDATE PATIENT DETAILS PORTAL");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 360, -1));

        lblImage.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1378, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void inputVerifiers() 
    {
          
        InputVerifier stringVal = new StringValidation();
        txtUserName.
                setInputVerifier(stringVal);
        txtFirstName.
                setInputVerifier(stringVal);
        txtLastName.
                setInputVerifier(stringVal);
        txtOccupation.
                setInputVerifier(stringVal);
        txtAddr1.
                setInputVerifier(stringVal);
        cityText.
                setInputVerifier(stringVal);
        txtAddr2.
                setInputVerifier(stringVal);
        
        InputVerifier dateOfBirtbValidation = new DateOfBirthChecker();
        txtDateOfBirth.
                setInputVerifier(dateOfBirtbValidation);
        
        InputVerifier phoneNoValidation = new PhoneNoChecker();
        txtPhoneNumber.
                setInputVerifier(phoneNoValidation);
        
        InputVerifier numberValidation = new NumberChecker();
        
        txtCity.
                setInputVerifier(numberValidation);
        
        
        
        InputVerifier emailVal = new EmailChecker();
        txtEmail.
                setInputVerifier(emailVal);
        
        
     }
    
    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void cityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextActionPerformed

    private void txtAddr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddr2ActionPerformed

    private void txtAddr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddr1ActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOccupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOccupationActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        txtOccupation.
                setEnabled(true);
        
        txtUserName.
                setEnabled(true);
        
        txtPhoneNumber.
                setEnabled(true);
        
        btnSave.
                setEnabled(true);
        
        txtFirstName.
                setEnabled(true);
        
        txtLastName.
                setEnabled(true);
        
        txtDateOfBirth.
                setEnabled(true);
        
        cmbGender.
                setEnabled(true);
        
        txtAddr1.
                setEnabled(true);
        
        txtAddr2.
                setEnabled(true);
        
        cityText.
                setEnabled(true);
        
        txtCity.
                setEnabled(true);
      
        btnUpdate.
                setEnabled(false);
        
        txtFirstName.
                setEditable(true);
        
        txtLastName.
                setEditable(true);
        
        txtDateOfBirth.
                setEditable(true);
        
        txtAddr1.
                setEditable(true);
        
        txtAddr2.
                setEditable(true);
        
        cityText.
                setEditable(true);
        
        txtCity.
                setEditable(true);
        
        txtOccupation.
                setEditable(true);
        
        txtUserName.
                setEditable(true);
        
        txtPhoneNumber.setEditable(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        if(txtFirstName.
                getText()!= null &&
                !txtFirstName.
                        getText().
                        isEmpty() 
                &&
            txtLastName.
                    getText()!= null && 
                !txtLastName.
                        getText().
                        isEmpty()
                &&
            txtAddr1.
                    getText()!=null
                && !txtAddr1.
                        getText().isEmpty() 
                &&
            txtAddr2.
                    getText()!=null 
                && !txtAddr2.
                        getText().
                        isEmpty()
                &&
            cityText.
                    getText()!=null 
                && !cityText.
                        getText().
                        isEmpty() &&
            txtOccupation.
                    getText()!=null &&
                !txtOccupation.
                        getText().
                        isEmpty() &&
            txtEmail.
                    getText()!=null && 
                !txtEmail.getText().
                        isEmpty() 
                &&
            txtUserName.
                    getText()!=null 
                && !txtUserName.
                        getText().
                        isEmpty()
            && cmbGender.
                    getSelectedIndex()>=1 
                && txtDateOfBirth.getText()!=null 
                &&
            !txtDateOfBirth.
                    getText().isEmpty() 
                &&
            txtCity.
                    getText()!=null 
                && !txtCity.getText().
                        isEmpty())
        {
            try
            {
                if(!(account.
                        getProfileName().
                        equals(txtUserName.
                                getText()))&&!(
                        uaDirectory.
                                checkUniqueProfileName(txtUserName.
                                        getText())))
                {
                    JOptionPane.
                            
                            showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(txtDateOfBirth.getText()) ;
               
               
                emp.
                        setAddress2(txtAddr2.getText());
                emp.
                        setAddress1(txtAddr1.getText());
                account.
                        setProfileName(txtUserName.getText());
                emp.
                        setDateOfBirth(dateOfBirthVal);
                emp.
                        setPhoneNo(txtPhoneNumber.getText());
                emp.
                        setCity(cityText.getText());
                emp.
                        setZip(txtCity.getText());
                emp.
                        setProfession(txtOccupation.getText());
                emp.
                        setFirstName(txtFirstName.getText());
                emp.
                        setLastname(txtLastName.getText());
                
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(this, "Invalid details", "warning",JOptionPane.WARNING_MESSAGE);
                return;
            }
            catch(ParseException pe)
            {
                //Prompt message
                JOptionPane.
                        showMessageDialog(this, "Invalid details", "warning",JOptionPane.WARNING_MESSAGE);
                return;
            }

            //prompt message
            JOptionPane.
                    showMessageDialog(null, "Your Profile has been updated successfully", "success", JOptionPane.
                            PLAIN_MESSAGE);
            btnUpdate.
                    setEnabled(true);
            txtLastName.
                    setEnabled(false);
            txtEmail.
                    setEnabled(false);
            txtUserName.
                    setEnabled(false);
            txtPhoneNumber.
                    setEnabled(false);
            txtAddr1.
                    setEnabled(false);
           
            txtDateOfBirth.
                    setEnabled(false);
            cmbGender.
                    setEnabled(false);
            txtAddr2.
                    setEnabled(false);
            btnSave.
                    setEnabled(false);
            txtFirstName.
                    setEnabled(false);
          
            cityText.
                    setEnabled(false);
            txtCity.
                    setEnabled(false);
            txtOccupation.
                    setEnabled(false);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        //remove container
        container.
                remove(this);
        
        //cardlayout
        CardLayout cardLayout = (CardLayout)container.
                getLayout();
        
        //cardLayout previous load
        cardLayout.
                previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField cityText;
    private javax.swing.JComboBox cmbGender;
    private javax.swing.JLabel lblAddr1;
    private javax.swing.JLabel lblAddr2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAddr1;
    private javax.swing.JTextField txtAddr2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}