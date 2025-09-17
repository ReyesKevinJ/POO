
/**
 * Representa a una mujer con datos personales y estado civil.
 * En su defecto es soltera, aunque permite gestionar su relación 
 * si tuviera un esposo (casarse o divorciarse).
 * 
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Mujer {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;
    
    //Constructor;
    /**
     * Crea una mujer soltera con nombre, apellido y edad.
     * 
     * @param p_nombre nombre de la mujer
     * @param p_apellido apellido de la mujer
     * @param p_edad edad de la mujer
     */
    public Mujer (String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);       
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
    }
    
    /**
     * Crea una mujer con nombre, apellido, edad y esposo.
     * 
     * @param p_nombre nombre de la mujer
     * @param p_apellido apellido de la mujer
     * @param p_edad edad de la mujer
     * @param p_esposo esposo de la mujer
     */
    public Mujer (String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposo(p_esposo);
        this.setEstadoCivil(null);
    }
    
    //Setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }
    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }
    private void setEsposo (Hombre p_hombre) {
        this.esposo = p_hombre;
    }
    
    //Getters
    private String getNombre() {
        return this.nombre;
    }
    private String getApellido() {
        return this.apellido;
    }
    private int getEdad() {
        return this.edad;
    }
    private String getEstadoCivil() {
        return this.estadoCivil;
    }
    private Hombre getEsposo () {
        return this.esposo;
    }
    
    //Metodos de comportamiento
    /**
     * Casa a la mujer con un hombre y actualiza su estado civil.
     * 
     * @param p_hombre hombre con quien se casa 
     */
    public void casarseCon(Hombre p_hombre) {
        this.setEsposo(p_hombre);
        this.setEstadoCivil("Casada");
    }
    
    /**
     * Divorcia a la mujer y actualiza su estado civil.
     */
    public void divorcio() {
        this.setEsposo(null);
        this.setEstadoCivil("Divorciada");
    }
    
    /**
     * Devuelve una cadena con nombre y edad de la mujer.
     * 
     * @return cadena de caracteres
     */
    public String datos() {
        return this.getNombre() + " de " + this.getEdad() + " años";
    }
    
    /**
     *  Muestra por consola los datos de la mujer y su estado civil.
     */
    public void mostrarEstadoCivil() {
        System.out.println(this.datos() + " - " + this.getEstadoCivil());
    }
}