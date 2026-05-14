package com.mycompany.complaintapplication;
public class ViewProvider extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ViewProvider.class.getName());
    public ViewProvider() {
      initComponents();
    loadCategories();    // Step 1: Fill the dropdown
    loadAllProviders();  // Step 2: Fill the table
    }
public void loadAllProviders() {
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tblProviders.getModel();
    model.setRowCount(0); 
    try {
        java.sql.Connection con = myconnection.getconnectivity();        
        
        Object selectedItem = cmbCategoryFilter.getSelectedItem();
        String category = (selectedItem != null) ? selectedItem.toString() : "All Categories";
        String search = txtSearchProvider.getText().trim();        
        
        // FIX: Changed 'service' to 'service_name' and 'phone' to 'contact'
        String sql = "SELECT name, service, contact, address FROM providers WHERE (name LIKE ? OR address LIKE ?)";
        
        if (!category.equals("All Categories")) {
            sql += " AND service_name = '" + category + "'";
        }       
        
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "%" + search + "%");
        pst.setString(2, "%" + search + "%");        
        java.sql.ResultSet rs = pst.executeQuery();
        
        while(rs.next()) {
    model.addRow(new Object[]{
        rs.getString("name"),
        rs.getString("service"),
        rs.getString("contact"),
        rs.getString("address"), // Yahan ab 'address' ka data aayega
        "REMOVE" 
    });
        }
        con.close();
    } catch (Exception e) {
        System.out.println("SQL Error: " + e.getMessage());
    }

}
public void loadCategories() {
    cmbCategoryFilter.removeAllItems();
    cmbCategoryFilter.addItem("All Categories");

    try {
        java.sql.Connection con = myconnection.getconnectivity();
        // FIX: Changed 'service' to 'service_name'
        String sql = "SELECT DISTINCT service_name FROM providers ORDER BY service_name ASC";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            cmbCategoryFilter.addItem(rs.getString("service_name"));
        }
        con.close();
    } catch (Exception e) {
        System.out.println("Category Load Error: " + e.getMessage());
    }

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearchProvider = new javax.swing.JTextField();
        cmbCategoryFilter = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProviders = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnBackToDash = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Provider");

        txtSearchProvider.addActionListener(this::txtSearchProviderActionPerformed);
        txtSearchProvider.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchProviderKeyReleased(evt);
            }
        });

        cmbCategoryFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoryFilter.addActionListener(this::cmbCategoryFilterActionPerformed);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Filter By Category");

        tblProviders.setBackground(new java.awt.Color(0, 0, 0));
        tblProviders.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblProviders.setForeground(new java.awt.Color(255, 255, 255));
        tblProviders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Provider Name", "Category", "Phone Number", "Area", "Action"
            }
        ));
        tblProviders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProvidersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProviders);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VIEW PROVIDERS");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Pictures\\Screenshots\\Screenshot 2026-03-23 150100.png")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)))
        );

        btnBackToDash.setBackground(new java.awt.Color(0, 0, 0));
        btnBackToDash.setForeground(new java.awt.Color(51, 153, 255));
        btnBackToDash.setText("Back To Dashboard");
        btnBackToDash.setBorderPainted(false);
        btnBackToDash.addActionListener(this::btnBackToDashActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1087, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 660, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbCategoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBackToDash)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCategoryFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackToDash)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchProviderActionPerformed

    private void txtSearchProviderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchProviderKeyReleased
        loadAllProviders();
    }//GEN-LAST:event_txtSearchProviderKeyReleased

    private void cmbCategoryFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryFilterActionPerformed
        loadAllProviders();
    }//GEN-LAST:event_cmbCategoryFilterActionPerformed

    private void btnBackToDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashActionPerformed
       new Dashboard().setVisible(true); // Ensure your Dashboard class name is correct
    this.dispose();
    }//GEN-LAST:event_btnBackToDashActionPerformed

    private void tblProvidersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProvidersMouseClicked
                                        
    int row = tblProviders.getSelectedRow();
    String providerName = tblProviders.getValueAt(row, 0).toString(); // Get name from column 0
    String phoneNumber = tblProviders.getValueAt(row, 2).toString();  // Get phone from column 2

    // 1. Ask for confirmation so you don't delete by mistake
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this, 
            "Are you sure you want to remove " + providerName + "?", 
            "Remove Provider", javax.swing.JOptionPane.YES_NO_OPTION);

    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        try {
            java.sql.Connection con = myconnection.getconnectivity();
            
            // 2. Delete from database using Name and Phone (to be safe)
          // Inside tblProvidersMouseClicked...
// FIX: Use 'contact' instead of 'phone' in the DELETE query
String sql = "DELETE FROM providers WHERE name = ? AND contact = ?";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, providerName);
            pst.setString(2, phoneNumber);
            
            int deleted = pst.executeUpdate();
            
            if (deleted > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Provider removed successfully!");
                loadAllProviders(); // 3. Refresh the table automatically
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_tblProvidersMouseClicked

    public static void main(String args[]) {
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

        java.awt.EventQueue.invokeLater(() -> new ViewProvider().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToDash;
    private javax.swing.JComboBox<String> cmbCategoryFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProviders;
    private javax.swing.JTextField txtSearchProvider;
    // End of variables declaration//GEN-END:variables
}
