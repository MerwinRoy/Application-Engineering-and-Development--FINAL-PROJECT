/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DocRole;

//Import Organization
import Business.Organization.Organization;

//Import Doctor organization
import Business.Organization.DocOrg;

//Import Patient
import Business.Employee.Patient;

//Import Enterprise
import Business.Enterprise.Enterprise;

//Import VitalSign
import Business.Employee.VitalSign;


//Import Useraccount
import Business.UserAccount.UserAccount;

//Import work request
import Business.WorkQueue.WorkRequest;

//Import doctor work request
import Business.WorkQueue.DocWorkReq;

//Import Donor work request
import Business.WorkQueue.DonorWorkReq;

//Import lab work request
import Business.WorkQueue.LabWorkReq;


//Import management work request
import Business.WorkQueue.ManagementWorkReq;



//Import table Model
import javax.swing.table.DefaultTableModel;

//Import String validation
import Business.Validation.StringValidation;

//Import cardlayout
import java.awt.CardLayout;

//Import JOptionPane
import javax.swing.JOptionPane;

//Import JPanel
import javax.swing.JPanel;

//Import InputVerifier
import javax.swing.InputVerifier;

//Import Hashset
import java.util.HashSet;



/**
 *
 * @author pradyumnareddy
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel 

{

    //JPanel object
    private JPanel container;
    
    //Doctor Organization object
    private DocOrg org;
    
    //Enterprise object
    private Enterprise enterprise;
    
    //USerAccount object
    private UserAccount account;
    
    //DoctorWorkRequest object
    private DocWorkReq docWorkReq;
    
    //Patient object
    private Patient patient;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    
    //Constructor
    public DoctorWorkAreaJPanel(JPanel container, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise) 
    {
        //Initialize components
        initComponents();
        
        this.
                account = account;
        this.
                container = container;
        this.
                enterprise = enterprise;
        this.
                org = (DocOrg)organization;
        
       //New patient object created
        patient = new Patient(account.
                getEmployee());
       
       //Input verifier function
        inputVerifier();
        
        //Populate patient combo box created
        populatePatientComboBox();
        
        //Populate request table
        populateRequestTable();
        
    }
    
    //Input verifier function
    public void inputVerifier()
    {
        //Input Verifier object created for string validation
        InputVerifier stringValidation = new StringValidation();

    }
   


    
        //Populate request table

    
        //function to populate Patient combo box
    public void populatePatientComboBox()
    {
        //remove all items from patient combo box
        cmbPatientVitals.removeAllItems();
        
        if(account.getWorkQueue().
                getListOfWorkRequest().
                isEmpty())
        {
            
            //Error Prompt
            JOptionPane.
                    showMessageDialog(null, "No data of patient available yet.","warning", JOptionPane.WARNING_MESSAGE);
            return;    
        }
        
    //HashSet to store set of unique values
    HashSet<String> hashVal = new HashSet<>(); 
      
    //for loop of request to loop through list of work request
    for(WorkRequest request : account.
            getWorkQueue().
            
            getListOfWorkRequest())
        {
        
            //fetch profile name of visitor
            String visitor = (String)request.
                    getSenderAccount().
                    getProfileName();
            
            //add visitor to hashset
            hashVal.
                    add(visitor);
        
        }
    
    
        //for loop to iterate through hashset of string values
        for(String str : hashVal)
        {
            for(WorkRequest request : account.getWorkQueue().getListOfWorkRequest())
            {
                //username fetched
                String name = (String)request.
                        getSenderAccount().
                        getProfileName();
                
                if(name.equals(str))
                {
                    //add item to combo box
                    cmbPatientVitals.addItem(patient);
                }
            }    
        
        }
      
       }
    
        //Function to populate table
    public void populateTable()
            
    {
        //table Model creeated 
        DefaultTableModel tableModel =(DefaultTableModel) tblVitals.
                getModel();
        
        //table model row count set to 0
        tableModel.
                setRowCount(0);
        
        //for loop to iterate through list of work request
        for(WorkRequest request : account.
                getWorkQueue().
                getListOfWorkRequest())
        {
            if (!(request instanceof LabWorkReq) && !(request instanceof DonorWorkReq) && !(request instanceof ManagementWorkReq))
           {
               
        //docWorkReq object request
        docWorkReq = (DocWorkReq)request;
        
        //set text of message
        txtAreaPatientProb.
                setText(docWorkReq.
                getMessage());
        
        //For loop to iterate through list of vital signs
        for (VitalSign vitalSign : docWorkReq.
                getVitalSignList())
        {
            Object row[]= new Object[2];
            
            row[0]=vitalSign;
            
            row[1]=vitalSign.
                    getTimeStamp();
            
            //row added into model after every iteration
            tableModel.addRow(row);
        }
           }
        }
        
                 
    }
    
    public void populateRequestTable()
        
        {
        //tableModel object created
        DefaultTableModel tableModel = (DefaultTableModel) tblWorkRequest.
                getModel();
        
        //table Model row count set to 0
        tableModel.setRowCount(0);
        for (WorkRequest request : account.
                getWorkQueue().
                getListOfWorkRequest())
        {
            
            if (!(request instanceof LabWorkReq) && !(request instanceof DonorWorkReq) && !(request instanceof ManagementWorkReq))
                
           {
               
                Object[] row = new Object[4];
                
                row[0] = request;
                
                row[1] = request.
                    getSenderAccount();
                
                row[2] = request.
                        getReceiverAccount() == null ? null : request.
                                getReceiverAccount().
                                getEmployee().
                                getName();
                
                row[3] = request.
                        getStatus();
            
                //row added to table Model after every iteration
                tableModel.addRow(row);
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

        btnTestReq = new javax.swing.JButton();
        cmbPatientVitals = new javax.swing.JComboBox();
        btnFetchVitals = new javax.swing.JButton();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtHeartRate = new javax.swing.JTextField();
        lblHeartRate = new javax.swing.JLabel();
        lblVitalSigns = new javax.swing.JLabel();
        lblPatientProb = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaPatientProb = new javax.swing.JTextArea();
        lblPrescription = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaPrescription = new javax.swing.JTextArea();
        btnSendReview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVitals = new javax.swing.JTable();
        btnViewVitals = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        lblLabResults = new javax.swing.JLabel();
        txtLabResults = new javax.swing.JTextField();
        btnLabResult = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTestReq.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnTestReq.setText("Request Lab Test");
        btnTestReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestReqActionPerformed(evt);
            }
        });
        add(btnTestReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 190, 40));

        cmbPatientVitals.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cmbPatientVitals.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbPatientVitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 179, 40));

        btnFetchVitals.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnFetchVitals.setText("Get Vital Signs Data");
        btnFetchVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchVitalsActionPerformed(evt);
            }
        });
        add(btnFetchVitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 190, 30));

        txtWeight.setEditable(false);
        txtWeight.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, -1));

        lblWeight.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblWeight.setText("WEIGHT:");
        add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        txtPulse.setEditable(false);
        txtPulse.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, -1));

        lblPulse.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPulse.setText("PULSE:");
        add(lblPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtBloodPressure.setEditable(false);
        txtBloodPressure.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 90, -1));

        lblBloodPressure.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblBloodPressure.setText("BLOOD PRESURE:");
        add(lblBloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txtHeartRate.setEditable(false);
        txtHeartRate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        add(txtHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 90, -1));

        lblHeartRate.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblHeartRate.setText("HEART RATE:");
        add(lblHeartRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        lblVitalSigns.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lblVitalSigns.setText("Vital Signs");
        add(lblVitalSigns, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        lblPatientProb.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPatientProb.setText("PROBLEMS OF PATIENT:");
        add(lblPatientProb, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, -1, 38));

        txtAreaPatientProb.setColumns(20);
        txtAreaPatientProb.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAreaPatientProb.setRows(5);
        jScrollPane3.setViewportView(txtAreaPatientProb);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 180, 90));

        lblPrescription.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblPrescription.setText("Prescription:");
        add(lblPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 110, 70));

        txtAreaPrescription.setColumns(20);
        txtAreaPrescription.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtAreaPrescription.setRows(5);
        jScrollPane4.setViewportView(txtAreaPrescription);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 400, 180, 80));

        btnSendReview.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnSendReview.setText("Send Review to Patient");
        btnSendReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReviewActionPerformed(evt);
            }
        });
        add(btnSendReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 720, 230, 40));

        tblVitals.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tblVitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BLOOD PRESSURE", "DATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVitals);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 151));

        btnViewVitals.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnViewVitals.setText("View Vital Signs");
        btnViewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalsActionPerformed(evt);
            }
        });
        add(btnViewVitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 190, 30));

        tblWorkRequest.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MESSAGE", "SENDER", "RECEIVER", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblWorkRequest);
        if (tblWorkRequest.getColumnModel().getColumnCount() > 0) {
            tblWorkRequest.getColumnModel().getColumn(0).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(1).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(2).setResizable(false);
            tblWorkRequest.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 450, 150));

        lblLabResults.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lblLabResults.setText("Lab Results:");
        add(lblLabResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 170, 30));

        txtLabResults.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        txtLabResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabResultsActionPerformed(evt);
            }
        });
        add(txtLabResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 580, 180, 80));

        btnLabResult.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnLabResult.setText("Lab Result");
        btnLabResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabResultActionPerformed(evt);
            }
        });
        add(btnLabResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 720, 150, 40));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Double Left_100px.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 830, 60, 40));

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background-emergency_1378x910.jpeg"))); // NOI18N
        add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 910));
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestReqActionPerformed

        //CardLayout object created
        CardLayout cardLayout = (CardLayout) container.
                getLayout();
        
        //New RequestLabTestJPanel object created
        RequestLabTestJPanel rltJPanel = new RequestLabTestJPanel(container, account, org,enterprise);
        
        //container added to panel 
        container.add("RequestLabTestJPanel", rltJPanel);
        //next cardlayout loaded
        cardLayout.next(container);
    }//GEN-LAST:event_btnTestReqActionPerformed

    private void btnFetchVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchVitalsActionPerformed
        
        if(cmbPatientVitals.getSelectedIndex()<0)
            
        {
            //Error message prompt
            JOptionPane.
                    showMessageDialog(null, "Please Select a Patient to continue!","warning", JOptionPane.
                            WARNING_MESSAGE);
            return;
        }
        
        //patient object to refer to selected item in patient combo box
        Patient visitor = (Patient)cmbPatientVitals.
                getSelectedItem();
        
        //refresh table
        populateTable();


        

    }//GEN-LAST:event_btnFetchVitalsActionPerformed

    private void btnSendReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReviewActionPerformed
        // TODO add your handling code here:
        try
        {
            //set diagnosis, resukt
            docWorkReq.
                    setDiagnosis(txtAreaPrescription.getText());
            
            //set account of receiver of medication
            docWorkReq.
                    setReceiverAccount(account);
            
            //set status of request
            docWorkReq.
                    setStatus("Completed");
            
            //Update prompt
            JOptionPane.
                    showMessageDialog(null, "Prescription sent to patient","Success", JOptionPane.PLAIN_MESSAGE);
            
            //set text as empty
            txtAreaPrescription.setText("");
        }
        
        //Catch exception
        catch(Exception e)
        {
            //Error prompt
            JOptionPane.
                    showMessageDialog(null, "Prescription format is invalid","Success", JOptionPane.PLAIN_MESSAGE);
        }
        
        //refresh request table
        populateRequestTable();
    }//GEN-LAST:event_btnSendReviewActionPerformed

    private void btnViewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalsActionPerformed
        // TODO add your handling code here:
        
        //inteher value to represent selected row from table
        int selectedRow = tblVitals.
                getSelectedRow();

        //if the value is greater than 0, row is selected
        if (selectedRow>=0)
        {
            //VitalSign object to refer to selected row
            VitalSign vitalSign=(VitalSign)tblVitals.getValueAt(selectedRow, 0);
            
            //set text of weight
            txtWeight.setText(String.valueOf(vitalSign.getWeight()));
            
             //set text of pulse
            txtPulse.setText(String.valueOf(vitalSign.getPulse()));
            
            //set text of heartrate
            txtHeartRate.setText(String.valueOf(vitalSign.getHeartRate()));
            
            //set text of blood pressure
            txtBloodPressure.setText(String.valueOf(vitalSign.getBloodPressure()));
            
           
            
            
        }
        else
        {
            //Error prompt
            JOptionPane.
                    showMessageDialog(null,"Please select any row to continue...");
        }
    }//GEN-LAST:event_btnViewVitalsActionPerformed

    private void txtLabResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabResultsActionPerformed

    private void btnLabResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabResultActionPerformed
        // TODO add your handling code here:
        
        //Iterate through list of work request
        for (WorkRequest wr : account.
                getWorkQueue().
                getListOfWorkRequest())
            
        {
            
            if (!(wr instanceof DocWorkReq) && !(wr instanceof DonorWorkReq) && !(wr instanceof ManagementWorkReq))
                
           {
               //store result in string result
               String result = ((LabWorkReq) wr).
                       getResult();
               
               if(result==null)
                {
                    //set text to prompt user to wait for lab response
                    txtLabResults.
                    setText("Waiting fo Lab to respond");
                }
            else
            {
                //set result as text to prompt user
                txtLabResults.setText(result);
            }
        }
            
        }

    }//GEN-LAST:event_btnLabResultActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        //remove container
        container.remove(this);
        
        //cardLayout object created
        CardLayout cardLayout = (CardLayout)container.
                getLayout();
        
        //previous layout loaded
        cardLayout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFetchVitals;
    private javax.swing.JButton btnLabResult;
    private javax.swing.JButton btnSendReview;
    private javax.swing.JButton btnTestReq;
    private javax.swing.JButton btnViewVitals;
    private javax.swing.JComboBox cmbPatientVitals;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLabResults;
    private javax.swing.JLabel lblPatientProb;
    private javax.swing.JLabel lblPrescription;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblVitalSigns;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTable tblVitals;
    private javax.swing.JTable tblWorkRequest;
    private javax.swing.JTextArea txtAreaPatientProb;
    private javax.swing.JTextArea txtAreaPrescription;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtLabResults;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
