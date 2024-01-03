package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import Utilities.PasswordHashing;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManagerRegistration extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
    
    public ManagerRegistration() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mgrRegHeader = new javax.swing.JLabel();
        mgrRegisterBtn = new javax.swing.JButton();
        mgrClearBtn = new javax.swing.JButton();
        mgrBackBtn = new javax.swing.JButton();
        mgrEmailField = new javax.swing.JTextField();
        mgrEmailLabel = new javax.swing.JLabel();
        mgrPasswordField = new javax.swing.JPasswordField();
        mgrPasswordLabel = new javax.swing.JLabel();
        mgrNameField = new javax.swing.JTextField();
        mgrNameLabel = new javax.swing.JLabel();
        mgrIDField = new javax.swing.JTextField();
        mgrIDLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mgrRegHeader.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        mgrRegHeader.setForeground(new java.awt.Color(255, 0, 0));
        mgrRegHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mgrRegHeader.setText("MANAGER REGISTRATION");
        mgrRegHeader.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(mgrRegHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 29, 1067, 173));

        mgrRegisterBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        mgrRegisterBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrRegisterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verify users.png"))); // NOI18N
        mgrRegisterBtn.setText("REGISTER");
        mgrRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrRegisterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mgrRegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 600, -1, -1));

        mgrClearBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        mgrClearBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        mgrClearBtn.setText("CLEAR");
        mgrClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mgrClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, -1, -1));

        mgrBackBtn.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 600, -1, -1));

        mgrEmailField.setBackground(new java.awt.Color(244, 244, 244));
        mgrEmailField.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrEmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(mgrEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 324, 36));

        mgrEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        mgrEmailLabel.setText("Email:");
        getContentPane().add(mgrEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 500, -1, 31));

        mgrPasswordField.setBackground(new java.awt.Color(244, 244, 244));
        mgrPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(mgrPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, 324, 36));

        mgrPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        mgrPasswordLabel.setText("Password:");
        getContentPane().add(mgrPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, -1, 31));

        mgrNameField.setBackground(new java.awt.Color(244, 244, 244));
        mgrNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        getContentPane().add(mgrNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 324, 36));

        mgrNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        mgrNameLabel.setText("Manager Name:");
        getContentPane().add(mgrNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, 31));

        mgrIDField.setBackground(new java.awt.Color(244, 244, 244));
        mgrIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        mgrIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrIDFieldActionPerformed(evt);
            }
        });
        getContentPane().add(mgrIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 324, 36));

        mgrIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        mgrIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        mgrIDLabel.setText("Manager ID:");
        getContentPane().add(mgrIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrPasswordFieldActionPerformed

    }//GEN-LAST:event_mgrPasswordFieldActionPerformed

    private void mgrEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrEmailFieldActionPerformed

    }//GEN-LAST:event_mgrEmailFieldActionPerformed

    private void mgrIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrIDFieldActionPerformed

    }//GEN-LAST:event_mgrIDFieldActionPerformed

    private void mgrClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrClearBtnActionPerformed
        mgrIDField.setText(null);
        mgrNameField.setText(null);
        mgrPasswordField.setText(null);
        mgrEmailField.setText(null);
        System.out.println("A user has cleared the fields in Customer Registration page.");
    }//GEN-LAST:event_mgrClearBtnActionPerformed

    private void mgrRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrRegisterBtnActionPerformed
        
        //Converts UserID and UserName to UpperCase
        mgr.setUserID(mgrIDField.getText().toUpperCase());
        mgr.setUserName(mgrNameField.getText().toUpperCase());
        
        //Converts password into hash format of SHA-256
        try {
            mgr.setUserPassword(password.toHexString(password.getSHA(String.valueOf(mgrPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Exception occurred - " + e.toString());
        }
        mgr.setUserEmail(mgrEmailField.getText());
        
        //Stores contents string of credentials into variable to be appended into the file later
        String mgrRegCredentials = mgr.concatenateCredentials() + "|TO BE APPROVED";
        
        //Create FileHandling object and file object to store data into the the manager account text file    
        FileHandling mgrFile = new FileHandling();
        File file = new File("mgrAccount.txt");
        
        try {
            
            //If any of the text fields are blank then an error message is shown
            if (mgr.getUserID().equals("")||mgr.getUserName().equals("")||
                mgr.getUserPassword().equals("")||mgr.getUserEmail().equals("")){
                System.err.println("A user did not enter all data fields.");
                JOptionPane.showMessageDialog(null, "Error: All text fields must be filled out.");
            }
            
            //If any the Manager ID is not exactly 9 characters or contains "MGR" error message is shown
            else if (!(mgr.getUserID().substring(0,3).equals("MGR") && mgr.getUserID().length()==9)){
                System.err.println("A user entered an invalid Manager ID.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid Manager ID.");
            }
           
            // If the Manager ID exists within the text file, an error message will be shown
            else if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserID(), file, 0))){
                System.err.println("A user entered an existing Manager ID.");
                JOptionPane.showMessageDialog(null, "Error: Manager ID already exists.");
            }
            
            // If the Manager Password does not meet the set range
            else if (mgrPasswordField.getText().length() < 6 || mgrPasswordField.getText().length() > 20){
                System.err.println("A user entered an invalid password.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a password between 6 and 20 characters in length.");
            }
            
            //If the user entered an invalid email format, an error message will be shown
            else if(validateManagerEmail(mgr.getUserEmail()) == false){
                System.err.println("A user entered an invalid email format.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid email address.");
            }
            
            //If the user entered an existing email within the text file, an error message will be shown
            else if (!"NA".equals(mgrFile.locateItemInFile(mgr.getUserEmail(), file, 3))){
                System.err.println("A user entered an existing Email.");
                JOptionPane.showMessageDialog(null, "Error: Manager Email already exists.");
            }
            
            //If the user entered an invalid email format, an error message will be shown
            else if(validateManagerEmail(mgr.getUserEmail()) == false){
                System.err.println("A user entered an invalid email format.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid email address.");
            }
            
            //If all the other conditions are met then the user will be registered successfully
            else {
                mgrFile.appendToFile(mgrRegCredentials, file);
                JOptionPane.showMessageDialog(null, "Registration successful!");
                System.out.println("Manager " + mgr.getUserID() + " has been registered successfully.");
                WelcomePage mgrBack = new WelcomePage();
                mgrBack.setVisible(true);
                this.dispose();
                System.out.println("Manager " + mgrIDField.getText().toUpperCase() + " has attempted to view Welcome page.");
            }
            
        } catch (IOException e) {
            System.err.println("Exception occurred - " + e.toString());
        }
    }//GEN-LAST:event_mgrRegisterBtnActionPerformed

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        WelcomePage mgrBack = new WelcomePage();
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Welcome page.");
    }//GEN-LAST:event_mgrBackBtnActionPerformed
 
    public static boolean validateManagerEmail(String userEmail){
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher = emailPattern.matcher(userEmail);
       
        return emailMatcher.find();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrClearBtn;
    private javax.swing.JTextField mgrEmailField;
    private javax.swing.JLabel mgrEmailLabel;
    private javax.swing.JTextField mgrIDField;
    private javax.swing.JLabel mgrIDLabel;
    private javax.swing.JTextField mgrNameField;
    private javax.swing.JLabel mgrNameLabel;
    private javax.swing.JPasswordField mgrPasswordField;
    private javax.swing.JLabel mgrPasswordLabel;
    private javax.swing.JLabel mgrRegHeader;
    private javax.swing.JButton mgrRegisterBtn;
    // End of variables declaration//GEN-END:variables
}
