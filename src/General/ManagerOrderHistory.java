package General;

import Utilities.UserRegistrationInfo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ManagerOrderHistory extends javax.swing.JFrame implements OrderHistory {

    UserRegistrationInfo mgr = new UserRegistrationInfo();
    private final String COFILE = "completedOrders.txt";
    
    public ManagerOrderHistory(String userID, String userPassword) {
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
                    // Adding the data into the order history table
                    Double totalPrice;
                    totalPrice = Double.parseDouble(data[4]) * Integer.parseInt(data[5]);
                    totalPrice = Math.round(totalPrice * 100.0) / 100.0;
                    String totalPriceStr;
                    totalPriceStr = totalPrice.toString();
                    orderHistoryTableModel.addRow(new Object[]{data[0], data[1], data[2], data[3], 
                                            data[4], data[5], totalPriceStr, idToDateConversion(data[0])});
                    
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
        custBackBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        custOrderHistoryTable = new javax.swing.JTable();
        userIDTF = new javax.swing.JLabel();
        userDisplayLabel1 = new javax.swing.JLabel();
        custHomeHeader1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        custBackBtn.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        custBackBtn.setForeground(new java.awt.Color(255, 0, 0));
        custBackBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        custBackBtn.setText("BACK");
        custBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custBackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(custBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 570, 130, 40));

        custOrderHistoryTable.setFont(new java.awt.Font("SF Pro Text", 0, 11)); // NOI18N
        custOrderHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Customer ID", "Food ID", "Food", "Price", "Quantity", "Total Price", "Ordered Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            custOrderHistoryTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 930, 390));

        userIDTF.setBackground(new java.awt.Color(18, 18, 18));
        userIDTF.setFont(new java.awt.Font("SF Pro Text", 1, 18)); // NOI18N
        userIDTF.setForeground(new java.awt.Color(0, 102, 155));
        userIDTF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIDTF.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(userIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 120, 70));

        userDisplayLabel1.setBackground(new java.awt.Color(18, 18, 18));
        userDisplayLabel1.setFont(new java.awt.Font("SF Pro Text", 1, 24)); // NOI18N
        userDisplayLabel1.setForeground(new java.awt.Color(255, 0, 51));
        userDisplayLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userDisplayLabel1.setText("USER ID");
        jPanel1.add(userDisplayLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 40));

        custHomeHeader1.setFont(new java.awt.Font("SF Pro Text", 1, 53)); // NOI18N
        custHomeHeader1.setForeground(new java.awt.Color(255, 0, 0));
        custHomeHeader1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        custHomeHeader1.setText("ORDER HISTORY");
        custHomeHeader1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        custHomeHeader1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(custHomeHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 18, 941, 119));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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
        ManagerHome mgrBack = new ManagerHome(mgr.getUserID(), mgr.getUserPassword());
        mgrBack.setVisible(true);
        this.dispose();
        System.out.println("User " + mgr.getUserID() + " has attempted to view Customer Home page.");
    }//GEN-LAST:event_custBackBtnActionPerformed

    private void custOrderHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custOrderHistoryTableMouseClicked

    }//GEN-LAST:event_custOrderHistoryTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton custBackBtn;
    private javax.swing.JLabel custHomeHeader1;
    private javax.swing.JTable custOrderHistoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel userDisplayLabel1;
    private javax.swing.JLabel userIDTF;
    // End of variables declaration//GEN-END:variables
}
