/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Himashi
 */
public class AddProduct extends javax.swing.JFrame {

    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAP = new javax.swing.JLabel();
        jLabelAPID = new javax.swing.JLabel();
        jLabelAPPN = new javax.swing.JLabel();
        jLabelAPC = new javax.swing.JLabel();
        jLabelAPP = new javax.swing.JLabel();
        jTextFieldAPID = new javax.swing.JTextField();
        jTextFieldAPPN = new javax.swing.JTextField();
        jTextFieldAPC = new javax.swing.JTextField();
        jTextFieldAPP = new javax.swing.JTextField();
        jButtonAPB = new javax.swing.JButton();
        jButtonAPA = new javax.swing.JButton();
        jButtonAPC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelAP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAP.setText("|   Add Product  Details   |");
        getContentPane().add(jLabelAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 6, 434, 59));

        jLabelAPID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelAPID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAPID.setText("Product ID  :");
        getContentPane().add(jLabelAPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 100, 181, 34));

        jLabelAPPN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelAPPN.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAPPN.setText("Product Name  :");
        getContentPane().add(jLabelAPPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 154, -1, 40));

        jLabelAPC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelAPC.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAPC.setText("Category    :");
        getContentPane().add(jLabelAPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 212, 181, 39));

        jLabelAPP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelAPP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAPP.setText("Price");
        getContentPane().add(jLabelAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 269, 181, 38));

        jTextFieldAPID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jTextFieldAPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 98, 265, -1));

        jTextFieldAPPN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jTextFieldAPPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 154, 265, 40));

        jTextFieldAPC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jTextFieldAPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 212, 265, 39));

        jTextFieldAPP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jTextFieldAPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 269, 265, -1));

        jButtonAPB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAPB.setText("Back");
        jButtonAPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAPB, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 325, -1, 31));

        jButtonAPA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAPA.setText("Add");
        jButtonAPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 325, -1, 31));

        jButtonAPC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAPC.setText("Clear");
        jButtonAPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAPCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 325, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPBActionPerformed
    MLMenu p1  = new MLMenu();
    p1.setVisible(true);
    p1.toFront();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAPBActionPerformed

    private void jButtonAPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPCActionPerformed
    jTextFieldAPID.setText("");
    jTextFieldAPPN.setText("");
    jTextFieldAPC.setText("");
    jTextFieldAPP.setText("");


        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAPCActionPerformed

    private void jButtonAPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAPAActionPerformed
    ProductsClass obj = new ProductsClass ();
    obj.setPoductID(jTextFieldAPID.getText().toString());
    obj.setProductName(jTextFieldAPPN.getText().toString());
    obj.setCategory(jTextFieldAPC.getText().toString());
    obj.setPrice(Float.parseFloat(jTextFieldAPP.getText()));
    
    obj.addProducts(obj);
 
    
    
    
       // TODO add your handling code here:

       
    }//GEN-LAST:event_jButtonAPAActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAPA;
    private javax.swing.JButton jButtonAPB;
    private javax.swing.JButton jButtonAPC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAP;
    private javax.swing.JLabel jLabelAPC;
    private javax.swing.JLabel jLabelAPID;
    private javax.swing.JLabel jLabelAPP;
    private javax.swing.JLabel jLabelAPPN;
    private javax.swing.JTextField jTextFieldAPC;
    private javax.swing.JTextField jTextFieldAPID;
    private javax.swing.JTextField jTextFieldAPP;
    private javax.swing.JTextField jTextFieldAPPN;
    // End of variables declaration//GEN-END:variables
}
