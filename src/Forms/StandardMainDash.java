/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eldane
 */
public class StandardMainDash extends javax.swing.JFrame {

    /**
     * Creates new form StandardMainDash
     */
    public StandardMainDash() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new Color(45,45,45));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainDashHeader = new javax.swing.JPanel();
        pnlRegisterHeader1 = new javax.swing.JPanel();
        lblMainDashboard = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnManageRequest = new javax.swing.JButton();
        btnManageProfile = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnViewUserDetails = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 45, 45));
        setResizable(false);

        pnlMainDashHeader.setBackground(new java.awt.Color(255, 255, 0));
        pnlMainDashHeader.setPreferredSize(new java.awt.Dimension(1071, 530));

        pnlRegisterHeader1.setBackground(new java.awt.Color(204, 0, 0));
        pnlRegisterHeader1.setPreferredSize(new java.awt.Dimension(1307, 65));

        lblMainDashboard.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblMainDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblMainDashboard.setText("Main Dashboard");
        lblMainDashboard.setAlignmentY(0.0F);

        javax.swing.GroupLayout pnlRegisterHeader1Layout = new javax.swing.GroupLayout(pnlRegisterHeader1);
        pnlRegisterHeader1.setLayout(pnlRegisterHeader1Layout);
        pnlRegisterHeader1Layout.setHorizontalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterHeader1Layout.createSequentialGroup()
                .addGap(607, 607, 607)
                .addComponent(lblMainDashboard)
                .addContainerGap(699, Short.MAX_VALUE))
        );
        pnlRegisterHeader1Layout.setVerticalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterHeader1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblMainDashboard)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlMainDashHeaderLayout = new javax.swing.GroupLayout(pnlMainDashHeader);
        pnlMainDashHeader.setLayout(pnlMainDashHeaderLayout);
        pnlMainDashHeaderLayout.setHorizontalGroup(
            pnlMainDashHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegisterHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        pnlMainDashHeaderLayout.setVerticalGroup(
            pnlMainDashHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainDashHeaderLayout.createSequentialGroup()
                .addComponent(pnlRegisterHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.setBackground(new java.awt.Color(40, 40, 40));

        btnManageRequest.setBackground(new java.awt.Color(204, 0, 0));
        btnManageRequest.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnManageRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/products.png"))); // NOI18N
        btnManageRequest.setText("Manage Request");
        btnManageRequest.setBorder(null);
        btnManageRequest.setBorderPainted(false);
        btnManageRequest.setContentAreaFilled(false);
        btnManageRequest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageRequest.setFocusPainted(false);
        btnManageRequest.setIconTextGap(34);
        btnManageRequest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/products_Red.png"))); // NOI18N
        btnManageRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestActionPerformed(evt);
            }
        });

        btnManageProfile.setBackground(new java.awt.Color(40, 40, 40));
        btnManageProfile.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnManageProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/clients.png"))); // NOI18N
        btnManageProfile.setText("Manage Profile");
        btnManageProfile.setBorder(null);
        btnManageProfile.setBorderPainted(false);
        btnManageProfile.setContentAreaFilled(false);
        btnManageProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageProfile.setFocusPainted(false);
        btnManageProfile.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnManageProfile.setIconTextGap(55);
        btnManageProfile.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/clients_Red.png"))); // NOI18N
        btnManageProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProfileActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(40, 40, 40));
        btnExit.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/LogOut1.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setFocusPainted(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExit.setIconTextGap(145);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/LogOut1_red.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnViewUserDetails.setBackground(new java.awt.Color(40, 40, 40));
        btnViewUserDetails.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnViewUserDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnViewUserDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View.png"))); // NOI18N
        btnViewUserDetails.setText("View Product Details");
        btnViewUserDetails.setActionCommand("View Details");
        btnViewUserDetails.setBorder(null);
        btnViewUserDetails.setBorderPainted(false);
        btnViewUserDetails.setContentAreaFilled(false);
        btnViewUserDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewUserDetails.setFocusPainted(false);
        btnViewUserDetails.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnViewUserDetails.setIconTextGap(10);
        btnViewUserDetails.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View_Red.png"))); // NOI18N
        btnViewUserDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewUserDetailsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnManageRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnManageProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnViewUserDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnManageRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewUserDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(700, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainDashHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMainDashHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestActionPerformed
        frmManageRequest manageRequest = new frmManageRequest();
        manageRequest.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageRequestActionPerformed

    private void btnManageProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProfileActionPerformed
        frmManageProfile manageP = new frmManageProfile();
        manageP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageProfileActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
        if(answer == 0)// yes
        {
            System.exit(0);
        }    
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnViewUserDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewUserDetailsMouseClicked
       frmViewProducts viewP = new frmViewProducts();
       viewP.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnViewUserDetailsMouseClicked

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
            java.util.logging.Logger.getLogger(StandardMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandardMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandardMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandardMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StandardMainDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManageProfile;
    private javax.swing.JButton btnManageRequest;
    private javax.swing.JButton btnViewUserDetails;
    private javax.swing.JLabel lblMainDashboard;
    private javax.swing.JPanel pnlMainDashHeader;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlRegisterHeader1;
    // End of variables declaration//GEN-END:variables
}
