/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdminRole;

//Import Employee
import Business.Employee.Employee;

//Import Enterprise
import Business.Enterprise.Enterprise;

//Import Organization
import Business.Organization.Organization;

//Import User account
import Business.UserAccount.UserAccount;


//Import role
import Business.Role.Role;

//Import password checker
import Business.Validation.PasswordChecker;

//import string validation
import Business.Validation.StringValidation;




//import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

//Import DefaultTableModel
import javax.swing.table.DefaultTableModel;


//import  card layout
import java.awt.CardLayout;

//import inputverifier
import javax.swing.InputVerifier;

/**
 *
 * @author raj
 */
public class UserAccountManagementJpanel extends javax.swing.JPanel 

{

    /**
     * Creates new form UserAccountManagementJpanel
     */
    
    //Enterprise object
    private Enterprise enterprise;
    
    //JPanel object
    private JPanel container;
    
    
    //Constructor
    public UserAccountManagementJpanel(JPanel container,
            Enterprise enterprise)
    {
        //Initialize component
        initComponents();
        
        this.
                container = container;
        
        this.
                enterprise = enterprise;
        
        //Input verifiers
        inputVerifiers();
        
        //populate data
        populateData();
        
        //populate Organization combo box
        populateOrganizationComboBox();
        
        
    }
    
        
    private void inputVerifiers() 
            
    {
        
        
        //NEw InputVerifier object created for string validation
        InputVerifier passwordValidation = new PasswordChecker();
        
        //Input verifier implemented on password for validation
        txtPassword.
                setInputVerifier(passwordValidation);
        
        //New InputVerifier object created for string validation
        InputVerifier stringValidation = new StringValidation();
        
        
        //string validation set to textfield
        txtUserName.
                setInputVerifier(stringValidation);
        

       
     }

    public void populateOrganizationComboBox() 
    
    {
        //remove items from organization combo box
        cmbOrganization.
                removeAllItems();

        //loop to iterate through list of organization
        for (Organization org : enterprise.
                getOrganizationDirectory().
                getListOfOrganization()) 
        {
            //add item to combo box
            cmbOrganization.
                    addItem(org);
        }
    }
    
        public void populateData()
    
    {

        //tabe Model object created
        DefaultTableModel tableModel = (DefaultTableModel) tblUser.getModel();

        //table model row count set to 0
        tableModel.setRowCount(0);

        //For loop to iterate through list of organization
        for (Organization org : enterprise.
                getOrganizationDirectory().
                getListOfOrganization()) 
        {
            //for loop to list of user account
            for (UserAccount user : org.
                    getUserAccountDirectory().
                    getListOfUserAccount()) 
                
            {
                Object row[] = new Object[2];
                
                row[0] = user;
                
                row[1] = user.
                        getRole();
                
                //add row to table model after every iteration
                ((DefaultTableModel) tblUser.
                        getModel()).
                        addRow(row);
                
            }
        }
    }

    
    private void populateRoleComboBox(Organization organization)
    {
        
        //remove all items from role combo box
        cmbRole.
                removeAllItems();
        
        //iterate through all supported roles in organization using for loop
        for (Role r : organization.
                getSupportedRole())
            
        {
            //add role into combo box
            cmbRole.
                    addItem(r);
        }
    }

    
    public void populateEmployeeComboBox(Organization org)
    {
        //item removed from combo box
        cmbEmployee.
                removeAllItems();
        
        //for loop to iterate through list of employees
        for (Employee emp : org.
                getEmployeeDirectory().
                getListOfEmployee())
        {
            //employee object added to employee combo box
            cmbEmployee.
                    addItem(emp);
            
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

        btnCreate = new javax.swing.JButton();
        txtUserName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblEmployee = new javax.swing.JLabel();
        cmbEmployee = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblOrganization = new javax.swing.JLabel();
        cmbOrganization = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox();
        lblImage = new javax.swing.JLabel();

        setLayout(null);

        btnCreate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_create.png"))); // NOI18N
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate);
        btnCreate.setBounds(490, 670, 130, 40);

        txtUserName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtUserName);
        txtUserName.setBounds(680, 460, 146, 31);

        lblUserName.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblUserName.setText("User Name:");
        add(lblUserName);
        lblUserName.setBounds(560, 460, 110, 21);

        tblUser.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);
        if (tblUser.getColumnModel().getColumnCount() > 0) {
            tblUser.getColumnModel().getColumn(0).setResizable(false);
            tblUser.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(250, 110, 610, 300);

        lblPassword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPassword.setText("Password:");
        add(lblPassword);
        lblPassword.setBounds(560, 520, 110, 21);

        txtPassword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtPassword);
        txtPassword.setBounds(680, 520, 146, 31);

        lblEmployee.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblEmployee.setText("Employee:");
        add(lblEmployee);
        lblEmployee.setBounds(250, 520, 110, 21);

        cmbEmployee.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbEmployee);
        cmbEmployee.setBounds(370, 520, 146, 27);

        btnBack.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(50, 790, 60, 40);

        lblOrganization.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblOrganization.setText("Organization:");
        add(lblOrganization);
        lblOrganization.setBounds(250, 460, 110, 21);

        cmbOrganization.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrganizationActionPerformed(evt);
            }
        });
        add(cmbOrganization);
        cmbOrganization.setBounds(370, 460, 146, 27);

        lblRole.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole);
        lblRole.setBounds(250, 580, 70, 21);

        cmbRole.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbRole);
        cmbRole.setBounds(370, 580, 146, 27);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage);
        lblImage.setBounds(0, -80, 1620, 1080);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        //
        //Password string to fetch password from textfield
        String password = txtPassword.getText();
        
        //username string to fetch username from textfield
        String name = txtUserName.getText();
        
        //Employee object created to select item from employee combo box
        Employee emp = (Employee) cmbEmployee.
                getSelectedItem();
        
        //Organization object created to select item from organization combo box
        Organization org = (Organization) cmbOrganization.
                getSelectedItem();
        

        //Role object created to select item from role combo box
        Role r = (Role) cmbRole.
                getSelectedItem();
        
        if( txtUserName.
                getText().
                trim().
                isEmpty() ||
            txtPassword.
                    getText().
                    trim().
                    isEmpty() )
            
        {
            //Prompt error message
            JOptionPane.
                    showMessageDialog(null, "Empty text fields not allowed!");
            return;
        }
        
        //create a new user account in an organization
        org.
                getUserAccountDirectory().
                createUserAccount(name, password, emp, r);
        
        //refresh table
        populateData();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        //remove current container
        container.
                remove(this);
        
        //CardLayout object created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //previous layout loaded
        cardLayout.
                previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrganizationActionPerformed
        
        //Organization object to point to organization combo box
        Organization org = (Organization) cmbOrganization.
                getSelectedItem();
        
        if (org != null)
        {
            //populate role combo box
            populateRoleComboBox(org);
            
            //populate emoployee combo box
            populateEmployeeComboBox(org);
            
        }
    }//GEN-LAST:event_cmbOrganizationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox cmbEmployee;
    private javax.swing.JComboBox cmbOrganization;
    private javax.swing.JComboBox cmbRole;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
