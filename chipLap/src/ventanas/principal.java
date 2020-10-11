/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.configuracion;
import clases.control;
import clases.validar;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class principal extends javax.swing.JFrame {

         int usuario_id = 3;

         /**
          * Creates new form principal
          */
         public principal() {
                  initComponents();
                  setLocationRelativeTo(null);
                  setTitle("sistema de entregas de chips y laptos");
                  this.getContentPane().setBackground(new Color(33, 76, 102));

 
         }

         public principal(String usuario_id) {
                  initComponents();
                  this.usuario_id = Integer.parseInt(usuario_id);
                  setLocationRelativeTo(null);
                  setTitle("programa principal");
                  String usuario = control.returnData("select login from usuario where idUsuario=" + this.usuario_id);
                  jLabel1.setText(usuario + ", te damos la coordial bienvenida!");
                  this.getContentPane().setBackground(new Color(33, 76, 102));

                  (new datos_administrador(this, false, this.usuario_id)).setVisible(true);
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

                  jLabel1 = new javax.swing.JLabel();
                  jLabel2 = new javax.swing.JLabel();
                  jLabel3 = new javax.swing.JLabel();
                  jLabel4 = new javax.swing.JLabel();
                  jMenuBar1 = new javax.swing.JMenuBar();
                  jMenu1 = new javax.swing.JMenu();
                  jMenuItem1 = new javax.swing.JMenuItem();
                  jMenuItem2 = new javax.swing.JMenuItem();
                  jMenuItem3 = new javax.swing.JMenuItem();
                  jMenuItem4 = new javax.swing.JMenuItem();
                  jMenu2 = new javax.swing.JMenu();
                  jMenuItem5 = new javax.swing.JMenuItem();
                  jMenu3 = new javax.swing.JMenu();
                  jMenuItem6 = new javax.swing.JMenuItem();
                  jMenuItem7 = new javax.swing.JMenuItem();
                  jMenuItem8 = new javax.swing.JMenuItem();
                  jMenuItem9 = new javax.swing.JMenuItem();
                  jMenu6 = new javax.swing.JMenu();
                  jMenuItem15 = new javax.swing.JMenuItem();
                  jMenu7 = new javax.swing.JMenu();
                  jMenuItem16 = new javax.swing.JMenuItem();
                  jMenuItem17 = new javax.swing.JMenuItem();
                  jMenuItem18 = new javax.swing.JMenuItem();
                  jMenu4 = new javax.swing.JMenu();
                  jMenuItem10 = new javax.swing.JMenuItem();
                  jMenuItem11 = new javax.swing.JMenuItem();
                  jMenu5 = new javax.swing.JMenu();
                  jMenuItem12 = new javax.swing.JMenuItem();
                  jMenuItem13 = new javax.swing.JMenuItem();
                  jMenuItem14 = new javax.swing.JMenuItem();

                  setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                  jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

                  jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/universidad.jpg"))); // NOI18N

                  jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
                  jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                  jLabel3.setText("SISTEMA DE ENTREGA DE CHIPS Y LAPTOP");

                  jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
                  jLabel4.setText("\"Univercidad Nacional Santiago Antúnez de mayolo\"");

                  jMenu1.setText("registros");

                  jMenuItem1.setText("registrar faculades");
                  jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem1ActionPerformed(evt);
                           }
                  });
                  jMenu1.add(jMenuItem1);

                  jMenuItem2.setText("registrar escuelas");
                  jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem2ActionPerformed(evt);
                           }
                  });
                  jMenu1.add(jMenuItem2);

                  jMenuItem3.setText(" registrar alumnos");
                  jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem3ActionPerformed(evt);
                           }
                  });
                  jMenu1.add(jMenuItem3);

                  jMenuItem4.setText("registrar administradores");
                  jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem4ActionPerformed(evt);
                           }
                  });
                  jMenu1.add(jMenuItem4);

                  jMenuBar1.add(jMenu1);

                  jMenu2.setText("entregas");

                  jMenuItem5.setText("entregar materiales");
                  jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem5ActionPerformed(evt);
                           }
                  });
                  jMenu2.add(jMenuItem5);

                  jMenuBar1.add(jMenu2);

                  jMenu3.setText("reportes");

                  jMenuItem6.setText("reporte de entregas");
                  jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem6ActionPerformed(evt);
                           }
                  });
                  jMenu3.add(jMenuItem6);

                  jMenuItem7.setText("reporte de alumnos que faltan entregar");
                  jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem7ActionPerformed(evt);
                           }
                  });
                  jMenu3.add(jMenuItem7);

                  jMenuItem8.setText("reporte de entregas entre fechas");
                  jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem8ActionPerformed(evt);
                           }
                  });
                  jMenu3.add(jMenuItem8);

                  jMenuItem9.setText("facultades");
                  jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem9ActionPerformed(evt);
                           }
                  });
                  jMenu3.add(jMenuItem9);

                  jMenuBar1.add(jMenu3);

                  jMenu6.setText("administrador");

                  jMenuItem15.setText("datos del administrador");
                  jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem15ActionPerformed(evt);
                           }
                  });
                  jMenu6.add(jMenuItem15);

                  jMenuBar1.add(jMenu6);

                  jMenu7.setText("configuración");

                  jMenuItem16.setText("tema azul");
                  jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem16ActionPerformed(evt);
                           }
                  });
                  jMenu7.add(jMenuItem16);

                  jMenuItem17.setText("tema oscuro");
                  jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem17ActionPerformed(evt);
                           }
                  });
                  jMenu7.add(jMenuItem17);

                  jMenuItem18.setText("tema claro");
                  jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem18ActionPerformed(evt);
                           }
                  });
                  jMenu7.add(jMenuItem18);

                  jMenuBar1.add(jMenu7);

                  jMenu4.setText("sobre unasam");

                  jMenuItem10.setText("página web");
                  jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem10ActionPerformed(evt);
                           }
                  });
                  jMenu4.add(jMenuItem10);

                  jMenuItem11.setText("misión y visión");
                  jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem11ActionPerformed(evt);
                           }
                  });
                  jMenu4.add(jMenuItem11);

                  jMenuBar1.add(jMenu4);

                  jMenu5.setText("ayuda");

                  jMenuItem12.setText("version del software");
                  jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem12ActionPerformed(evt);
                           }
                  });
                  jMenu5.add(jMenuItem12);

                  jMenuItem13.setText("manual del software");
                  jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem13ActionPerformed(evt);
                           }
                  });
                  jMenu5.add(jMenuItem13);

                  jMenuItem14.setText("salir");
                  jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    jMenuItem14ActionPerformed(evt);
                           }
                  });
                  jMenu5.add(jMenuItem14);

                  jMenuBar1.add(jMenu5);

                  setJMenuBar(jMenuBar1);

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(layout.createSequentialGroup()
                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                               .addGroup(layout.createSequentialGroup()
                                                                        .addGap(173, 173, 173)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                               .addGroup(layout.createSequentialGroup()
                                                                        .addGap(404, 404, 404)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                 .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                      .addGap(0, 174, Short.MAX_VALUE))
                                             .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addContainerGap())
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(26, Short.MAX_VALUE))
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
                  // TODO add your handling code here:
                  (new escuela(this, false)).setVisible(true);
         }//GEN-LAST:event_jMenuItem2ActionPerformed

         private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                  // TODO add your handling code here:
                  (new alumno(this, false)).setVisible(true);
         }//GEN-LAST:event_jMenuItem3ActionPerformed

         private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_jMenuItem4ActionPerformed

         private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
                  // TODO add your handling code here:
                  (new facultades(this, false)).setVisible(true);
         }//GEN-LAST:event_jMenuItem1ActionPerformed

         private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
                  // TODO add your handling code here:

                  (new entregas(this, false, usuario_id)).setVisible(true);
         }//GEN-LAST:event_jMenuItem5ActionPerformed

         private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
                  // TODO add your handling code here:

                  HashMap parametros = new HashMap<>();
                  JasperViewer reporte = control.showReport("reportes/entregas.jasper", parametros);
                  try {
                           reporte.setTitle("mostrando los detalles de las entregas");
                  } catch (Exception e) {
                  }
         }//GEN-LAST:event_jMenuItem6ActionPerformed

         private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
                  // TODO add your handling code here:

                  (new entregas_por_intervalo(this, false)).setVisible(true);
         }//GEN-LAST:event_jMenuItem8ActionPerformed

         private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
                  // TODO add your handling code here:
                  HashMap parametros = new HashMap<>();
                  JasperViewer reporte = control.showReport("reportes/no_entregados.jasper", parametros);
                  try {
                           reporte.setTitle("alumnos que no han sido entregados");
                  } catch (Exception e) {
                  }
         }//GEN-LAST:event_jMenuItem7ActionPerformed

         private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
                  // TODO add your handling code here:

                  HashMap parametros = new HashMap<>();
                  JasperViewer reporte = control.showReport("reportes/principalFacultad.jasper", parametros);
                  try {
                           reporte.setTitle("reporte de facultades y escuelas");
                  } catch (Exception e) {
                  }
         }//GEN-LAST:event_jMenuItem9ActionPerformed

         private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_jMenuItem13ActionPerformed

         private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
                  // TODO add your handling code here:
                  validar.abrirUrl("http://www.unasam.edu.pe/");
         }//GEN-LAST:event_jMenuItem10ActionPerformed

         private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
                  // TODO add your handling code here:
                  validar.abrirUrl("http://www.unasam.edu.pe/WebMisionVision");
         }//GEN-LAST:event_jMenuItem11ActionPerformed

         private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
                  // TODO add your handling code here:
                  if (JOptionPane.showConfirmDialog(jMenuItem14, "¿desea  salir del programa?") == 0) {
                           System.exit(0);
                  }

         }//GEN-LAST:event_jMenuItem14ActionPerformed

         private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
                  // TODO add your handling code here:

                  (new datos_administrador(this, true, usuario_id)).setVisible(true);
         }//GEN-LAST:event_jMenuItem15ActionPerformed

         private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
                  // TODO add your handling code here:

                  configuracion.fondo = new Color(60, 63, 65);
                  configuracion.letra = new Color(187, 187, 187);

                  this.getContentPane().setBackground(configuracion.fondo);
                  jLabel3.setForeground(configuracion.letra);
         }//GEN-LAST:event_jMenuItem17ActionPerformed

         private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
                  // TODO add your handling code here:
                  configuracion.fondo = new Color(33, 76, 102);
                  configuracion.letra = new Color(255, 255, 255);

                  this.getContentPane().setBackground(configuracion.fondo);
                  jLabel3.setForeground(configuracion.letra);
         }//GEN-LAST:event_jMenuItem16ActionPerformed

         private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
                  // TODO add your handling code here:

                  configuracion.fondo = new Color(214, 217, 223);
                  configuracion.letra = new Color(0, 0, 0);
                  this.getContentPane().setBackground(configuracion.fondo);
                  jLabel3.setForeground(configuracion.letra);
         }//GEN-LAST:event_jMenuItem18ActionPerformed

         private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
                  // TODO add your handling code here:
                  
                  (new version(this, false)).setVisible(true);
         }//GEN-LAST:event_jMenuItem12ActionPerformed

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
                           java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>

                  /* Create and display the form */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    new principal().setVisible(true);
                           }
                  });
         }

         // Variables declaration - do not modify//GEN-BEGIN:variables
         private javax.swing.JLabel jLabel1;
         private javax.swing.JLabel jLabel2;
         private javax.swing.JLabel jLabel3;
         private javax.swing.JLabel jLabel4;
         private javax.swing.JMenu jMenu1;
         private javax.swing.JMenu jMenu2;
         private javax.swing.JMenu jMenu3;
         private javax.swing.JMenu jMenu4;
         private javax.swing.JMenu jMenu5;
         private javax.swing.JMenu jMenu6;
         private javax.swing.JMenu jMenu7;
         private javax.swing.JMenuBar jMenuBar1;
         private javax.swing.JMenuItem jMenuItem1;
         private javax.swing.JMenuItem jMenuItem10;
         private javax.swing.JMenuItem jMenuItem11;
         private javax.swing.JMenuItem jMenuItem12;
         private javax.swing.JMenuItem jMenuItem13;
         private javax.swing.JMenuItem jMenuItem14;
         private javax.swing.JMenuItem jMenuItem15;
         private javax.swing.JMenuItem jMenuItem16;
         private javax.swing.JMenuItem jMenuItem17;
         private javax.swing.JMenuItem jMenuItem18;
         private javax.swing.JMenuItem jMenuItem2;
         private javax.swing.JMenuItem jMenuItem3;
         private javax.swing.JMenuItem jMenuItem4;
         private javax.swing.JMenuItem jMenuItem5;
         private javax.swing.JMenuItem jMenuItem6;
         private javax.swing.JMenuItem jMenuItem7;
         private javax.swing.JMenuItem jMenuItem8;
         private javax.swing.JMenuItem jMenuItem9;
         // End of variables declaration//GEN-END:variables
}
