package com.mycompany.complaintapplication;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
public class Dashboard extends javax.swing.JFrame {
    String username; // Ye line add karo agar nahi hai
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());
public Dashboard() {
    this("Admin"); 
}
    public Dashboard(String name) { 
    initComponents();
    loadRecentComplaints(); 
    startClock(); // Ye naya method hum abhi banayenge
    this.username = name;
    if(lblAdminName != null) {
        lblAdminName.setText(username); // Ye "Admin" ki jagah user ka naam set kar dega
    }
    loadRecentComplaints(); 
    updateStats();
    updatePerformance();
tblRecent.setRowHeight(35); // Rows ko thoda khula-khula (airy) karo
tblRecent.setShowVerticalLines(false); // Vertical lines hata do, clean dikhega
tblRecent.getTableHeader().setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 13));
tblRecent.getTableHeader().setReorderingAllowed(false); // Columns ko move hona band karo

// Pehle ka Layout hatao aur GridLayout lagao

JPanel progressCircle = new JPanel() {
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g;
        g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);

        // Size logic: Panel ke size se thoda chhota (margin 15px)
        int w = getWidth();
        int h = getHeight();
        int size = Math.min(w, h) - 15; 
        
        int x = (w - size) / 2;
        int y = (h - size) / 2;

        // Gray Ring (Patli line)
        g2.setColor(new java.awt.Color(51, 65, 85));
        g2.setStroke(new java.awt.BasicStroke(6)); 
        g2.drawOval(x, y, size, size);

        // Blue Progress Ring
        g2.setColor(new java.awt.Color(59, 130, 246));
        g2.setStroke(new java.awt.BasicStroke(8, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_ROUND));
        
        try {
            String text = lblPerformanceScore.getText().replace("%", "").trim();
            int score = (text.equals("!") || text.isEmpty()) ? 0 : Integer.parseInt(text);
            int angle = (int) (360 * (score / 100.0));
            g2.drawArc(x, y, size, size, 90, -angle);
        } catch(Exception e) {
            g2.drawArc(x, y, size, size, 90, 0);
        }
    }
};

progressCircle.setOpaque(false);
/*********************************************************************/
    updatePerformance();
    // Ab 'name' brackets mein hai, toh ye error nahi dega
 
    updateStats(); // <--- Ye line likhi honi chahiye, tabhi numbers aayenge!

