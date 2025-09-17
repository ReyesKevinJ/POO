
/**
 * Representa a un hombre con datos personales y estado civil.
 * En su defecto es soltero, aunque permite gestionar su relación 
 * si tuviera un esposo (casarse o divorciarse).
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Hombre {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;
    
    //Constructor;
    /**
     * Hombre con nombre, apellido y edad.
     * 
     * @param p_nombre nombre del hombre
     * @param p_apellido apellido del hombre
     * @param p_edad edad del hombre
     */
    public Hombre (String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);       
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }
    
    /**
     * Hombre con nombre, apellido, edad y esposa.
     * 
     * @param p_nombre nombre del hombre
     * @param p_apellido apellido del hombre
     * @param p_edad edad del hombre
     * @param p_esposa esposa del hombre
     */
    public Hombre (String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEsposa(p_esposa);
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
    private void setEsposa (Mujer p_mujer) {
        this.esposa = p_mujer;
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
    private Mujer getEsposa () {
        return this.esposa;
    }
    
    //Metodos de comportamiento
    /**
     * Casa al hombre con una mujer y actualiza su estado civil.
     * 
     * @param p_mujer mujer con quien se casa 
     */
    public void casarseCon(Mujer p_mujer) {
        this.setEsposa(p_mujer);
        this.setEstadoCivil("Casado");
    }
    
    /**
     * Divorcia al hombre y actualiza su estado civil.
     */
    public void divorcio() {
        this.setEsposa(null);
        this.setEstadoCivil("Divorciado");
    }
    
    /**
     * Devuelve una cadena con nombre y edad del hombre.
     * 
     * @return cadena de caracteres
     */
    public String datos() {
        return this.getNombre() + " de " + this.getEdad() + " años";
    }
    
    /**
     *  Muestra por consola los datos del hombre y su estado civil.
     */
    public void mostrarEstadoCivil() {
        System.out.println (this.datos() + " - " + this.getEstadoCivil());
    }
}