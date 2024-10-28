/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioSingleton;

/**
 *
 * @author Jorge
 */
public class UserSession {
    
    private static UserSession instance;
    private String nombre;
    
    private UserSession(){}
    
    
    public static UserSession getInstance(){
        if(instance == null){
            instance = new UserSession();
        }
        return instance;
    }
    
    public void login(String nombreJ){
        this.nombre = nombreJ;
        System.out.println("Usuario'" + nombre + "'ha iniciado sesión.");
    }
    
    public void logout (){
        System.out.println("Sesión cerrada para '" + nombre + "'.");
        this.nombre = null;
        }
    
    public String getNombre(){
        return nombre;
    }
}
            
    
    
