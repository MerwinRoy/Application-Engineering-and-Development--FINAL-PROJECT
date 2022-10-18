/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ManagementRole;

//Import StringValidation
import Business.Validation.StringValidation;

//Import CardLayout
import java.awt.CardLayout;


//Import InputVerifier
import javax.swing.InputVerifier;

//Import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

//Import Employee
import Business.Employee.Employee;

//Import UserAccount
import Business.UserAccount.UserAccount;


//Import DateFormat
import java.text.DateFormat;

//Import ParseException
import java.text.ParseException;

//Import SimpleDateFormat
import java.text.SimpleDateFormat;

//Import Date
import java.util.Date;

//Import UserAccount
import Business.Validation.DateOfBirthChecker;

//Import EmailChecker
import Business.Validation.EmailChecker;

//Import NumberChecker
import Business.Validation.NumberChecker;

//Import PhoneNoChecker
import Business.Validation.PhoneNoChecker;



/**
 *
 * @author merwinroy
 */
public class CreateManagerJPanel extends javax.swing.JPanel 

{
    //UserAccount object
    private UserAccount account;

    //JPanel object
    private JPanel container;
    
    /**
     * Creates new form CreateManagerJPanel
     */
    public CreateManagerJPanel(JPanel container,
            UserAccount account)
    {
        //initialize components
        initComponents();
        
        //
        this.
                container = container;
        this.
                account = account;
        
        //Input Verifier function
        inputVerifiers();
        
        //set name to manager name text field
        txtFullName.
                setText(account.
                        getEmployee().
                        getName());
    }
    
    public void reset()
    {
        
        //set all textfields empty to reset
        txtOccupation.
                setText("");
        
       
        txtZip.
                setText("");
        
        txtDateOfBirth.
                setText("");
        
        txtAddress.
                setText("");
        
        txtCity.
                setText("");
        
        txtFullName.
                setText("");
        
        txtPhoneNumber.
                setText("");
        
        txtEmail.
                setText("");
        
    }

    
    private void inputVerifiers() 
    
    {
        //date of birth validation
        InputVerifier dateOfBirthValidation = new DateOfBirthChecker();
        
        txtDateOfBirth.
                setInputVerifier(dateOfBirthValidation);
        
        InputVerifier stringVal = new StringValidation();
        
        txtFullName.
                setInputVerifier(stringVal);
        
        txtAddress.
                setInputVerifier(stringVal);
        
        
        txtCity.
                setInputVerifier(stringVal);
        
        txtOccupation.
                setInputVerifier(stringVal);
        
        //phone number validation
        InputVerifier phoneNoValidation = new PhoneNoChecker();
        txtPhoneNumber.
                setInputVerifier(phoneNoValidation);
        
        //Number Validation
        InputVerifier numberValidation = new NumberChecker();
        
        txtZip.
                setInputVerifier(numberValidation);
        
        //email validation
        InputVerifier emailVal = new EmailChecker();
        
        txtEmail.
                setInputVerifier(emailVal);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblDateOfBirth = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblOccupation = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblManagerCreateWorkPanelTitle = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblFullName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JFormattedTextField();
        txtOccupation = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();

        setLayout(null);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 810, 60, 40);

        lblDateOfBirth.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblDateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");
        add(lblDateOfBirth);
        lblDateOfBirth.setBounds(390, 240, 230, 21);

