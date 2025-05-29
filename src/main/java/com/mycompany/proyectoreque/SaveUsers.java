package com.mycompany.proyectoreque;

import java.io.File;
import java.io.FileWriter;

/**
 * @author chava
 */
public class SaveUsers {
    
    public void saveUser(String username, String password) {
        try {
            //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
            File nombre_archivo = new File("users.txt");

            //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
            FileWriter escritor = new FileWriter(nombre_archivo, true);

            String cadena = username + ";" + password + "\n";

            escritor.write(cadena);

            //Cerramos la conexion
            escritor.close();
        } //Si existe un problema al escribir cae aqui
        catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }
}

