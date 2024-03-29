package General;

import Utilities.FileHandling;
import Utilities.UserRegistrationInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManagerFeedback extends javax.swing.JFrame {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    String CRFILE = "customerReviews.txt";
   
    public ManagerFeedback(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        loadOrderHistoryTable();
        
        // Set some text fields to empty when the window loads
        orderIDTF.setText("");
        foodIDTF.setText("");
        foodTF.setText("");
        orderDateTF.setText("");
        
        // Set a placeholder text for feedbackTA
        feedbackTA.setText("-- Select one of the Order ID in the table at the left to display the feedback provided --");
    }

    private void loadOrderHistoryTable(){
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        File file = new File(CRFILE);
        
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Only adding the users orders in the order history
                    // Adding the data into the order history table
                    orderHistoryTableModel.addRow(new Object[]{data[0], data[1], data[2], data[4]});
                }
                br.close();
            } catch (IOException e) {
                System.err.println("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
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

        jPanel1 = new javax.swing.JPanel();
        userPanel1 = new javax.swing.JPanel();
        custBackBtn = new javax.swing.JButton();
        custHomeHeader1 = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        userDisplayLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        custOrderHistoryTable = new javax.swing.JTable();
        orderIDLabel = new javax.swing.JLabel();
        orderIDTF = new javax.swing.JTextField();
        custIDLabel = new javax.swing.JLabel();
        custIDTF = new javax.swing.JTextField();
        foodIDLabel = new javax.swing.JLabel();
        foodIDTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedbackTA = new javax.swing.JTextArea();
        feedbackLabel = new javax.swing.JLabel();
        orderDateLabel = new javax.swing.JLabel();
        orderDateTF = new javax.swing.JTextField();
        foodLabel = new javax.swing.JLabel();
        foodTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userPanel1.setBackground(new java.awt.Color(255, 255, 255));
        userPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(userPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1195, 64, 142, -1));

        custBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        custBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 590, 119, 30));

        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 53)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("FEEDBACK");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 39, 650, 131));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 91, 120, 60));

        userDisplayLabel1.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel1.setForeground(new java.awt.Color(255, 0, 0));
        userDisplayLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel1.setText("USER ID");
        jPanel1.add(userDisplayLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 39, 120, 40));

        custOrderHistoryTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        custOrderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Food ID", "Ordered Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        custOrderHistoryTable.setToolTipText("");
        custOrderHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                custOrderHistoryTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                custOrderHistoryTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(custOrderHistoryTable);
        if (custOrderHistoryTable.getColumnModel().getColumnCount() > 0) {
            custOrderHistoryTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            custOrderHistoryTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 252, 483, 362));

        orderIDLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        orderIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        orderIDLabel.setText("Order ID:");
        jPanel1.add(orderIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 237, -1, 30));

        orderIDTF.setEditable(false);
        orderIDTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        orderIDTF.setFocusable(false);
        orderIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(orderIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 227, 330, 32));

        custIDLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        custIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        custIDLabel.setText("Customer ID:");
        jPanel1.add(custIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 287, -1, 30));

        custIDTF.setEditable(false);
        custIDTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        custIDTF.setFocusable(false);
        custIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(custIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 285, 330, 32));

        foodIDLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        foodIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        foodIDLabel.setText("Food ID:");
        jPanel1.add(foodIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 337, -1, 30));

        foodIDTF.setEditable(false);
        foodIDTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        foodIDTF.setFocusable(false);
        foodIDTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodIDTFActionPerformed(evt);
            }
        });
        jPanel1.add(foodIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 335, 330, 32));

        feedbackTA.setEditable(false);
        feedbackTA.setColumns(20);
        feedbackTA.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        feedbackTA.setRows(5);
        feedbackTA.setText("-- Select one of the Order ID in the table at the left to display the feedback provided --");
        jScrollPane1.setViewportView(feedbackTA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 440, 390, 110));

        feedbackLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        feedbackLabel.setForeground(new java.awt.Color(255, 255, 255));
        feedbackLabel.setText("Feedback");
        jPanel1.add(feedbackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 434, -1, 30));

        orderDateLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        orderDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        orderDateLabel.setText("Ordered Date:");
        jPanel1.add(orderDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 383, -1, 30));

        orderDateTF.setEditable(false);
        orderDateTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        orderDateTF.setFocusable(false);
        orderDateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDateTFActionPerformed(evt);
            }
        });
        jPanel1.add(orderDateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 384, 330, 32));

        foodLabel.setFont(new java.awt.Font("SF Pro Text", 0, 18)); // NOI18N
        foodLabel.setForeground(new java.awt.Color(18, 18, 18));
        foodLabel.setText("Food:");
        jPanel1.add(foodLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 487, -1, 30));

        foodTF.setEditable(false);
        foodTF.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        foodTF.setFocusable(false);
        foodTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodTFActionPerformed(evt);
            }
        });
        jPanel1.add(foodTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 485, 330, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        ManagerHome mgrBack = new ManagerHome(mgr.getUserID(),mgr.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void custOrderHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custOrderHistoryTableMouseClicked

    }//GEN-LAST:event_custOrderHistoryTableMouseClicked

    private void orderIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDTFActionPerformed

    }//GEN-LAST:event_orderIDTFActionPerformed

    private void foodIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodIDTFActionPerformed

    }//GEN-LAST:event_foodIDTFActionPerformed

    private void foodTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodTFActionPerformed

    }//GEN-LAST:event_foodTFActionPerformed

    private void custIDTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custIDTFActionPerformed

    }//GEN-LAST:event_custIDTFActionPerformed

    private void orderDateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDateTFActionPerformed

    }//GEN-LAST:event_orderDateTFActionPerformed

    private void custOrderHistoryTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custOrderHistoryTableMousePressed
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        orderIDTF.setText(orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(),0).toString());
        custIDTF.setText(orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(),1).toString());
        foodIDTF.setText(orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(),2).toString());
        orderDateTF.setText(orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(),3).toString());
        
        File file = new File(CRFILE);
        FileHandling fh = new FileHandling();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                if (!"NA".equals(fh.locateItemInFile(orderIDTF.getText(), foodIDTF.getText(), file, 0, 2))) {
                    // Get the data that is clicked on and obtain its respective information from customerReviews.txt
                    String line = fh.locateItemInFile(orderIDTF.getText(), foodIDTF.getText(), file, 0, 2);
                    
                    // Strip the line into tokens
                    String[] lineArray = line.split("\\|");
                       
                    // Match the tokens to their respective text field
                    foodTF.setText(lineArray[3]);

                    feedbackTA.setText(lineArray[5]);
                }
                br.close();
                System.out.println("Manager " + mgr.getUserID() + " has attempted to view the feedback of Order ID " + orderIDTF.getText() 
                        + "with Food ID " + foodIDTF.getText() + ".");
            } catch (IOException e) {
                System.err.println("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: File cannot be read.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: File does not exist!");
        }
    }//GEN-LAST:event_custOrderHistoryTableMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custBackBtn;
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JLabel custIDLabel;
    private javax.swing.JTextField custIDTF;
    private javax.swing.JTable custOrderHistoryTable;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JTextArea feedbackTA;
    private javax.swing.JLabel foodIDLabel;
    private javax.swing.JTextField foodIDTF;
    private javax.swing.JLabel foodLabel;
    private javax.swing.JTextField foodTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orderDateLabel;
    private javax.swing.JTextField orderDateTF;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JTextField orderIDTF;
    private javax.swing.JLabel userDisplayLabel1;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel1;
    // End of variables declaration//GEN-END:variables
}
