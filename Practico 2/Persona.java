
/**
 * Write a description of class Persona here.
 * 
 * @author(Torres Jemina Cesia) 
 * @DNI(42790791)
 */

import java.util.*;
public class Persona {
    //Atributos de la clase
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    //Metodo especial: Constructor
    public Persona (int p_dni, String p_nombre, String p_apellido, int p_anio) {
        setDNI(p_dni);
        setNombre (p_nombre);
        setApellido (p_apellido);
        setAnioNacimiento (p_anio);
    }
    
    //Metodos privados de la clase
    private void setDNI(int p_dni) { //Asigna un valor al atributo nroDni
        this.nroDni = p_dni; 
    }
    private void setNombre (String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setApellido (String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setAnioNacimiento (int p_anio) {
        this.anioNacimiento = p_anio;
    }
    
    //Metodos públicos de la clase (visibles para otros objetos)
    public int getDNI() { //Retorna el DNI de la persona
        return nroDni;        
    }
    public String getNombre() { //Retorna el nombre de la persona
        return nombre;
    }
    public String getApellido() { //Retorna el apellido de la persona
        return apellido;
    }
    public int getAnioNacimiento() { //Retorna el año de nacimiento de la persona
        return anioNacimiento;
    }   
    public int edad() { //Retorna la edad de la persona
        Calendar fechaHoy = new GregorianCalendar(); 
        int anioHoy = fechaHoy.get(Calendar.YEAR); //Obtiene el año actual
        return (anioHoy - getAnioNacimiento());
    }
    public String nomYApe() { //Retorna nombre y apellido de la persona
        return getNombre() + ", " + getApellido();
       
    }
    public String apeYNom() { //Retorna apellido y nombre de la persona
        return getApellido() + ", " + getNombre();
    }
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "\t" + "Edad: " + edad() + " años");
    }
}