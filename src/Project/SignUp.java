package Project;

import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {
    Database db = new Database();
    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Base = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LogoName = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        SignUp = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        Phone = new javax.swing.JLabel();
        PhoneText = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        PasswordText = new javax.swing.JPasswordField();
        SignUpButton = new java.awt.Button();
        Account = new javax.swing.JLabel();
        LoginButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SignUp");
        setPreferredSize(new java.awt.Dimension(1366, 768));

        Base.setPreferredSize(new java.awt.Dimension(1366, 768));
        Base.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(633, 768));

        Logo.setForeground(new java.awt.Color(0, 102, 102));
        Logo.setIcon(new javax.swing.ImageIcon("E:\\Coding\\MedicalStockManagement\\logo\\logo.jpg")); // NOI18N

        LogoName.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        LogoName.setForeground(new java.awt.Color(255, 255, 255));
        LogoName.setText("Vandana Nursing Home");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(LogoName))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(Logo)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(Logo)
                .addGap(54, 54, 54)
                .addComponent(LogoName)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        Base.add(Right);
        Right.setBounds(0, 0, 633, 768);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(633, 768));

        SignUp.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        SignUp.setForeground(new java.awt.Color(0, 102, 102));
        SignUp.setText("SIGNUP");

        Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Name.setText("Full Name");

        NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });

        Phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Phone.setText("Phone");

        PhoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTextActionPerformed(evt);
            }
        });

        Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Email.setText("Email");

        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Password.setText("Password");

        PasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextActionPerformed(evt);
            }
        });

        SignUpButton.setActionCommand("Login");
        SignUpButton.setBackground(new java.awt.Color(0, 102, 102));
        SignUpButton.setForeground(new java.awt.Color(153, 255, 255));
        SignUpButton.setLabel("SignUp");
        SignUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpButtonActionPerformed(evt);
            }
        });

        Account.setText("Have an account?");

        LoginButton.setActionCommand("Login");
        LoginButton.setBackground(new java.awt.Color(255, 204, 204));
        LoginButton.setLabel("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(Account)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(SignUp)
                        .addGap(277, 277, 277))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(305, 305, 305))))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(SignUp)
                .addGap(44, 44, 44)
                .addComponent(Name)
                .addGap(18, 18, 18)
                .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Phone)
                .addGap(18, 18, 18)
                .addComponent(PhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(Email)
                .addGap(18, 18, 18)
                .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Password)
                .addGap(18, 18, 18)
                .addComponent(PasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(SignUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(Account)
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );

        Base.add(Left);
        Left.setBounds(630, 0, 740, 770);

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

        getAccessibleContext().setAccessibleName("SignUp");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextActionPerformed

    private void SignUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpButtonActionPerformed
        // TODO add your handling code here:
        String name = NameText.getText();
        String phone = PhoneText.getText();
        String email = EmailText.getText();
        String pass = PasswordText.getText();
        if(db.InsertInfo(email, name, phone, pass)){
            JOptionPane.showMessageDialog(null, "You are registered with this System");
        }else{
            JOptionPane.showMessageDialog(null,"Error404");
        }
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_SignUpButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NameTextActionPerformed

    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextActionPerformed

    private void PhoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.JPanel Base;
    private javax.swing.JLabel Email;
    private javax.swing.JTextField EmailText;
    private javax.swing.JPanel Left;
    private java.awt.Button LoginButton;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel LogoName;
    private javax.swing.JLabel Name;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField PhoneText;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel SignUp;
    private java.awt.Button SignUpButton;
    // End of variables declaration//GEN-END:variables
}
