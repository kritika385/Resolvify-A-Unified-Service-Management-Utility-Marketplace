package com.mycompany.complaintapplication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class searchServicePage extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(searchServicePage.class.getName());
    public searchServicePage() {
        initComponents();
        loadServices(); 
        loadAreas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbServiceQuery = new javax.swing.JComboBox<>();
        cmbAreaQuery = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnBackToDash = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Service Page");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Pictures\\Screenshots\\Screenshot 2026-03-23 152538.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        cmbServiceQuery.setBackground(new java.awt.Color(51, 51, 51));
        cmbServiceQuery.setForeground(new java.awt.Color(255, 255, 255));
        cmbServiceQuery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbServiceQuery.addActionListener(this::cmbServiceQueryActionPerformed);

        cmbAreaQuery.setBackground(new java.awt.Color(51, 51, 51));
        cmbAreaQuery.setForeground(new java.awt.Color(255, 255, 255));
        cmbAreaQuery.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search Service");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search Area");

        btnSearch.setBackground(new java.awt.Color(51, 51, 51));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search  🔍");
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        btnBackToDash.setBackground(new java.awt.Color(51, 51, 51));
        btnBackToDash.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToDash.setText("Back to Dashboard");
        btnBackToDash.addActionListener(this::btnBackToDashActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbServiceQuery, 0, 346, Short.MAX_VALUE)
                            .addComponent(cmbAreaQuery, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnBackToDash))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbServiceQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(cmbAreaQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnBackToDash)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Provider", "Area", "Service"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    String selectedService = cmbServiceQuery.getSelectedItem().toString();
    String selectedArea = cmbAreaQuery.getSelectedItem().toString();
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); 

    try {
        Connection con = myconnection.getconnectivity();
        // Fixed: 'service' instead of 'service_name'
        StringBuilder queryBuilder = new StringBuilder("SELECT name, address, service FROM providers WHERE 1=1");
        
        if (!selectedService.equals("Select Service...")) {
            queryBuilder.append(" AND service = ?");
        }
        if (!selectedArea.equals("Select Area...")) {
            queryBuilder.append(" AND address LIKE ?");
        }

        PreparedStatement pst = con.prepareStatement(queryBuilder.toString());
        int paramIndex = 1;
        if (!selectedService.equals("Select Service...")) {
            pst.setString(paramIndex++, selectedService);
        }
        if (!selectedArea.equals("Select Area...")) {
            pst.setString(paramIndex++, "%" + selectedArea + "%");
        }

        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            Vector<String> row = new Vector<>();
            row.add(rs.getString("name")); 
            row.add(rs.getString("address")); 
            row.add(rs.getString("service")); // Fixed here too
            model.addRow(row);
        }
        con.close(); 
    } catch (Exception e) {
         e.printStackTrace();
    }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackToDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashActionPerformed
    new Dashboard().setVisible(true); // Dashboard screen khulegi
        this.dispose();
    }//GEN-LAST:event_btnBackToDashActionPerformed

    private void cmbServiceQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbServiceQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbServiceQueryActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new searchServicePage().setVisible(true));
    }

    public void loadServices() {
    cmbServiceQuery.removeAllItems();
    cmbServiceQuery.addItem("Select Service...");
    try {
        Connection con = myconnection.getconnectivity();
        // Fixed: service instead of service_name
        String sql = "SELECT DISTINCT service FROM providers ORDER BY service ASC";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()) {
            cmbServiceQuery.addItem(rs.getString("service"));
        }
        con.close();
    } catch (Exception e) { e.printStackTrace(); }
}

public void loadAreas() {
    cmbAreaQuery.removeAllItems();
    cmbAreaQuery.addItem("Select Area...");
    try {
        Connection con = myconnection.getconnectivity();
        // Extracting distinct addresses to use as areas
        String sql = "SELECT DISTINCT address FROM providers ORDER BY address ASC";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()) {
            cmbAreaQuery.addItem(rs.getString("address"));
        }
    } catch (Exception e) { System.out.println("Error: " + e.getMessage()); }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToDash;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbAreaQuery;
    private javax.swing.JComboBox<String> cmbServiceQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
