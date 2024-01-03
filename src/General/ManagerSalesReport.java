package General; 

import Utilities.UserRegistrationInfo;
import Utilities.SalesReportCalculations;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ManagerSalesReport extends javax.swing.JFrame{

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    SalesReportCalculations report = new SalesReportCalculations() {};
      
    public ManagerSalesReport(String userID, String userPassword) throws IOException {
        initComponents();
        setTitle("APU Cafeteria Ordering System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        // Set the user ID
        mgr.setUserID(userID);
        mgr.setUserPassword(userPassword);
        userIDTF.setText(userID);
        
        //Calculates and displays system balance, total orders and total customers
        systemBalanceLabel.setText("Rs " + String.valueOf(report.calculateSystemBalance()));
        totalOrdersLabel.setText(String.valueOf(report.totalNumber(0)));
        totalCustomersLabel.setText(String.valueOf(report.totalNumber(1)));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerPanel1 = new javax.swing.JPanel();
        userIDTF = new javax.swing.JLabel();
        userDisplayLabel = new javax.swing.JLabel();
        custHomeHeader1 = new javax.swing.JLabel();
        systemBalanceLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalOrdersLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalCustomersLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        salesTable = new javax.swing.JTable();
        totalSalesLabel = new javax.swing.JLabel();
        totalSalesAmountLabel = new javax.swing.JLabel();
        mgrBackBtn = new javax.swing.JButton();
        mgrBackBtn1 = new javax.swing.JButton();
        printRptBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dateSearchField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel1.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(headerPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1164, 17, -1, 120));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 128, 56));

        userDisplayLabel.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel.setForeground(new java.awt.Color(255, 0, 0));
        userDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel.setText("USER ID");
        jPanel1.add(userDisplayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 128, 40));

        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 48)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("SALES REPORT");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 17, 913, 136));

        systemBalanceLabel.setBackground(new java.awt.Color(255, 255, 255));
        systemBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        systemBalanceLabel.setToolTipText("");
        systemBalanceLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(systemBalanceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 235, 200, 36));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SYSTEM BALANCE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, 37));

        totalOrdersLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalOrdersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalOrdersLabel.setToolTipText("");
        totalOrdersLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(totalOrdersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 198, 36));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL ORDERS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 210, 37));

        totalCustomersLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalCustomersLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalCustomersLabel.setToolTipText("");
        totalCustomersLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(totalCustomersLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 198, 36));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TOTAL CUSTOMERS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 198, 37));

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Quantity", "Total Sales"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salesTable);
        if (salesTable.getColumnModel().getColumnCount() > 0) {
            salesTable.getColumnModel().getColumn(0).setResizable(false);
            salesTable.getColumnModel().getColumn(1).setResizable(false);
            salesTable.getColumnModel().getColumn(2).setResizable(false);
            salesTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 610, 330));

        totalSalesLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalSalesLabel.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        totalSalesLabel.setForeground(new java.awt.Color(255, 255, 255));
        totalSalesLabel.setText(" Total Sales on Selected Date: ");
        jPanel1.add(totalSalesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 631, -1, -1));

        totalSalesAmountLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalSalesAmountLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        totalSalesAmountLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        totalSalesAmountLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        totalSalesAmountLabel.setOpaque(true);
        jPanel1.add(totalSalesAmountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 631, 181, 44));

        mgrBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        mgrBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        mgrBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        mgrBackBtn.setText("BACK");
        mgrBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(mgrBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1865, 631, 110, 56));

        mgrBackBtn1.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        mgrBackBtn1.setForeground(new java.awt.Color(255, 0, 0));
        mgrBackBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit small.png"))); // NOI18N
        mgrBackBtn1.setText("BACK");
        mgrBackBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgrBackBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(mgrBackBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 640, 130, 56));

        printRptBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        printRptBtn.setForeground(new java.awt.Color(255, 0, 0));
        printRptBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/generate bill & print.png"))); // NOI18N
        printRptBtn.setText("PRINT REPORT");
        printRptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printRptBtnActionPerformed(evt);
            }
        });
        jPanel1.add(printRptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 496, 179, 47));

        searchBtn.setFont(new java.awt.Font("SF Pro Text", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 0, 0));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        searchBtn.setText("SEARCH");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 431, 179, 47));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Date format: dd-mm-yyyy");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 397, -1, -1));

        dateSearchField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateSearchField.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        dateSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateSearchFieldActionPerformed(evt);
            }
        });
        jPanel1.add(dateSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 350, 179, 35));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 306, 157, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mgrBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtnActionPerformed
        ManagerHome mgrBack = new ManagerHome(mgr.getUserID(),mgr.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
    }//GEN-LAST:event_mgrBackBtnActionPerformed

    private void dateSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateSearchFieldActionPerformed

    }//GEN-LAST:event_dateSearchFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        DefaultTableModel salesTableModel = (DefaultTableModel) salesTable.getModel();
        salesTableModel.setRowCount(0); //Setting the row count to 0 each time the button is clicked
        
        //Setting the orderDate back to null
        String orderDate = null; 
        totalSalesAmountLabel.setText(null);

        try {
            //Validates date format 
            orderDate = report.dateValidation(dateSearchField.getText());
        } catch (IOException e) {
            System.err.println("Exception occurred - " + e.toString());
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        if (orderDate != null){
            //itemDetails object reference created for storing item details from file
            ArrayList<String> itemIDs = new ArrayList<String>();
            //Initialize total sales
            double totalSales = 0;
            
            try {
                //Gets all the lines in the file and stores it in a string variable
                for (int i = 0; i < report.findAllSales(orderDate).size(); i++){
                    String line = report.findAllSales(orderDate).get(i);
                    
                    //Splits the lines by delimiter
                    String [] lineArray = line.split("\\|");
                    
                    totalSales = totalSales + Double.parseDouble(lineArray[4]) * Integer.parseInt(lineArray[5]);
                    totalSales = (double) Math.round(totalSales * 100)/100;
                    //If ID is not already in lineArray, then it appended into it (Ensures unique ID)
                    if (!itemIDs.contains(lineArray[2])){
                        itemIDs.add(lineArray[2]);
                    }
                }
                
                for (int j = 0; j < itemIDs.size(); j++){
                    
                    double itemSales = 0;
                    int itemQuantity = 0;
                    String itemName = null;
                    String salesAmount = null;
                    
                    for (int k = 0; k < report.findAllSales(orderDate,itemIDs.get(j)).size(); k++){
                        String lines = report.findAllSales(orderDate, itemIDs.get(j)).get(k);
                        
                        //Splits string into multiple sections of an array
                        String [] lineArray = lines.split("\\|");
                        
                        //Adding the quantity of the item in each iteration
                        itemQuantity += Integer.parseInt(lineArray[5]);
                        
                        //Adding the sales of the item in each iteration and rounds the amount to 2 decimal places
                        itemSales += Double.parseDouble(lineArray[4]) * itemQuantity;
                        itemSales = Math.round(itemSales * 100.0) / 100.0;
                        salesAmount = "Rs " + String.valueOf(itemSales);
                        
                        //Stores the name of the item
                        itemName = lineArray[3];
                    }
                    
                    //Appends lines into the table
                    salesTableModel.addRow(new Object[] {itemIDs.get(j), itemName, itemQuantity, salesAmount});
                    
                    //Calculates the total sales amount for that particular date
                    totalSalesAmountLabel.setText("Rs " + String.valueOf(totalSales) + " ");
                }
            } catch (IOException e) {
                System.err.println("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void printRptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printRptBtnActionPerformed
        DefaultTableModel salesTableModel = (DefaultTableModel) salesTable.getModel();
        if(salesTableModel.getRowCount() > 0){
            // Set the header and the footer of the report
            MessageFormat header = new MessageFormat("Daily Sales Report (" + dateSearchField.getText() + ")");

            try {
                // Add the total row
                salesTableModel.addRow(new Object[] {"", "", "", ""});
                salesTableModel.addRow(new Object[] {"Total Sales", "", "", totalSalesAmountLabel.getText()});
                salesTableModel.addRow(new Object[] {"System Balance", "", "", systemBalanceLabel.getText()});
                salesTableModel.addRow(new Object[] {"Total Orders", "", "", totalOrdersLabel.getText()});
                salesTableModel.addRow(new Object[] {"Total Customers", "", "", totalCustomersLabel.getText()});
                
                // Print the table as a report
                salesTable.print(JTable.PrintMode.FIT_WIDTH, header, null); 
                
            } catch(PrinterException e) {
                System.err.println("Exception occurred - " + e.toString());
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: No data to generate report!");
        }

        System.out.println("Manager " + mgr.getUserID() + " has attempted to print the daily report of the date " + dateSearchField.getText() + ".");
    }//GEN-LAST:event_printRptBtnActionPerformed

    private void mgrBackBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgrBackBtn1ActionPerformed
        ManagerHome mgrBack = new ManagerHome(mgr.getUserID(),mgr.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("Manager " + mgr.getUserID() + " has attempted to view Manager Home page.");
    }//GEN-LAST:event_mgrBackBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JTextField dateSearchField;
    private javax.swing.JPanel headerPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mgrBackBtn;
    private javax.swing.JButton mgrBackBtn1;
    private javax.swing.JButton printRptBtn;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel systemBalanceLabel;
    private javax.swing.JLabel totalCustomersLabel;
    private javax.swing.JLabel totalOrdersLabel;
    private javax.swing.JLabel totalSalesAmountLabel;
    private javax.swing.JLabel totalSalesLabel;
    private javax.swing.JLabel userDisplayLabel;
    private javax.swing.JLabel userIDTF;
    // End of variables declaration//GEN-END:variables
}
