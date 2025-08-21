import java.util.*;
/**
 * La clase Persona representa a una persona con datos basicos:
 * número de DNI, nombre, apellido y año de nacimiento.
 * 
 * Proporciona métodos para consultar los datos, calcular la edad,
 * mostrar la información en distintos formatos y visualizarla en consola.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class Persona {
    //Atributos
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    /**
     * Constructor.
     * Inicializa todos los atributos de la persona.
     * 
     * @param p_dni numero de documento de identidad
     * @param p_nombre nombre de la persona
     * @param p_apellido apellido de la persona
     * @param p_anio año de nacimiento
     */
    public Persona (int p_dni, String p_nombre, String p_apellido, int p_anio) {
        setDNI(p_dni);
        setNombre (p_nombre);
        setApellido (p_apellido);
        setAnioNacimiento (p_anio);
    }
    
    //Setters
    private void setDNI(int p_dni) {
        nroDni = p_dni; 
    }
    private void setNombre (String p_nombre) {
        nombre = p_nombre;
    }
    private void setApellido (String p_apellido) {
        apellido = p_apellido;
    }
    private void setAnioNacimiento (int p_anio) {
        anioNacimiento = p_anio;
    }
    
    //Getters
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
    
    //Metodos de comp
     /**
     * Calcula y retorna la edad actual de la persona a partir del año de nacimiento.
     * 
     * @return edad en años
     */
    public int edad() {
        Calendar fechaHoy = new GregorianCalendar(); 
        int anioHoy = fechaHoy.get(Calendar.YEAR); //Obtiene el año actual
        return (anioHoy - getAnioNacimiento());
    }
    
    /**
     * Retorna el nombre y apellido en formato "Nombre, Apellido".
     * @return cadena con nombre y apellido
     */
    public String nomYApe() {
        return getNombre() + ", " + getApellido();
       
    }
    
    /**
     * Retorna el apellido y nombre en formato "Apellido, Nombre".
     * @return cadena con apellido y nombre
     */
    public String apeYNom() {
        return getApellido() + ", " + getNombre();
    }
    
    /**
     * Muestra en consola los datos de la persona:
     * nombre y apellido, DNI y edad.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.println("DNI: " + getDNI() + "\t" + "Edad: " + edad() + " años");
    }
}