/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlado;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author luise
 */
public class Seguridad {
    
    public String getHashMD5(String str) {

        byte[] msg = str.getBytes();

        byte[] hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            hash = md.digest(msg);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error al de hashing: " + e.getMessage());
        }
        
        StringBuilder strBuilder = new StringBuilder();
        
        for (byte b : hash) {
            strBuilder.append(String.format("%02x", b));
        }
        
        String strHash = strBuilder.toString();

        return strHash;

    } // close getHashMD5
    
}
