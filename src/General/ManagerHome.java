package General;

import Utilities.UserRegistrationInfo;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ManagerHome extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
      
    public ManagerHome(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        
        if (userID.equals("admin")){
            mgrHomeHeader.setText("ADMIN HOME");
        } else {
            mgrHomeHeader.setText("MANAGER HOME");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mgrLogoutBtn = new javax.swing.JButton();
        mgrAccountApprovalBtn = new javax.swing.JButton();
        mgrFeedbackBtn = new javax.swing.JButton();
        mgrSalesReportBtn = new javax.swing.JButton();
        mgrProfileBtn = new javax.swing.JButton();
        mgrManageOrderBtn = new javax.swing.JButton();
        mgrOrderHistoryBtn = new javax.swing.JButton();
        mgrUpdateMenuBtn = new javax.swing.JButton();
        mgrHomeHeader = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        userDisplayLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setForeground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mgrLogoutBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        mgrLogoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrLogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        mgrLogoutBtn.setText("LOGOUT");
        mgrLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrLogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrLogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 630, 137, 40));

        mgrAccountApprovalBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrAccountApprovalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verify users.png"))); // NOI18N
        mgrAccountApprovalBtn.setText("Account Approval");
        mgrAccountApprovalBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrAccountApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrAccountApprovalBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrAccountApprovalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, -1, 83));

        mgrFeedbackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrFeedbackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view edit delete product.png"))); // NOI18N
        mgrFeedbackBtn.setText("Feedback");
        mgrFeedbackBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrFeedbackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrFeedbackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 221, 83));

        mgrSalesReportBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrSalesReportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/generate bill & print.png"))); // NOI18N
        mgrSalesReportBtn.setText("Sales Report");
        mgrSalesReportBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrSalesReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrSalesReportBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrSalesReportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 242, 83));

        mgrProfileBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrProfileBtn.setText("Profile");
        mgrProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrProfileBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 221, 83));

        mgrManageOrderBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrManageOrderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/place order.png"))); // NOI18N
        mgrManageOrderBtn.setText("Manage Order");
        mgrManageOrderBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrManageOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrManageOrderBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrManageOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 221, 83));

        mgrOrderHistoryBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrOrderHistoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View Bills & Order Placed Details.png"))); // NOI18N
        mgrOrderHistoryBtn.setText("Order History");
        mgrOrderHistoryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mgrOrderHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrOrderHistoryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrOrderHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 242, 83));

        mgrUpdateMenuBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrUpdateMenuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/new product.png"))); // NOI18N
        mgrUpdateMenuBtn.setText("Update Menu");
        mgrUpdateMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrUpdateMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrUpdateMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 221, 83));

        mgrHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrHomeHeader.setForeground(new java.awt.Color(255, 0, 0));
        mgrHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrHomeHeader.setText("MANAGER HOME");
        mgrHomeHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        mgrHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mgrHomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 28, 637, 140));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 120, 70));

        userDisplayLabel1.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel1.setForeground(new java.awt.Color(255, 255, 255));
        userDisplayLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel1.setText("USER ID");
        jPanel1.add(userDisplayLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrLogoutBtnActionPerformed
        WelcomePage mgrLogout = new WelcomePage();
        mgrLogout.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Welcome page.");
    }//GEN-LAST:event_mgrLogoutBtnActionPerformed

    private void mgrFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrFeedbackBtnActionPerformed
        ManagerFeedback mgrFeedback = new ManagerFeedback(mgr.getUserID(), mgr.getUserPassword());
        mgrFeedback.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Feedback page.");
    }//GEN-LAST:event_mgrFeedbackBtnActionPerformed

    private void mgrUpdateMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrUpdateMenuBtnActionPerformed
        ManagerMenu mgrMenu = new ManagerMenu(mgr.getUserID(), mgr.getUserPassword());
        mgrMenu.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Menu page.");
    }//GEN-LAST:event_mgrUpdateMenuBtnActionPerformed

    private void mgrOrderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrOrderHistoryBtnActionPerformed
        ManagerOrderHistory mgrOrderHistory = new ManagerOrderHistory(mgr.getUserID(), mgr.getUserPassword());
        mgrOrderHistory.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Order History page.");
    }//GEN-LAST:event_mgrOrderHistoryBtnActionPerformed

    private void mgrProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrProfileBtnActionPerformed
        ManagerProfile mgrProfile = new ManagerProfile(mgr.getUserID(), mgr.getUserPassword());
        mgrProfile.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Profile page.");
    }//GEN-LAST:event_mgrProfileBtnActionPerformed

    private void mgrSalesReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrSalesReportBtnActionPerformed
        ManagerSalesReport mgrSalesReport;
        try {
            mgrSalesReport = new ManagerSalesReport(mgr.getUserID(), mgr.getUserPassword());
            mgrSalesReport.setVisible(true);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Sales Report page.");
    }//GEN-LAST:event_mgrSalesReportBtnActionPerformed

    private void mgrManageOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrManageOrderBtnActionPerformed
        ManagerManageOrder mgrManageOrder = new ManagerManageOrder(mgr.getUserID(), mgr.getUserPassword());
        mgrManageOrder.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Manage Order page.");
    }//GEN-LAST:event_mgrManageOrderBtnActionPerformed

    private void mgrAccountApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrAccountApprovalBtnActionPerformed
        if (mgr.getUserID().equals("admin")){    
            ManagerApproval mgrApproval = new ManagerApproval(mgr.getUserID(),mgr.getUserPassword());
            mgrApproval.setVisible(true);
            this.dispose();
            System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Account Approval page.");
        } else {
            System.out.println("Manager " + mgr.getUserID() + " that did not have admin level access has attempted to view Manager Account Approval page.");
            JOptionPane.showMessageDialog(null, "Page requires admin level access.");
        }
    }//GEN-LAST:event_mgrAccountApprovalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrAccountApprovalBtn;
    private javax.swing.JButton mgrFeedbackBtn;
    private javax.swing.JLabel mgrHomeHeader;
    private javax.swing.JButton mgrLogoutBtn;
    private javax.swing.JButton mgrManageOrderBtn;
    private javax.swing.JButton mgrOrderHistoryBtn;
    private javax.swing.JButton mgrProfileBtn;
    private javax.swing.JButton mgrSalesReportBtn;
    private javax.swing.JButton mgrUpdateMenuBtn;
    private javax.swing.JLabel userDisplayLabel1;
    private javax.swing.JLabel userIDTF;
    // End of variables declaration//GEN-END:variables
}
