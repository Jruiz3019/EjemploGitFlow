/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import ejercicioSingleton.Configuracion;
import ejercicioSingleton.Logger;
import ejercicioSingleton.DatabaseConnection;
import ejercicioSingleton.UserSession;
/**
 *
 * @author Jorge
 */
public class Calculadora {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            int threadNum = i; // Capturar el número del hilo
            new Thread(() -> {
                Logger logger = Logger.getInstance();
                logger.logMessage("Mensaje desde el hilo " + threadNum);
                try {
                    Thread.sleep(1000); // Pausar 1 segundo después de registrar
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
        
        // Pausar el hilo principal para ver el resultado
        try {
            Thread.sleep(6000); // Esperar que todos los hilos terminen
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


        
//        Logger.getInstance().logMessage("Error: La base de datos fallo");
//        Logger.getInstance().logMessage("Advertencia: El archivo de configuracion no se encontró.");
//        Logger.getInstance().logMessage("Info: La aplicacion se ha iniciado correctamente.");
//
//        
//        Configuracion config = Configuracion.getInstance();
//        
//        config.getNombreAplicacion();
//        config.getVersion();
//        config.isModoOscuro();
//        
//        System.out.println(config.getNombreAplicacion());
//        System.out.println(config.getVersion());
//        System.out.println(config.isModoOscuro());
//        
//        
//        config.setNombreAplicacion("Invulnerable");
//        config.setVersion("2.2.0");
//        config.setModoOscuro(true);
//        
//        System.out.println("Nombre de la aplicacion: " + config.getNombreAplicacion());
//        System.out.println("Version: " + config.getVersion());
//        System.out.println("Modo oscuro: " + (config.isModoOscuro()));
//        
//        Configuracion otraConfi = Configuracion.getInstance();
//        
//        System.out.println("Es la misma instancia: " + (config == otraConfi));
//        
//        
//        DatabaseConnection conexion = DatabaseConnection.getInstance();
//        conexion.connect();
//        
//        conexion.disconnet();
//        
//        //Verificamos que sea la misma instancia
//        DatabaseConnection conexionVerificada = DatabaseConnection.getInstance();
//        System.out.println("Es la misma instancia: " + (conexion == conexionVerificada));
//        
//        System.out.println("--------------------------------------------------------------------");
//        
//        UserSession iniciarSesion = UserSession.getInstance();
//        iniciarSesion.login("Jorge Ruiz");
//       
//        
//        System.out.println("Usuario actual: " + iniciarSesion.getNombre());
//        iniciarSesion.logout();
//        
//        System.out.println("Usuario actual después de logout: " + iniciarSesion.getNombre());
//        



        
    
}
