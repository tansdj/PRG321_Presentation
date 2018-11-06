/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import ProductManagement.ProductManagement_Methods;
import ProductManagement.UserRequest;
import bc_stationary_bll.Communication;
import bc_stationary_management_system.ClientHandler;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eldane
 */
public class frmEditRequest extends javax.swing.JFrame {

    /**
     * Creates new form frmEditRequest
     */
    public ArrayList<UserRequest> requestItems;
    Communication c;
    public frmEditRequest() {
        try {
            initComponents();
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            this.getContentPane().setBackground(new Color(45, 45, 45));
            UserRequest request = new UserRequest();
            c  = new Communication(ProductManagement_Methods.UR_SELECT_ALL.methodIdentifier, request);
            requestItems = new ClientHandler(c).request().listResult;
            
            DefaultListModel model = new DefaultListModel();
            // Populate Listbox
            for (UserRequest u : requestItems) {
                model.addElement(u);
            }
            
            lbxRequestedItems.setModel(model);
        } catch (IOException ex) {
            Logger.getLogger(frmEditRequest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        lblEditRequest = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnViewRequest = new javax.swing.JButton();
        btnAddRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnEditRequest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbxRequestedItems = new javax.swing.JList<>();
        lblProductName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMainDashHeader.setBackground(new java.awt.Color(255, 255, 0));
        pnlMainDashHeader.setPreferredSize(new java.awt.Dimension(1071, 530));

        pnlRegisterHeader1.setBackground(new java.awt.Color(204, 0, 0));
        pnlRegisterHeader1.setPreferredSize(new java.awt.Dimension(1307, 65));

        lblEditRequest.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblEditRequest.setForeground(new java.awt.Color(255, 255, 255));
        lblEditRequest.setText("Edit Request");
        lblEditRequest.setAlignmentY(0.0F);

        javax.swing.GroupLayout pnlRegisterHeader1Layout = new javax.swing.GroupLayout(pnlRegisterHeader1);
        pnlRegisterHeader1.setLayout(pnlRegisterHeader1Layout);
        pnlRegisterHeader1Layout.setHorizontalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterHeader1Layout.createSequentialGroup()
                .addGap(607, 607, 607)
                .addComponent(lblEditRequest)
                .addContainerGap(753, Short.MAX_VALUE))
        );
        pnlRegisterHeader1Layout.setVerticalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterHeader1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblEditRequest)
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
                .addComponent(pnlRegisterHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlMenu.setBackground(new java.awt.Color(40, 40, 40));

        btnViewRequest.setBackground(new java.awt.Color(40, 40, 40));
        btnViewRequest.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnViewRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnViewRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View.png"))); // NOI18N
        btnViewRequest.setText("View Request");
        btnViewRequest.setBorder(null);
        btnViewRequest.setBorderPainted(false);
        btnViewRequest.setContentAreaFilled(false);
        btnViewRequest.setFocusPainted(false);
        btnViewRequest.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnViewRequest.setIconTextGap(16);
        btnViewRequest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View_Red.png"))); // NOI18N
        btnViewRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRequestActionPerformed(evt);
            }
        });

        btnAddRequest.setBackground(new java.awt.Color(204, 0, 0));
        btnAddRequest.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnAddRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnAddRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1.png"))); // NOI18N
        btnAddRequest.setText("Add Request");
        btnAddRequest.setBorder(null);
        btnAddRequest.setBorderPainted(false);
        btnAddRequest.setContentAreaFilled(false);
        btnAddRequest.setFocusPainted(false);
        btnAddRequest.setIconTextGap(20);
        btnAddRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRequestActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 0, 0));
        btnBack.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Back1.png"))); // NOI18N
        btnBack.setText("Main Dash");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setIconTextGap(38);
        btnBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Back1_red.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEditRequest.setBackground(new java.awt.Color(204, 0, 0));
        btnEditRequest.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEditRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnEditRequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Edit1_Red.png"))); // NOI18N
        btnEditRequest.setText("Edit Request");
        btnEditRequest.setBorder(null);
        btnEditRequest.setBorderPainted(false);
        btnEditRequest.setContentAreaFilled(false);
        btnEditRequest.setFocusPainted(false);
        btnEditRequest.setIconTextGap(22);
        btnEditRequest.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Edit1_Red.png"))); // NOI18N

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditRequest, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btnAddRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnViewRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(762, Short.MAX_VALUE))
        );

        lbxRequestedItems.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbxRequestedItems.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lbxRequestedItemsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lbxRequestedItems);

        lblProductName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("Select Item to delete from list:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainDashHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(68, 68, 68)
                            .addComponent(lblProductName)
                            .addGap(731, 731, 731))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMainDashHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(lblProductName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRequestActionPerformed
        frmViewRequest viewR = new frmViewRequest();
        viewR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewRequestActionPerformed

    private void btnAddRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRequestActionPerformed
        frmManageRequest manageRequest = new frmManageRequest();
        manageRequest.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StandardMainDash mainDash = new StandardMainDash();
        mainDash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void lbxRequestedItemsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lbxRequestedItemsValueChanged
        int index = lbxRequestedItems.getSelectedIndex();
        UserRequest selectedRequest = requestItems.get(index);
        int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this request item?","Remove Request Item",JOptionPane.YES_NO_OPTION);
        if(answer == 0)// if Yes
        {
            try {
                c = new Communication(ProductManagement_Methods.UR_DELETE.methodIdentifier, selectedRequest);
                int requestDeleteSuccess = new ClientHandler(c).request().intResult;
                if(requestDeleteSuccess != -1)
                {
                    JOptionPane.showMessageDialog(null, "The request item was successfully deleted","Deletion Successful",JOptionPane.INFORMATION_MESSAGE);
                    StandardMainDash mainDash = new StandardMainDash();
                    mainDash.setVisible(true);                                    
                    this.setVisible(false);
                }
            } catch (IOException ex) {
                Logger.getLogger(frmEditRequest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lbxRequestedItemsValueChanged

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
            java.util.logging.Logger.getLogger(frmEditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEditRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEditRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRequest;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditRequest;
    private javax.swing.JButton btnViewRequest;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEditRequest;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JList<String> lbxRequestedItems;
    private javax.swing.JPanel pnlMainDashHeader;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlRegisterHeader1;
    // End of variables declaration//GEN-END:variables
}
