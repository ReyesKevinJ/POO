
/**
 * Write a description of class Persona here.
 * 
 * @author (Reyes Kevin) 
 * @version (2025-08-11)
 */
import java.util.*;
public class Persona
{
    
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    Persona(int p_dni,String p_nombre,String p_apellido, int p_anio){
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    /**
     * acceso mutador de al atributo nroDni
    *@params(4599999)   
    */
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    /**
     * acceso mutador de al atributo apellido
    * @params("Apellido")
    */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    /**
     * acceso mutador de al atributo nombre
    * @params("Nombre")
    */
    private void setNombre(String p_nombre){
        this.nombre= p_nombre;
    }
    /**acceso mutador de al atributo anioNacimiento
    * @params(2004)
    */
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento= p_anio;
    }
    /**
     * acceso observador de al atributo nroDni
    * @return(4599999)
    */
    public int getDNI(){
        return this.nroDni;
    }
    /**
     * acceso observador de al atributo nombre
    * @return("Nombre")
    */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * acceso observador de al atributo apellido
    * @return("Apellido")
    */
    public String getApellido(){
        return this.apellido;
    }
    /**
     * acceso observador de al atributo anioNacimiento
    * @return(2004)
    */
    public int getAnioNacimiento(){
        
        return this.anioNacimiento;
    }
    
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        int edad= anioHoy-this.getAnioNacimiento();
        return edad;
    }
    
    public String nomYApe(){
        return this.getNombre()+" "+ this.getApellido();
    }
    
    public String apeYNom(){
        return this.getApellido()+" "+ this.getNombre();
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+this.nomYApe());
        System.out.println("DNI: "+this.getDNI()+" Edad: "+this.edad());
    }
}