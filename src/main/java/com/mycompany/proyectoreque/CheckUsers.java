package com.mycompany.proyectoreque;

import java.io.File;
import java.io.FileWriter;
import org.mindrot.jbcrypt.BCrypt;

/**
 * @author chava
 */
public class CheckUsers {
    
    public boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
    
    public boolean validateUser(String username, String password) {
        try {
            File archivo = new File("users.txt");
            java.util.Scanner lector = new java.util.Scanner(archivo);
            
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] partes = linea.split(";");
                
                if (partes[0].equals(username)) {
                    
                    return checkPassword(password, partes[1]);
                }
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivov");
        }
        return false;
    }
    
    public boolean validateUsername(String username) {
        try {
            File archivo = new File("users.txt");
            java.util.Scanner lector = new java.util.Scanner(archivo);
            
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                String[] partes = linea.split(";");
                
                if (partes[0].equals(username)) {
                    return true;
                }
            }
            lector.close();
        } catch (Exception e) {
            System.out.println("Error al leer archivo");
        }
        return false;
    }
}

