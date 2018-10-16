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
public class frmAddStock extends javax.swing.JFrame {

    /**
     * Creates new form frmAddStock
     */
    public frmAddStock() {
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
        lblAddStock = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnAddProduct = new javax.swing.JButton();
        btnUpdateStock = new javax.swing.JButton();
        btnViewStock = new javax.swing.JButton();
        btnAddStock = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        pnlProductInfo = new javax.swing.JPanel();
        lblProductInfo = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        pnlInStock = new javax.swing.JPanel();
        lblInStock = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        numQuantity = new javax.swing.JSpinner();
        btnInsertStock = new javax.swing.JButton();
        lblSearchProducts = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlRegisterHeader.setBackground(new java.awt.Color(255, 255, 0));
        pnlRegisterHeader.setPreferredSize(new java.awt.Dimension(1071, 530));

        pnlRegisterHeader1.setBackground(new java.awt.Color(204, 0, 0));
        pnlRegisterHeader1.setPreferredSize(new java.awt.Dimension(1307, 65));

        lblAddStock.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblAddStock.setForeground(new java.awt.Color(255, 255, 255));
        lblAddStock.setText("Add Stock");
        lblAddStock.setAlignmentY(0.0F);

        javax.swing.GroupLayout pnlRegisterHeader1Layout = new javax.swing.GroupLayout(pnlRegisterHeader1);
        pnlRegisterHeader1.setLayout(pnlRegisterHeader1Layout);
        pnlRegisterHeader1Layout.setHorizontalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterHeader1Layout.createSequentialGroup()
                .addGap(607, 607, 607)
                .addComponent(lblAddStock)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        pnlRegisterHeader1Layout.setVerticalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterHeader1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblAddStock)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlRegisterHeaderLayout = new javax.swing.GroupLayout(pnlRegisterHeader);
        pnlRegisterHeader.setLayout(pnlRegisterHeaderLayout);
        pnlRegisterHeaderLayout.setHorizontalGroup(
            pnlRegisterHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
            .addGroup(pnlRegisterHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegisterHeaderLayout.createSequentialGroup()
                    .addComponent(pnlRegisterHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 1490, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlRegisterHeaderLayout.setVerticalGroup(
            pnlRegisterHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
            .addGroup(pnlRegisterHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlRegisterHeaderLayout.createSequentialGroup()
                    .addComponent(pnlRegisterHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnlMenu.setBackground(new java.awt.Color(40, 40, 40));

        btnAddProduct.setBackground(new java.awt.Color(204, 0, 0));
        btnAddProduct.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1.png"))); // NOI18N
        btnAddProduct.setText("Add Product");
        btnAddProduct.setBorder(null);
        btnAddProduct.setBorderPainted(false);
        btnAddProduct.setContentAreaFilled(false);
        btnAddProduct.setFocusPainted(false);
        btnAddProduct.setIconTextGap(12);
        btnAddProduct.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1_Red.png"))); // NOI18N
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnUpdateStock.setBackground(new java.awt.Color(40, 40, 40));
        btnUpdateStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnUpdateStock.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Edit1.png"))); // NOI18N
        btnUpdateStock.setText("Update Stock");
        btnUpdateStock.setBorder(null);
        btnUpdateStock.setBorderPainted(false);
        btnUpdateStock.setContentAreaFilled(false);
        btnUpdateStock.setFocusPainted(false);
        btnUpdateStock.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdateStock.setIconTextGap(6);
        btnUpdateStock.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Edit1_Red.png"))); // NOI18N
        btnUpdateStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStockActionPerformed(evt);
            }
        });

        btnViewStock.setBackground(new java.awt.Color(40, 40, 40));
        btnViewStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnViewStock.setForeground(new java.awt.Color(255, 255, 255));
        btnViewStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View.png"))); // NOI18N
        btnViewStock.setText("View Stock");
        btnViewStock.setBorder(null);
        btnViewStock.setBorderPainted(false);
        btnViewStock.setContentAreaFilled(false);
        btnViewStock.setFocusPainted(false);
        btnViewStock.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnViewStock.setIconTextGap(25);
        btnViewStock.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View_Red.png"))); // NOI18N
        btnViewStock.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View_Red.png"))); // NOI18N
        btnViewStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStockActionPerformed(evt);
            }
        });

