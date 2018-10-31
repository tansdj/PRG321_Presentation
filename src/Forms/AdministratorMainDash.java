/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Eldane
 */
public class AdministratorMainDash extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorMainDash
     */
    public AdministratorMainDash() {
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

        pnlRegisterHeader = new javax.swing.JPanel();
        pnlRegisterHeader1 = new javax.swing.JPanel();
        lblMainDashboard = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnManageStock = new javax.swing.JButton();
        btnManageUser = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnManageRequests = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlRegisterHeader.setBackground(new java.awt.Color(255, 255, 0));
        pnlRegisterHeader.setPreferredSize(new java.awt.Dimension(1071, 530));

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

        javax.swing.GroupLayout pnlRegisterHeaderLayout = new javax.swing.GroupLayout(pnlRegisterHeader);
        pnlRegisterHeader.setLayout(pnlRegisterHeaderLayout);
        pnlRegisterHeaderLayout.setHorizontalGroup(
            pnlRegisterHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegisterHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        pnlRegisterHeaderLayout.setVerticalGroup(
            pnlRegisterHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterHeaderLayout.createSequentialGroup()
                .addComponent(pnlRegisterHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.setBackground(new java.awt.Color(40, 40, 40));

        btnManageStock.setBackground(new java.awt.Color(204, 0, 0));
        btnManageStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnManageStock.setForeground(new java.awt.Color(255, 255, 255));
        btnManageStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/products.png"))); // NOI18N
        btnManageStock.setText("Manage Stock");
        btnManageStock.setBorder(null);
        btnManageStock.setBorderPainted(false);
        btnManageStock.setContentAreaFilled(false);
        btnManageStock.setFocusPainted(false);
        btnManageStock.setIconTextGap(20);
        btnManageStock.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/products_Red.png"))); // NOI18N
        btnManageStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStockActionPerformed(evt);
            }
        });

        btnManageUser.setBackground(new java.awt.Color(40, 40, 40));
        btnManageUser.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnManageUser.setForeground(new java.awt.Color(255, 255, 255));
        btnManageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/clients.png"))); // NOI18N
        btnManageUser.setText("Manage User");
        btnManageUser.setBorder(null);
        btnManageUser.setBorderPainted(false);
        btnManageUser.setContentAreaFilled(false);
        btnManageUser.setFocusPainted(false);
        btnManageUser.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnManageUser.setIconTextGap(30);
        btnManageUser.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/clients_Red.png"))); // NOI18N
        btnManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageUserActionPerformed(evt);
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
        btnExit.setFocusPainted(false);
        btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExit.setIconTextGap(110);
        btnExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/LogOut1_red.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnManageRequests.setBackground(new java.awt.Color(40, 40, 40));
        btnManageRequests.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnManageRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnManageRequests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View.png"))); // NOI18N
        btnManageRequests.setText("Manage Orders");
        btnManageRequests.setBorder(null);
        btnManageRequests.setBorderPainted(false);
        btnManageRequests.setContentAreaFilled(false);
        btnManageRequests.setFocusPainted(false);
        btnManageRequests.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnManageRequests.setIconTextGap(10);
        btnManageRequests.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View_Red.png"))); // NOI18N
        btnManageRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnManageStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnManageUser, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
            .addComponent(btnManageRequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnManageStock, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnManageRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(pnlRegisterHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegisterHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageUserActionPerformed
        frmViewUsers viewUser = new frmViewUsers();
        viewUser.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageUserActionPerformed

    private void btnManageStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStockActionPerformed
        frmAddProduct addProduct = new frmAddProduct();
        addProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageStockActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnManageRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestsActionPerformed
        frmManageOrders manageO = new frmManageOrders();
        manageO.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageRequestsActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(AdministratorMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorMainDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorMainDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnManageRequests;
    private javax.swing.JButton btnManageStock;
    private javax.swing.JButton btnManageUser;
    private javax.swing.JLabel lblMainDashboard;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlRegisterHeader;
    private javax.swing.JPanel pnlRegisterHeader1;
    // End of variables declaration//GEN-END:variables
}
