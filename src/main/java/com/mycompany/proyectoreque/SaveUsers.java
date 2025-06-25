package com.mycompany.proyectoreque;

import java.io.File;
import java.io.FileWriter;
import org.mindrot.jbcrypt.BCrypt;

/**
 * @author chava
 */
public class SaveUsers {
    
    public String encryptPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }
    
    public void saveUser(String username, String password) {
        try {
            
            String encryptedPassword = encryptPassword(password);
            
            File nombre_archivo = new File("users.txt");
            FileWriter escritor = new FileWriter(nombre_archivo, true);

            String cadena = username + ";" + encryptedPassword + "\n";

            escritor.write(cadena);
            escritor.close();
        }
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
}

