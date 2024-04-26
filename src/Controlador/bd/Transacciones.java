/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.bd;
import Modelo.Usuario;

/**
 *
 * @author luise
 */
public class Transacciones {
    
     public boolean validarSesion(Usuario usuario){
    
        try {
            
            //si tuvieramos base de datos, aquí ejecutariamos la consulta
            
            //validamos
            return (usuario.getNombreUsuario().equals("User") && usuario.getContrasena().equals("202cb962ac59075b964b07152d234b70"));
                        
        } catch (Exception e) {
            System.out.println("Error al validar la sesión");
            return false;
        }
        
    } //close vaidarSesion
    
}
