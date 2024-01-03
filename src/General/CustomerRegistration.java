package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import Utilities.PasswordHashing;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CustomerRegistration extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
    PasswordHashing password = new PasswordHashing();
       
    public CustomerRegistration() {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        custIDLabel = new javax.swing.JLabel();
        custIDField = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        custNameField = new javax.swing.JTextField();
        custPasswordLabel = new javax.swing.JLabel();
        custPasswordField = new javax.swing.JPasswordField();
        custEmailLabel = new javax.swing.JLabel();
        custEmailField = new javax.swing.JTextField();
        custRegisterBtn = new javax.swing.JButton();
        custClearBtn = new javax.swing.JButton();
        custBackBtn = new javax.swing.JButton();
        custHomeHeader2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        custIDLabel.setText("Customer ID:");
        getContentPane().add(custIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, 31));

        custIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        custIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDFieldActionPerformed(evt);
            }
        });
        getContentPane().add(custIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 350, 36));

        custNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        custNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        custNameLabel.setText("Customer Name:");
        getContentPane().add(custNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, 31));

        custNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        custNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(custNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 350, 36));

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        custPasswordLabel.setText("Password:");
        getContentPane().add(custPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, 31));

        custPasswordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        custPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        custPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custPasswordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(custPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 350, 36));

        custEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        custEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        custEmailLabel.setText("Email:");
        getContentPane().add(custEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, 31));

        custEmailField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        custEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custEmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(custEmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 360, 36));

        custRegisterBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custRegisterBtn.setForeground(new java.awt.Color(255, 0, 0));
        custRegisterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verify users.png"))); // NOI18N
        custRegisterBtn.setText("REGISTER");
        custRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRegisterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(custRegisterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        custClearBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custClearBtn.setForeground(new java.awt.Color(255, 0, 51));
        custClearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clear.png"))); // NOI18N
        custClearBtn.setText("CLEAR");
        custClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custClearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(custClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, 40));

        custBackBtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        custBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, -1, 40));

        custHomeHeader2.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader2.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader2.setText("CUSTOMER REGISTRATION");
        custHomeHeader2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(custHomeHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 713, 191));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custPasswordFieldActionPerformed
  
    }//GEN-LAST:event_custPasswordFieldActionPerformed

    private void custEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custEmailFieldActionPerformed
  
    }//GEN-LAST:event_custEmailFieldActionPerformed

    private void custIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDFieldActionPerformed
   
    }//GEN-LAST:event_custIDFieldActionPerformed

    //Clears the text fields to null upon click
    private void custClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custClearBtnActionPerformed
        custIDField.setText(null);
        custNameField.setText(null);
        custPasswordField.setText(null);
        custEmailField.setText(null);
        System.out.println("A user has cleared the fields in Customer Registration page.");
    }//GEN-LAST:event_custClearBtnActionPerformed

    private void custNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameFieldActionPerformed
 
    }//GEN-LAST:event_custNameFieldActionPerformed

    private void custRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRegisterBtnActionPerformed
        
        //Converts UserID and UserName to UpperCase
        cust.setUserID(custIDField.getText().toUpperCase());
        cust.setUserName(custNameField.getText().toUpperCase());
        try {
            cust.setUserPassword(password.toHexString(
                    password.getSHA(String.valueOf(custPasswordField.getPassword()))));
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Exception occurred - " + e.toString());
        }
        cust.setUserEmail(custEmailField.getText());

        // Setting the default balance among users
        String custRegCredentials = cust.concatenateCredentials() + "|50.0";
            
        //Create FileHandling object and file object to store data into the the customer account text file
        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");
        
        try {
            //If any of the text fields are blank then an error message is shown
            if (cust.getUserID().equals("")||cust.getUserName().equals("")||
                cust.getUserPassword().equals("")||cust.getUserEmail().equals("")){
                    System.err.println("A user did not enter all data fields.");
                    JOptionPane.showMessageDialog(null, "Error: Please fill out all text fields.");
            }
            
            //If any the Customer ID is not exactly 9 characters or contains "TP", an error message is shown
            else if (!(cust.getUserID().substring(0,2).equals("TP") && cust.getUserID().length()==8)){
                System.err.println("A user entered an invalid Customer ID.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid Customer ID.");
            }
            
            // If the Cusotmer ID exists within the text file, an error message will be shown
            else if (!"NA".equals(custFile.locateItemInFile(cust.getUserID(), file, 0))){
                System.err.println("A user entered an existing Customer ID.");
                JOptionPane.showMessageDialog(null, "Error: Customer ID already exists.");
            }
            
            // If the Customer Password does not meet the set range
            else if (custPasswordField.getText().length() < 6 || custPasswordField.getText().length() > 20){
                System.err.println("A user entered an invalid password.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a password \nbetween 6 and 20 characters in length.");
            }

            //If the user entered an invalid email format, an error message will be shown
            else if(validateCustomerEmail(cust.getUserEmail()) == false){
                System.err.println("A user entered an invalid email format.");
                JOptionPane.showMessageDialog(null, "Error: Please enter a valid email address.");
            }

            //If the user entered an existing email within the text file, an error message will be shown
            else if (!"NA".equals(custFile.locateItemInFile(cust.getUserEmail(), file, 3))){
                System.err.println("A user entered an existing Email.");
                JOptionPane.showMessageDialog(null, "Error: Customer Email already exists.");
            }
            
            //If all the other conditions are met then the user will be registered successfully
            else {
                custFile.appendToFile(custRegCredentials, file);
                JOptionPane.showMessageDialog(null, "Registration successful!");
                System.out.println("User " + cust.getUserID() + " has been registered successfully.");
                WelcomePage custBack = new WelcomePage();
                custBack.setVisible(true);
                this.dispose();
                System.out.println("User " + custIDField.getText().toUpperCase() + " has attempted to view Welcome page.");
            }
            
        } catch (IOException e) {
            System.out.println("Exception occurred - " + e.toString());
        }        
    }//GEN-LAST:event_custRegisterBtnActionPerformed

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        WelcomePage custBack = new WelcomePage();
        custBack.setVisible(true);
        this.dispose();
        System.out.println("A user has attempted to view Welcome page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    public static boolean validateCustomerEmail(String userEmail){
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher emailMatcher = emailPattern.matcher(userEmail);
        
        return emailMatcher.find();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custBackBtn;
    private javax.swing.JButton custClearBtn;
    private javax.swing.JTextField custEmailField;
    private javax.swing.JLabel custEmailLabel;
    private javax.swing.JLabel custHomeHeader2;
    private javax.swing.JTextField custIDField;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JTextField custNameField;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JPasswordField custPasswordField;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JButton custRegisterBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