        btnCreate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_create.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate);
        btnCreate.setBounds(520, 570, 120, 40);

        lblOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblOccupation.setText("Occupation:");
        add(lblOccupation);
        lblOccupation.setBounds(390, 360, 91, 21);

        lblZip.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblZip.setText("Zip Code:");
        add(lblZip);
        lblZip.setBounds(390, 440, 130, 21);

        lblManagerCreateWorkPanelTitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblManagerCreateWorkPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagerCreateWorkPanelTitle.setText("CREATE MANAGER WORK AREA PANEL ");
        add(lblManagerCreateWorkPanelTitle);
        lblManagerCreateWorkPanelTitle.setBounds(390, 50, 400, 42);

        txtCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtCity);
        txtCity.setBounds(620, 310, 184, 30);

        txtPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(620, 470, 184, 30);

        lblPhoneNumber.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(390, 480, 115, 21);

        txtEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtEmail);
        txtEmail.setBounds(620, 390, 184, 30);

        txtZip.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        add(txtZip);
        txtZip.setBounds(620, 430, 184, 30);

        lblCity.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblCity.setText("City");
        add(lblCity);
        lblCity.setBounds(390, 320, 140, 21);

        txtFullName.setEditable(false);
        txtFullName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtFullName.setEnabled(false);
        add(txtFullName);
        txtFullName.setBounds(620, 190, 184, 30);

        txtAddress.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtAddress);
        txtAddress.setBounds(620, 270, 184, 30);

        lblFullName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblFullName.setText("Full Name:");
        add(lblFullName);
        lblFullName.setBounds(390, 190, 194, 30);

        lblEmail.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblEmail.setText("Email:");
        add(lblEmail);
        lblEmail.setBounds(390, 400, 130, 21);

        lblAddress.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblAddress.setText("Address: ");
        add(lblAddress);
        lblAddress.setBounds(390, 280, 194, 21);
        add(txtDateOfBirth);
        txtDateOfBirth.setBounds(620, 230, 184, 30);

        txtOccupation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtOccupation);
        txtOccupation.setBounds(620, 350, 184, 30);

        lblImage.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage);
        lblImage.setBounds(0, 0, 1378, 910);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        //container remove
        container.
                remove(this);
        
        //cardlayout object created
        CardLayout cardLayout = (CardLayout)container.
                getLayout();
        
        //previous layout loaded
        cardLayout.
                previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        //Employee object
        Employee emp = account.
                getEmployee();
        
        if( txtAddress.
                getText()==null || txtAddress.
                        getText().
                        trim().
                        isEmpty() ||
                
            txtCity.
                    getText()==null || txtCity.
                            getText().
                            trim().
                            isEmpty() ||
                
            txtPhoneNumber.
                    getText()==null || txtPhoneNumber.
                            getText().
                            trim().
                            isEmpty() ||
                
            txtDateOfBirth.
                    getText()==null || txtDateOfBirth.
                            getText().
                            trim().
                            isEmpty() ||
                
            txtOccupation.
                    
                    getText()==null || txtOccupation.
                            getText().
                            trim().
                            isEmpty() ||
                
            txtEmail.
                    getText()==null || txtEmail.
                            getText().
                            trim().
                            isEmpty() ||
                
            txtZip.
                    getText()==null || txtZip.
                            getText().
                            trim().
                            isEmpty() )
        {
            JOptionPane.
                    showMessageDialog(null, "Enter data for all fields");
            return;
        }
        
        try
        {
            //dateformat
            DateFormat df =  new SimpleDateFormat("MM/dd/yyyy");
            
            Date date = new Date();
            
            Date dateOfBirth =  df.parse(txtDateOfBirth.getText());
            
            if(dateOfBirth.
                    after(date) || dateOfBirth.
                            equals(date))
            {
                //error prompt
                JOptionPane.
                        showMessageDialog(null, "Date of Birth not valid");
                return;
            }
            emp.
                    setDateOfBirth(df.
                    parse(txtDateOfBirth.
                            getText()));
            
            emp.
                    setEmailId(txtEmail.
                    getText());
            
            emp.
                    setAddress1(txtAddress.
                    getText());
            
            emp.
                    setCity(txtCity.
                    getText());
            
            emp.
                    setZip(txtZip.
                            getText());
            
            emp.
                    setPhoneNo(txtPhoneNumber.
                            getText());
            
            emp.
                    setProfession(txtOccupation.
                            getText());
            
       //Error prompt 
            JOptionPane.
                    showMessageDialog(null, "Manager created Successfully", "success", JOptionPane.
                            PLAIN_MESSAGE);
            reset();
        }
        catch(ParseException pe)
        {
            //Error prompt 
            JOptionPane.
                    showMessageDialog(null, "Invalid date of birth");
            return;
        }
        
        catch(NumberFormatException nfe)
        {
            //Error prompt
            JOptionPane.
                    showMessageDialog(null, "Invalid Number");
            return;
        }
        catch(Exception e)
        {
            //Error prompt
            JOptionPane.
                    showMessageDialog(null, "Invalid Data! Check data in all fields");
            return;
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblManagerCreateWorkPanelTitle;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JFormattedTextField txtDateOfBirth;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}