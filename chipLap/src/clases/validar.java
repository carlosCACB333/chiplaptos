package clases;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class validar {

         public static boolean esCajaVacio(JTextField... field) {
                  boolean retornar = false;
                  String mensaje = "los  campos : ";
                  for (int i = 0; i <= field.length - 1; i++) {
                           if (field[i].getText().trim().length() == 0) {
                                    retornar = true;
                                    if (mensaje.equals("los  campos : ")) {
                                             mensaje += "\n-" + field[i].getName() + "\n";
                                    } else {
                                             mensaje += "-" + field[i].getName() + "\n";
                                    }
                           }
                  }
                  if (retornar) {
                           JOptionPane.showMessageDialog(null, mensaje + " son requeridos");
                  }
                  return retornar;
         }

         static public void SoloLetras(KeyEvent e) {
                  if ((e.getKeyChar() >= 48) && (e.getKeyChar() <= 57)) {
                           e.consume();
                  }
         }

         static public void Solonumeros(KeyEvent e) {
                  if ((e.getKeyChar() < 48) || (e.getKeyChar() > 57)) {
                           e.consume();
                  }
         }

         static public void AnularTecl(KeyEvent e) {
                  if ((e.getKeyCode() == KeyEvent.VK_BACK_SPACE) || (e.getKeyChar() == KeyEvent.VK_DELETE)) {
                           e.consume();
                  }
         }

         static public boolean esCorreo(String correo) {

                  // Patrón para validar el email
                  Pattern pattern = Pattern
                          .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

                  // El email a validar
                  String email = correo;

                  Matcher mather = pattern.matcher(email);

                  if (mather.find() == true) {
                           return true;
                  } else {
                           return false;
                  }

         }

         public static String Formato_Amd(java.util.Date v1) {
                  java.util.Date fecha1 = v1;
                  java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd");
                  String fecha = df.format(fecha1);

                  return fecha;
         }

         public static String Formato_Dma(java.util.Date v1) {
                  java.util.Date fecha1 = v1;
                  java.text.SimpleDateFormat df = new java.text.SimpleDateFormat("dd-MM-yyyy");
                  String fecha = df.format(fecha1);

                  return fecha;
         }

         public static boolean BuscarDatoenJList(DefaultListModel mdl, String toString) {
                  int i = mdl.getSize();
                  boolean b = false;
                  for (int j = 0; j < i; j++) {
                           if (mdl.getElementAt(j).equals(toString)) {
                                    b = true;
                           }
                  }
                  return b;
         }
}
