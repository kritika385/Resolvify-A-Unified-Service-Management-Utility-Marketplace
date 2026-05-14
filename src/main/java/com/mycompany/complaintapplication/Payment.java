
package com.mycompany.complaintapplication;

public class Payment extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Payment.class.getName());

    public Payment() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        btnPayNow = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        lblTotalAmount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFetch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unified Payment Dashboard");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Registered Mobile Number");

        btnPayNow.setText("PAY ALL DUES");
        btnPayNow.addActionListener(this::btnPayNowActionPerformed);

        tblDetails.setBackground(new java.awt.Color(51, 51, 51));
        tblDetails.setForeground(new java.awt.Color(255, 255, 255));
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SERVICE NAME", "DATE", "AMOUNT"
            }
        ));
        jScrollPane1.setViewportView(tblDetails);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblTotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalAmount.setText("TOTAL DUE");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL DUE");

        btnFetch1.setText("Fetch My Bills");
        btnFetch1.addActionListener(this::btnFetch1ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnPayNow)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnFetch1)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(lblTotalAmount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFetch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblTotalAmount))
                .addGap(44, 44, 44)
                .addComponent(btnPayNow)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFetch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetch1ActionPerformed
    String phone = txtPhone.getText().trim();
    
    if (phone.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please enter a registered mobile number.");
        return;
    }

    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblDetails.getModel();
    model.setRowCount(0); 
    double grandTotal = 0.0;

    try {
        java.sql.Connection con = myconnection.getconnectivity();

        // 1. Fetch WiFi Dues
        String q1 = "SELECT plan, booking_date FROM wifi_booking WHERE mobile_number = ? AND (status IS NULL OR status = 'Pending')";
        java.sql.PreparedStatement pst1 = con.prepareStatement(q1);
        pst1.setString(1, phone);
        java.sql.ResultSet rs1 = pst1.executeQuery();
        
        while (rs1.next()) {
            String planName = rs1.getString("plan");
            String date = rs1.getString("booking_date");
            double amount = 0.0;

            if (planName != null) {
                String p = planName.toLowerCase();
                if (p.contains("basic")) amount = 499.0;
                else if (p.contains("standar")) amount = 699.0;
                else if (p.contains("premium")) amount = 999.0;
                else if (p.contains("ultimate")) amount = 1200.0;
            }
            model.addRow(new Object[]{"WiFi: " + planName, date, amount});
            grandTotal += amount;
        }

        // 2. Fetch Cylinder Dues (FIXED: Added column check and correct ResultSet)
        // 2. Fetch Cylinder Dues with Auto-Calculation
String q2 = "SELECT cylinder_type, quantity, created_at FROM cylinder_booking WHERE mobile = ? AND status = 'Pending'";
java.sql.PreparedStatement pst2 = con.prepareStatement(q2);
pst2.setString(1, phone);
java.sql.ResultSet rs2 = pst2.executeQuery();

while (rs2.next()) {
    String typeFromDB = rs2.getString("cylinder_type");
    String qtyStr = rs2.getString("quantity");
    String date = rs2.getString("created_at");
    
    int qty = 1; 
    try {
        qty = Integer.parseInt(qtyStr.trim());
    } catch (Exception e) {
        qty = 1; 
    }

    double unitPrice = 0.0;
    String cleanType = "Unknown"; // Display ke liye
    
    if (typeFromDB != null) {
        String lowerType = typeFromDB.toLowerCase();
        
        // Flexible search logic
        if (lowerType.contains("domestic")) {
            unitPrice = 850.0;
            cleanType = "Domestic";
        } else if (lowerType.contains("commercial")) {
            unitPrice = 1200.0;
            cleanType = "Commercial";
        }
    }

    double totalCylinderPrice = unitPrice * qty;

    // Table mein "Gas (Domestic x1)" jaisa clean name dikhega
    model.addRow(new Object[]{"Gas (" + cleanType + " x" + qty + ")", date, totalCylinderPrice});
    grandTotal += totalCylinderPrice;
}
        lblTotalAmount.setText(String.format("%.2f", grandTotal));

        if (grandTotal == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "No pending dues found for this number.");
        }

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Database Error: " + e.getMessage());
    }

    }//GEN-LAST:event_btnFetch1ActionPerformed

    private void btnPayNowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayNowActionPerformed
       
    String phone = txtPhone.getText().trim();
    String totalStr = lblTotalAmount.getText();

    if (totalStr.equals("0.00") || totalStr.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "There are no pending amounts to pay.");
        return;
    }

    try {
        java.sql.Connection con = myconnection.getconnectivity();

        // Update WiFi status to 'Paid'
        String updateWifi = "UPDATE wifi_booking SET status = 'Paid' WHERE mobile_number = ? AND (status = 'Pending' OR status IS NULL)";
        java.sql.PreparedStatement pstU1 = con.prepareStatement(updateWifi);
        pstU1.setString(1, phone);
        pstU1.executeUpdate();

        // Update Cylinder status to 'Paid'
        String updateCyl = "UPDATE cylinder_booking SET status = 'Paid' WHERE mobile = ? AND status = 'Pending'";
        java.sql.PreparedStatement pstU2 = con.prepareStatement(updateCyl);
        pstU2.setString(1, phone);
        pstU2.executeUpdate();

        javax.swing.JOptionPane.showMessageDialog(this, "Payment Successful! Your dues have been cleared. ✅");
        
        // Refresh UI
        lblTotalAmount.setText("0.00");
        ((javax.swing.table.DefaultTableModel) tblDetails.getModel()).setRowCount(0);
        txtPhone.setText("");

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(this, "Payment Processing Failed: " + e.getMessage());
    }

    }//GEN-LAST:event_btnPayNowActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Payment().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFetch1;
    private javax.swing.JButton btnPayNow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
