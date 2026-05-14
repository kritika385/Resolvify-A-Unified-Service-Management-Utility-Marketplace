
package com.mycompany.complaintapplication;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; // Exception handle karne ke liye
public class HomePage extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(HomePage.class.getName());

   public HomePage() {
    initComponents();
    // HomePage Constructor ke andar
new javax.swing.Timer(30000, e -> updateCylinderStats()).start();
    // 1. Initial Data Load (Page khulte hi stats dikhein)
    updateCylinderStats();

    // 2. Auto-Refresh Timer (Har 5 second mein database se naya data check karega)
    new javax.swing.Timer(5000, e -> updateCylinderStats()).start();

    // 3. Buttons setup (Hover effects apply karne ke liye loop)
    javax.swing.JButton[] sidebarButtons = {btnGas, btnWifi, btnComplaints, btnJobs, btnReviews, btnSpeedTest, btnLogout};
    for (javax.swing.JButton b : sidebarButtons) {
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setHoverEffect(b); // Aapka banaya hua hover method yahan call karein
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGas = new javax.swing.JButton();
        btnJobs = new javax.swing.JButton();
        btnWifi = new javax.swing.JButton();
        btnComplaints = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnReviews = new javax.swing.JButton();
        btnSpeedTest = new javax.swing.JButton();
        btnBackToDash = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cardStatus = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtActivityFeed = new javax.swing.JTextArea();
        jProgressBar1 = new javax.swing.JProgressBar();
        pbHP = new javax.swing.JProgressBar();
        lblHPCount = new javax.swing.JLabel();
        pbBharat = new javax.swing.JProgressBar();
        lblBharatCount = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cardGas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cardWifi = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cardComplaints = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cardJobs = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RESOLVIFY");

        btnGas.setBackground(new java.awt.Color(51, 51, 51));
        btnGas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGas.setForeground(new java.awt.Color(255, 255, 255));
        btnGas.setText("GAS SUPPLY");
        btnGas.setBorderPainted(false);
        btnGas.setContentAreaFilled(false);
        btnGas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGas.addActionListener(this::btnGasActionPerformed);

        btnJobs.setBackground(new java.awt.Color(51, 51, 51));
        btnJobs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnJobs.setForeground(new java.awt.Color(255, 255, 255));
        btnJobs.setText("FIND JOBS");
        btnJobs.setBorderPainted(false);
        btnJobs.setContentAreaFilled(false);
        btnJobs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJobs.addActionListener(this::btnJobsActionPerformed);

        btnWifi.setBackground(new java.awt.Color(51, 51, 51));
        btnWifi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnWifi.setForeground(new java.awt.Color(255, 255, 255));
        btnWifi.setText("WIFI BOOKING");
        btnWifi.setBorderPainted(false);
        btnWifi.setContentAreaFilled(false);
        btnWifi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWifi.addActionListener(this::btnWifiActionPerformed);

        btnComplaints.setBackground(new java.awt.Color(51, 51, 51));
        btnComplaints.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnComplaints.setForeground(new java.awt.Color(255, 255, 255));
        btnComplaints.setText("COMPLAINTS");
        btnComplaints.setBorderPainted(false);
        btnComplaints.setContentAreaFilled(false);
        btnComplaints.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComplaints.addActionListener(this::btnComplaintsActionPerformed);

        btnLogout.setBackground(new java.awt.Color(51, 51, 51));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.setBorderPainted(false);
        btnLogout.setContentAreaFilled(false);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(this::btnLogoutActionPerformed);

        btnReviews.setBackground(new java.awt.Color(51, 51, 51));
        btnReviews.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReviews.setForeground(new java.awt.Color(255, 255, 255));
        btnReviews.setText("REVIEWS");
        btnReviews.setBorderPainted(false);
        btnReviews.setContentAreaFilled(false);
        btnReviews.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReviews.addActionListener(this::btnReviewsActionPerformed);

        btnSpeedTest.setBackground(new java.awt.Color(51, 51, 51));
        btnSpeedTest.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSpeedTest.setForeground(new java.awt.Color(255, 255, 255));
        btnSpeedTest.setText("SPEED TEST");
        btnSpeedTest.setBorderPainted(false);
        btnSpeedTest.setContentAreaFilled(false);
        btnSpeedTest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSpeedTest.addActionListener(this::btnSpeedTestActionPerformed);

        btnBackToDash.setBackground(new java.awt.Color(51, 51, 51));
        btnBackToDash.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBackToDash.setForeground(new java.awt.Color(255, 255, 255));
        btnBackToDash.setText("Dashboard");
        btnBackToDash.setBorderPainted(false);
        btnBackToDash.addActionListener(this::btnBackToDashActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackToDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnJobs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnComplaints, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReviews, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSpeedTest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(btnGas)
                .addGap(18, 18, 18)
                .addComponent(btnWifi)
                .addGap(12, 12, 12)
                .addComponent(btnComplaints)
                .addGap(18, 18, 18)
                .addComponent(btnReviews)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnJobs)
                .addGap(18, 18, 18)
                .addComponent(btnSpeedTest)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(18, 18, 18)
                .addComponent(btnBackToDash)
                .addGap(36, 36, 36))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        cardStatus.setBackground(new java.awt.Color(51, 51, 51));
        cardStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 255), 1, true));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Ongoing Status");

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));

        txtActivityFeed.setEditable(false);
        txtActivityFeed.setBackground(new java.awt.Color(51, 51, 51));
        txtActivityFeed.setColumns(20);
        txtActivityFeed.setForeground(new java.awt.Color(255, 255, 255));
        txtActivityFeed.setRows(5);
        txtActivityFeed.setBorder(null);
        jScrollPane1.setViewportView(txtActivityFeed);

        jProgressBar1.setBackground(new java.awt.Color(51, 51, 51));
        jProgressBar1.setForeground(new java.awt.Color(204, 51, 255));

        pbHP.setBackground(new java.awt.Color(255, 255, 255));
        pbHP.setForeground(new java.awt.Color(102, 0, 0));
        pbHP.setMaximum(10);

        lblHPCount.setForeground(new java.awt.Color(255, 255, 255));
        lblHPCount.setText("jLabel5");

        pbBharat.setBackground(new java.awt.Color(255, 255, 255));
        pbBharat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pbBharat.setForeground(new java.awt.Color(102, 0, 0));
        pbBharat.setMaximum(10);

        lblBharatCount.setForeground(new java.awt.Color(255, 255, 255));
        lblBharatCount.setText("jLabel2");

        javax.swing.GroupLayout cardStatusLayout = new javax.swing.GroupLayout(cardStatus);
        cardStatus.setLayout(cardStatusLayout);
        cardStatusLayout.setHorizontalGroup(
            cardStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardStatusLayout.createSequentialGroup()
                .addGroup(cardStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardStatusLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(cardStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHPCount, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBharatCount, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pbHP, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(pbBharat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(cardStatusLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(cardStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardStatusLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(cardStatusLayout.createSequentialGroup()
                                .addGroup(cardStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 15, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        cardStatusLayout.setVerticalGroup(
            cardStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardStatusLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14)
                .addGap(37, 37, 37)
                .addComponent(pbHP, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHPCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pbBharat, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBharatCount)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cardStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(cardStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblWelcome.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Welcome Back, User!");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quick Access Services");

        cardGas.setBackground(new java.awt.Color(0, 0, 0));
        cardGas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 51), 2, true));
        cardGas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardGasMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("BOOK CYLINDER");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-05-12 195020.png")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout cardGasLayout = new javax.swing.GroupLayout(cardGas);
        cardGas.setLayout(cardGasLayout);
        cardGasLayout.setHorizontalGroup(
            cardGasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cardGasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardGasLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardGasLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        cardGasLayout.setVerticalGroup(
            cardGasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardGasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        cardWifi.setBackground(new java.awt.Color(0, 0, 0));
        cardWifi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 2, true));
        cardWifi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardWifiMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("BOOK WIFI");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\complaintApplication\\src\\main\\java\\com\\mycompany\\complaintapplication\\Screenshot 2026-05-11 124031.png")); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout cardWifiLayout = new javax.swing.GroupLayout(cardWifi);
        cardWifi.setLayout(cardWifiLayout);
        cardWifiLayout.setHorizontalGroup(
            cardWifiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardWifiLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(cardWifiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardWifiLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardWifiLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31))))
        );
        cardWifiLayout.setVerticalGroup(
            cardWifiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardWifiLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cardComplaints.setBackground(new java.awt.Color(0, 0, 0));
        cardComplaints.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 2, true));
        cardComplaints.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardComplaintsMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("COMPLAINTS");

        javax.swing.GroupLayout cardComplaintsLayout = new javax.swing.GroupLayout(cardComplaints);
        cardComplaints.setLayout(cardComplaintsLayout);
        cardComplaintsLayout.setHorizontalGroup(
            cardComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardComplaintsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        cardComplaintsLayout.setVerticalGroup(
            cardComplaintsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardComplaintsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel12)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        cardJobs.setBackground(new java.awt.Color(0, 0, 0));
        cardJobs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true));
        cardJobs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cardJobsMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("JOBS");

        javax.swing.GroupLayout cardJobsLayout = new javax.swing.GroupLayout(cardJobs);
        cardJobs.setLayout(cardJobsLayout);
        cardJobsLayout.setHorizontalGroup(
            cardJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardJobsLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardJobsLayout.setVerticalGroup(
            cardJobsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardJobsLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWelcome)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cardGas, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardComplaints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cardWifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cardJobs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardGas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardWifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cardComplaints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cardJobs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGasActionPerformed
                                         
    // Naya frame/page kholne ke liye
    // Maan le tere Gas wale page ki class ka naam 'GasBooking' hai
    GasSupply gasPage = new GasSupply(); 
    gasPage.setVisible(true);
    
    // Is purane Home Page ko band karne ke liye
    this.dispose(); 

    }//GEN-LAST:event_btnGasActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
                 int a = javax.swing.JOptionPane.showConfirmDialog(this, "Logout confirm?", "Select", 0);
