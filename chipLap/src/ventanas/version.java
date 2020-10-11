/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.configuracion;
import java.awt.Color;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class version extends javax.swing.JDialog {

         Color fondo = configuracion.fondo;
         Color letra = configuracion.letra;

         /**
          * Creates new form version
          */
         public version(java.awt.Frame parent, boolean modal) {
                  super(parent, modal);
                  initComponents();
                  setLocationRelativeTo(null);
                    this.getContentPane().setBackground(fondo);
         }

         /**
          * This method is called from within the constructor to
          * initialize the form. WARNING: Do NOT modify this code. The
          * content of this method is always regenerated by the Form
          * Editor.
          */
         @SuppressWarnings("unchecked")
         // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
         private void initComponents() {

                  jScrollPane1 = new javax.swing.JScrollPane();
                  jTextArea1 = new javax.swing.JTextArea();
                  jLabel2 = new javax.swing.JLabel();
                  jLabel1 = new javax.swing.JLabel();
                  jButton1 = new javax.swing.JButton();

                  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                  jTextArea1.setEditable(false);
                  jTextArea1.setBackground(fondo);
                  jTextArea1.setColumns(20);
                  jTextArea1.setForeground(letra);
                  jTextArea1.setRows(5);
                  jTextArea1.setText("VERSIÓN DEL PRODUCTO : SISTEMA DE ENTREGA DE CHIP LAPTOPS 1.0\nJAVA : JDK 14.\nSISTEMA OPERATIVO : WINDOWS 10\nÚLTIMA ACTUALIZACIÓN : OCTUBRE  DE 2020");
                  jTextArea1.setDragEnabled(true);
                  jTextArea1.setOpaque(false);
                  jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
                           public void keyTyped(java.awt.event.KeyEvent evt) {
                                    jTextArea1KeyTyped(evt);
                           }
                  });
                  jScrollPane1.setViewportView(jTextArea1);

                  jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escudo.png"))); // NOI18N

                  jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
                  jLabel1.setForeground(letra);
                  jLabel1.setText("sistema de entrega de chips y laptop");

                  jButton1.setText("ok");
                  jButton1.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jButton1ActionPerformed(evt);
                           }
                  });

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(155, 155, 155)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(94, 94, 94))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 45, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(39, 39, 39))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel2)
                                    .addGap(39, 39, 39)
                                    .addComponent(jLabel1)
                                    .addGap(32, 32, 32)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(44, 44, 44))
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         private void jTextArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyTyped
                  // TODO add your handling code here:
                evt.consume();
         }//GEN-LAST:event_jTextArea1KeyTyped

         private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  // TODO add your handling code here:
                  dispose();
         }//GEN-LAST:event_jButton1ActionPerformed

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
                           java.util.logging.Logger.getLogger(version.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(version.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(version.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(version.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>

                  /* Create and display the dialog */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    version dialog = new version(new javax.swing.JFrame(), true);
                                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                             @Override
                                             public void windowClosing(java.awt.event.WindowEvent e) {
                                                      System.exit(0);
                                             }
                                    });
                                    dialog.setVisible(true);
                           }
                  });
         }

         // Variables declaration - do not modify//GEN-BEGIN:variables
         private javax.swing.JButton jButton1;
         private javax.swing.JLabel jLabel1;
         private javax.swing.JLabel jLabel2;
         private javax.swing.JScrollPane jScrollPane1;
         private javax.swing.JTextArea jTextArea1;
         // End of variables declaration//GEN-END:variables
}