// Column index 3 (Status) ko target kar rahe hain
tblRecent.getColumnModel().getColumn(3).setCellRenderer(new javax.swing.table.DefaultTableCellRenderer() {
    @Override
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Label create karo jo cell ke andar dikhega
        javax.swing.JLabel label = (javax.swing.JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        // Background ko opaque rakho taaki colors dikhein
        label.setOpaque(true);
        label.setHorizontalAlignment(javax.swing.JLabel.CENTER); // Text center mein
        label.setFont(new java.awt.Font("SansSerif", java.awt.Font.BOLD, 12)); // Thoda bold font

        if (value != null) {
            String status = value.toString();
            
            if (status.equalsIgnoreCase("Resolved")) {
                label.setForeground(new java.awt.Color(34, 197, 94)); // Modern Green text
                label.setText("●  Resolved"); // Dot ke saath professional look
            } else if (status.equalsIgnoreCase("Pending")) {
                label.setForeground(new java.awt.Color(249, 115, 22)); // Vibrant Orange text
                label.setText("○  Pending");
            } else {
                label.setForeground(java.awt.Color.WHITE);
            }
        }

        // Selection style (Jab row par click karein)
        if (isSelected) {
            label.setBackground(new java.awt.Color(59, 130, 246)); // Blue selection
            label.setForeground(java.awt.Color.WHITE);
        } else {
            label.setBackground(table.getBackground()); // Default background
        }

        return label;
    }
});
// Ye code Dashboard constructor ke andar updateStats() ke niche likho
jProgressBar1.setValue(80); // Manually set kar rahi hoon abhi
jProgressBar2.setValue(45);
jProgressBar3.setValue(60);
jProgressBar4.setValue(20);
    if(lblAdminName != null) {
        lblAdminName.setText(username);
    }

    // Sidebar and Background Styling
    jPanel2.setBackground(new java.awt.Color(15, 23, 42));
    this.getContentPane().setBackground(new java.awt.Color(2, 6, 23)); 

    // Button Styling
    btnComplaintRegister.setBackground(new java.awt.Color(59, 130, 246)); 
    btnComplaintRegister.setForeground(java.awt.Color.WHITE);
    btnComplaintRegister.setBorderPainted(false);
    
    // Frame settings
    this.setLocationRelativeTo(null); 
    
    // Database se stats load karne ke liye

    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSupport = new javax.swing.JButton();
        btnViewProviderCenter = new javax.swing.JButton();
        btnJobBoard = new javax.swing.JButton();
        btnSearchServicePage = new javax.swing.JButton();
        btnAddProvider = new javax.swing.JButton();
        btnBackLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnComplaintRegister1 = new javax.swing.JButton();
        btnReviewPage = new javax.swing.JButton();
        cardTotalProviders = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTotalCount = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnComplaintRegister = new javax.swing.JButton();
        cardRegisteredComplaints = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblRegisteredCount = new javax.swing.JLabel();
        cardPending = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPendingCount = new javax.swing.JLabel();
        cardResolved = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        lblResolvedCount = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        welcomePanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblAdminName = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        panelAnalysis = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecent = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        lblPerformanceScore = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        btnHome.setBackground(new java.awt.Color(51, 51, 51));
        btnHome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        btnHome.setBorderPainted(false);
        btnHome.addActionListener(this::btnHomeActionPerformed);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Pictures\\Screenshots\\Screenshot 2026-03-23 150100.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESOLVIFY");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Efficiency through Resolution");

        btnSupport.setBackground(new java.awt.Color(51, 51, 51));
        btnSupport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSupport.setForeground(new java.awt.Color(255, 255, 255));
        btnSupport.setText("Support");
        btnSupport.setBorderPainted(false);
        btnSupport.addActionListener(this::btnSupportActionPerformed);

        btnViewProviderCenter.setBackground(new java.awt.Color(51, 51, 51));
        btnViewProviderCenter.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnViewProviderCenter.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProviderCenter.setText("view provider");
        btnViewProviderCenter.setBorderPainted(false);
        btnViewProviderCenter.addActionListener(this::btnViewProviderCenterActionPerformed);

        btnJobBoard.setBackground(new java.awt.Color(51, 51, 51));
        btnJobBoard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnJobBoard.setForeground(new java.awt.Color(255, 255, 255));
        btnJobBoard.setText("job ");
        btnJobBoard.setBorderPainted(false);
        btnJobBoard.addActionListener(this::btnJobBoardActionPerformed);

        btnSearchServicePage.setBackground(new java.awt.Color(51, 51, 51));
        btnSearchServicePage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearchServicePage.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchServicePage.setText("SearchServicePage");
        btnSearchServicePage.setBorderPainted(false);
        btnSearchServicePage.addActionListener(this::btnSearchServicePageActionPerformed);

        btnAddProvider.setBackground(new java.awt.Color(51, 51, 51));
        btnAddProvider.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddProvider.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProvider.setText("Add provider");
        btnAddProvider.setBorderPainted(false);
        btnAddProvider.addActionListener(this::btnAddProviderActionPerformed);

        btnBackLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnBackLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBackLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnBackLogin.setText("Back to Login");
        btnBackLogin.setBorderPainted(false);
        btnBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBackLogin.addActionListener(this::btnBackLoginActionPerformed);

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.setBorderPainted(false);
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        btnComplaintRegister1.setBackground(new java.awt.Color(51, 51, 51));
        btnComplaintRegister1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnComplaintRegister1.setForeground(new java.awt.Color(255, 255, 255));
        btnComplaintRegister1.setText("Complaint register");
        btnComplaintRegister1.setBorderPainted(false);
        btnComplaintRegister1.addActionListener(this::btnComplaintRegister1ActionPerformed);

        btnReviewPage.setBackground(new java.awt.Color(51, 51, 51));
        btnReviewPage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReviewPage.setForeground(new java.awt.Color(255, 255, 255));
        btnReviewPage.setText("Review");
        btnReviewPage.setBorderPainted(false);
        btnReviewPage.addActionListener(this::btnReviewPageActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReviewPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJobBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewProviderCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnComplaintRegister1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                .addComponent(btnSupport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnSearchServicePage, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddProvider, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnViewProviderCenter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnComplaintRegister1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnJobBoard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchServicePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddProvider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReviewPage)
                .addGap(12, 12, 12)
                .addComponent(btnSupport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBackLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        cardTotalProviders.setBackground(new java.awt.Color(0, 0, 0));
        cardTotalProviders.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 3, 3, new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Providers");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-03-22 190545.png")); // NOI18N
        jLabel8.setText("jLabel8");

        lblTotalCount.setBackground(new java.awt.Color(0, 0, 51));
        lblTotalCount.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTotalCount.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalCount.setText("0");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Active");

        javax.swing.GroupLayout cardTotalProvidersLayout = new javax.swing.GroupLayout(cardTotalProviders);
        cardTotalProviders.setLayout(cardTotalProvidersLayout);
        cardTotalProvidersLayout.setHorizontalGroup(
            cardTotalProvidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardTotalProvidersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardTotalProvidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardTotalProvidersLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cardTotalProvidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardTotalProvidersLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardTotalProvidersLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalCount))))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardTotalProvidersLayout.setVerticalGroup(
            cardTotalProvidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardTotalProvidersLayout.createSequentialGroup()
                .addGroup(cardTotalProvidersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cardTotalProvidersLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTotalCount, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addGroup(cardTotalProvidersLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RESOLVIFY");

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dashboard");

        btnComplaintRegister.setBackground(new java.awt.Color(204, 153, 0));
        btnComplaintRegister.setText("Complaint register");
        btnComplaintRegister.addActionListener(this::btnComplaintRegisterActionPerformed);

        cardRegisteredComplaints.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Registered Complaints");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-05-07 191319.png")); // NOI18N

        lblRegisteredCount.setBackground(new java.awt.Color(102, 204, 0));
        lblRegisteredCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblRegisteredCount.setForeground(new java.awt.Color(255, 255, 255));
        lblRegisteredCount.setText("0");

        javax.swing.GroupLayout cardRegisteredComplaintsLayout = new javax.swing.GroupLayout(cardRegisteredComplaints);
        cardRegisteredComplaints.setLayout(cardRegisteredComplaintsLayout);
        cardRegisteredComplaintsLayout.setHorizontalGroup(
            cardRegisteredComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardRegisteredComplaintsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardRegisteredComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(lblRegisteredCount))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardRegisteredComplaintsLayout.setVerticalGroup(
            cardRegisteredComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardRegisteredComplaintsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardRegisteredComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cardRegisteredComplaintsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRegisteredCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        cardPending.setBackground(new java.awt.Color(102, 0, 102));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Pending Investigations");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-05-07 191713.png")); // NOI18N
        jLabel14.setText("jLabel8");

        lblPendingCount.setBackground(new java.awt.Color(102, 204, 0));
        lblPendingCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblPendingCount.setForeground(new java.awt.Color(255, 255, 255));
        lblPendingCount.setText("0");

        javax.swing.GroupLayout cardPendingLayout = new javax.swing.GroupLayout(cardPending);
        cardPending.setLayout(cardPendingLayout);
        cardPendingLayout.setHorizontalGroup(
            cardPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPendingLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPendingCount)
                    .addComponent(jLabel13))
                .addContainerGap())
        );
        cardPendingLayout.setVerticalGroup(
            cardPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardPendingLayout.createSequentialGroup()
                .addGroup(cardPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(cardPendingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPendingCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardPendingLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardResolved.setBackground(new java.awt.Color(51, 0, 102));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-05-07 191718.png")); // NOI18N
        jLabel16.setText("jLabel8");

        lblResolvedCount.setBackground(new java.awt.Color(102, 204, 0));
        lblResolvedCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResolvedCount.setForeground(new java.awt.Color(255, 255, 255));
        lblResolvedCount.setText("0");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Resolved Cases");

        javax.swing.GroupLayout cardResolvedLayout = new javax.swing.GroupLayout(cardResolved);
        cardResolved.setLayout(cardResolvedLayout);
        cardResolvedLayout.setHorizontalGroup(
            cardResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardResolvedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(lblResolvedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        cardResolvedLayout.setVerticalGroup(
            cardResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardResolvedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardResolvedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardResolvedLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResolvedCount, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        welcomePanel.setBackground(new java.awt.Color(0, 0, 0));
        welcomePanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Welcome back,");

        lblAdminName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAdminName.setForeground(new java.awt.Color(255, 255, 255));
        lblAdminName.setText("jLabel18");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("RESOLVIFY - Efficiency through Resolution. Effortlessly managing service providers.");

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-05-09 183704.png")); // NOI18N

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(welcomePanelLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(welcomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblAdminName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelAnalysis.setBackground(new java.awt.Color(0, 0, 0));
        panelAnalysis.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recent Activity Analysis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        panelAnalysis.setForeground(new java.awt.Color(255, 255, 255));
        panelAnalysis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        tblRecent.setBackground(new java.awt.Color(51, 51, 51));
        tblRecent.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tblRecent.setForeground(new java.awt.Color(255, 255, 255));
        tblRecent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Complaint ID", "Provider Name", "Service", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblRecent);

        panelAnalysis.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 910, 218));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-05-09 182241.png")); // NOI18N
        jLabel22.setText("jLabel22");

        lblPerformanceScore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPerformanceScore.setForeground(new java.awt.Color(255, 255, 255));
        lblPerformanceScore.setText("85");
        lblPerformanceScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPerformanceScoreMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Complaints Resolved Successfully");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 70, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(lblPerformanceScore, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPerformanceScore)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        lblDateTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDateTime.setForeground(new java.awt.Color(255, 255, 255));
        lblDateTime.setText("jLabel22");

        jProgressBar1.setForeground(new java.awt.Color(0, 102, 0));
        jProgressBar1.setStringPainted(true);

        jProgressBar2.setForeground(new java.awt.Color(0, 102, 51));
        jProgressBar2.setStringPainted(true);

        jProgressBar4.setForeground(new java.awt.Color(0, 102, 0));
        jProgressBar4.setStringPainted(true);

        jProgressBar3.setForeground(new java.awt.Color(0, 102, 0));
        jProgressBar3.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cardTotalProviders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnComplaintRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cardRegisteredComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cardResolved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cardPending, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 927, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cardRegisteredComplaints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cardResolved, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cardPending, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(welcomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblDateTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cardTotalProviders, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnComplaintRegister)
                                .addGap(45, 45, 45)))
                        .addComponent(panelAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackLoginActionPerformed
        this.dispose(); // Close Dashboard
    new Login().setVisible(true); // Assuming your login class is named 'Login'
    }//GEN-LAST:event_btnBackLoginActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
    int a = javax.swing.JOptionPane.showConfirmDialog(this, "Logout confirm?", "Select", 0);
if (a == 0) {
    new Login().setVisible(true); // Login screen khulegi
    this.dispose(); // Dashboard band hoga
}
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProviderActionPerformed
new AddProvider().setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnAddProviderActionPerformed

    private void btnSupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupportActionPerformed
        // TODO add your handling code here:
        new SupportPage().setVisible(true);
    }//GEN-LAST:event_btnSupportActionPerformed

    private void btnViewProviderCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProviderCenterActionPerformed
      new ViewProvider().setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnViewProviderCenterActionPerformed

    private void btnJobBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobBoardActionPerformed
                                           this.dispose(); 
    new job("").setVisible(true); 
    }//GEN-LAST:event_btnJobBoardActionPerformed

    private void btnComplaintRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComplaintRegisterActionPerformed
        // TODO add your handling code here:
        new complaintRegister().setVisible(true);
    }//GEN-LAST:event_btnComplaintRegisterActionPerformed

    private void btnSearchServicePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchServicePageActionPerformed
        // TODO add your handling code here:
        new searchServicePage().setVisible(true);
    }//GEN-LAST:event_btnSearchServicePageActionPerformed

    private void btnComplaintRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComplaintRegister1ActionPerformed
        // TODO add your handling code here:
        new complaintRegister().setVisible(true);
    }//GEN-LAST:event_btnComplaintRegister1ActionPerformed

    private void btnReviewPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewPageActionPerformed
        // TODO add your handling code here:
          this.dispose(); 
    new ReviewPage().setVisible(true); 
    }//GEN-LAST:event_btnReviewPageActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
          new HomePage().setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void lblPerformanceScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPerformanceScoreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPerformanceScoreMouseClicked

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        // "Admin" ek temporary naam hai taaki error chala jaye aur dashboard khul sake
        new Dashboard("Admin").setVisible(true); 
    });
}
    public void updatePerformance() {
 
    try {
        java.sql.Connection con = myconnection.getconnectivity();
        java.sql.Statement st = con.createStatement();
        
        // 1. Total Complaints count
        java.sql.ResultSet rs1 = st.executeQuery("SELECT COUNT(*) FROM complaints");
        rs1.next();
        double total = rs1.getInt(1);
        
        // 2. Resolved + In-Progress count (Dono ko progress maana jayega)
        java.sql.ResultSet rs2 = st.executeQuery("SELECT COUNT(*) FROM complaints WHERE status = 'Resolved' OR status = 'In-Progress'");
        rs2.next();
        double ongoingPlusResolved = rs2.getInt(1); 
        
        // 3. Performance Score Calculate karein
        if (total > 0) {
            int percentage = (int) ((ongoingPlusResolved / total) * 100);
            lblPerformanceScore.setText(percentage + "%");
            // Agar aapka progress circle component hai, toh repaint call karein
            // progressCircle.repaint(); 
        } else {
            lblPerformanceScore.setText("0%");
        }
        
        con.close();
    } catch (Exception e) {
        System.out.println("Performance Score Error: " + e.getMessage());
    }

}
 public void updateStats() {
    try {
        java.sql.Connection con = myconnection.getconnectivity();
        
        // 1. Total Providers
        String sqlProviders = "SELECT COUNT(*) FROM providers"; 
        java.sql.PreparedStatement pst1 = con.prepareStatement(sqlProviders);
        java.sql.ResultSet rs1 = pst1.executeQuery();
        if(rs1.next()) {
            int totalP = rs1.getInt(1);
            lblTotalCount.setText(String.valueOf(totalP));
            // Bar 1 update: Providers count (Maan lo max capacity 50 hai)
            jProgressBar1.setValue(totalP * 2); 
            jProgressBar1.setString("Providers: " + totalP);
        }

        // 2. Registered Complaints (Total)
        String sqlComplaints = "SELECT COUNT(*) FROM complaints"; 
        java.sql.PreparedStatement pst2 = con.prepareStatement(sqlComplaints);
        java.sql.ResultSet rs2 = pst2.executeQuery();
        if(rs2.next()) {
            int totalC = rs2.getInt(1);
            lblRegisteredCount.setText(String.valueOf(totalC));
            // Bar 2 update: Total load
            jProgressBar2.setValue(totalC > 100 ? 100 : totalC); 
            jProgressBar2.setString("Total Load: " + totalC);
        }

        // 3. Pending Investigations
        String sqlPending = "SELECT COUNT(*) FROM complaints WHERE status = 'Pending'"; 
        java.sql.PreparedStatement pst3 = con.prepareStatement(sqlPending);
        java.sql.ResultSet rs3 = pst3.executeQuery();
        if(rs3.next()) {
            int pending = rs3.getInt(1);
            lblPendingCount.setText(String.valueOf(pending));
            // Bar 4 update (Pending percentage)
            jProgressBar4.setValue(pending * 10);
            jProgressBar4.setString("Pending: " + pending);
        }

        // 4. Resolved Cases
        String sqlResolved = "SELECT COUNT(*) FROM complaints WHERE status = 'Resolved'"; 
        java.sql.PreparedStatement pst4 = con.prepareStatement(sqlResolved);
        java.sql.ResultSet rs4 = pst4.executeQuery();
        if(rs4.next()) {
            int resolved = rs4.getInt(1);
            lblResolvedCount.setText(String.valueOf(resolved));
            // Bar 3 update: Success Rate
            jProgressBar3.setValue(resolved * 10);
            jProgressBar3.setString("Resolved: " + resolved);
        }

        con.close();
    } catch (Exception e) {
        System.out.println("Database Error: " + e.getMessage());
        lblTotalCount.setText("!"); 
        lblRegisteredCount.setText("!"); 
    }

}
 