if (a == 0) {
    new Login().setVisible(true); // Login screen khulegi
    this.dispose(); // Dashboard band hoga
}                              
    

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnComplaintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComplaintsActionPerformed
        // TODO add your handling code here:
        new complaintRegister().setVisible(true);
    }//GEN-LAST:event_btnComplaintsActionPerformed

    private void btnJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobsActionPerformed
        // TODO add your handling code here:
                                               this.dispose(); 
    new job("").setVisible(true); 
    }//GEN-LAST:event_btnJobsActionPerformed

    private void btnReviewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewsActionPerformed
        // TODO add your handling code here:
        this.dispose(); 
    new ReviewPage().setVisible(true); 
    }//GEN-LAST:event_btnReviewsActionPerformed

    private void cardGasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardGasMouseClicked
        // TODO add your handling code here:
        new GasSupply().setVisible(true);
this.dispose();
    }//GEN-LAST:event_cardGasMouseClicked

    private void cardWifiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardWifiMouseClicked
        // TODO add your handling code here:
         new Wifi().setVisible(true);
this.dispose();
    }//GEN-LAST:event_cardWifiMouseClicked

    private void cardComplaintsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardComplaintsMouseClicked
        // TODO add your handling code here:
        new complaintRegister().setVisible(true);
