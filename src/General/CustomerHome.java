package General;

import Utilities.UserRegistrationInfo;
import javax.swing.JFrame;

public class CustomerHome extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
   
    
    
    public CustomerHome(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
          
        // Set the user ID
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        userIDTF.setText(userID);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        custHomeHeader = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        userDisplayLabel = new javax.swing.JLabel();
        custMenuBtn = new javax.swing.JButton();
        custProfileBtn = new javax.swing.JButton();
        custLogoutBtn = new javax.swing.JButton();
        custOrderHistoryBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custHomeHeader.setBackground(new java.awt.Color(204, 204, 255));
        custHomeHeader.setFont(new java.awt.Font("SF Pro Text", 1, 53)); // NOI18N
        custHomeHeader.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader.setText("Customer Home");
        custHomeHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 57, 820, 220));

        userIDTF.setBackground(new java.awt.Color(255, 255, 255));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(255, 255, 255));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 120, 70));

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(255, 0, 0));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        jPanel1.add(userDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 120, 40));

        custMenuBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custMenuBtn.setText("Menu");
        custMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custMenuBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custMenuBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 130, 70));

        custProfileBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custProfileBtn.setText("Profile");
        custProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custProfileBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 170, 60));

        custLogoutBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custLogoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        custLogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        custLogoutBtn.setText("LOGOUT");
        custLogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLogoutBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custLogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, 130, 40));

        custOrderHistoryBtn.setFont(new java.awt.Font("SF Pro Text", 1, 36)); // NOI18N
        custOrderHistoryBtn.setText("Order History");
        custOrderHistoryBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        custOrderHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custOrderHistoryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custOrderHistoryBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, 270, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -9, 1410, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1967, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void custLogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLogoutBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        System.out.println("User " + cust.getUserID() + " has logged out of the system.");
    }//GEN-LAST:event_custLogoutBtnActionPerformed

    private void custProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custProfileBtnActionPerformed
        CustomerProfile custProfile = new CustomerProfile(cust.getUserID(), String.valueOf(cust.getUserPassword()));
        custProfile.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_custProfileBtnActionPerformed

    private void custOrderHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custOrderHistoryBtnActionPerformed
        CustomerOrderHistory custOrderHistory = new CustomerOrderHistory(cust.getUserID(), cust.getUserPassword());
        custOrderHistory.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_custOrderHistoryBtnActionPerformed

    private void custMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custMenuBtnActionPerformed
        CustomerMenu custMenu = new CustomerMenu(cust.getUserID(), cust.getUserPassword());
        custMenu.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_custMenuBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custHomeHeader;
    private javax.swing.JButton custLogoutBtn;
    private javax.swing.JButton custMenuBtn;
    private javax.swing.JButton custOrderHistoryBtn;
    private javax.swing.JButton custProfileBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    // End of variables declaration//GEN-END:variables
}
