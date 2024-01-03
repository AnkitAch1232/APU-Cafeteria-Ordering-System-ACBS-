package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;


public class ManagerApproval extends javax.swing.JFrame {
    
    UserRegistrationInfo mgr = new UserRegistrationInfo();
    FileHandling fh  = new FileHandling();
    private final String MGRACCFILE = "mgrAccount.txt";
   
    public ManagerApproval(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        loadManagerTable();
    }
    
    //Used to load the mannager accounts table
    private void loadManagerTable() {
        //Creating object for the JTable
        DefaultTableModel mgrApprovalTableModel = (DefaultTableModel) mgrApprovalTable.getModel();
        mgrApprovalTableModel.setRowCount(0); //Setting the row count back to 0
        File file = new File(MGRACCFILE);
        
        try {
            String line;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try{
                while((line = br.readLine()) != null){  
                    
                    //Splits the line into multiple sections
                    String data[] = line.split("\\|");     
                    //Adds each line into the table row by row
                    mgrApprovalTableModel.addRow(new Object[] {data[0], data[1], data[3], data[4]});
                }
                br.close();
            } catch (IOException e) {
                System.err.println("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
            }            
        }catch (FileNotFoundException e){
            System.err.println("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        custHomeHeader = new javax.swing.JLabel();
        mgrApprovalBtn = new javax.swing.JButton();
        mgrRejectBtn = new javax.swing.JButton();
        mgrBackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mgrApprovalTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 53)); // NOI18N
        custHomeHeader.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader.setText("MANAGER APPROVAL");
        custHomeHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 51, 956, 98));

        mgrApprovalBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrApprovalBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrApprovalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verify users.png"))); // NOI18N
        mgrApprovalBtn.setText("APPROVE");
        mgrApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrApprovalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrApprovalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 287, -1, 70));

        mgrRejectBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrRejectBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrRejectBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close.png"))); // NOI18N
        mgrRejectBtn.setText("REJECT");
        mgrRejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrRejectBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrRejectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 392, 191, 70));

        mgrBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 502, 199, 70));

        mgrApprovalTable.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        mgrApprovalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manager ID", "Name", "Email", "Approval Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(mgrApprovalTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 227, 845, 443));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        ManagerHome mgrBack = new ManagerHome(mgr.getUserID(), mgr.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
    }//GEN-LAST:event_mgrBackBtnActionPerformed

    //Removes managers credentials from both the table and the text file
    private void mgrRejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrRejectBtnActionPerformed
        DefaultTableModel mgrApprovalTableModel = (DefaultTableModel) mgrApprovalTable.getModel();
        String managerID;
        
        if (mgrApprovalTable.getSelectedRowCount() >= 1) {
            
            // Uses the selected row from the table and stores it in a variable
            managerID = mgrApprovalTableModel.getValueAt(mgrApprovalTable.getSelectedRow(),0).toString();
            File file = new File(MGRACCFILE);

            // Removes the selected row from the file entirely
            fh.removeLine(file, 0, managerID);

            // Loads the manager table again
            loadManagerTable();
        
            JOptionPane.showMessageDialog(null, "Manager " + managerID + " has been rejected successfully.");
            System.out.println("Manager " + mgr.getUserID() + " has rejected Manager " + managerID + ".");
            
        } else if (mgrApprovalTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            JOptionPane.showMessageDialog(null, "No row is selected for rejection!");
        }
        
    }//GEN-LAST:event_mgrRejectBtnActionPerformed

    //Edits the managers approval status to "APPROVED"
    private void mgrApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrApprovalBtnActionPerformed
        DefaultTableModel mgrApprovalTableModel = (DefaultTableModel) mgrApprovalTable.getModel();
        String managerID;
        if (mgrApprovalTable.getSelectedRowCount() >= 1) {
            
           // Uses the selected row from the table and stores it in a variable
            managerID = mgrApprovalTableModel.getValueAt(mgrApprovalTable.getSelectedRow(),0).toString();
            File file = new File(MGRACCFILE);

            // Rewrites the contents of the file with the new editted line for the manager to be "APPROVED"
            fh.rewriteContent(file, 0, managerID, "APPROVED");

            // Loads the manager table again
            loadManagerTable();
        
            JOptionPane.showMessageDialog(null, "Manager " + managerID + " has been approved successfully.");
            System.out.println("Manager " + mgr.getUserID() + " has approved Manager " + managerID + ".");
            
        } else if (mgrApprovalTable.getRowCount() == 0){
            JOptionPane.showMessageDialog(null, "Table is empty!");
        } else {
            JOptionPane.showMessageDialog(null, "No row is selected for approval!");
        }
        
    }//GEN-LAST:event_mgrApprovalBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custHomeHeader;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mgrApprovalBtn;
    private javax.swing.JTable mgrApprovalTable;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrRejectBtn;
    // End of variables declaration//GEN-END:variables
}
