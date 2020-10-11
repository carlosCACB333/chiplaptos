/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.TableStyleRenderer;
import clases.configuracion;
import clases.control;
import clases.tableHeaderStyle;
import clases.validar;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class entregas extends javax.swing.JDialog {

         Color fondo = configuracion.fondo;
         Color letra = configuracion.letra;

         int usuario_id = 3;

         /**
          * Creates new form entregas
          */
         public entregas(java.awt.Frame parent, boolean modal) {
                  super(parent, modal);
                  initComponents();
                  setLocationRelativeTo(null);
                  control.fillTable2(tabla_alumnos, "select id,dni,codigo,concat(nombre,' ',apellido) as datos from v_alumnos");
                  validar.ocultarColumna(tabla_alumnos, 0);
                  setTitle("enrega de materiales");

                  this.getContentPane().setBackground(fondo);
                  tabla_alumnos.getTableHeader().setDefaultRenderer(new tableHeaderStyle());
                  tabla_alumnos.setDefaultRenderer(Object.class, new TableStyleRenderer());
                  tabla_alumnos.setRowHeight(25);
                  
                   tabla_equipos.getTableHeader().setDefaultRenderer(new tableHeaderStyle());
                  tabla_equipos.setDefaultRenderer(Object.class, new TableStyleRenderer());
                  tabla_equipos.setRowHeight(25);
         }

         public entregas(java.awt.Frame parent, boolean modal, int usuario_id) {
                  super(parent, modal);
                  this.usuario_id = usuario_id;
                  initComponents();
                  setLocationRelativeTo(null);

                  control.fillTable2(tabla_alumnos, "select id,dni,codigo,concat(nombre,' ',apellido) as datos from v_alumnos");
                  validar.ocultarColumna(tabla_alumnos, 0);
                  setTitle("enrega de materiales");

                  this.getContentPane().setBackground(fondo);
                  tabla_alumnos.getTableHeader().setDefaultRenderer(new tableHeaderStyle());
                  tabla_alumnos.setDefaultRenderer(Object.class, new TableStyleRenderer());
                  tabla_alumnos.setRowHeight(25);
                  
                   tabla_equipos.getTableHeader().setDefaultRenderer(new tableHeaderStyle());
                  tabla_equipos.setDefaultRenderer(Object.class, new TableStyleRenderer());
                  tabla_equipos.setRowHeight(25);
         }

         private void limpiar() {
                  control.limTable((DefaultTableModel) tabla_equipos.getModel());
                  txt_serie.setText("");
                  cb_equipo.setSelectedIndex(-1);

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
                  txt_buscar = new javax.swing.JTextField();
                  jScrollPane2 = new javax.swing.JScrollPane();
                  tabla_alumnos = new javax.swing.JTable();
                  jPanel2 = new javax.swing.JPanel();
                  jLabel3 = new javax.swing.JLabel();
                  cb_equipo = new javax.swing.JComboBox<>();
                  bt_grabar = new javax.swing.JButton();
                  bt_cancelar = new javax.swing.JButton();
                  bt_salir = new javax.swing.JButton();
                  jLabel2 = new javax.swing.JLabel();
                  txt_serie = new javax.swing.JTextField();
                  btn_agregar = new javax.swing.JButton();
                  lb_resultado = new javax.swing.JLabel();
                  jScrollPane3 = new javax.swing.JScrollPane();
                  tabla_equipos = new javax.swing.JTable();
                  jSeparator1 = new javax.swing.JSeparator();

                  setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                  jPanel1.setBackground(fondo);
                  jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "buscar alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), letra)); // NOI18N

                  jLabel1.setForeground(letra);
                  jLabel1.setText("buscar");

                  txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
                           public void keyTyped(java.awt.event.KeyEvent evt) {
                                    txt_buscarKeyTyped(evt);
                           }
                  });

                  tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
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
                  tabla_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
                           public void mousePressed(java.awt.event.MouseEvent evt) {
                                    tabla_alumnosMousePressed(evt);
                           }
                  });
                  jScrollPane2.setViewportView(tabla_alumnos);

                  javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                  jPanel1.setLayout(jPanel1Layout);
                  jPanel1Layout.setHorizontalGroup(
                           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addGroup(jPanel1Layout.createSequentialGroup()
                                                      .addGap(26, 26, 26)
                                                      .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                             .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                      .addGap(23, 23, 23)
                                                      .addComponent(jLabel1)
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                      .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(15, 15, 15))
                  );
                  jPanel1Layout.setVerticalGroup(
                           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(jLabel1)
                                             .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28))
                  );

                  jPanel2.setBackground(fondo);
                  jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "detalles de entregas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), letra)); // NOI18N

                  jLabel3.setForeground(letra);
                  jLabel3.setText("equipo");

                  cb_equipo.addItemListener(new java.awt.event.ItemListener() {
                           public void itemStateChanged(java.awt.event.ItemEvent evt) {
                                    cb_equipoItemStateChanged(evt);
                           }
                  });
                  cb_equipo.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    cb_equipoActionPerformed(evt);
                           }
                  });

                  bt_grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar-el-archivo.png"))); // NOI18N
                  bt_grabar.setText("grabar entrega");
                  bt_grabar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bt_grabarActionPerformed(evt);
                           }
                  });

                  bt_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incorrecto.png"))); // NOI18N
                  bt_cancelar.setText("cancelar");
                  bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bt_cancelarActionPerformed(evt);
                           }
                  });

                  bt_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hogar.png"))); // NOI18N
                  bt_salir.setText("finalizar");
                  bt_salir.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    bt_salirActionPerformed(evt);
                           }
                  });

                  jLabel2.setForeground(letra);
                  jLabel2.setText("serie");

                  txt_serie.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    txt_serieActionPerformed(evt);
                           }
                  });

                  btn_agregar.setText("agregar a la lista");
                  btn_agregar.addActionListener(new java.awt.event.ActionListener() {
                           public void actionPerformed(java.awt.event.ActionEvent evt) {
                                    btn_agregarActionPerformed(evt);
                           }
                  });

                  lb_resultado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
                  lb_resultado.setForeground(letra);
                  lb_resultado.setText("no ha seleccionado aún ningun alumno");

                  tabla_equipos.setModel(new javax.swing.table.DefaultTableModel(
                           new Object [][] {

                           },
                           new String [] {
                                    "equipo", "serie"
                           }
                  ));
                  jScrollPane3.setViewportView(tabla_equipos);

                  javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                  jPanel2.setLayout(jPanel2Layout);
                  jPanel2Layout.setHorizontalGroup(
                           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bt_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(79, 79, 79))
                           .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                             .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel2Layout.createSequentialGroup()
                                                               .addGap(24, 24, 24)
                                                               .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addGroup(jPanel2Layout.createSequentialGroup()
                                                               .addGap(15, 15, 15)
                                                               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2))
                                                               .addGap(18, 18, 18)
                                                               .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(btn_agregar, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                                        .addComponent(cb_equipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(txt_serie))
                                                               .addGap(44, 44, 44)
                                                               .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(20, Short.MAX_VALUE))
                  );
                  jPanel2Layout.setVerticalGroup(
                           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(lb_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                             .addGroup(jPanel2Layout.createSequentialGroup()
                                                      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                               .addComponent(cb_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addGap(18, 18, 18)
                                                      .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                               .addComponent(jLabel2)
                                                               .addComponent(txt_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(btn_agregar))
                                             .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGap(48, 48, 48)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(bt_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(bt_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                             .addComponent(bt_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35))
                  );

                  javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                  getContentPane().setLayout(layout);
                  layout.setHorizontalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31))
                  );
                  layout.setVerticalGroup(
                           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                             .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addContainerGap(30, Short.MAX_VALUE))
                  );

                  pack();
         }// </editor-fold>//GEN-END:initComponents

         private void cb_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_equipoActionPerformed
                  // TODO add your handling code here

         }//GEN-LAST:event_cb_equipoActionPerformed

         private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
                  // TODO add your handling code here:
                  limpiar();
                  cb_equipo.removeAllItems();
                  lb_resultado.setText("no se ha seleccionado ningún alumno");
                  int pos = txt_buscar.getCaretPosition();
                  String parametro = (txt_buscar.getText().substring(0, pos) + evt.getKeyChar() + txt_buscar.getText().substring(pos)).trim();

                  if (parametro.trim().length() == 0) {
                           control.fillTable2(tabla_alumnos, "select id,dni,codigo,concat(nombre,' ',apellido) as datos from v_alumnos");

                  } else {

                           String sql = "select id,dni,codigo,concat(nombre,' ',apellido) as datos from v_alumnos where"
                                   + " dni like '%" + parametro + "%' or codigo like '%" + parametro + "%'  or nombre like '%" + parametro + "%' "
                                   + "or apellido like '%" + parametro + "%'";
                           control.fillTable2(tabla_alumnos, sql);

                  }
                  validar.ocultarColumna(tabla_alumnos, 0);
         }//GEN-LAST:event_txt_buscarKeyTyped

         private void cb_equipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_equipoItemStateChanged
                  // TODO add your handling code here:


         }//GEN-LAST:event_cb_equipoItemStateChanged

         private void bt_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_grabarActionPerformed
                  // TODO add your handling code here:
                  if(tabla_alumnos.getSelectedRowCount()!=0){
                  if (tabla_equipos.getRowCount() == 1) {

                           int alumno_id = Integer.parseInt(tabla_alumnos.getValueAt(tabla_alumnos.getSelectedRow(), 0).toString());
                           String sql = String.format("insert into entrega values(null,curdate(),curtime(),%s,%s)", alumno_id, usuario_id);
                           int resp = control.update(sql);

                           int entrega_id = Integer.parseInt(control.returnData("select idEntrega from entrega order by idEntrega desc limit 1 "));

                           sql = String.format("insert into detalleentrega values(null,'%s','%s',%s)",
                                   tabla_equipos.getValueAt(0, 0).toString(), tabla_equipos.getValueAt(0, 1), entrega_id);
                           int resp2 = control.update(sql);
                           if (resp > 0 && resp2 > 0) {
                                    JOptionPane.showMessageDialog(bt_grabar, "se grabó correctamente");
                           }
                           limpiar();
                           control.fillTable2(tabla_alumnos, "select id,dni,codigo,concat(nombre,' ',apellido) as datos from v_alumnos");
                           validar.ocultarColumna(tabla_alumnos, 0);
                           lb_resultado.setText("no se ha seleccionado ningun alumno");
                           cb_equipo.removeAllItems();
                           txt_buscar.setText("");

                  } else if (tabla_equipos.getRowCount() == 2) {
                           int alumno_id = Integer.parseInt(tabla_alumnos.getValueAt(tabla_alumnos.getSelectedRow(), 0).toString());

                           String sql = String.format("insert into entrega values(null,curdate(),curtime(),%s,%s)", alumno_id, usuario_id);
                           int resp = control.update(sql);

                           int entrega_id = Integer.parseInt(control.returnData("select idEntrega from entrega order by idEntrega desc limit 1 "));

                           sql = String.format("insert into detalleentrega values(null, '%s','%s',%s),(null,'%s','%s',%s)",
                                   tabla_equipos.getValueAt(0, 0).toString(), tabla_equipos.getValueAt(0, 1).toString(), entrega_id,
                                   tabla_equipos.getValueAt(1, 0).toString(), tabla_equipos.getValueAt(1, 1).toString(), entrega_id);

                           int resp2 = control.update(sql);
                           if (resp > 0 && resp2 > 0) {
                                    JOptionPane.showMessageDialog(bt_grabar, "se grabó correctamente");
                           }
                           limpiar();
                           control.fillTable2(tabla_alumnos, "select id,dni,codigo,concat(nombre,' ',apellido) as datos from v_alumnos");
                           validar.ocultarColumna(tabla_alumnos, 0);
                           lb_resultado.setText("no se ha seleccionado ningun alumno");
                           cb_equipo.removeAllItems();
                           txt_buscar.setText("");
                  } else {
                           JOptionPane.showMessageDialog(bt_grabar, "no hay nada que grabar");
                  }
                  
                  }else{
                            JOptionPane.showMessageDialog(bt_grabar, "no has seleccionado ningun alumno");
                           
                  }
         }//GEN-LAST:event_bt_grabarActionPerformed

         private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
                  // TODO add your handling code here:
                  limpiar();
         }//GEN-LAST:event_bt_cancelarActionPerformed

         private void bt_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salirActionPerformed
                  // TODO add your handling code here:
                  if (JOptionPane.showConfirmDialog(bt_salir, "¿desea volver a la ventana  principal?") == 0) {
                           dispose();
                  }
         }//GEN-LAST:event_bt_salirActionPerformed

         private void txt_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_serieActionPerformed
                  // TODO add your handling code here:
         }//GEN-LAST:event_txt_serieActionPerformed

         private void tabla_alumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_alumnosMousePressed
                  // TODO add your handling code here:

                  if (tabla_alumnos.getSelectedRowCount() > 0) {
                           cb_equipo.removeAllItems();
                           String buscar = tabla_alumnos.getValueAt(tabla_alumnos.getSelectedRow(), 2).toString();
                           try {
                                    String sql = String.format("select * from v_alumnos where codigo='%s' ", buscar);
                                    if (control.checkQuery(sql)) {
                                             sql = String.format("select count(*) from v_detalle_entrega where codigo='%s' ", buscar);
                                             int cant = Integer.parseInt(control.returnData(sql));

                                             switch (cant) {

                                                      case 0:
                                                               sql = String.format("select codigo, nombre,apellido, escuela from v_alumnos where codigo='%s' ", buscar);

                                                               ResultSet resultSet = control.returnResultset(sql);
                                                               if (resultSet.next()) {
                                                                        String mensaje = String.format("alumno: %s, %s %s, %s", resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
                                                                                resultSet.getString(4));
                                                                        lb_resultado.setText(mensaje);

                                                                        cb_equipo.addItem("LAPTOP");

                                                                        cb_equipo.addItem("CHIP DE DATOS");

                                                               }

                                                               break;
                                                      case 1:
                                                               sql = String.format("select codigo,nombre,apellido,escuela,tipo from v_detalle_entrega where codigo ='%s' ", buscar);

                                                               resultSet = control.returnResultset(sql);
                                                               if (resultSet.next()) {
                                                                        String mensaje = String.format("alumno: %s, %s %s, %s", resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
                                                                                resultSet.getString(4));
                                                                        lb_resultado.setText(mensaje);

                                                                        if (resultSet.getString(5).equalsIgnoreCase("CHIP DE DATOS")) {
                                                                                 cb_equipo.addItem("LAPTOP");
                                                                        } else if (resultSet.getString(5).equalsIgnoreCase("LAPTOP")) {
                                                                                 cb_equipo.addItem("CHIP DE DATOS");
                                                                        }

                                                               }

                                                               break;
                                                      case 2:
                                                               lb_resultado.setText("");
                                                               lb_resultado.setText("no se ha seleccionado ningun alumno");
                                                               JOptionPane.showMessageDialog(tabla_alumnos, " al alumno ya recibió ambos equipos");

                                                               break;

                                             }
                                             cb_equipo.setSelectedIndex(-1);
                                             control.limTable((DefaultTableModel) tabla_equipos.getModel());
                                    } else {
                                             lb_resultado.setText("no se ha seleccionado ningun alumno");
                                             JOptionPane.showMessageDialog(txt_buscar, "el alumno no se encuentra registrado");

                                    }
                           } catch (SQLException ex) {
                                    Logger.getLogger(entregas.class.getName()).log(Level.SEVERE, null, ex);
                           }
                  }
         }//GEN-LAST:event_tabla_alumnosMousePressed

         private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
                  // TODO add your handling code here

                  if (cb_equipo.getSelectedIndex() != -1) {
                           String equipo = cb_equipo.getSelectedItem().toString();
                           String serie = txt_serie.getText().trim();

                           if (serie.length() != 0) {
                                    if (!validar.buscarDatoEnJTable(tabla_equipos, equipo, 0)) {
                                             DefaultTableModel modelo = (DefaultTableModel) tabla_equipos.getModel();
                                             modelo.addRow(new String[]{equipo, serie});
                                             cb_equipo.setSelectedIndex(-1);
                                             txt_serie.setText("");

                                    } else {
                                             JOptionPane.showMessageDialog(btn_agregar, "el equipo ya ha sido añadido");
                                    }

                           } else {
                                    JOptionPane.showMessageDialog(btn_agregar, "ingrese la serie del equipo");
                           }
                  } else {
                           JOptionPane.showMessageDialog(btn_agregar, "seleccione el equipo por favor");
                  }


         }//GEN-LAST:event_btn_agregarActionPerformed

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
                           java.util.logging.Logger.getLogger(entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (InstantiationException ex) {
                           java.util.logging.Logger.getLogger(entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (IllegalAccessException ex) {
                           java.util.logging.Logger.getLogger(entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                           java.util.logging.Logger.getLogger(entregas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                  }
                  //</editor-fold>

                  /* Create and display the dialog */
                  java.awt.EventQueue.invokeLater(new Runnable() {
                           public void run() {
                                    entregas dialog = new entregas(new javax.swing.JFrame(), true);
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
         private javax.swing.JButton bt_cancelar;
         private javax.swing.JButton bt_grabar;
         private javax.swing.JButton bt_salir;
         private javax.swing.JButton btn_agregar;
         private javax.swing.JComboBox<String> cb_equipo;
         private javax.swing.JLabel jLabel1;
         private javax.swing.JLabel jLabel2;
         private javax.swing.JLabel jLabel3;
         private javax.swing.JPanel jPanel1;
         private javax.swing.JPanel jPanel2;
         private javax.swing.JScrollPane jScrollPane2;
         private javax.swing.JScrollPane jScrollPane3;
         private javax.swing.JSeparator jSeparator1;
         private javax.swing.JLabel lb_resultado;
         private javax.swing.JTable tabla_alumnos;
         private javax.swing.JTable tabla_equipos;
         private javax.swing.JTextField txt_buscar;
         private javax.swing.JTextField txt_serie;
         // End of variables declaration//GEN-END:variables
}
