import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.table.DefaultTableModel;
/*
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Himashi
 */
public class SearchProduct extends javax.swing.JFrame {

    /**
     * Creates new form SearchProduct
     */
    public SearchProduct() {
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

        jLabelSP = new javax.swing.JLabel();
        jLabelSPID = new javax.swing.JLabel();
        jTextFieldSPID = new javax.swing.JTextField();
        jButtonSPB = new javax.swing.JButton();
        jButtonSPS = new javax.swing.JButton();
        jButtonSPC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSP.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelSP.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSP.setText("|   Search Product Details   |");
        getContentPane().add(jLabelSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 6, 482, 62));

        jLabelSPID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelSPID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSPID.setText("Product ID   :");
        getContentPane().add(jLabelSPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 106, 181, 38));

        jTextFieldSPID.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        getContentPane().add(jTextFieldSPID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 40));

        jButtonSPB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSPB.setText("Back");
        jButtonSPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSPBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSPB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 91, 39));

        jButtonSPS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSPS.setText("Search");
        jButtonSPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSPSActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 39));

        jButtonSPC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSPC.setText("Clear");
        jButtonSPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSPCActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 90, 39));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 450, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSPBActionPerformed
    MLMenu p1  = new MLMenu();
    p1.setVisible(true);
    p1.toFront();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSPBActionPerformed

    private void jButtonSPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSPCActionPerformed
    jTextFieldSPID.setText("");
    
    

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSPCActionPerformed

    private void jButtonSPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSPSActionPerformed
    String filePath = "D:\\Apple_iStore\\AppleiStoreProduct.txt";
    findData(jTextFieldSPID.getText().toString(), filePath);
    

    // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSPSActionPerformed
    public void findData(String searchWord, String filePath)
    {
      try{   BufferedReader in = new BufferedReader(
                 new FileReader(filePath));
         
             
      DefaultTableModel tblmodel = (DefaultTableModel)jTable1.getModel();
      String firstLine = in.readLine().trim();
      String[] columnsName = firstLine.split(",");
          
      tblmodel.setColumnIdentifiers(columnsName);
      String line;
      while ((line = in.readLine()) != null)
      {
       
        // extract by lines and write to file
          line = line.trim();
        String firstColumn =  line.split(",")[0];
        if (firstColumn.contains(searchWord))
        {
            //line.replaceAll("\\s", "");
            
            String[] dataRow = line.split(",");          
   
            tblmodel.addRow(dataRow);
            
        }

      }
}catch (IOException ex){
    
      ex.printStackTrace();
    }
    }
    
    
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
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSPB;
    private javax.swing.JButton jButtonSPC;
    private javax.swing.JButton jButtonSPS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSP;
    private javax.swing.JLabel jLabelSPID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSPID;
    // End of variables declaration//GEN-END:variables
}
