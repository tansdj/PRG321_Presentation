/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import ProductManagement.Category;
import ProductManagement.Model;
import ProductManagement.Product;
import ProductManagement.Stock;
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.animation.Animation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Eldane
 */
public class frmUpdateStock extends javax.swing.JFrame {

    /**
     * Creates new form frmUpdateStock
     */
    public ArrayList<Product> products;
    public ArrayList<Category> categories;
    public frmUpdateStock() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.getContentPane().setBackground(new Color(45,45,45));
        Product product = new Product();
         products = product.select();
         for(Product p :products){
            cmbProductSearch.addItem(p.getName()+"("+ p.getDescription()+")");
        }
         
        Category category = new Category();
        categories = category.select();
        for(Category c :categories){
            cmbCategory.addItem(c.getDescription());
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

        pnlRegisterHeader = new javax.swing.JPanel();
        pnlRegisterHeader1 = new javax.swing.JPanel();
        lblUpdateStock = new javax.swing.JLabel();
        pnlProductInfo = new javax.swing.JPanel();
        lblProductInfo = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        cmbCategory = new javax.swing.JComboBox<>();
        lblProductModel = new javax.swing.JLabel();
        txtProductModel = new javax.swing.JTextField();
        lblProductCost = new javax.swing.JLabel();
        txtProductCost = new javax.swing.JTextField();
        lblProductSale = new javax.swing.JLabel();
        txtProductSale = new javax.swing.JTextField();
        lblSearchProducts = new javax.swing.JLabel();
        pnlInStock = new javax.swing.JPanel();
        lblInStock = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnEditStock = new javax.swing.JButton();
        cmbProductSearch = new javax.swing.JComboBox<>();
        pnlMenu = new javax.swing.JPanel();
        btnAddProduct = new javax.swing.JButton();
        btnUpdateStock = new javax.swing.JButton();
        btnViewStock = new javax.swing.JButton();
        btnAddStock = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlRegisterHeader.setBackground(new java.awt.Color(255, 255, 0));
        pnlRegisterHeader.setPreferredSize(new java.awt.Dimension(1071, 530));

        pnlRegisterHeader1.setBackground(new java.awt.Color(204, 0, 0));
        pnlRegisterHeader1.setPreferredSize(new java.awt.Dimension(1307, 65));

        lblUpdateStock.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblUpdateStock.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdateStock.setText("Update Product");
        lblUpdateStock.setAlignmentY(0.0F);

        javax.swing.GroupLayout pnlRegisterHeader1Layout = new javax.swing.GroupLayout(pnlRegisterHeader1);
        pnlRegisterHeader1.setLayout(pnlRegisterHeader1Layout);
        pnlRegisterHeader1Layout.setHorizontalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegisterHeader1Layout.createSequentialGroup()
                .addGap(607, 607, 607)
                .addComponent(lblUpdateStock)
                .addContainerGap(738, Short.MAX_VALUE))
        );
        pnlRegisterHeader1Layout.setVerticalGroup(
            pnlRegisterHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegisterHeader1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblUpdateStock)
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

        pnlProductInfo.setBackground(new java.awt.Color(45, 45, 45));
        pnlProductInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblProductInfo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblProductInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblProductInfo.setText("Product Information");

        lblProductName.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductName.setForeground(new java.awt.Color(255, 255, 255));
        lblProductName.setText("Product Name:");

        lblDescription.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(255, 255, 255));
        lblDescription.setText("Description:");

        lblCategory.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblCategory.setForeground(new java.awt.Color(255, 255, 255));
        lblCategory.setText("Category:");

        lblStatus.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus.setText("Status:");

        txtDescription.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtDescription.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtProductName.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cmbStatus.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available", "Discontinued" }));

        cmbCategory.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N

        lblProductModel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductModel.setForeground(new java.awt.Color(255, 255, 255));
        lblProductModel.setText("Model:");

        txtProductModel.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductModel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProductCost.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductCost.setForeground(new java.awt.Color(255, 255, 255));
        lblProductCost.setText("Cost Price:");

        txtProductCost.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductCost.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProductSale.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblProductSale.setForeground(new java.awt.Color(255, 255, 255));
        lblProductSale.setText("Sales Price:");

        txtProductSale.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtProductSale.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlProductInfoLayout = new javax.swing.GroupLayout(pnlProductInfo);
        pnlProductInfo.setLayout(pnlProductInfoLayout);
        pnlProductInfoLayout.setHorizontalGroup(
            pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblProductInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductInfoLayout.createSequentialGroup()
                        .addComponent(lblProductName)
                        .addGap(67, 67, 67))
                    .addGroup(pnlProductInfoLayout.createSequentialGroup()
                        .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategory)
                            .addComponent(lblStatus)
                            .addComponent(lblDescription)
                            .addComponent(lblProductModel)
                            .addComponent(lblProductCost)
                            .addComponent(lblProductSale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductCost, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductSale, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        pnlProductInfoLayout.setVerticalGroup(
            pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductInfoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblProductInfo)
                .addGap(30, 30, 30)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProductName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCategory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductModel)
                    .addComponent(txtProductModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductCost)
                    .addComponent(txtProductCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProductSale)
                    .addComponent(txtProductSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lblSearchProducts.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblSearchProducts.setForeground(new java.awt.Color(255, 255, 255));
        lblSearchProducts.setText("Search Products: ");

        pnlInStock.setBackground(new java.awt.Color(45, 45, 45));
        pnlInStock.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblInStock.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblInStock.setForeground(new java.awt.Color(255, 255, 255));
        lblInStock.setText("In Stock");

        lblQuantity.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("Quanity: ");

        txtQuantity.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtQuantity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnlInStockLayout = new javax.swing.GroupLayout(pnlInStock);
        pnlInStock.setLayout(pnlInStockLayout);
        pnlInStockLayout.setHorizontalGroup(
            pnlInStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInStockLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblInStock)
                .addContainerGap(349, Short.MAX_VALUE))
            .addGroup(pnlInStockLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblQuantity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        pnlInStockLayout.setVerticalGroup(
            pnlInStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInStockLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblInStock)
                .addGap(37, 37, 37)
                .addGroup(pnlInStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEditStock.setText("Update Stock");
        btnEditStock.setBorderPainted(false);
        btnEditStock.setFocusPainted(false);
        btnEditStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditStockActionPerformed(evt);
            }
        });

        cmbProductSearch.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        cmbProductSearch.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbProductSearchPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

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
        btnAddProduct.setIconTextGap(30);
        btnAddProduct.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1_Red.png"))); // NOI18N
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnUpdateStock.setBackground(new java.awt.Color(40, 40, 40));
        btnUpdateStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnUpdateStock.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Edit1_Red.png"))); // NOI18N
        btnUpdateStock.setText("Update Product");
        btnUpdateStock.setBorder(null);
        btnUpdateStock.setBorderPainted(false);
        btnUpdateStock.setContentAreaFilled(false);
        btnUpdateStock.setFocusPainted(false);
        btnUpdateStock.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUpdateStock.setIconTextGap(5);
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
        btnViewStock.setIconTextGap(40);
        btnViewStock.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/View_Red.png"))); // NOI18N
        btnViewStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStockActionPerformed(evt);
            }
        });

        btnAddStock.setBackground(new java.awt.Color(204, 0, 0));
        btnAddStock.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnAddStock.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1.png"))); // NOI18N
        btnAddStock.setText("Add Stock");
        btnAddStock.setBorder(null);
        btnAddStock.setBorderPainted(false);
        btnAddStock.setContentAreaFilled(false);
        btnAddStock.setFocusPainted(false);
        btnAddStock.setIconTextGap(50);
        btnAddStock.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/Images/Add1_Red.png"))); // NOI18N
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
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
        btnBack.setIconTextGap(45);
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
            .addComponent(btnAddStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
            .addComponent(btnUpdateStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnViewStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSearchProducts)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pnlProductInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(pnlInStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(525, 525, 525)
                                .addComponent(btnEditStock)))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegisterHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSearchProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlInStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlProductInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEditStock)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStockActionPerformed
        String pName, pDescription, pStatus, pCategory, pModel;
        int pQuantity;
        LocalDate local = LocalDate.now();
        Date date = Date.valueOf(local);
        double costPrice, salePrice;
        
        Stock stockToUpdate;
        Product product;
        Category category;
        Model model;
        //Assigning variables values  
        pName =  txtProductName.getText();
        pDescription = txtDescription.getText();
        pStatus = cmbStatus.getSelectedItem().toString();
        pCategory = cmbCategory.getSelectedItem().toString();
        pQuantity = Integer.parseInt(txtQuantity.getText());  
        pModel = txtProductModel.getText();
        costPrice = (Double)Double.parseDouble(txtProductCost.getText());
        salePrice = (Double)Double.parseDouble(txtProductSale.getText());
                
        category = new Category(pCategory);
        model = new Model(pModel);
        product = new Product(pName, pDescription, category, pStatus, model, costPrice, salePrice, date); 
                
            if(product.update() != -1)
            {
                JOptionPane.showMessageDialog(null, "The product was successfully updated","Update Successful",JOptionPane.INFORMATION_MESSAGE);
                                        
                AdministratorMainDash mainDash = new AdministratorMainDash();
                mainDash.setVisible(true);
                this.setVisible(false);
            }
            else
            {
               JOptionPane.showMessageDialog(null, "Something went wrong during the update process. Product Update was unsuccessful!","Registration Failed",JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_btnEditStockActionPerformed

    private void cmbProductSearchPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbProductSearchPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String selectedProductSearch = cmbProductSearch.getSelectedItem().toString();
        String searchedProduct = selectedProductSearch.substring(0,selectedProductSearch.indexOf("("));
        String searchedDescription = selectedProductSearch.substring(selectedProductSearch.indexOf("(")+1,selectedProductSearch.indexOf(")"));
        
        Product selectedProduct = new Product();
        for(Product p : products)
        {
            if((p.getName().equals(searchedProduct)&&(p.getDescription().equals(searchedDescription))))
            {
                selectedProduct = p;
            }
        }
        
        Model model = selectedProduct.getModel();
        Category category = selectedProduct.getCategory();
        Stock stock = new Stock(selectedProduct,0);
        stock = stock.selectSpecStock();
        
        txtProductName.setText(selectedProduct.getName());
        txtDescription.setText(selectedProduct.getDescription());
        txtProductModel.setText(model.getDescription()); 
        txtProductCost.setText(Double.toString(selectedProduct.getCostPrice()));
        txtProductSale.setText(Double.toString(selectedProduct.getSalesPrice()));
        txtQuantity.setText(Integer.toString(stock.getQuantity()));
        txtQuantity.setEditable(false);

    }//GEN-LAST:event_cmbProductSearchPopupMenuWillBecomeInvisible

    private void btnUpdateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStockActionPerformed

    }//GEN-LAST:event_btnUpdateStockActionPerformed

    private void btnViewStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStockActionPerformed
        frmViewStock viewStock = new frmViewStock();
        viewStock.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewStockActionPerformed

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        frmAddStock addStock = new frmAddStock();
        addStock.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdministratorMainDash mainDash = new AdministratorMainDash();
        mainDash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        frmAddProduct addProduct = new frmAddProduct();
        addProduct.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddProductActionPerformed

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
            java.util.logging.Logger.getLogger(frmUpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUpdateStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUpdateStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditStock;
    private javax.swing.JButton btnUpdateStock;
    private javax.swing.JButton btnViewStock;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbProductSearch;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblInStock;
    private javax.swing.JLabel lblProductCost;
    private javax.swing.JLabel lblProductInfo;
    private javax.swing.JLabel lblProductModel;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductSale;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblSearchProducts;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUpdateStock;
    private javax.swing.JPanel pnlInStock;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlProductInfo;
    private javax.swing.JPanel pnlRegisterHeader;
    private javax.swing.JPanel pnlRegisterHeader1;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtProductCost;
    private javax.swing.JTextField txtProductModel;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductSale;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