public void loadRecentComplaints() {
    DefaultTableModel model = (DefaultTableModel) tblRecent.getModel();
    model.setRowCount(0); // Purana data saaf karo
    try {
        java.sql.Connection con = myconnection.getconnectivity();
        java.sql.Statement st = con.createStatement();
        // Sirf top 5 ya 10 complaints dikhao latest wali
       // Sahi columns ke saath query:
java.sql.ResultSet rs = st.executeQuery("SELECT id, company_name, category, status FROM complaints ORDER BY id DESC LIMIT 10");

while(rs.next()) {
    model.addRow(new Object[]{
        rs.getString("id"),
        rs.getString("company_name"), // SQL ke 'company_name' ko uthao
        rs.getString("category"),     // SQL ke 'category' ko uthao
        rs.getString("status")
    });
}
        con.close();
    } catch (Exception e) {
        System.out.println("Error loading table: " + e.getMessage());
    }
}
private void startClock() {
    // Timer class use karenge jo har 1000ms (1 second) baad run hoga
    javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            // Aaj ki date aur time format karo
            java.time.LocalDateTime now = java.time.LocalDateTime.now();
            java.time.format.DateTimeFormatter formatter = 
                java.time.format.DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy  HH:mm:ss");
            
            // Label par set karo
            lblDateTime.setText(now.format(formatter));
        }
    });
    timer.start(); // Timer shuru karo
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProvider;
    private javax.swing.JButton btnBackLogin;
    private javax.swing.JButton btnComplaintRegister;
    private javax.swing.JButton btnComplaintRegister1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnJobBoard;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReviewPage;
    private javax.swing.JButton btnSearchServicePage;
    private javax.swing.JButton btnSupport;
    private javax.swing.JButton btnViewProviderCenter;
    private javax.swing.JPanel cardPending;
    private javax.swing.JPanel cardRegisteredComplaints;
    private javax.swing.JPanel cardResolved;
    private javax.swing.JPanel cardTotalProviders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdminName;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblPendingCount;
    private javax.swing.JLabel lblPerformanceScore;
    private javax.swing.JLabel lblRegisteredCount;
    private javax.swing.JLabel lblResolvedCount;
    private javax.swing.JLabel lblTotalCount;
    private javax.swing.JPanel panelAnalysis;
    private javax.swing.JTable tblRecent;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
