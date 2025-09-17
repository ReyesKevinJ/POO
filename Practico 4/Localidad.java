
/**
 * La clase Localidad representa a una region dentro de una provincia. 
 * La misma cuenta con un nombre y la provincia a la que pertenece.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Localidad {
    //Atributos
    private String nombre;
    private String provincia;
    
    //Constructor
    /**
     * Localidad perteneciente a una provincia.
     * 
     * @param
     * @param
     */
    public Localidad (String p_nombre, String p_provincia) {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    //Setters
    /**
     * Asigna p_nombre como nuevo nombre de la localidad.
     * 
     * @param p_nombre 
     */
    private void setNombre (String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna p_provincia como la provincia a la que pertenece la localidad.
     * 
     * @param p_provincia 
     */
    private void setProvincia(String p_provincia) {
        this.provincia = p_provincia;
    }
    
    //getters
     /**
     * Devuelve el nombre de la localidad.
     * 
     * @return una cadena de caracteres 
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Devuelve la provincia a la que pertenece la localidad.
     * 
     * @return una cadena de caracteres 
     */
    public String getProvincia() {
        return this.provincia;
    }
    
    //Metodos de comportamiento
    /**
     * Muestra por pantalla los datos de la localidad.
     * 
     * @return una cadena de caracteres
     */
    public String mostrar() {
        return "Localidad: " + this.getNombre() + "\t" + "Provincia: " +
                this.getProvincia();
    }
    
}