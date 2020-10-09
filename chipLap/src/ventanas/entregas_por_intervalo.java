/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.control;
import clases.validar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class entregas_por_intervalo extends javax.swing.JDialog {

         /**
          * Creates new form entregas_por_intervalo
          */
         public entregas_por_intervalo(java.awt.Frame parent, boolean modal) {
                  super(parent, modal);
                  initComponents();
                  setLocationRelativeTo(null);
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

                  jDateChooser1 = new com.toedter.calendar.JDateChooser();
                  jLabel1 = new javax.swing.JLabel();
                  jLabel2 = new javax.swing.JLabel();
                  f_inicial = new com.toedter.calendar.JDateChooser();
                  f_final = new com.toedter.calendar.JDateChooser();
                  jButton1 = new javax.swing.JButton();
                  jButton2 = new javax.swing.JButton();
                  jButton3 = new javax.swing.JButton();

                  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                  jLabel1.setText("fecha inicial");

                  jLabel2.setText("fecha final");

                  f_inicial.setBackground(new java.awt.Color(204, 204, 204));
                  f_inicial.setForeground(new java.awt.Color(255, 255, 255));
                  f_inicial.setDateFormatString("dd/MM/yyyy");

                  f_final.setForeground(new java.awt.Color(255, 255, 255));
                  f_final.setDateFormatString("dd/MM/yyyy");

                  jButton1.setText("mostrar reporte");
                  jButton1.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jButton1ActionPerformed(evt);
                           }
                  });

                  jButton2.setText("cancelar");
                  jButton2.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jButton2ActionPerformed(evt);
                           }
                  });

                  jButton3.setText("salir");
                  jButton3.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jButton3ActionPerformed(evt);
                           }
                  });

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                             .addGroup(layout.createSequentialGroup()
                                                      .addComponent(jLabel2)
                                                      .addGap(35, 35, 35)
                                                      .addComponent(f_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                             .addGroup(layout.createSequentialGroup()
                                                      .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                      .addComponent(f_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                      .addGroup(layout.createSequentialGroup()
                                                               .addGap(6, 6, 6)
                                                               .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                      .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(65, 65, 65))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(123, 123, 123)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel1)
                                             .addComponent(f_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(51, 51, 51)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jLabel2)
                                             .addComponent(f_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(128, Short.MAX_VALUE))
                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(105, 105, 105))
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                  // TODO add your handling code here:

                  String ultimo = validar.Formato_Amd(this.f_final.getDate());
                  String inicial = validar.Formato_Amd(this.f_inicial.getDate());

                  HashMap parametros = new HashMap<>();
                  parametros.put("f_inicial", inicial);
                  parametros.put("f_final", ultimo);
                  JasperViewer reporte = control.showReport("reportes/entregas_por_fechas.jasper", parametros);
                  try {
                           reporte.setTitle("reporte en las fechas dadas  dadas");
                  } catch (Exception e) {
                  }

         }//GEN-LAST:event_jButton1ActionPerformed

         private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                  // TODO add your handling code here:
                  f_inicial.setDate(null);
                  f_final.setDate(null);
         }//GEN-LAST:event_jButton2ActionPerformed

         private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                  // TODO add your handling code here:
                  if (JOptionPane.showConfirmDialog(jButton3, "¿desea abandonar la aplicacion?") == 0) {
                           dispose();
                  }
         }//GEN-LAST:event_jButton3ActionPerformed

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
                           java.util.logging.Logger.getLogger(entregas_por_intervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(entregas_por_intervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(entregas_por_intervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(entregas_por_intervalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>

                  /* Create and display the dialog */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    entregas_por_intervalo dialog = new entregas_por_intervalo(new javax.swing.JFrame(), true);
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
         private com.toedter.calendar.JDateChooser f_final;
         private com.toedter.calendar.JDateChooser f_inicial;
         private javax.swing.JButton jButton1;
         private javax.swing.JButton jButton2;
         private javax.swing.JButton jButton3;
         private com.toedter.calendar.JDateChooser jDateChooser1;
         private javax.swing.JLabel jLabel1;
         private javax.swing.JLabel jLabel2;
         // End of variables declaration//GEN-END:variables
}
