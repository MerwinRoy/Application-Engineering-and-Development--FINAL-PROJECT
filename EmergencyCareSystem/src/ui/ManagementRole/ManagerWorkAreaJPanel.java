/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ManagementRole;

//Import EcoSystem
import Business.EcoSystem;

//Import ManagementOrg
import Business.Organization.ManagementOrg;

//Import Organization
import Business.Organization.Organization;

//Import UserAccount
import Business.UserAccount.UserAccount;

//Import Enterprise
import Business.Enterprise.Enterprise;



//Import CardLayout
import java.awt.CardLayout;

//Import JOptionPane
import javax.swing.JOptionPane;


//Import JPanel
import javax.swing.JPanel;

//Import TableModel
import javax.swing.table.DefaultTableModel;

//Import ViewDonorJPanel
import ui.DonorRole.ViewDonorJPanel;


//Import ManagementWorkReq
import Business.WorkQueue.ManagementWorkReq;

//Import WorkRequest
import Business.WorkQueue.WorkRequest;



/**
 *
 * @author merwinroy
 */
public class ManagerWorkAreaJPanel extends javax.swing.JPanel 

{

    private JPanel container;
    private EcoSystem ecoSystem;
    private UserAccount account;
    private ManagementOrg managementOrganization;
    private Enterprise enterprise;
    /**
     * Creates new form SupervisorWorkAreaJPanel
     */
    public ManagerWorkAreaJPanel(JPanel container,
            UserAccount account,
            Organization organization, 
            Enterprise enterprise,
            EcoSystem ecoSystem ) 
    {
        
        //Initialize components
        initComponents();
        
        
        this.
                container = container;
        this.
                account = account;
        this.
                managementOrganization = (ManagementOrg)organization;
        this.
                enterprise = enterprise;
        this.
                ecoSystem = ecoSystem;
        
        //Populate table
        populateTable();
    }

    //populate table
    public void populateTable()
    {
        //tableModel object created
        DefaultTableModel tableModel = (DefaultTableModel)tblWorkRequest.
                getModel();
        
        //set row count of tableModel to 0
        tableModel.
                setRowCount(0);
        
        //for loop to iterate through list of work requests
        for(WorkRequest request : managementOrganization.
                getWorkQueue().
                getListOfWorkRequest()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.
                    getSenderAccount().
                    getEmployee().
                    getName();
            row[2] = request.
                    getReceiverAccount() == null ? null : request.
                            getReceiverAccount().
                            getEmployee().
                            getName();
            row[3] = request.
                    getStatus();
            row[4] = request.
                    getSenderAccount().
                    getRole().
                    toString();
            
            //add row to table model after each iteration
            tableModel.
                    addRow(row);
        }
    }
    
