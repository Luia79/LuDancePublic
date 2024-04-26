/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luise
 */
public class ConexionBD {
    
    private static final String usuario = "root";
    private static final String contrasenia = "luised_1479";
    private static final String bd = "colegio2";
    private static final String ip = "localhost";
    private static final String puerto = "3306";
    private static final String ZONE = "serverTimezone=UTC";
    
    public static Connection conexion;
    
    public static boolean iniciarConeccionBD() {
        //ConexionBD.conexion = null;
        
         try {
            if( conexion==null || conexion.isClosed()){
                
            String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
            conexion = DriverManager.getConnection(cadena, usuario, contrasenia);   
            }//Cierra if
            return true;
//            JOptionPane.showMessageDialog(null,"Conectado a la base");
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(null,"No se conecto a la base de datos: "+ e.toString());
            return false; 
        }//Cierrre try
        
      
    } //Cierrre de funcion de conección
    
   public static void desconeccionBD(){
        
        try {
            if(conexion != null){
                conexion.isClosed();
                conexion = null;
            }//Cierra if
        } catch (SQLException e) {
            
           System.err.println("Error al cerrar la conexion: " + e.getMessage());
        }//Cierra if
    }//Cierrre de funcion de desconeccionBD
    
}
