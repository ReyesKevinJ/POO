
/**
 * Clase Escuela que representa a una institucion educativa con nombre, domicilio
 * y un director.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Escuela {
    //Atributos
    private String nombre;
    private String domicilio;
    private String director;
    
    //Constructor
    /**
     * Escuela con nombre, domicilio y un director.
     * 
     * @param p_nombre nombre de la escuela
     * @param p_domicilio domicilio fisico de la escuela
     * @param p_director director a cargo de la institucion
     */
    public Escuela (String p_nombre, String p_domicilio, String p_director) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    //Setters
    /**
     * Asigna p_nombre como nuevo nombre de la escuela.
     * 
     * @param p_nombre de tipo String
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna p_domicilio como nuevo domicilio de la escuela.
     * 
     * @param p_domicilio de tipo String
     */
    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }
    
    /**
     * Asigna p_director como unico director de la escuela.
     * 
     * @param p_director de tipo String
     */
    private void setDirector(String p_director) {
        this.director = p_director;
    }
    
    //Getters
    /**
     * Devuelve el nombre de la institucion.
     * 
     * @return cadena de caracteres
     */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
     * Devuelve el domicilio fisico de la institucion.
     * 
     * @return cadena de caracteres
     */
    public String getDomicilio() {
        return this.domicilio;
    }
    
    /**
     * Devuelve el nombre del director de la institucion.
     * 
     * @return cadena de caracteres
     */
    public String getDirector() {
        return this.director;
    }
    
    //Metodos de comportamiento
    /**
     * Muestra por pantalla el recibo de sueldo de un docente.
     * 
     * @param p_docente docente que percibe un sueldo
     */
    public void imprimirRecibo(Docente p_docente) {
        System.out.println ("\n***RECIBO DE SUELDO***");
        System.out.printf("Escuela: %s \t Domicilio: %s \t Director: %s \n", 
                            this.getNombre(), this.getDomicilio(), 
                            this.getDirector());
        System.out.println("---------------------------------------------------------");
        System.out.println("Docente:............... " + p_docente.getNombre());
        System.out.println("Sueldo Basico:............... " + 
                            p_docente.getSueldoBasico());
        System.out.println("Asignacion Familiar:............... " + 
                            p_docente.getAsignacionFamiliar());
    }
}