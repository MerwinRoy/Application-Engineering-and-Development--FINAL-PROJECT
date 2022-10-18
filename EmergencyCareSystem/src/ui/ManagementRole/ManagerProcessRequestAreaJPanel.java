/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ManagementRole;

//Import EcoSystem
import Business.EcoSystem;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import String Validation
import Business.Validation.StringValidation;

//Import DonorWorkRequest
import Business.WorkQueue.DonorWorkReq;

//Import Enterprise
import Business.Enterprise.Enterprise;

//Import Network
import Business.Network.Network;

//Import Date
import java.util.Date;

//Import InputVerifier
import javax.swing.InputVerifier;

//Import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

//Import Doctor Organization
import Business.Organization.DonorOrg;

//Import Organization
import Business.Organization.Organization;




//Import ManagementWorkReq

import Business.WorkQueue.ManagementWorkReq;

//Import CardLayout
import java.awt.CardLayout;

//Import Component
import java.awt.Component;




/**
 *
 * @author merwinroy
 */
public class ManagerProcessRequestAreaJPanel extends javax.swing.JPanel 

{

    private JPanel container;
    private ManagementWorkReq managementWorkRequest;
    private EcoSystem ecoSystem;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    /**
     * Creates new form ManagerProcessRequestAreaJPanel
     */
    public ManagerProcessRequestAreaJPanel(JPanel container,
            ManagementWorkReq managementWorkRequest, 
            EcoSystem ecoSystem,
            Organization organization,
            Enterprise enterprise,
            UserAccount account) 
    {
        //Initialize components
        initComponents();
        
        this.
                container = container;
        
        this.
                organization=organization;
        
        this.
                enterprise=enterprise;
        
        this.
                managementWorkRequest = managementWorkRequest;
        
        this.
                ecoSystem = ecoSystem;
        

        
        this.
                account=account;
        
        //remove items from combo box
        cmbResult.
                removeAllItems();
        
        //add item to combo box
        cmbResult.
                addItem(ManagementWorkReq.
                        REQUEST_APPROVED);
        
        //add item to combo box
        cmbResult.
                addItem(ManagementWorkReq.
                        REQUEST_REJECT);
        
        //populate combo box
        populateComboBox();
        
        //InputVerifier function
        inputVerifier();
    }
    
    private void populateComboBox()
    
    {
        //remove items from network combo box
        cmbNetwork.
                removeAllItems();
        
        //
        if(ecoSystem.
                getNetworkList().
                isEmpty())
        {
            
        //error prompt
        JOptionPane.
                showMessageDialog(null, "There is no Network at present");  
         return;        
        }
        
        //add item to combo box
        cmbNetwork.
                addItem("Please assign a Network");
        
        for(Network ntw : ecoSystem.
                getNetworkList())
        {
            //add item to combo box
             cmbNetwork.
                     addItem(ntw);
        }
    }

