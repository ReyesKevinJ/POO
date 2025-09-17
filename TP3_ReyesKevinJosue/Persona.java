import java.util.*;
/**
 * La clase Persona representa a una persona con datos basicos:
 * número de DNI, nombre, apellido y año de nacimiento. 
 * Permite consultar y modificar estos valores, asi como mostrar la información de la persona.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class Persona {
    //Atributos
    private int nroDni;
    private String apellido;
    private String nombre;
    //private int anioNacimiento;
    private Calendar fechaNacimiento;
    
    //Constructor
    /**
     * Constructor que recibe DNI, nombre, apellido y año de nacimiento
     * 
     * @param p_dni número de documento de la persona
     * @param p_apellido apellido de la persona
     * @param p_nombre nombre de la persona
     * @param p_anio año de nacimiento
     */
    public Persona (int p_dni, String p_nombre, String p_apellido, int p_anio) {
      this.setNroDni(p_dni);
      this.setApellido(p_apellido);
      this.setNombre(p_nombre);
      this.setAnioNacimiento (p_anio);
    }
    
    /**
     * Constructor que recibe DNI, nombre, apellido y fecha completa
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha) {
        this.setNroDni(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setFechaNacimiento(p_fecha);
    }
    
    //Setters
    //Setters
    /**
     * Asigna una nueva edad a la persona.
     * 
     * @param p_edad edad en años
     */
    public void setNroDni (int p_nroDni) {
      this.nroDni = p_nroDni;
    }
    
    /**
     * Asigna un nuevo apellido a la persona.
     * 
     * @param p_apellido
     */
    public void setApellido(String p_apellido) {
      this.apellido = p_apellido;
    }
    
    /**
     * Asigna un nuevo nombre a la persona.
     * 
     * @param p_nombre
     */
    public void setNombre(String p_nombre) {
      this.nombre = p_nombre;
    }
    
    /**
     * Asigna p_anio año de nacimiento de la persona.
     * 
     * @param p_anio tipo int
     */
    private void setAnioNacimiento (int p_anio) {
        if (this.fechaNacimiento == null) { 
            this.fechaNacimiento = Calendar.getInstance(); //crea un calendario (fecha/hora actual)
            //this.fechaNacimiento.set(p_anio, Calendar.JANUARY, 1);
            this.fechaNacimiento.set(Calendar.MONTH, Calendar.JANUARY); //Asigna mes Enero por defecto
            this.fechaNacimiento.set(Calendar.DAY_OF_MONTH, 1); //Asigna dia 1 por defecto
        }
        this.fechaNacimiento.set(Calendar.YEAR, p_anio); //Asigna el año ingresado 
        
        //fechaNacimiento = 1/Enero/1990
    }
    //La explicacione es: Si ya use setFechaNacimiento y asigne dia, mes y año..
    //la idea con el if es no perder ese dia y mes YA ASIGNADOS.
    
    /**
     * Asigna p_fecha como fecha de nacimiento de la persona.
     * 
     * @param p_fecha
     */
    private void setFechaNacimiento(Calendar p_fecha) {
        this.fechaNacimiento = p_fecha;
    }
    
    //Getters
    /**
     * Devuelve la edad de la persona.
     * 
     * @return edad como int
     */
    public int getNroDni() {
        return this.nroDni;
    }
    
    /**
     * Devuelve el apellido de la persona.
     * 
     * @return apellido como String
     */
    public String getApellido() {
        return this.apellido;
    }
    
    /**
     * Devuelve el nombre de la persona.
     * 
     * @return nombre como String
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Devuelve el año de nacimiento de la persona.
     * 
     * @return valor de tipo int
     */
    public int getAnioNacimiento() {
        return this.fechaNacimiento.get(Calendar.YEAR); //Sólo retorna el año
    }
    
    public Calendar getFechaNacimiento() {
        return this.fechaNacimiento; //Retorna la fecha completa -> apto para nuevos codigos
    }
    
    //Metodos de comp
    /**
     * Calcula y retorna la edad actual de la persona a partir del año de nacimiento.
     * 
     * @return edad en años
     */  
    public int edad() {
        Calendar hoy = new GregorianCalendar();
        
        int edad = hoy.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);   
        //Si todavia no cumplio años este año, resto 1
        if (hoy.get(Calendar.MONTH) < fechaNacimiento.get(Calendar.MONTH) ||
            (hoy.get(Calendar.MONTH) == fechaNacimiento.get(Calendar.MONTH) &&
             hoy.get(Calendar.DAY_OF_MONTH) < fechaNacimiento.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }        
        return edad;
    }
    
    /**
     * Devuelve el nombre y el apellido en ese orden.
     * 
     * @return una cadena con formato "Nombre Apellido"
     */
    public String nomYApe() {
      return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Retorna el apellido y nombre en formato "Apellido, Nombre".
     * @return cadena con apellido y nombre
     */
    public String apeYNom() {
        return this.getApellido() + ", " + this.getNombre();
    }
    
    /**
     * Muestra en consola los datos de la persona:
     * nombre y apellido, DNI y edad.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getNroDni() + "\t" + "Edad: " + this.edad() + " años");
    }
    
    /**
     * Comprueba si hoy es el cumpleaños de la persona
     * Como solo ingresamos el año, asumimos cumpleaños 1 de enero.
     */
    public boolean esCumpleaños() {
        Calendar hoy = new GregorianCalendar();
        
        return (hoy.get(Calendar.MONTH) == this.getFechaNacimiento().get(Calendar.MONTH) &&
                hoy.get(Calendar.DAY_OF_MONTH) == this.getFechaNacimiento().get(Calendar.DAY_OF_MONTH));
    }

}