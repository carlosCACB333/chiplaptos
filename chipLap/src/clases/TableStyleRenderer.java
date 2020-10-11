/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Rojeru San CL
 */
public class TableStyleRenderer extends DefaultTableCellRenderer {

         Color fondo = configuracion.fondo;
         Color letra = configuracion.letra;

         private Component componenete;

         @Override
         public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                 boolean hasFocus, int row, int column) {
                  componenete = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.       

//     this.setHorizontalAlignment(SwingConstants.CENTER);
                  this.setBorder(null);
                  //componenete.setFont(new Font("Roboto", Font.BOLD, 14));
                  if (row % 2 == 0) {
                           componenete.setForeground(letra);
                           componenete.setBackground(new Color(64, 81, 92));

                           if (fondo.getRGB() == (new Color(214, 217, 223)).getRGB()) {
                                    componenete.setBackground(new Color(255, 255, 255));
                           }
                  } else {
//            componenete.setForeground(new Color(1, 170, 45));
                           componenete.setForeground(letra);
                           componenete.setBackground(fondo);

                           // componenete.setBackground(new Color(255, 255, 255));
                  }
                  if (isSelected) {
//            componenete.setForeground(Color.white);
                           componenete.setBackground(new Color(0, 153, 153));
                           componenete.setForeground(Color.white);

                  }
//añadir imagen
//        if (value instanceof JLabel) {
//            JLabel label = (JLabel) value;
//
//            return label;
//        }
                  return componenete;

         }

}