    //input verifier function
    public void inputVerifier()
    {
        //InputVerifier object for string validation
        InputVerifier stringVal = new StringValidation();
        
        //set input verifier on text field
        txtComments.setInputVerifier(stringVal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbNetwork = new javax.swing.JComboBox();
        lblLocation = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblRequestResult = new javax.swing.JLabel();
        lblWorkRequestPanelTitle = new javax.swing.JLabel();
        cmbResult = new javax.swing.JComboBox();
        lblComments = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();

        setLayout(null);

        cmbNetwork.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNetworkActionPerformed(evt);
            }
        });
        add(cmbNetwork);
        cmbNetwork.setBounds(740, 200, 163, 27);

        lblLocation.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLocation.setText("Assign Location");
        add(lblLocation);
        lblLocation.setBounds(540, 200, 170, 21);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(60, 810, 60, 40);

        btnSubmit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/button_submit.png"))); // NOI18N
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(670, 350, 110, 40);

        lblRequestResult.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblRequestResult.setText("Request Result");
        add(lblRequestResult);
        lblRequestResult.setBounds(540, 150, 116, 20);

        lblWorkRequestPanelTitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblWorkRequestPanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWorkRequestPanelTitle.setText("WORK REQUEST PANEL");
        add(lblWorkRequestPanelTitle);
        lblWorkRequestPanelTitle.setBounds(570, 58, 300, 60);

        cmbResult.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbResult.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbResult);
        cmbResult.setBounds(740, 150, 163, 27);

        lblComments.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblComments.setText("Comments");
        add(lblComments);
        lblComments.setBounds(540, 250, 81, 21);

        txtComments.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtComments);
        txtComments.setBounds(740, 240, 163, 31);

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage);
        lblImage.setBounds(0, 0, 1378, 910);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNetworkActionPerformed

    }//GEN-LAST:event_cmbNetworkActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        //remove container
        container.remove(this);
        
        //Component array to collect container components
        Component[] componentArray = container.
                getComponents();
        
        //component object to refer to array of components
        Component comp = componentArray[componentArray.
                length - 1];
        
        //New JPanel object
        ManagerWorkAreaJPanel mwaJPanel = (ManagerWorkAreaJPanel) comp;
        
        //populate table on JPanel
        mwaJPanel.
                populateTable();
        
        //New cardlayout object
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        //previous layout loaded
        cardLayout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        if(cmbResult.
                getSelectedIndex()<0 ||
                
                txtComments.
                        getText().
                        trim().
                        isEmpty() ||
                
            cmbNetwork.
                    getSelectedIndex()<1)
            
        {
            //Error prompt
            JOptionPane.
                    showMessageDialog(null, "Enter data in every fields", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        //Network object to select item from combo box
        Network network = (Network)cmbNetwork.
                getSelectedItem();
        
        
        //
        if((managementWorkRequest.
                getSenderAccount().
                getRole().
                toString()).
                equalsIgnoreCase("Business.Role.ApplicantRole"))
        {
            for (Network net : ecoSystem.
                    getNetworkList()) {
            
            
                for ( Enterprise ep   : net.
                        getEnterpriseDirectory().
                        getListOfEnterprise()) 
                {
                    
                        ep.
                                setTypeOfEnterprise(Enterprise.
                                        EnterpriseType.
                                        NonProfit);    
                        if (ep.
                                getTypeOfEnterprise().
                                getValue().
                                equals("NonProfit"))
                    {
        DonorWorkReq donorWorkReq = new DonorWorkReq();
        
        //set status
        donorWorkReq.
                setStatus("Sent");
        
        //set message
        donorWorkReq.
                setMessage("Please Donate Organs");
        
        //set sender account
        donorWorkReq.
                setSenderAccount(account);
        
        
        Organization org = null;
        
        //
        for (Organization organization : enterprise.
                getOrganizationDirectory().
                getListOfOrganization()){
            if (organization instanceof DonorOrg)
            {
                org = organization;
                break;
            }
        }
        
        if (org!=null){
            org.getWorkQueue().getListOfWorkRequest().add(donorWorkReq);
            account.getWorkQueue().getListOfWorkRequest().add(donorWorkReq);
        }
                    }
                }
            }
        }
        
        
        //Set status
        managementWorkRequest.
                setStatus(ManagementWorkReq.
                        REQUEST_COMPLETED);
        
        //set network
        managementWorkRequest.
                getSenderAccount().
                setNetwork(network);
        
        //set resolve date
        managementWorkRequest.
                setResolveDate(new Date());
        
        //set feedback
        managementWorkRequest.
                setFeedback(txtComments.
                        getText());
        
        //set result
        managementWorkRequest.
                setResult((String)cmbResult.
                        getSelectedItem());
        
        
        
        

        
        
        if(managementWorkRequest.
                getResult().
                equals(ManagementWorkReq.
                        REQUEST_APPROVED))
        {
            managementWorkRequest.
                    getSenderAccount().
                    setAccountActive(true);
            
            String userName = managementWorkRequest.
                    getSenderAccount().
                    getProfileName();
            
            String password = managementWorkRequest.
                    getSenderAccount().
                    getPassword();
            
            String emailId = managementWorkRequest.
                    getSenderAccount().
                    getEmployee().
                    getEmailId();
            
            
            
            
            StringBuilder emailText = new StringBuilder();
            
            //append email text
            emailText.
                    append("Acount created successfully. Below are your details");
            emailText.
                    append(System.lineSeparator());
            emailText.
                    append("username : ".concat(userName));
            emailText.
                    append(System.lineSeparator());
            emailText.
                    append("password : ".concat(password));
            emailText.
                    append(System.lineSeparator());
            emailText.
                    append(System.lineSeparator());
            emailText.
                    append("EmergencyHelpCare");

        }
        
        //Prompt success
        JOptionPane.
                showMessageDialog(null, "Request processed successfully", "success", JOptionPane.
                        PLAIN_MESSAGE);
        
        //set textfield as empty
        txtComments.
                setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbNetwork;
    private javax.swing.JComboBox cmbResult;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblRequestResult;
    private javax.swing.JLabel lblWorkRequestPanelTitle;
    private javax.swing.JTextField txtComments;
    // End of variables declaration//GEN-END:variables
}