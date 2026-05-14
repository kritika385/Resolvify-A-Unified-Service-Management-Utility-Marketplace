
package com.mycompany.complaintapplication;
import javax.swing.table.DefaultTableModel;

public class ReviewPage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ReviewPage.class.getName());

    
    public ReviewPage() {
        initComponents();
// Ise Constructor mein dalo (ReviewPage() method ke andar)

    fillComboBox(); // Ye line zaroori hai!
loadReviews(); // <--- Ye wali table load karega
        // Default row height thodi zyada rakho
    tblReviews.setRowHeight(45); 
    
    // Renderer ko column index 2 (Comment column) par lagao
    tblReviews.getColumnModel().getColumn(2).setCellRenderer(new MultiLineTableCellRenderer());

    }
public void fillComboBox() {
  
    try {
        java.sql.Connection con = myconnection.getconnectivity();
        String sql = "SELECT name FROM providers";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery();
        
        comboProvider.removeAllItems();
        comboProvider.addItem("Select Provider");
        
        int count = 0; // Check karne ke liye
        while(rs.next()) {
            comboProvider.addItem(rs.getString("name"));
            count++;
        }
        System.out.println("Total Providers Loaded: " + count); // Console mein check karo
        
        con.close();
    } catch (Exception e) {
        System.out.println("Combo Error: " + e.getMessage());
    }

}
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReviews = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        comboProvider = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComment = new javax.swing.JTextArea();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBackToDash = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tblReviews.setBackground(new java.awt.Color(51, 51, 51));
        tblReviews.setForeground(new java.awt.Color(255, 255, 255));
        tblReviews.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Provider Name", "Rating", "Comment"
            }
        ));
        jScrollPane3.setViewportView(tblReviews);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("FEEDBACK");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        comboProvider.setBackground(new java.awt.Color(102, 102, 102));
        comboProvider.setForeground(new java.awt.Color(255, 255, 255));
        comboProvider.addActionListener(this::comboProviderActionPerformed);

        btnSubmit.setBackground(new java.awt.Color(51, 102, 255));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(this::btnSubmitActionPerformed);

        txtComment.setBackground(new java.awt.Color(51, 51, 51));
        txtComment.setColumns(20);
        txtComment.setForeground(new java.awt.Color(255, 255, 255));
        txtComment.setRows(5);
        txtComment.setText("add comment");
        jScrollPane1.setViewportView(txtComment);

        buttonGroup1.add(r1);
        r1.addActionListener(this::r1ActionPerformed);

        buttonGroup1.add(r2);

        buttonGroup1.add(r3);
        r3.setForeground(new java.awt.Color(255, 204, 0));

        buttonGroup1.add(r4);
        r4.setForeground(new java.awt.Color(255, 204, 0));

        buttonGroup1.add(r5);
        r5.setForeground(new java.awt.Color(255, 204, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Provider Selection");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select your rating ");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(1 to 5 stars)");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnSubmit))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r3)
                            .addGap(9, 9, 9)
                            .addComponent(r4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(r5)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboProvider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(r1)
                            .addComponent(r2)
                            .addComponent(r3)
                            .addComponent(r4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(r5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(19, 19, 19))
        );

        btnBackToDash.setBackground(new java.awt.Color(51, 51, 51));
        btnBackToDash.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToDash.setText("Back to Dashboard");
        btnBackToDash.addActionListener(this::btnBackToDashActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBackToDash)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackToDash))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void loadReviews() {
    DefaultTableModel model = (DefaultTableModel) tblReviews.getModel();
    model.setRowCount(0); 
    try {
        java.sql.Connection con = myconnection.getconnectivity();
        
        // GROUP_CONCAT saare comments ko join kar dega separator ' | ' ke saath
        // SEPARATOR ko badal kar '\n' (New Line) kar do
String sql = "SELECT provider_name, AVG(rating) as avg_rating, "
           + "GROUP_CONCAT(comment SEPARATOR '\n\n') as all_comments "
           + "FROM reviews GROUP BY provider_name";
                   
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        java.sql.ResultSet rs = pst.executeQuery();
        
        while(rs.next()) {
            // Average rating ko 1 decimal point tak round karne ke liye
            double avg = rs.getDouble("avg_rating");
            String formattedAvg = String.format("%.1f", avg);
            
            model.addRow(new Object[]{
                rs.getString("provider_name"),
                formattedAvg + " Stars",
                rs.getString("all_comments") // Saare comments ek saath yahan dikhenge
            });
        }
        con.close();
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

    int rating = 0;
    if(r1.isSelected()) rating = 1;
    else if(r2.isSelected()) rating = 2;
    else if(r3.isSelected()) rating = 3;
    else if(r4.isSelected()) rating = 4;
    else if(r5.isSelected()) rating = 5;

    if(rating == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Star select kar lo pehle!");
        return;
    }

    try {
        java.sql.Connection con = myconnection.getconnectivity();
        // DATA SAVE KARNE KA CODE WAPAS DALO:
        String sql = "INSERT INTO reviews (provider_name, rating, comment) VALUES (?, ?, ?)";
        java.sql.PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, comboProvider.getSelectedItem().toString());
        pst.setInt(2, rating);
        pst.setString(3, txtComment.getText());
        
        pst.executeUpdate(); // Ye database mein bhejega
        
        loadReviews(); // Ye table refresh karega
        
        // Resetting UI
        buttonGroup1.clearSelection(); 
        txtComment.setText(""); 
        javax.swing.JOptionPane.showMessageDialog(this, "Review Saved!");
        
        con.close();
    } catch (Exception e) {
        System.out.println("Insert Error: " + e.getMessage());
    }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void comboProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProviderActionPerformed

    private void btnBackToDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashActionPerformed
        new Dashboard().setVisible(true); // Dashboard screen khulegi
        this.dispose();
    }//GEN-LAST:event_btnBackToDashActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new ReviewPage().setVisible(true));
    }
// Class ke end mein (variables declaration se pehle)
class MultiLineTableCellRenderer extends javax.swing.JTextArea implements javax.swing.table.TableCellRenderer {
    public MultiLineTableCellRenderer() {
        setLineWrap(true);
        setWrapStyleWord(true);
        setOpaque(true);
        // Border hata do taaki box-in-box na lage
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)); 
    }

    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        setText(value != null ? value.toString() : "");
        
        // Colors selection ke liye
        if (isSelected) {
            setBackground(table.getSelectionBackground());
            setForeground(table.getSelectionForeground());
        } else {
            setBackground(table.getBackground());
            setForeground(table.getForeground());
        }

        // --- YEH FIX HAI ---
        // Column ki width ke hisaab se text height calculate karo
        int width = table.getColumnModel().getColumn(column).getWidth();
        setSize(new java.awt.Dimension(width, 1000)); 
        int preferredHeight = getPreferredSize().height;
        
        // Agar current row ki height kam hai, toh usey badha do
        if (table.getRowHeight(row) != preferredHeight) {
            table.setRowHeight(row, Math.max(preferredHeight, 40)); 
        }

        return this;
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToDash;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboProvider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JTable tblReviews;
    private javax.swing.JTextArea txtComment;
    // End of variables declaration//GEN-END:variables
}