    //populateWorkReqToProcessTable
    public void populateWorkReqToProcessTable()
    {
        //tableModel object created
        DefaultTableModel tableModel = (DefaultTableModel)tblWorkRequest.
                getModel();
        
        //set row count to 0
        tableModel.setRowCount(0);
        
        for(WorkRequest request : managementOrganization.
                getWorkQueue().
                getListOfWorkRequest())
        {
            if(request.
                    getStatus().
                    equalsIgnoreCase("Sent") || 
                    request.getStatus().
                            equalsIgnoreCase("Pending") ||
                    
              request.
                      getStatus().
                      equalsIgnoreCase("Processing")   )
            {
            Object[] row = new Object[4];
            
            row[0] = request;
            
            row[1] = request.
                    getSenderAccount().
                    getEmployee().
                    getName();
            
            row[2] = request.
                    getReceiverAccount() == null ? null : request.
                            getReceiverAccount().
                            getEmployee().
                            getName();
            
            row[3] = request.
                    getStatus();
            
            tableModel.
                    addRow(row);
            }
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

        btnViewRequestToProcess = new javax.swing.JButton();
        btnViewPatientProfile = new javax.swing.JButton();
        btnViewProfile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        lblWorkRequest = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnCreateProfile = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewRequestToProcess.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnViewRequestToProcess.setText("View Request to be Processed");
        btnViewRequestToProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestToProcessActionPerformed(evt);
            }
        });
        add(btnViewRequestToProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 270, 40));

        btnViewPatientProfile.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnViewPatientProfile.setText("View Patient's Profile");
        btnViewPatientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientProfileActionPerformed(evt);
            }
        });
        add(btnViewPatientProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 270, 40));

        btnViewProfile.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnViewProfile.setText("View My Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        add(btnViewProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 230, 181, -1));

        tblWorkRequest.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 710, 169));

        lblTitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("SUPERVISOR WORK AREA PANEL");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 410, 60));

        lblWorkRequest.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblWorkRequest.setText("Work Requests:");
        add(lblWorkRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 260, -1));

        btnAssign.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 140, 30));

        btnProcess.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 140, -1));

        btnRefresh.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 140, 30));

        btnCreateProfile.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnCreateProfile.setText("Create My Profile");
        btnCreateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProfileActionPerformed(evt);
            }
        });
        add(btnCreateProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 175, -1));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1378, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRequestToProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestToProcessActionPerformed
        populateWorkReqToProcessTable();
    }//GEN-LAST:event_btnViewRequestToProcessActionPerformed

    private void btnViewPatientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientProfileActionPerformed

        //selected row
        int selectedRow = tblWorkRequest.
                getSelectedRow();
        if (selectedRow < 0)
        {
            //prompt message error
            JOptionPane.
                    showMessageDialog(null, "Please select a row", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        //ManagementWorkrequest
        ManagementWorkReq manageWorkReq = (ManagementWorkReq)tblWorkRequest.
                getValueAt(selectedRow, 0);
        
        //UserAccount registration
        UserAccount user = manageWorkReq.getSenderAccount();
        
        //viewDonorJPanel 
        ViewDonorJPanel viewDonorPanel = new ViewDonorJPanel(container, user);
        
        //
        CardLayout cardLayout = (CardLayout) container.getLayout();
        
        container.add("ViewDonorJPanel", viewDonorPanel);
        
        cardLayout.next(container);
    }//GEN-LAST:event_btnViewPatientProfileActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed

        //New JPanel
        ViewDonorJPanel viewPanel = new ViewDonorJPanel(container, account);
        
        
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //add container
        container.
                add("ViewDonorJPanel", viewPanel);
        
        //next container
        cardLayout.next(container);
    }//GEN-LAST:event_btnViewProfileActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        //selected row on table
        
        
        int selectedRow = tblWorkRequest.
                getSelectedRow();
        
        if (selectedRow < 0)
        {
            //Error prompt
            JOptionPane.
                    showMessageDialog(null, "Select a row from the table to proceed!", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //workrequest object to refer to value in table
        WorkRequest workReq = (WorkRequest)tblWorkRequest.
                getValueAt(selectedRow, 0);
        
        if(workReq.
                getReceiverAccount()!=null)
        {
            //Warning prompt
            JOptionPane.
                    showMessageDialog(null, "Request has already been processed", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //work request set receiver amount
        workReq.
                setReceiverAccount(account);
        
        //work request set status
        workReq.
                setStatus("Pending");
        
        //refresh table
        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        //selected row from table
        int selectedRow = tblWorkRequest.
                getSelectedRow();
        
        
        if (selectedRow < 0)
        {
            //Prompt
            JOptionPane.
                    showMessageDialog(null, "Select a row from the table to proceed", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        //ManagementWorkRequest object to point to table values
        ManagementWorkReq managementWorkRequest = (ManagementWorkReq)tblWorkRequest.getValueAt(selectedRow, 0);
        
        
        if(managementWorkRequest.
                getReceiverAccount() == null)
        {
            //Prompt
            JOptionPane.
                    showMessageDialog(null, "Request must be assigned first", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        
        if(managementWorkRequest.
                getStatus().
                equalsIgnoreCase("Completed"))
        {
            JOptionPane.
                    showMessageDialog(null, "It has already been processed", "warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        
        if(managementWorkRequest.
                getStatus().
                equalsIgnoreCase("Processing") ||  managementWorkRequest.
                        getStatus().
                        equalsIgnoreCase("Pending"))
        {
            if(managementWorkRequest.getReceiverAccount()!=account)
            {
                //warning prompt
                JOptionPane.
                        showMessageDialog(null, "Request already processed", "warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }
        //set status
        managementWorkRequest.
                setStatus("Processing");
        
        ManagerProcessRequestAreaJPanel managementProcessorRequestPanel = new ManagerProcessRequestAreaJPanel(container, managementWorkRequest, ecoSystem,managementOrganization,enterprise,account);
        container.
                add("ManagerProcessRequestAreaJPanel", managementProcessorRequestPanel);
        
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        cardLayout.next(container);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        //refresh table
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCreateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProfileActionPerformed
        
        //New JPanel object created
        CreateManagerJPanel createJPanel = new CreateManagerJPanel(container, account);
        
        //cardLayout object created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //container added
        container.
                add("CreateManagerJPanel", createJPanel);
        
        //previous layout loaded
        cardLayout.
                next(container);
    }//GEN-LAST:event_btnCreateProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnCreateProfile;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewPatientProfile;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JButton btnViewRequestToProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWorkRequest;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}