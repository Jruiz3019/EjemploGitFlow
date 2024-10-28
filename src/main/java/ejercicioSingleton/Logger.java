/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioSingleton;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Jorge
 */
public class Logger {
    
    private static Logger instance;
    
private Logger(){
// Creamos un constructor privado
} 

public static Logger getInstance(){
    if(instance == null){
        synchronized (Logger.class) {//Bloqueo para evitar conflictos entre hilos
            if (instance == null){
            
                instance = new Logger();
            }
        }    
    }
        return instance;
}

public void logMessage( String mensaje){
    String tiempo = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    System.out.println("[" + tiempo + "]" + mensaje );
}

}
