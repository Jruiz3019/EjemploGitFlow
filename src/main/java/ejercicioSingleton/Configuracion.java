/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioSingleton;

/**
 *
 * @author Jorge
 */
public class Configuracion {
    private static Configuracion instance;
    
    private String nombreAplicacion;
    private String version;
    private boolean modoOscuro;
    
    private Configuracion(){
        this.nombreAplicacion = "J-&-R Proyectos";
        this.version = "1.0.0";
        this.modoOscuro = false;
        
    }
    
    public static Configuracion getInstance(){
        if(instance == null){
            instance = new Configuracion();
        }
        return instance;
    }
    
    public String getNombreAplicacion(){
        return nombreAplicacion;
    }
    
    public void setNombreAplicacion(String nombreAplicacion){
        this.nombreAplicacion = nombreAplicacion;
    }
    
    public String getVersion (){
        return version;
    }
    
    public void setVersion (String version){
        this.version = version;
    }
    
    public boolean isModoOscuro(){
        return modoOscuro;
    }
    
    public void setModoOscuro(boolean modoOscuro){
        this.modoOscuro = modoOscuro;
    }
    
    
}
