/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.gui;

import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import planetfood.dao.CategoryDao;
import planetfood.dao.ProductDao;
import planetfood.pojo.Product;
import planetfood.pojo.UserProfile;

/**
 *
 * @author ROYAL CHHORA
 */
public class AddProductFrame extends javax.swing.JFrame {

   private HashMap<String,String>categories;
   private String prodName;
   private double prodPrice;
   private String catId;
    public AddProductFrame() { 
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsername.setText("Hello"+UserProfile.getUsername());
    try
    {
        categories=CategoryDao.getAllcategoryID();
        System.out.println(categories.values());
        for(String catName: categories.keySet())
            jcCatId.addItem(catName);
        
        txtProdId.setText(ProductDao.getNewID());
      
    }
    catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"Exception in DB","Exception!",JOptionPane.ERROR_MESSAGE);
         ex.printStackTrace();
    }
    }
    public int validateInput()
    {
        int result=1;
        prodName=txtprodName.getText();
        String catName=jcCatId.getSelectedItem().toString();
        catId=categories.get(catName);
        try
        {
            prodPrice=Double.parseDouble(txtprodPrice.getText());
            
        }
        catch(Exception ex)
        {
            result=0;
            
        }
            if(prodName.isEmpty())
                result=-1;
            return result;
    }
    
    public void clearAll()
    {
        txtProdId.setText("");
        txtprodName.setText("");
        txtProdPrice.setText("");
        jcCatId.setSelectedIndex(0);
        try{
            txtProdId.setText(ProductDao.getNewID());
        }
        catch(SQLException ex){
         JOptionPane.showMessageDialog(null,"Error while connecting to DB","Exception!",JOptionPane.ERROR_MESSAGE);
         ex.printStackTrace();
        
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

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CatName = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        txtProdPrice = new javax.swing.JLabel();
        txtProdId = new javax.swing.JTextField();
        txtprodName = new javax.swing.JTextField();
        txtprodPrice = new javax.swing.JTextField();
        jcCatId = new javax.swing.JComboBox<>();
        btnAddProd = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theplanetfood/gui/diet.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setToolTipText("SET");

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product code");

        CatName.setBackground(new java.awt.Color(0, 153, 153));
        CatName.setForeground(new java.awt.Color(255, 255, 255));
        CatName.setText("Choose The Category");

        jlabel.setBackground(new java.awt.Color(0, 153, 153));
        jlabel.setForeground(new java.awt.Color(255, 255, 255));
        jlabel.setText("Product Name");

        txtProdPrice.setBackground(new java.awt.Color(0, 153, 153));
        txtProdPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtProdPrice.setText("Product Price");

        txtProdId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdIdActionPerformed(evt);
            }
        });

        txtprodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodNameActionPerformed(evt);
            }
        });

        txtprodPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprodPriceActionPerformed(evt);
            }
        });

        jcCatId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jcCatId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCatIdActionPerformed(evt);
            }
        });

        btnAddProd.setBackground(new java.awt.Color(204, 204, 204));
        btnAddProd.setText("Add product");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCatId, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProdPrice)
                            .addComponent(jlabel)
                            .addComponent(CatName)
                            .addComponent(txtprodName, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtprodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAddProd)
                        .addGap(136, 136, 136)
                        .addComponent(btnBack)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(CatName)
                .addGap(18, 18, 18)
                .addComponent(jcCatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jlabel)
                .addGap(18, 18, 18)
                .addComponent(txtprodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProdPrice)
                .addGap(18, 18, 18)
                .addComponent(txtprodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProd)
                    .addComponent(btnBack))
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCT ADDING PANEL");

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SET PRODUCT DETAILS");

        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogout)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtprodPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodPriceActionPerformed

    private void jcCatIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCatIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCatIdActionPerformed

    private void txtProdIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdIdActionPerformed

    private void txtprodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprodNameActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
int result=validateInput();
if(result==0)
{
     JOptionPane.showMessageDialog(null,"Please Input Numeric value for product Price","Invalid Input!",JOptionPane.ERROR_MESSAGE);
         return;
}
    
if(result==-1)
{
     JOptionPane.showMessageDialog(null,"Please input Product name","Invalid Input!",JOptionPane.ERROR_MESSAGE);    
     return;
}
try
{
    Product p=new Product();
    p.setProdId(txtProdId.getText());
    p.setCatId(catId);
    p.setProdName(prodName);
    p.setProdPrice(prodPrice);
    p.setIsActive("Y");
        boolean status=ProductDao.addProduct(p);

    if(status)
        
    {
        JOptionPane.showMessageDialog(null,"adding product Successfully ","Success!",JOptionPane.INFORMATION_MESSAGE);
        clearAll();
    }
    else
    {
                
                JOptionPane.showMessageDialog(null,"Cannot adding product ","Adding Product Denied!",JOptionPane.ERROR_MESSAGE);
    }      
            

}

catch(SQLException ex)
                    {
                        ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Error while  adding product ","Exception!",JOptionPane.ERROR_MESSAGE);
                    }
    
    

    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
AdminOptionsFrame adminFrame=new AdminOptionsFrame();
adminFrame.setVisible(true);
this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
 LoginFrame loginFrame=new LoginFrame();
       loginFrame.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CatName;
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcCatId;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtProdId;
    private javax.swing.JLabel txtProdPrice;
    private javax.swing.JTextField txtprodName;
    private javax.swing.JTextField txtprodPrice;
    // End of variables declaration//GEN-END:variables
}
