/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.control;
import clases.validar;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class escuela extends javax.swing.JDialog {

         /**
          * Creates new form escuela
          */
         public escuela(java.awt.Frame parent, boolean modal) {
                  super(parent, modal);
                  initComponents();
                  setLocationRelativeTo(null);
                  control.fillTable2(tabla, "select *from  v_escuela_detalle");
                  control.fillCombo(cb_facultad, "select nomfac from facultad");
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

                  jPanel1 = new javax.swing.JPanel();
                  jLabel1 = new javax.swing.JLabel();
                  jTextField1 = new javax.swing.JTextField();
                  cb_facultad = new javax.swing.JComboBox<>();
                  jLabel2 = new javax.swing.JLabel();
                  bt_crear = new javax.swing.JButton();
                  btn_actualizar = new javax.swing.JButton();
                  btn_eliminar = new javax.swing.JButton();
                  btn_cancelar = new javax.swing.JButton();
                  btn_salir = new javax.swing.JButton();
                  jPanel2 = new javax.swing.JPanel();
                  jScrollPane1 = new javax.swing.JScrollPane();
                  tabla = new javax.swing.JTable();

                  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                  jLabel1.setText("facultad");

                  jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
                           public void keyTyped(java.awt.event.KeyEvent evt) {
                                    jTextField1KeyTyped(evt);
                           }
                  });

                  cb_facultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                  jLabel2.setText("escuela");

                  bt_crear.setText("crear");
                  bt_crear.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bt_crearActionPerformed(evt);
                           }
                  });

                  btn_actualizar.setText("actualizar");
                  btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_actualizarActionPerformed(evt);
                           }
                  });

                  btn_eliminar.setText("eliminar");
                  btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_eliminarActionPerformed(evt);
                           }
                  });

                  btn_cancelar.setText("cancelar");
                  btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_cancelarActionPerformed(evt);
                           }
                  });

                  btn_salir.setText("salir");
                  btn_salir.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_salirActionPerformed(evt);
                           }
                  });

                  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                  jPanel1.setLayout(jPanel1Layout);
                  jPanel1Layout.setHorizontalGroup(
                           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                      .addComponent(jLabel1)
                                                      .addGap(18, 18, 18)
                                                      .addComponent(cb_facultad, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                      .addComponent(jLabel2)
                                                      .addGap(18, 18, 18)
                                                      .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                               .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(bt_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(30, 30, 30)
                                                                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(34, 34, 34)
                                                                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(39, 39, 39)
                                                                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(30, 30, 30)
                                                                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(0, 185, Short.MAX_VALUE))
                                                               .addComponent(jTextField1))))
                                    .addGap(61, 61, 61))
                  );
                  jPanel1Layout.setVerticalGroup(
                           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(jLabel1)
                                             .addComponent(cb_facultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(btn_actualizar)
                                             .addComponent(bt_crear)
                                             .addComponent(btn_eliminar)
                                             .addComponent(btn_cancelar)
                                             .addComponent(btn_salir))
                                    .addContainerGap())
                  );

                  tabla.setModel(new javax.swing.table.DefaultTableModel(
                           new Object [][] {
                                    {null, null, null, null},
                                    {null, null, null, null},
                                    {null, null, null, null},
                                    {null, null, null, null}
                           },
                           new String [] {
                                    "Title 1", "Title 2", "Title 3", "Title 4"
                           }
                  ));
                  tabla.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mousePressed(java.awt.event.MouseEvent evt) {
                                    tablaMousePressed(evt);
                           }
                  });
                  jScrollPane1.setViewportView(tabla);

                  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                  jPanel2.setLayout(jPanel2Layout);
                  jPanel2Layout.setHorizontalGroup(
                           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                                    .addGap(23, 23, 23))
                  );
                  jPanel2Layout.setVerticalGroup(
                           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  );

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(23, Short.MAX_VALUE))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(9, Short.MAX_VALUE))
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         private void bt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearActionPerformed
                  // TODO add your handling code here:
                  String esc = jTextField1.getText().trim();

                  if (esc.length() != 0 && cb_facultad.getSelectedIndex() >= 0) {

                           String sql = String.format("call insertar_escuela('%s','%s')", esc, cb_facultad.getSelectedItem().toString());
                           if (control.update(sql) != 0) {
                                    control.fillTable2(tabla, "select *from  v_escuela_detalle");
                                    JOptionPane.showMessageDialog(bt_crear, "se ingresó correctamente");
                           }
                  } else {
                           JOptionPane.showMessageDialog(bt_crear, "ingrese todo los campos", "alerta", JOptionPane.WARNING_MESSAGE);

                  }
         }//GEN-LAST:event_bt_crearActionPerformed

         private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
                  // TODO add your handling code here:
                  validar.SoloLetras(evt);
         }//GEN-LAST:event_jTextField1KeyTyped

         private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
                  // TODO add your handling code here:

                  jTextField1.setText(tabla.getValueAt(tabla.getSelectedRow(), 1).toString());
                  cb_facultad.setSelectedItem(tabla.getValueAt(tabla.getSelectedRow(), 2));
         }//GEN-LAST:event_tablaMousePressed

         private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
                  // TODO add your handling code here:
                  String esc = jTextField1.getText().trim();

                  if (esc.length() != 0 && cb_facultad.getSelectedIndex() >= 0) {
                           if (tabla.getSelectedRowCount() != 0) {

                                    if (JOptionPane.showConfirmDialog(btn_actualizar, "desea actualizar la facultad "
                                            + tabla.getValueAt(tabla.getSelectedRow(), 1) + " por :\n " + jTextField1.getText().trim()) == 0) {

                                             String sql = String.format("call actualizar_escuela(%s,'%s','%s')", tabla.getValueAt(tabla.getSelectedRow(), 0).toString(),
                                                     esc, cb_facultad.getSelectedItem().toString());
                                             System.out.println(sql);
                                             if (control.update(sql) != 0) {
                                                      control.fillTable2(tabla, "select *from  v_escuela_detalle");
                                                      JOptionPane.showMessageDialog(btn_actualizar, "se actualizo correctamente");
                                             }
                                    }
                           } else {
                                    JOptionPane.showMessageDialog(bt_crear, "seleccione la fila que desea actualizar", "alerta", JOptionPane.WARNING_MESSAGE);
                           }
                  } else {
                           JOptionPane.showMessageDialog(bt_crear, "ingrese todo los campos", "alerta", JOptionPane.WARNING_MESSAGE);
                  }
         }//GEN-LAST:event_btn_actualizarActionPerformed

         private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
                  // TODO add your handling code here:

                  if (tabla.getSelectedRowCount() != 0) {
                           if (JOptionPane.showConfirmDialog(btn_eliminar, "¿desea eliminar la escuela" + tabla.getValueAt(tabla.getSelectedRow(), 1).toString()) == 0) {
                                    String sql = String.format("delete from escuela where idescuela=%s", tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                                    if (control.update(sql) != 0) {
                                             control.fillTable2(tabla, "select *from  v_escuela_detalle");
                                             JOptionPane.showMessageDialog(btn_eliminar, "se ha borrado correctamente");
                                    }
                           }

                  } else {
                           JOptionPane.showMessageDialog(btn_eliminar, "seleccione una fila para eliminar", "alerta", JOptionPane.WARNING_MESSAGE);
                  }


         }//GEN-LAST:event_btn_eliminarActionPerformed

         private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
                  // TODO add your handling code here:
                  tabla.getSelectionModel().removeSelectionInterval(0, tabla.getRowCount());
                  jTextField1.setText("");
                  cb_facultad.setSelectedIndex(-1);
         }//GEN-LAST:event_btn_cancelarActionPerformed

         private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
                  // TODO add your handling code here:
                  
                  if(JOptionPane.showConfirmDialog(btn_salir, "¿desea abandonar la aplicacion?")==0){
                           dispose();
                  }
         }//GEN-LAST:event_btn_salirActionPerformed

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
                           java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(escuela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>

                  /* Create and display the dialog */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    escuela dialog = new escuela(new javax.swing.JFrame(), true);
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
         private javax.swing.JButton bt_crear;
         private javax.swing.JButton btn_actualizar;
         private javax.swing.JButton btn_cancelar;
         private javax.swing.JButton btn_eliminar;
         private javax.swing.JButton btn_salir;
         private javax.swing.JComboBox<String> cb_facultad;
         private javax.swing.JLabel jLabel1;
         private javax.swing.JLabel jLabel2;
         private javax.swing.JPanel jPanel1;
         private javax.swing.JPanel jPanel2;
         private javax.swing.JScrollPane jScrollPane1;
         private javax.swing.JTextField jTextField1;
         private javax.swing.JTable tabla;
         // End of variables declaration//GEN-END:variables
}
