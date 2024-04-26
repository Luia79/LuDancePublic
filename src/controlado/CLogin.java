/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlado;

import Controlador.bd.Transacciones;
import Modelo.Usuario;
import Vista.VMenu;
import Vista.VLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author luise
 */
public class CLogin implements ActionListener {
    
    VLogin login;
    Usuario usuario;
    Seguridad seguridad;
    Transacciones transacciones;
    
    public CLogin(VLogin login) {        
        this.seguridad = new Seguridad();
        this.transacciones = new Transacciones();
        
        this.login = login;
        this.login.btnIniciarSesion.addActionListener((ActionListener) this);
      
        
        
    }
    
    public void iniciarLogin() {        
        this.login.setLocationRelativeTo(null);
        this.login.setTitle("Login");
        this.login.setResizable(false);
               
        this.login.pack();  //redimensión de contenedores
        this.login.setVisible(true);        
    } //close iniciarLogin
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == login.btnIniciarSesion) {
            this.usuario = new Usuario();

            //Obtenemos los datos que han ingresado en el VLogin
            String nombreUsuario = this.login.txtUsuario.getText();
            char[] contrasenaChars = this.login.txtContrasena.getPassword();            
            String contrasena = this.seguridad.getHashMD5(new String(contrasenaChars));  
            
            //JOptionPane.showMessageDialog(null, contrasena);
            
            this.usuario.setNombreUsuario(nombreUsuario);
            this.usuario.setContrasena(contrasena);            
            
            //validamos la sesión
            if (this.transacciones.validarSesion(usuario)) {
              
                new VMenu().setVisible(true);  
                VMenu menu = new VMenu();
                CMenu cmenu = new CMenu(menu);
                cmenu.iniciarMenu();  
                this.login.dispose();
                
               
                                                
            } 
            
        } 
    } //close actionPerformed   
    
}
