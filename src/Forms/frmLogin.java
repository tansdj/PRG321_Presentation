/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;

/**
 *
 * @author Eldane
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        pnlLoginDetails.setBackground(new Color(0,0,0,150));
        cbxForgotPassword.setBackground(new Color(0,0,0,0));
        this.setLocationRelativeTo(null); // Centers form in the middle of screen
        btnRegister.setOpaque(false);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setBorderPainted(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        lblBCLogo = new javax.swing.JLabel();
        lblStationary1 = new javax.swing.JLabel();
        lblSystem = new javax.swing.JLabel();
        pnlLoginDetails = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblAccessLevel = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        cmbAccessLevel = new javax.swing.JComboBox<>();
        pnlLoginHeader = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        pnlLoginHeader1 = new javax.swing.JPanel();
        cbxForgotPassword = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLoginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome - Login");
        setMaximumSize(new java.awt.Dimension(700, 600));
        setName("frmLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 530));
        setResizable(false);

        pnlLogin.setMaximumSize(new java.awt.Dimension(700, 400));
        pnlLogin.setPreferredSize(new java.awt.Dimension(700, 600));
        pnlLogin.setLayout(null);

        lblBCLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/BC_Logo.png"))); // NOI18N
        lblBCLogo.setLabelFor(lblBCLogo);
        pnlLogin.add(lblBCLogo);
        lblBCLogo.setBounds(40, 10, 220, 110);

        lblStationary1.setFont(new java.awt.Font("Ink Free", 1, 44)); // NOI18N
        lblStationary1.setForeground(new java.awt.Color(255, 255, 255));
        lblStationary1.setText("Stationary Management");
        pnlLogin.add(lblStationary1);
        lblStationary1.setBounds(150, 40, 570, 60);

        lblSystem.setFont(new java.awt.Font("Ink Free", 1, 44)); // NOI18N
        lblSystem.setForeground(new java.awt.Color(255, 255, 255));
        lblSystem.setText("System");
        pnlLogin.add(lblSystem);
        lblSystem.setBounds(170, 90, 260, 40);

        pnlLoginDetails.setBackground(new java.awt.Color(0, 0, 0));
        pnlLoginDetails.setLayout(null);

        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username:");
        pnlLoginDetails.add(lblUsername);
        lblUsername.setBounds(90, 90, 82, 21);

        lblAccessLevel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblAccessLevel.setForeground(new java.awt.Color(255, 255, 255));
        lblAccessLevel.setText("Access Level:");
        pnlLoginDetails.add(lblAccessLevel);
        lblAccessLevel.setBounds(90, 200, 103, 21);

        lblPassword.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        pnlLoginDetails.add(lblPassword);
        lblPassword.setBounds(90, 130, 76, 21);

        txtPassword.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLoginDetails.add(txtPassword);
        txtPassword.setBounds(250, 130, 180, 25);

        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlLoginDetails.add(txtUsername);
        txtUsername.setBounds(250, 90, 180, 25);

        cmbAccessLevel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cmbAccessLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Administrator" }));
        pnlLoginDetails.add(cmbAccessLevel);
        cmbAccessLevel.setBounds(250, 200, 180, 27);

        pnlLoginHeader.setBackground(new java.awt.Color(204, 0, 0));

        lblLogin.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/login1.png"))); // NOI18N
        lblLogin.setText("LOGIN");

        javax.swing.GroupLayout pnlLoginHeaderLayout = new javax.swing.GroupLayout(pnlLoginHeader);
        pnlLoginHeader.setLayout(pnlLoginHeaderLayout);
        pnlLoginHeaderLayout.setHorizontalGroup(
            pnlLoginHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginHeaderLayout.createSequentialGroup()
                .addContainerGap(203, Short.MAX_VALUE)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        pnlLoginHeaderLayout.setVerticalGroup(
            pnlLoginHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLoginDetails.add(pnlLoginHeader);
        pnlLoginHeader.setBounds(0, 0, 520, 50);

        pnlLoginHeader1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout pnlLoginHeader1Layout = new javax.swing.GroupLayout(pnlLoginHeader1);
        pnlLoginHeader1.setLayout(pnlLoginHeader1Layout);
        pnlLoginHeader1Layout.setHorizontalGroup(
            pnlLoginHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        pnlLoginHeader1Layout.setVerticalGroup(
            pnlLoginHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        pnlLoginDetails.add(pnlLoginHeader1);
        pnlLoginHeader1.setBounds(0, 0, 520, 60);

        cbxForgotPassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxForgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        cbxForgotPassword.setText("Forgot Password?");
        cbxForgotPassword.setBorder(null);
        cbxForgotPassword.setFocusPainted(false);
        cbxForgotPassword.setOpaque(false);
        cbxForgotPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbxForgotPasswordKeyPressed(evt);
            }
        });
        pnlLoginDetails.add(cbxForgotPassword);
        cbxForgotPassword.setBounds(250, 160, 180, 29);

        btnLogin.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLoginDetails.add(btnLogin);
        btnLogin.setBounds(340, 260, 90, 30);

        btnRegister.setBackground(new java.awt.Color(0, 0, 0));
        btnRegister.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 0));
        btnRegister.setText("Register Here");
        btnRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegister.setFocusPainted(false);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        pnlLoginDetails.add(btnRegister);
        btnRegister.setBounds(230, 300, 160, 27);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Not Registered Yet?");
        pnlLoginDetails.add(jLabel1);
        jLabel1.setBounds(120, 300, 150, 30);

        pnlLogin.add(pnlLoginDetails);
        pnlLoginDetails.setBounds(90, 150, 520, 340);

        lblLoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/background 4.jpg"))); // NOI18N
        lblLoginBackground.setMaximumSize(new java.awt.Dimension(700, 600));
        lblLoginBackground.setMinimumSize(new java.awt.Dimension(620, 397));
        lblLoginBackground.setOpaque(true);
        lblLoginBackground.setPreferredSize(new java.awt.Dimension(700, 600));
        pnlLogin.add(lblLoginBackground);
        lblLoginBackground.setBounds(0, 0, 700, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxForgotPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbxForgotPasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxForgotPasswordKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       AdministratorMainDash adminDash = new AdministratorMainDash();
       adminDash.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        frmRegisterUser register = new frmRegisterUser();
        register.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JCheckBox cbxForgotPassword;
    private javax.swing.JComboBox<String> cmbAccessLevel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAccessLevel;
    private javax.swing.JLabel lblBCLogo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLoginBackground;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStationary1;
    private javax.swing.JLabel lblSystem;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlLoginDetails;
    private javax.swing.JPanel pnlLoginHeader;
    private javax.swing.JPanel pnlLoginHeader1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
