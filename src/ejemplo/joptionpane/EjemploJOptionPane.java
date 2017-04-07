/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.joptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class EjemploJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // showOptionDialog
     
Object[] options = { "Plan de Invierno", "Plan de Otoño" };
  int eleccion = JOptionPane.showOptionDialog(null, 
      "Escoge una ruta de lanzamiento", 
      "Plan de lanzaminto", 
      JOptionPane.YES_NO_OPTION, 
      JOptionPane.DEFAULT_OPTION,
      null, 
      options, 
      options[0]);
   
    
        
    }
    
}
