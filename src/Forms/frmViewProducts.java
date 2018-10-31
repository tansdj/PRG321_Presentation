/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import ProductManagement.Product;
import ProductManagement.Stock;
import bc_stationary_bll.SoundEx;
import bc_stationary_bll.genericSort;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;

/**
 *
 * @author Eldane
 */
public class frmViewProducts extends javax.swing.JFrame {

    /**
     * Creates new form frmViewProducts
     */
    ArrayList<Product> productList;
    public frmViewProducts() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new Color(45,45,45));
        
        initializeForm();
    }

    public void initializeForm(){
        Product product = new Product();
        productList = product.select();
        
        DefaultListModel model = new DefaultListModel();
        // Populate Listbox
        for(Product p: productList)
        {
            model.addElement(p);
        }
        lbxProducts.setModel(model);
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
        lblAddProduct = new javax.swing.JLabel();
        pnlMenu = new javax.swing.JPanel();
        btnViewProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbxProducts = new javax.swing.JList<>();
        rbtnSortQuantity = new javax.swing.JRadioButton();
        rbtnSortProductName = new javax.swing.JRadioButton();
        pnlProductInfo = new javax.swing.JPanel();
        lblProductInfo2 = new javax.swing.JLabel();
        lblProductName2 = new javax.swing.JLabel();
        txtProductName2 = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        lblDescription2 = new javax.swing.JLabel();
        lblCategory2 = new javax.swing.JLabel();
        lblStatus2 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtDescription2 = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblProductModel = new javax.swing.JLabel();
        lblProductCost = new javax.swing.JLabel();
        lblProductSale = new javax.swing.JLabel();
        txtProductModel = new javax.swing.JTextField();
        txtProductCost = new javax.swing.JTextField();
        txtProductSale = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRegisterHeader.setBackground(new java.awt.Color(255, 255, 0));
        pnlRegisterHeader.setPreferredSize(new java.awt.Dimension(1071, 530));

        pnlRegisterHeader1.setBackground(new java.awt.Color(204, 0, 0));
        pnlRegisterHeader1.setPreferredSize(new java.awt.Dimension(1307, 65));

        lblAddProduct.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        lblAddProduct.setText("View Product");
        lblAddProduct.setAlignmentY(0.0F);

        javax.swing.GroupLayout pnlRegisterHeader1Layout = new javax.swing.GroupLayout(pnlRegisterHeader1);
        pnlRegisterHeader1.setLayout(pnlRegisterHeader1Layout);
        pnlRegisterHeader1Layout.setHorizontalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterHeader1Layout.createSequentialGroup()
                .addGap(607, 607, 607)
                .addComponent(lblAddProduct)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        pnlRegisterHeader1Layout.setVerticalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterHeader1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblAddProduct)
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

        btnViewProduct.setBackground(new java.awt.Color(40, 40, 40));
        btnViewProduct.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnViewProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View_Red.png"))); // NOI18N
        btnViewProduct.setText("View Product");
        btnViewProduct.setBorder(null);
        btnViewProduct.setBorderPainted(false);
        btnViewProduct.setContentAreaFilled(false);
        btnViewProduct.setFocusPainted(false);
        btnViewProduct.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnViewProduct.setIconTextGap(5);
        btnViewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductActionPerformed(evt);
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
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnViewProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(802, Short.MAX_VALUE))
        );

        txtSearch.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtSearch.setText("Search...");
        txtSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        lbxProducts.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lbxProducts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lbxProductsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lbxProducts);

        rbtnSortQuantity.setBackground(new java.awt.Color(45, 45, 45));
        rbtnSortQuantity.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbtnSortQuantity.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSortQuantity.setText("Sort via Quantity (High to Low)");
        rbtnSortQuantity.setFocusPainted(false);
        rbtnSortQuantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnSortQuantityMouseClicked(evt);
            }
        });

        rbtnSortProductName.setBackground(new java.awt.Color(45, 45, 45));
        rbtnSortProductName.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbtnSortProductName.setForeground(new java.awt.Color(255, 255, 255));
        rbtnSortProductName.setText("Sort via Product Name (Alphabetically)");
        rbtnSortProductName.setFocusPainted(false);
        rbtnSortProductName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnSortProductNameMouseClicked(evt);
            }
        });

        pnlProductInfo.setBackground(new java.awt.Color(45, 45, 45));
        pnlProductInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProductInfo2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblProductInfo2.setForeground(new java.awt.Color(255, 255, 255));
        lblProductInfo2.setText("Product Information");

        lblProductName2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductName2.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName2.setText("Product Name:");

        txtProductName2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductName2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtStatus.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblDescription2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblDescription2.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription2.setText("Description:");

        lblCategory2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCategory2.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory2.setText("Category:");

        lblStatus2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblStatus2.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus2.setText("Status:");

        txtCategory.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtCategory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDescription2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDescription2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblQuantity.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quanity: ");

        txtQuantity.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProductModel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductModel.setForeground(new java.awt.Color(255, 255, 255));
        lblProductModel.setText("Model:");

        lblProductCost.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductCost.setForeground(new java.awt.Color(255, 255, 255));
        lblProductCost.setText("Cost Price:");

        lblProductSale.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductSale.setForeground(new java.awt.Color(255, 255, 255));
        lblProductSale.setText("Sales Price:");

        txtProductModel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductModel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtProductCost.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductCost.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtProductSale.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductSale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlProductInfoLayout = new javax.swing.GroupLayout(pnlProductInfo);
        pnlProductInfo.setLayout(pnlProductInfoLayout);
        pnlProductInfoLayout.setHorizontalGroup(
            pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProductInfoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblProductInfo2))
                    .addGroup(pnlProductInfoLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblProductSale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProductSale, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblProductCost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProductCost, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblProductModel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblDescription2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblProductName2)
                                .addGap(65, 65, 65)
                                .addComponent(txtProductName2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblCategory2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                                .addComponent(lblStatus2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlProductInfoLayout.setVerticalGroup(
            pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblProductInfo2)
                .addGap(35, 35, 35)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductName2)
                    .addComponent(txtProductName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription2)
                    .addComponent(txtDescription2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus2)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategory2)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductCost)
                    .addComponent(txtProductCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductSale)
                    .addComponent(txtProductSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRegisterHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlProductInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnSortQuantity)
                                .addGap(27, 27, 27)
                                .addComponent(rbtnSortProductName)))))
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
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnSortQuantity)
                            .addComponent(rbtnSortProductName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlProductInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        StandardMainDash mainDash = new StandardMainDash();
        mainDash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        // TODO add your handling code here:
        txtSearch.setText("");
        initializeForm();
    }//GEN-LAST:event_txtSearchMouseClicked
   
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        Product product = new Product();
        ArrayList<Product> productsThatFitCriteria = new ArrayList<Product>();
        String searchCode = "", productCode = "", searchText = txtSearch.getText(),catCode="";
        if (searchText.equals("")) {
            productList = product.select();
            DefaultListModel model = new DefaultListModel();

            for (Product p : productList) {
                model.addElement(p);
            }
            lbxProducts.setModel(model);
        } else {
            int numSearchChars; // amount of characters that are typed into the search box.

            searchCode = SoundEx.Soundex(searchText);

            numSearchChars = searchText.length();
            for (Product p : productList) {
                if (p.getName().length() >= numSearchChars) {

                    productCode = SoundEx.Soundex(p.getName().substring(0, numSearchChars));
                    if(p.getCategory().getDescription().length()>=numSearchChars){
                        catCode = SoundEx.Soundex(p.getCategory().getDescription().substring(0,numSearchChars));
                    }
                    if ((productCode.equals(searchCode))) {

                        productsThatFitCriteria.add(p);

                    }else if(catCode.equals(searchCode)){
                        productsThatFitCriteria.add(p);
                    }

                }
            }
            productList = productsThatFitCriteria;
            lbxProducts.removeAll();
            DefaultListModel model = new DefaultListModel();

            lbxProducts.setModel(model);
            if(productList.size()==0){
                model.addElement(new String("No Results Found"));
            }else{
                for (Product p : productList) {
                    model.addElement(p);
                }
            }
            lbxProducts.setModel(model);
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    public Product selectedProduct;
    private void lbxProductsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lbxProductsValueChanged
        int index= lbxProducts.getSelectedIndex();
        if(index == -1){
            index = 0;
        }else{
            selectedProduct = productList.get(index);

            Stock stock = new Stock(selectedProduct,0);
            stock = stock.selectSpecStock();

            txtSearch.setText(selectedProduct.toString());
            txtProductName2.setText(selectedProduct.getName());
            txtProductName2.setEditable(false);

            txtDescription2.setText(selectedProduct.getDescription());
            txtDescription2.setEditable(false);

            txtStatus.setText(selectedProduct.getStatus());
            txtStatus.setEditable(false);

            txtProductModel.setText(selectedProduct.getModel().getDescription());
            txtProductModel.setEditable(false);

            txtCategory.setText(selectedProduct.getCategory().getDescription());
            txtCategory.setEditable(false);

            txtProductCost.setText(Double.toString(selectedProduct.getCostPrice()));
            txtProductCost.setEditable(false);

            txtProductSale.setText(Double.toString(selectedProduct.getSalesPrice()));
            txtProductSale.setEditable(false);

            txtQuantity.setText(Integer.toString(stock.getQuantity()));
            txtQuantity.setEditable(false);
        }
    }//GEN-LAST:event_lbxProductsValueChanged

    private void rbtnSortQuantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnSortQuantityMouseClicked
        Stock stock = null;
        ArrayList<Stock> allStockItems = new ArrayList<Stock>();
        ArrayList<Product> newProductList = new ArrayList<Product>();
        for(Product p : productList)
        {
            stock = new Stock(p,0);
            allStockItems.add(stock.selectSpecStock());
        }

        try {
            Collections.sort(allStockItems,new genericSort(Stock.class.getField("quantity")));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmViewStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(frmViewStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(frmViewStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        for(Stock s: allStockItems)
        {
            newProductList.add(s.getProduct());
        }

        productList = newProductList;
        DefaultListModel model = new DefaultListModel();
        // Populate Listbox
        for(Product p: productList)
        {
            model.addElement(p);
        }
        lbxProducts.setModel(model);
    }//GEN-LAST:event_rbtnSortQuantityMouseClicked

    private void rbtnSortProductNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnSortProductNameMouseClicked
        try {
            Collections.sort(productList,new genericSort(Product.class.getField("name")));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmViewStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(frmViewStock.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(frmViewStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultListModel model = new DefaultListModel();
        // Populate Listbox
        for(Product p: productList)
        {
            model.addElement(p);
        }
        lbxProducts.setModel(model);
    }//GEN-LAST:event_rbtnSortProductNameMouseClicked

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
            java.util.logging.Logger.getLogger(frmViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmViewProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewProduct;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddProduct;
    private javax.swing.JLabel lblCategory2;
    private javax.swing.JLabel lblDescription2;
    private javax.swing.JLabel lblProductCost;
    private javax.swing.JLabel lblProductInfo2;
    private javax.swing.JLabel lblProductModel;
    private javax.swing.JLabel lblProductName2;
    private javax.swing.JLabel lblProductSale;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStatus2;
    private javax.swing.JList<String> lbxProducts;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlProductInfo;
    private javax.swing.JPanel pnlRegisterHeader;
    private javax.swing.JPanel pnlRegisterHeader1;
    private javax.swing.JRadioButton rbtnSortProductName;
    private javax.swing.JRadioButton rbtnSortQuantity;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtDescription2;
    private javax.swing.JTextField txtProductCost;
    private javax.swing.JTextField txtProductModel;
    private javax.swing.JTextField txtProductName2;
    private javax.swing.JTextField txtProductSale;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
}
