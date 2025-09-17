
/**
 * Clase Docente que representa a una persona de profesion dedicada a la enseñanza.
 * Se desempeña en una institucion educativa del cual es responsable de grado y
 * cuenta con un nombre, un sueldo basico y una asignacion familiar a cobrar.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Docente {
    //Atributos
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    //Constructor
    /**
     * Docente con nombre, grado a cargo, sueldo basico y asignacion familiar.
     * 
     * @param p_nombre nombre del docente
     * @param p_grado grado del que está a cargo
     * @param p_sueldoBasico sueldo basico a cobrar
     * @param p_asignacionFamiliar asignacion familiar recibida
     */
    public Docente (String p_nombre, String p_grado, 
                    double p_sueldoBasico, double p_asignacionFamiliar) {
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    }
    
    //Setters
    /**
     * Asigna p_nombre como nombre del docente.
     * 
     * @param p_nombre tipo String
     */
    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna p_grado como grado del que el docente es responsable.
     * 
     * @param p_grado tipo String
     */
    public void setGrado(String p_grado) {
        this.grado = p_grado;
    }
    
    /**
     * Asigna p_sueldoBasico como nuevo saldo basico del docente.
     * 
     * @param p_sueldoBasico tipo double
     */
    public void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }
    
    /**
     * Asigna p_asignacionFamiliar como monto de asignacion familiar a percibir.
     * 
     * @param p_asignacionFamiliar tipo double
     */
    public void setAsignacionFamiliar(double p_asignacionFamiliar) {
        this.asignacionFamiliar = p_asignacionFamiliar;
    }
    
    //Getters
    /**
     * Devuelve el nombre del docente.
     * 
     * @return una cadena de caracteres
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Devuelve el grado del que el docente es responsable.
     * 
     * @return una cadena de caracteres
     */
    public String getGrado() {
        return this.grado;
    }
    
    /**
     * Devuelve el sueldo basico percibido por el docente.
     * 
     * @return valor de tipo double
     */
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    
    /**
     * Devuelve el monto de asignacion familiar percibido por el docente.
     * 
     * @return valor de tipo double
     */
    public double getAsignacionFamiliar() {
        return this.asignacionFamiliar;
    }
    
    //Metodos de comportamiento
    /**
     * Calcula y devuelve el monto total a cobrar como sueldo.
     * 
     * @return valor de tipo doble
     */
    public double calcularSueldo() {
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}