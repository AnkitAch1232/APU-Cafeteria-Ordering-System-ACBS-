package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomerProfile extends javax.swing.JFrame {

    UserRegistrationInfo cust = new UserRegistrationInfo();
       
    public CustomerProfile(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        
        //For Dispalying the Current Balance
        String line = "";
        FileHandling custFile = new FileHandling();
        File file = new File("custAccount.txt");
        try {
            line = custFile.locateItemInFile(cust.getUserID(), file, 0);
        } catch (IOException e) {
            System.err.println("Exception occurred - " + e.toString());
        }
        
        //Splits line into multiple sections
        String [] section = line.split("\\|");
        
        //Sets the customer credentials iwthin the text fields
        custID.setText(cust.getUserID());
        custName.setText(section[1]);
        custPassword.setText(cust.getUserPassword());
        custEmail.setText(section[3]);
        currentBalance.setText("Rs " + section[4]);
        
        //Ensures textfields cannot be edited
        custID.setEditable(false);
        custName.setEditable(false);
        custPassword.setEditable(false);
        custEmail.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        custBackBtn = new javax.swing.JButton();
        custHomeHeader2 = new javax.swing.JLabel();
        custIDLabel1 = new javax.swing.JLabel();
        custID = new javax.swing.JTextField();
        custNameLabel = new javax.swing.JLabel();
        custName = new javax.swing.JTextField();
        custPasswordLabel = new javax.swing.JLabel();
        custPassword = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        custEmailLabel = new javax.swing.JLabel();
        custEmail = new javax.swing.JTextField();
        currentBalance = new javax.swing.JLabel();
        custIDLabel = new javax.swing.JLabel();
        mgrTopUpBtn = new javax.swing.JButton();
        topUpInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setForeground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        custBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1021, 650, -1, 47));

        custHomeHeader2.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader2.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader2.setText("CUSTOMER PROFILE");
        custHomeHeader2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 43, 713, 191));

        custIDLabel1.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel1.setForeground(new java.awt.Color(255, 255, 255));
        custIDLabel1.setText("Customer ID:");
        jPanel1.add(custIDLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 303, -1, 31));

        custID.setBackground(new java.awt.Color(244, 244, 244));
        custID.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custID.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(custID, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 303, 297, 35));

        custNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        custNameLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        custNameLabel.setText("Customer Name:");
        jPanel1.add(custNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 375, -1, 31));

        custName.setBackground(new java.awt.Color(244, 244, 244));
        custName.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custName.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(custName, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 371, 300, 35));

        custPasswordLabel.setBackground(new java.awt.Color(0, 0, 0));
        custPasswordLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        custPasswordLabel.setText("Password:");
        jPanel1.add(custPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 444, -1, 31));

        custPassword.setBackground(new java.awt.Color(244, 244, 244));
        custPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(custPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 433, 300, 42));

        showPassword.setForeground(new java.awt.Color(255, 255, 255));
        showPassword.setText("Show Password");
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 509, -1, -1));

        custEmailLabel.setBackground(new java.awt.Color(0, 0, 0));
        custEmailLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custEmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        custEmailLabel.setText("Email:");
        jPanel1.add(custEmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 536, -1, 31));

        custEmail.setBackground(new java.awt.Color(244, 244, 244));
        custEmail.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        custEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(244, 244, 244))); // NOI18N
        jPanel1.add(custEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 531, 300, 36));

        currentBalance.setBackground(new java.awt.Color(255, 255, 255));
        currentBalance.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        currentBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        currentBalance.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        currentBalance.setPreferredSize(new java.awt.Dimension(300, 35));
        jPanel1.add(currentBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, 185, -1));

        custIDLabel.setBackground(new java.awt.Color(0, 0, 0));
        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        custIDLabel.setText("Current Balance:");
        custIDLabel.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel1.add(custIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, -1, 30));

        mgrTopUpBtn.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        mgrTopUpBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrTopUpBtn.setText("TOP UP");
        mgrTopUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrTopUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrTopUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1014, 389, 130, 70));

        topUpInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        topUpInput.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        topUpInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topUpInputActionPerformed(evt);
            }
        });
        jPanel1.add(topUpInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 336, 185, 35));

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

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        CustomerHome mgrBack = new CustomerHome(cust.getUserID(), cust.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("User " + cust.getUserID() + " has attempted to view Customer Home page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void mgrTopUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrTopUpBtnActionPerformed
            String line = "";
            FileHandling custFile = new FileHandling();
            File file = new File("custAccount.txt");

            try {
                Double topUpAmount;
                topUpAmount = Double.parseDouble(topUpInput.getText());
                
                // If the top up amount does not meet the condition an error message is shown
                if (topUpAmount > 100 || topUpAmount < 1){
                    System.err.println("Customer " + cust.getUserID() + " has inputted a top up amount outside the range.");
                    JOptionPane.showMessageDialog(null, "Error: Please input an amount between Rs 1 and Rs 100.");
                    topUpInput.setText("");
                    topUpAmount = 0.0;
                }
                
                else{
                    // Adds the top up amount with the previous value from the line within the text file
                    Double newAmount = topUpAmount + Double.parseDouble(currentBalance.getText().replace("Rs ", ""));
                    newAmount = (double) Math.round(newAmount * 100) / 100;

                    // Rewrites the line with the new top up amount back into the text file
                    custFile.rewriteContent(file, 0, custID.getText(), String.valueOf(newAmount));
                    System.out.println("User " + cust.getUserID() + " has topped up Rs" + topUpAmount + " to their account. User " 
                            + cust.getUserID() + " current balance is Rs" + newAmount);
                    JOptionPane.showMessageDialog(null, "Top up successful! Rs" + topUpAmount + " has been added to your account.");

                    try {
                        // Stores the line from the customer file 
                        line = custFile.locateItemInFile(cust.getUserID(), file, 0);
                    } catch (IOException e) {
                        System.err.println("Exception occurred - " + e.toString());
                        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                    }

                    // Splits the line into multiple sections and sets the current balance text area to the new value 
                    String [] section = line.split("\\|");
                    currentBalance.setText("Rs " + section[4]);

                    //Resets the top up input text field to blank again
                    topUpInput.setText("");
                }

        }catch (NumberFormatException e){
            System.err.println("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: Please input a valid amount to top up.");
        }
    }//GEN-LAST:event_mgrTopUpBtnActionPerformed

    private void topUpInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topUpInputActionPerformed
       
    }//GEN-LAST:event_topUpInputActionPerformed
    
    //Check box button to show and hide the password
    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if(showPassword.isSelected()){
            custPassword.setEchoChar((char)0); 
        } else {
            custPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentBalance;
    private javax.swing.JButton custBackBtn;
    private javax.swing.JTextField custEmail;
    private javax.swing.JLabel custEmailLabel;
    private javax.swing.JLabel custHomeHeader2;
    private javax.swing.JTextField custID;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JLabel custIDLabel1;
    private javax.swing.JTextField custName;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JPasswordField custPassword;
    private javax.swing.JLabel custPasswordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mgrTopUpBtn;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JTextField topUpInput;
    // End of variables declaration//GEN-END:variables
}
