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

public class CustomerOrderHistory extends javax.swing.JFrame implements OrderHistory {

    UserRegistrationInfo cust = new UserRegistrationInfo();
        
    public CustomerOrderHistory(String userID, String userPassword) {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        reviewTextArea.setLineWrap(true);
        reviewTextArea.setWrapStyleWord(true);
        
        // Set the user ID
        cust.setUserID(userID);
        cust.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        loadOrderHistoryTable();
    }
    
    // Loads the order history of completed orders in the JTable
    @Override
    public void loadOrderHistoryTable(){
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        File file = new File(COFILE);
        
        try {
            String str;
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {   
                while((str = br.readLine()) != null){
                    // Spliting the data into different section using the | delimeter
                    String data[] = str.split("\\|");
                    // Only adding the users orders in the order history
                    if (data[1].equals(cust.getUserID())) {
                        
                        // Calculating the total price and add the data into the order history table
                        Double totalPrice;
                        totalPrice = Double.parseDouble(data[4]) * Integer.parseInt(data[5]);
                        totalPrice = Math.round(totalPrice * 100.0) / 100.0;
                        String totalPriceStr;
                        totalPriceStr = totalPrice.toString();
                        orderHistoryTableModel.addRow(new Object[]{data[0], data[2], data[3], 
                                                data[4], data[5], totalPriceStr, idToDateConversion(data[0])});
                    }
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
    
    // Extracts the date from the order ID and converts it into a date format
    @Override
    public String idToDateConversion(String orderID) {
        
        String day = orderID.substring(0, 2);
        String month = orderID.substring(2,4);
        String year = orderID.substring(4,8);         
        String date = day + "-" + month + "-" + year;

        return date;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userPanel = new javax.swing.JPanel();
        custHomeHeader1 = new javax.swing.JLabel();
        userDisplayLabel = new javax.swing.JLabel();
        userIDTF = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        orderHistoryLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTextArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        orderHistoryLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        custOrderHistoryTable = new javax.swing.JTable();
        custBackBtn = new javax.swing.JButton();
        custSubmitReviewBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userPanel.setBackground(new java.awt.Color(255, 255, 255));
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 151, 140, -1));

        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 53)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("ORDER HISTORY");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 852, 123));

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(255, 0, 0));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        jPanel1.add(userDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 120, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        orderHistoryLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        orderHistoryLabel1.setForeground(new java.awt.Color(255, 0, 0));
        orderHistoryLabel1.setText("Review");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(orderHistoryLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(orderHistoryLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, -1, -1));

        reviewTextArea.setColumns(20);
        reviewTextArea.setRows(5);
        jScrollPane1.setViewportView(reviewTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 339, 348));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        orderHistoryLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        orderHistoryLabel.setForeground(new java.awt.Color(255, 0, 0));
        orderHistoryLabel.setText("Order History");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderHistoryLabel)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(orderHistoryLabel)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        custOrderHistoryTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        custOrderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Food ID", "Food", "Price", "Quantity", "Total Price", "Ordered Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        });
        jScrollPane2.setViewportView(custOrderHistoryTable);
        if (custOrderHistoryTable.getColumnModel().getColumnCount() > 0) {
            custOrderHistoryTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            custOrderHistoryTable.getColumnModel().getColumn(1).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            custOrderHistoryTable.getColumnModel().getColumn(3).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            custOrderHistoryTable.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 640, 348));

        custBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        custBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 120, 40));

        custSubmitReviewBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        custSubmitReviewBtn.setForeground(new java.awt.Color(255, 0, 51));
        custSubmitReviewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/verify users.png"))); // NOI18N
        custSubmitReviewBtn.setText("SUBMIT REVIEW");
        custSubmitReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSubmitReviewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custSubmitReviewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 640, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1998, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custBackBtnActionPerformed
        CustomerHome mgrBack = new CustomerHome(cust.getUserID(), cust.getUserPassword());
        mgrBack.setVisible(true);
        dispose();
        System.out.println("User " + cust.getUserID() + " has attempted to view Customer Home page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void custOrderHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custOrderHistoryTableMouseClicked
        
    }//GEN-LAST:event_custOrderHistoryTableMouseClicked
    
    //Appends customer review into the text file
    private void custSubmitReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSubmitReviewBtnActionPerformed
        FileHandling fh = new FileHandling();
        File reviewFile = new File("customerReviews.txt");
        DefaultTableModel orderHistoryTableModel = (DefaultTableModel) custOrderHistoryTable.getModel();
        System.out.println(orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString() +
                            orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 1).toString());
        try {
            
            //Searches the text file to see if a review has already been submitted
            if (!"NA".equals(fh.locateItemInFile(orderHistoryTableModel.getValueAt(
                            custOrderHistoryTable.getSelectedRow(), 0).toString(), orderHistoryTableModel.getValueAt(
                            custOrderHistoryTable.getSelectedRow(), 1).toString(), reviewFile, 0, 2))){
                javax.swing.JOptionPane.showMessageDialog(null, "Order has already been reviewed.");
                reviewTextArea.setText(null);
            }
            else{
                //If the feedback for a particular order is not in the text file it will proceed to add it in
                if(custOrderHistoryTable.getSelectedRowCount() == 1){
                
                //If the length of the review is less than 4 characters it will show an error
                    if(reviewTextArea.getText().length()<4){
                        javax.swing.JOptionPane.showMessageDialog(null, "Error: Please enter a minimum of 4 characters.");
                    }

                    //If length of the review is between 4 and 300 characters in length it will store the data the table line into a variable
                    else if (reviewTextArea.getText().length()<300||reviewTextArea.getText().length()>4){
                        String reviewContents = orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString() 
                                + "|" + cust.getUserID()
                                + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 1).toString()
                                + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 2).toString()
                                + "|" + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 6).toString()
                                + "|" + reviewTextArea.getText();
                        reviewTextArea.setText(null); // Text area is set back to null for user to provide next review
                        try {

                            // Appends the contents of the review into the file again
                            fh.appendToFile(reviewContents, reviewFile);
                            System.out.println("User " + cust.getUserID() + " has submitted a review for Order ID " 
                                    + orderHistoryTableModel.getValueAt(custOrderHistoryTable.getSelectedRow(), 0).toString());
                            javax.swing.JOptionPane.showMessageDialog(null, "Order review submitted.");

                        } catch (IOException e) {
                            System.err.println("Exception occurred - " + e.toString());
                            javax.swing.JOptionPane.showMessageDialog(null, "File cannot be opened.");
                        }
                    }
                    else{
                        javax.swing.JOptionPane.showMessageDialog(null, "Error: Only a maximum of 300 characters.");
                    }
                }
            }
            
        } catch (IOException e) {
            System.err.println("Exception occurred - " + e.toString());
        }
    }//GEN-LAST:event_custSubmitReviewBtnActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custBackBtn;
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JTable custOrderHistoryTable;
    private javax.swing.JButton custSubmitReviewBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel orderHistoryLabel;
    private javax.swing.JLabel orderHistoryLabel1;
    private javax.swing.JTextArea reviewTextArea;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
