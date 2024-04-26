/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import Vista.VLogin;
import com.jtattoo.plaf.aero.AeroLookAndFeel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Controlador.bd.ConexionBD;

/**
 *
 * @author luise
 */
public class ldSystem {
    
    public static void main(String[] args) {
        
        
        
       
        
        
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());              

        } catch (UnsupportedLookAndFeelException ex) {
            System.err.println("Error de LookAndFeel");
        }
        
        
          //evaluar la conexion 
        if (ConexionBD.iniciarConeccionBD()) {
            JOptionPane.showMessageDialog(null, "Conectado a la BD");
            
            new VLogin().setVisible(true);
           
        } else {
            JOptionPane.showMessageDialog(null, "No conectado a la BD", 
                    "Error de conección", JOptionPane.ERROR_MESSAGE);
        }

           
            
        
            
            
        
           

    } // close main
    
    
    
}