        btnAddStock.setBackground(new java.awt.Color(204, 0, 0));
        btnAddStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnAddStock.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1_Red.png"))); // NOI18N
        btnAddStock.setText("Add Stock");
        btnAddStock.setBorder(null);
        btnAddStock.setBorderPainted(false);
        btnAddStock.setContentAreaFilled(false);
        btnAddStock.setFocusPainted(false);
        btnAddStock.setIconTextGap(30);
        btnAddStock.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1_Red.png"))); // NOI18N

        btnBack.setBackground(new java.awt.Color(204, 0, 0));
        btnBack.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Back1.png"))); // NOI18N
        btnBack.setText("Main Dash");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setFocusPainted(false);
        btnBack.setIconTextGap(20);
        btnBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Back1_red.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddProduct, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewStock, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btnUpdateStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnUpdateStock, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewStock, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(693, Short.MAX_VALUE))
        );

        pnlProductInfo.setBackground(new java.awt.Color(45, 45, 45));
        pnlProductInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProductInfo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblProductInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblProductInfo.setText("Product Information");

        lblProductName.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("Product Name:");

        txtProductName.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtProductName.setEnabled(false);

        txtStatus.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtStatus.setEnabled(false);

        lblDescription.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Description:");

        lblCategory.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setText("Category:");

        lblStatus.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status:");

        txtCategory.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCategory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCategory.setEnabled(false);

        txtDescription.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDescription.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtDescription.setEnabled(false);

        javax.swing.GroupLayout pnlProductInfoLayout = new javax.swing.GroupLayout(pnlProductInfo);
        pnlProductInfo.setLayout(pnlProductInfoLayout);
        pnlProductInfoLayout.setHorizontalGroup(
            pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductInfoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblProductInfo))
                    .addGroup(pnlProductInfoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblDescription)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblProductName)
                                .addGap(65, 65, 65)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblCategory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlProductInfoLayout.setVerticalGroup(
            pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblProductInfo)
                .addGap(35, 35, 35)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategory)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pnlInStock.setBackground(new java.awt.Color(45, 45, 45));
        pnlInStock.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblInStock.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblInStock.setForeground(new java.awt.Color(255, 255, 255));
        lblInStock.setText("In Stock");

        lblQuantity.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quanity: ");

        numQuantity.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        numQuantity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlInStockLayout = new javax.swing.GroupLayout(pnlInStock);
        pnlInStock.setLayout(pnlInStockLayout);
        pnlInStockLayout.setHorizontalGroup(
            pnlInStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInStockLayout.createSequentialGroup()
                .addGroup(pnlInStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInStockLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblQuantity)
                        .addGap(83, 83, 83)
                        .addComponent(numQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInStockLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblInStock)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        pnlInStockLayout.setVerticalGroup(
            pnlInStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInStockLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblInStock)
                .addGap(37, 37, 37)
                .addGroup(pnlInStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(numQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInsertStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnInsertStock.setText("Add Stock");
        btnInsertStock.setBorderPainted(false);
        btnInsertStock.setFocusPainted(false);
        btnInsertStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertStockActionPerformed(evt);
            }
        });

        lblSearchProducts.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblSearchProducts.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchProducts.setText("Search Products: ");

        txtSearch.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSearch.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.setBorderPainted(false);
        btnSearch.setFocusPainted(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRegisterHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(550, 550, 550)
                                .addComponent(btnInsertStock))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSearchProducts)
                                        .addGap(47, 47, 47)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(pnlProductInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(pnlInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegisterHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearchProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlInStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlProductInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addComponent(btnInsertStock)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStockActionPerformed
        frmUpdateStock updateStock = new frmUpdateStock();
        updateStock.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnUpdateStockActionPerformed

    private void btnViewStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStockActionPerformed
        frmViewStock viewStock = new frmViewStock();
        viewStock.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewStockActionPerformed

    private void btnInsertStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertStockActionPerformed
        frmViewUsers view = new frmViewUsers();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInsertStockActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        frmAddProduct addProduct = new frmAddProduct();
        addProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdministratorMainDash mainDash = new AdministratorMainDash();
        mainDash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(frmAddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAddStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAddStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInsertStock;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateStock;
    private javax.swing.JButton btnViewStock;
    private javax.swing.JLabel lblAddStock;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblInStock;
    private javax.swing.JLabel lblProductInfo;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSearchProducts;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JSpinner numQuantity;
    private javax.swing.JPanel pnlInStock;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlProductInfo;
    private javax.swing.JPanel pnlRegisterHeader;
    private javax.swing.JPanel pnlRegisterHeader1;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
