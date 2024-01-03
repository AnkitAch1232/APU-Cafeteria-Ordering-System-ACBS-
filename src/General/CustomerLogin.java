package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import Utilities.PasswordHashing;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomerLogin extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
   
    
    public CustomerLogin() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        custLoginHeader = new javax.swing.JLabel();
        custIDField = new javax.swing.JTextField();
        custPasswordField = new javax.swing.JPasswordField();
        custIDLabel = new javax.swing.JLabel();
        custPasswordLabel = new javax.swing.JLabel();
        custBackBtn = new javax.swing.JButton();
        custClearBtn = new javax.swing.JButton();
        custLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 244, 244));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custLoginHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custLoginHeader.setForeground(new java.awt.Color(255, 0, 0));
        custLoginHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custLoginHeader.setText("CUSTOMER LOGIN");
        custLoginHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custLoginHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custLoginHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 1055, 171));

        custIDField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(custIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 410, 54));

        custPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPasswordFieldActionPerformed(evt);
            }
        });
        custPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                custPasswordFieldKeyPressed(evt);
            }
        });
        jPanel1.add(custPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 410, 54));

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        custIDLabel.setText("Customer ID:");
        jPanel1.add(custIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, 31));

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        custPasswordLabel.setText("Password:");
        jPanel1.add(custPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, 31));

        custBackBtn.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 51, 0));
        custBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 120, 50));

        custClearBtn.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        custClearBtn.setForeground(new java.awt.Color(255, 0, 0));
        custClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        custClearBtn.setText("CLEAR");
        custClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custClearBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 110, 50));

        custLoginBtn.setFont(new java.awt.Font("sansserif", 1, 10)); // NOI18N
        custLoginBtn.setForeground(new java.awt.Color(255, 0, 0));
        custLoginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
        custLoginBtn.setText("LOGIN");
        custLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custLoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 120, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, 880));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custClearBtnActionPerformed
        custIDField.setText(null);
        custPasswordField.setText(null);
        System.out.println("A user has cleared the fields in Customer Login page.");
    }//GEN-LAST:event_custClearBtnActionPerformed

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Welcome page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    //Gets the user ID and password from the text fields and converts the password to SHA-256 format
    private void custLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLoginBtnActionPerformed
        cust.setUserID(custIDField.getText());
        try {
            cust.setUserPassword(password.toHexString(password.getSHA(String.valueOf(custPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Exception occurred - " + e.toString());
        }

        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");

        try {

            //The customer file is first checked if the user ID is present and the if the account is set to APPROVED
            if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){

                //Next, if the password is equivalent to the password within the same line it will log the user in
                if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), cust.getUserPassword(), file, 0,2))){
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    CustomerHome custLogin = new CustomerHome(cust.getUserID(), String.valueOf(custPasswordField.getPassword()));
                    custLogin.setVisible(true);
                    this.dispose();
                    System.out.println("User " + cust.getUserID() + " has logged in successfully.");
                }

                //If the password does not match the user ID or password, then the user won't be logged in and an error message is shown
                else{
                    JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                    System.err.println("A user has failed to login with an incorrect ID or Password.");
                }
            }
            //If the customer ID is not found in the manager text file then it will show an error
            else{
                JOptionPane.showMessageDialog(null, "Error: Customer ID does not exist.");
                System.err.println("A user has typed in a Customer ID that does not exist.");
            }
        } catch (IOException e) {
            System.err.println("Exception occurred - " + e.toString());
        }
    }//GEN-LAST:event_custLoginBtnActionPerformed

    private void custIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDFieldActionPerformed

    }//GEN-LAST:event_custIDFieldActionPerformed

    private void custPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_custPasswordFieldKeyPressed

        //Code is identical to the login button above with one added feature of pressing the Enter key to log in
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            cust.setUserID(custIDField.getText());
            try {
                cust.setUserPassword(password.toHexString(password.getSHA(String.valueOf(custPasswordField.getPassword()))));
            } catch (NoSuchAlgorithmException e) {
                System.err.println("Exception occurred - " + e.toString());
            }

            FileHandling custFile = new FileHandling();
            File file = new File("custAccount.txt");

            try {
                if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){
                    if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), cust.getUserPassword(), file, 0,2))){
                        JOptionPane.showMessageDialog(null, "Login Successful");
                        CustomerHome custLogin = new CustomerHome(cust.getUserID(), String.valueOf(custPasswordField.getPassword()));
                        custLogin.setVisible(true);
                        this.dispose();
                        System.out.println("User " + cust.getUserID() + " has logged in successfully.");
                    }

                    else{
                        JOptionPane.showMessageDialog(null, "Error: Login Unsuccessful. Incorrect ID or Password.");
                        System.err.println("A user has failed to login with an incorrect ID or Password.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error: Customer ID does not exist.");
                    System.err.println("A user has typed in a Customer ID that does not exist.");
                }
            } catch (IOException e) {
                System.err.println("Exception occurred - " + e.toString());
            }
        }
    }//GEN-LAST:event_custPasswordFieldKeyPressed

    private void custPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPasswordFieldActionPerformed

    }//GEN-LAST:event_custPasswordFieldActionPerformed
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custBackBtn;
    private javax.swing.JButton custClearBtn;
    private javax.swing.JTextField custIDField;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JButton custLoginBtn;
    private javax.swing.JLabel custLoginHeader;
    private javax.swing.JPasswordField custPasswordField;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
