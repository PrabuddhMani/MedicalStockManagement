package Project;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Base = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LogoName = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        HomeIcon = new javax.swing.JLabel();
        Home = new java.awt.Button();
        AddStocks = new java.awt.Button();
        RemoveStocks = new java.awt.Button();
        LogOut = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ContactUs = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        Address = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AddPanel = new javax.swing.JPanel();
        addstock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DASHBOARD");

        Base.setPreferredSize(new java.awt.Dimension(1366, 768));
        Base.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(633, 768));

        Logo.setForeground(new java.awt.Color(0, 102, 102));
        Logo.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\ResizeImages\\logo.jpg")); // NOI18N

        LogoName.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        LogoName.setForeground(new java.awt.Color(255, 255, 255));
        LogoName.setText("Vandana Nursing Home");

        User.setBackground(new java.awt.Color(0, 102, 102));
        User.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\ResizeImages\\user.png")); // NOI18N
        User.setText("   Administrator");

        HomeIcon.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\ResizeImages\\home.png")); // NOI18N

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(0, 102, 102));
        Home.setLabel("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        AddStocks.setBackground(new java.awt.Color(255, 255, 255));
        AddStocks.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        AddStocks.setForeground(new java.awt.Color(0, 102, 102));
        AddStocks.setLabel("Add New Stocks");
        AddStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStocksActionPerformed(evt);
            }
        });

        RemoveStocks.setBackground(new java.awt.Color(255, 255, 255));
        RemoveStocks.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        RemoveStocks.setForeground(new java.awt.Color(0, 102, 102));
        RemoveStocks.setLabel("Sell Stocks");
        RemoveStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveStocksActionPerformed(evt);
            }
        });

        LogOut.setBackground(new java.awt.Color(255, 255, 255));
        LogOut.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        LogOut.setForeground(new java.awt.Color(0, 102, 102));
        LogOut.setLabel("LogOut");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DASHBOARD");

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\ResizeImages\\download-to-storage-drive.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\ResizeImages\\sign-out-option.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\ResizeImages\\power-button-off.png")); // NOI18N

        ContactUs.setBackground(new java.awt.Color(255, 255, 255));
        ContactUs.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        ContactUs.setForeground(new java.awt.Color(0, 102, 102));
        ContactUs.setLabel("Contact Us");
        ContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactUsActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\ResizeImages\\telephone-symbol-button.png")); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogoName))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ContactUs, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                                .addComponent(HomeIcon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(RightLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RemoveStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(RightLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AddStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Logo))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(LogoName)))
                .addGap(33, 33, 33)
                .addComponent(User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(HomeIcon)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(AddStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(RemoveStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addComponent(ContactUs, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(44, 44, 44)))
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(81, 81, 81))))
        );

        Base.add(Right);
        Right.setBounds(0, 0, 360, 768);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(633, 768));

        Address.setFont(new java.awt.Font("Malgun Gothic", 1, 48)); // NOI18N
        Address.setForeground(new java.awt.Color(0, 102, 102));
        Address.setText("Vandana Nursing Home");

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Mau, Chitrakoot-Prayagraj Road, Uttarpradesh");

        AddPanel.setBackground(new java.awt.Color(0, 102, 102));
        AddPanel.setForeground(new java.awt.Color(0, 102, 102));

        addstock.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        addstock.setForeground(new java.awt.Color(255, 255, 255));
        addstock.setText("Home");

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(addstock)
                .addGap(19, 19, 19))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(addstock)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Address, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33)))
                .addGap(118, 118, 118)
                .addComponent(AddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(553, Short.MAX_VALUE))
            .addComponent(AddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Base.add(Left);
        Left.setBounds(360, 0, 1010, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        DashBoard dash = new DashBoard();
        dash.setVisible(true);
        dash.pack();
        dash.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void ContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactUsActionPerformed
        // TODO add your handling code here:
        ContactUs cs = new ContactUs();
        cs.setVisible(true);
        cs.pack();
        cs.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ContactUsActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogOutActionPerformed

    private void AddStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStocksActionPerformed
        // TODO add your handling code here:
        AddStocks as = new AddStocks();
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_AddStocksActionPerformed

    private void RemoveStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveStocksActionPerformed
        // TODO add your handling code here:
        SellStocks rs = new SellStocks();
        rs.setVisible(true);
        rs.pack();
        rs.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_RemoveStocksActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPanel;
    private java.awt.Button AddStocks;
    private javax.swing.JLabel Address;
    private javax.swing.JPanel Base;
    private java.awt.Button ContactUs;
    private java.awt.Button Home;
    private javax.swing.JLabel HomeIcon;
    private javax.swing.JPanel Left;
    private java.awt.Button LogOut;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoName;
    private java.awt.Button RemoveStocks;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel User;
    private javax.swing.JLabel addstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new DashBoard().setVisible(true);
        });
    }
}
