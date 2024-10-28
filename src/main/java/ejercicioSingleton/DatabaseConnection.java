/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioSingleton;

/**
 *
 * @author Jorge
 */
public class DatabaseConnection {
    
    private static DatabaseConnection instance;
    
    private DatabaseConnection(){
        //constructor privado
    }
    
    public static DatabaseConnection getInstance (){
        if(instance == null){
            instance = new DatabaseConnection();
        }
            return instance;
    }
    
    
    public void connect(){
        System.out.println("Conectado a la base de datos.");
    }
    
    public void disconnet(){
        System.out.println("De desconecto a la base de datos");
    }

    

}