this.dispose();
    }//GEN-LAST:event_cardComplaintsMouseClicked

    private void cardJobsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardJobsMouseClicked
        // TODO add your handling code here:
          new job().setVisible(true);
this.dispose();
    }//GEN-LAST:event_cardJobsMouseClicked

    private void btnBackToDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToDashActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true); // Dashboard screen khulegi
        this.dispose();
    }//GEN-LAST:event_btnBackToDashActionPerformed

    private void btnWifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWifiActionPerformed
        // TODO add your handling code here:
         new Wifi().setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnWifiActionPerformed

    private void btnSpeedTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeedTestActionPerformed
                                                 
    // Khali new SpeedTest() ki jagah 'this' pass karo
    new SpeedTest(this).setVisible(true); 


    }//GEN-LAST:event_btnSpeedTestActionPerformed
private void setHoverEffect(javax.swing.JButton btn) {
    btn.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            btn.setForeground(java.awt.Color.WHITE); // Mouse aane par White
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            btn.setForeground(new java.awt.Color(180, 180, 180)); // Mouse hatne par vapis Grey
        }
    });
}

private void updateCylinderStats() {
    java.sql.Connection con = null;
    try {
        con = myconnection.getconnectivity();
        if (con == null) return;

        // 1. Bharat Gas
        java.sql.PreparedStatement pst1 = con.prepareStatement(
            "SELECT COUNT(*) FROM cylinder_booking WHERE provider LIKE '%Bharat%'");
        java.sql.ResultSet rs1 = pst1.executeQuery();
        if(rs1.next()) {
            int count = rs1.getInt(1);
            pbBharat.setValue(count); 
            lblBharatCount.setText("Bharat: " + count);
        }

        // 2. Indian Gas
        java.sql.PreparedStatement pst2 = con.prepareStatement(
            "SELECT COUNT(*) FROM cylinder_booking WHERE provider LIKE '%Indian%'");
        java.sql.ResultSet rs2 = pst2.executeQuery();
        if(rs2.next()) {
            int count = rs2.getInt(1);
            pbHP.setValue(count);
            lblHPCount.setText("Indian: " + count);
        }

    } catch(Exception e) {
        System.out.println("Stats Error: " + e.getMessage());
    } finally {
        // Sabse important step: Connection ko hamesha close karein
        try {
            if (con != null) con.close();
        } catch (java.sql.SQLException se) {
            se.printStackTrace();
        }
    }
}
// Ise HomePage class ke andar kahin bhi paste kar do
// HomePage class ke andar ye method add karein
public javax.swing.JTextArea getTxtActivityFeed() {
    return txtActivityFeed;
}
    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(() -> new HomePage().setVisible(true));
    }
// HomePage class ke andar ye method add karein

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToDash;
    private javax.swing.JButton btnComplaints;
    private javax.swing.JButton btnGas;
    private javax.swing.JButton btnJobs;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReviews;
    private javax.swing.JButton btnSpeedTest;
    private javax.swing.JButton btnWifi;
    private javax.swing.JPanel cardComplaints;
    private javax.swing.JPanel cardGas;
    private javax.swing.JPanel cardJobs;
    private javax.swing.JPanel cardStatus;
    private javax.swing.JPanel cardWifi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBharatCount;
    private javax.swing.JLabel lblHPCount;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JProgressBar pbBharat;
    private javax.swing.JProgressBar pbHP;
    private javax.swing.JTextArea txtActivityFeed;
    // End of variables declaration//GEN-END:variables
}
