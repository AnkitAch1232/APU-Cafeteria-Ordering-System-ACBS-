package General;

import javax.swing.JFrame;


public class WelcomePage extends javax.swing.JFrame {

    
    public WelcomePage() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        WelcomePanel = new javax.swing.JPanel();
        customerHeading = new javax.swing.JLabel();
        custRegOption = new javax.swing.JButton();
        custLoginOption = new javax.swing.JButton();
        managerHeading = new javax.swing.JLabel();
        mgrRegOption = new javax.swing.JButton();
        mgrLoginOption = new javax.swing.JButton();
        customerHeading1 = new javax.swing.JLabel();
        custHomeHeader1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WelcomePanel.setBackground(new java.awt.Color(244, 244, 244));
        WelcomePanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        WelcomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customerHeading.setBackground(new java.awt.Color(51, 0, 0));
        customerHeading.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        customerHeading.setForeground(new java.awt.Color(255, 255, 255));
        customerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerHeading.setText("CUSTOMER");
        customerHeading.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        WelcomePanel.add(customerHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 206, 76));

        custRegOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        custRegOption.setForeground(new java.awt.Color(255, 0, 0));
        custRegOption.setText("REGISTER");
        custRegOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRegOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(custRegOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 290, 76));

        custLoginOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        custLoginOption.setForeground(new java.awt.Color(255, 0, 0));
        custLoginOption.setText("LOGIN");
        custLoginOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLoginOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(custLoginOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 300, 75));

        managerHeading.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        managerHeading.setForeground(new java.awt.Color(255, 255, 255));
        managerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managerHeading.setText("MANAGER");
        managerHeading.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        WelcomePanel.add(managerHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 251, 76));

        mgrRegOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        mgrRegOption.setForeground(new java.awt.Color(255, 0, 0));
        mgrRegOption.setText("REGISTER");
        mgrRegOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrRegOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(mgrRegOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 330, 76));

        mgrLoginOption.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        mgrLoginOption.setForeground(new java.awt.Color(255, 0, 0));
        mgrLoginOption.setText("LOGIN");
        mgrLoginOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrLoginOptionActionPerformed(evt);
            }
        });
        WelcomePanel.add(mgrLoginOption, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 330, 76));

        customerHeading1.setBackground(new java.awt.Color(51, 0, 0));
        customerHeading1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        customerHeading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerHeading1.setText("CUSTOMER");
        customerHeading1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        WelcomePanel.add(customerHeading1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 206, 76));

        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("NIRANJAN AND NISCHAL CAFETERIA SYSTEM");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        WelcomePanel.add(custHomeHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 17, 1140, 136));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        WelcomePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WelcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WelcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custRegOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRegOptionActionPerformed
        CustomerRegistration custRegister = new CustomerRegistration();
        custRegister.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Customer Registration page.");
    }//GEN-LAST:event_custRegOptionActionPerformed

    private void custLoginOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLoginOptionActionPerformed
        CustomerLogin custLogin = new CustomerLogin();
        custLogin.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Customer Login page.");
    }//GEN-LAST:event_custLoginOptionActionPerformed

    private void mgrRegOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrRegOptionActionPerformed
        ManagerRegistration mgrRegister = new ManagerRegistration();
        mgrRegister.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Manager Registration page.");
    }//GEN-LAST:event_mgrRegOptionActionPerformed

    private void mgrLoginOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrLoginOptionActionPerformed
        ManagerLogin mgrLogin = new ManagerLogin();
        mgrLogin.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Manager Login page.");
    }//GEN-LAST:event_mgrLoginOptionActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel WelcomePanel;
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JButton custLoginOption;
    private javax.swing.JButton custRegOption;
    private javax.swing.JLabel customerHeading;
    private javax.swing.JLabel customerHeading1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel managerHeading;
    private javax.swing.JButton mgrLoginOption;
    private javax.swing.JButton mgrRegOption;
    // End of variables declaration//GEN-END:variables
}
