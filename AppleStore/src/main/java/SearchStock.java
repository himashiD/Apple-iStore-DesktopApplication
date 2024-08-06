
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleConstants;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Himashi
 */
public class SearchStock extends javax.swing.JFrame {

    /**
     * Creates new form SearchStock
     */
    public SearchStock() {
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

        jLabelSS = new javax.swing.JLabel();
        jButtonSSB = new javax.swing.JButton();
        jButtonSSV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSST = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSS.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelSS.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSS.setText("|   Search Stock Details   |");
        getContentPane().add(jLabelSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 6, 479, 64));

        jButtonSSB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSSB.setText("Back");
        jButtonSSB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSSBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSSB, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 332, -1, 33));

        jButtonSSV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSSV.setText("View");
        jButtonSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSSVActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(421, 332, -1, 33));

        jTableSST.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableSST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTableSST);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 502, 226));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSSBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSSBActionPerformed
    MLMenu p1  = new MLMenu();
    p1.setVisible(true);
    p1.toFront();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSSBActionPerformed

    private void jButtonSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSSVActionPerformed
    
        String filePath = "D:\\Apple_iStore\\AppleStock.txt";
        File file = new File(filePath);
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model =(DefaultTableModel)jTableSST.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
            
            for (int i = 0; i < tableLines.length; i++) 
            {
                String line = tableLines[i].toString().trim();
                String[] dataRow =line.split("/");
                model.addRow(dataRow);
            }
            
            
            
            // TODO add your handling code here:
        } catch (Exception ex) {
            Logger.getLogger(SearchStock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSSVActionPerformed

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
            java.util.logging.Logger.getLogger(SearchStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSSB;
    private javax.swing.JButton jButtonSSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSST;
    // End of variables declaration//GEN-END:variables
}
