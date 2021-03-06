/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.configuracion;
import clases.control;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class datos_administrador extends javax.swing.JDialog {

         private int usuario_id = 3;
         DefaultListModel modelo = new DefaultListModel();
          Color fondo = configuracion.fondo;
         Color letra = configuracion.letra;

         /**
          * Creates new form datos_administrador
          */
         public datos_administrador(java.awt.Frame parent, boolean modal) {
                  super(parent, modal);
                  initComponents();
                  setLocationRelativeTo(null);
                  jList1.setModel(modelo);
                  llenarLista();
                   this.getContentPane().setBackground(fondo);
         }

         public datos_administrador(java.awt.Frame parent, boolean modal, int usuario_id) {
                  super(parent, modal);
                  initComponents();
                  setLocationRelativeTo(null);
                  this.usuario_id = usuario_id;
                  jList1.setModel(modelo);
                  llenarLista();
                  this.getContentPane().setBackground(fondo);
         }

         private void llenarLista() {
                  modelo.removeAllElements();
                  String sql = String.format("select * from v_usuario where id=%s", usuario_id);
                  ResultSet res = control.returnResultset(sql);

                  try {
                           if (res.next()) {
                                    modelo.addElement(" login : " + res.getString(2));
                                    modelo.addElement(" DNI : " + res.getString(3));
                                    modelo.addElement(" nombre : " + res.getString(4));
                                    modelo.addElement(" apellido : " + res.getString(5));
                                    modelo.addElement(" genero : " + res.getString(6));
                                    modelo.addElement(" dirección : " + res.getString(7));
                                    modelo.addElement(" celular : " + res.getString(8));
                                    modelo.addElement(" email : " + res.getString(9));
                                    modelo.addElement(" tipo : " + res.getString(10));

                           }
                  } catch (SQLException ex) {
                           Logger.getLogger(datos_administrador.class.getName()).log(Level.SEVERE, null, ex);
                  }

                  DefaultListCellRenderer renderer = (DefaultListCellRenderer) jList1.getCellRenderer();
                  renderer.setHorizontalAlignment(JLabel.CENTER);

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
                  jList1 = new javax.swing.JList<>();
                  jLabel1 = new javax.swing.JLabel();
                  jButton1 = new javax.swing.JButton();

                  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                  setBackground(fondo);

                  jList1.setBackground(fondo);
                  jList1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                  jList1.setForeground(letra);
                  jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                  jScrollPane1.setViewportView(jList1);

                  jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                  jLabel1.setForeground(letra);
                  jLabel1.setText("datos del usuario");

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
                                    .addGap(0, 51, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(56, Short.MAX_VALUE))
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(155, 155, 155)
                                    .addComponent(jLabel1)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(47, 47, 47))
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

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
                           java.util.logging.Logger.getLogger(datos_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(datos_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(datos_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(datos_administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>

                  /* Create and display the dialog */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    datos_administrador dialog = new datos_administrador(new javax.swing.JFrame(), true);
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
         private javax.swing.JList<String> jList1;
         private javax.swing.JScrollPane jScrollPane1;
         // End of variables declaration//GEN-END:variables
}
