
/**
 * La clase Paciente representa a una persona con un nombre, domicilio, localidad
 * de nacimiento y recidencia, y una historia clinica.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Paciente {
    //Atributos
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    //Constructor
    /**
     * Paciente con nombre, historia clinica, domicilio, localidad de nacimiento y
     * localidad de nacimiento.
     * 
     * @param p_historia historia clinica del paciente
     * @param p_nombre nombre del paciente
     * @param p_domicilio domicilio del paciente
     * @param p_localidadNacido localidad de nacimiento del paciente
     * @param p_localidadVive localidad de residencia
     */
    public Paciente (int p_historia, String p_nombre, String p_domicilio, 
                    Localidad p_localidadNacido, Localidad p_localidadVive) {
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setNacido(p_localidadNacido);
        this.setVive(p_localidadVive);
    }
    
    //Setters
    /**
     * Asigna p_historia como historia clinica del paciente
     * 
     * @param p_historia historia clinica
     */
    private void setHistoriaClinica (int p_historia) {
        this.historiaClinica = p_historia;
    }
    
    /**
     * Asigna p_nombre como nombre del paciente.
     * 
     * @param p_nombre nombre 
     */
    private void setNombre (String p_nombre) {
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna p_domicilio como domicilio del paciente.
     * 
     * @param p_domiclio domiclio
     */
    private void setDomicilio (String  p_domicilio) {
        this.domicilio = p_domicilio;
    }
    
    /**
     * Asigna p_localidad como localidad de nacimiento del paciente.
     * 
     * @param p_localidad localidad de nacimiento
     */
    private void setNacido (Localidad p_localidad) {
        this.localidadNacido = p_localidad;
    }
    
    /**
     * Asigna p_localidad como localidad de residencia del paciente.
     * 
     * @param p_localidad localidad de residencia
     */
    private void setVive (Localidad p_localidad) {
        this.localidadVive = p_localidad;
    }
    
    //Getters
    /**
     * Devuelve la historia clinica del paciente
     * 
     * @return un valor de tipo int
     */
    public int getHistoriaClinica () {
        return this.historiaClinica;
    }
    
    /**
     * Devuelve el nombre del paciente.
     * 
     * @return una cadena de caracteres
     */
    public String getNombre () {
        return this.nombre;
    }
    
    /**
     * Devuelve el domicilio del paciente.
     * 
     * @return cadena de caracteres
     */
    public String getDomicilio () {
        return this.domicilio;
    }
    
    /**
     * Devuelve la localidad de nacimiento del paciente.
     * 
     * @return un objeto de tipo Localidad
     */
    public Localidad getNacido () {
        return this.localidadNacido;
    }
    
    /**
     * Devuelve la localidad de residencia del paciente.
     * 
     * @return un objeto de tipo Localidad
     */
    public Localidad getVive () {
        return this.localidadVive;
    }
    
    //Metodos de comportamiento
    /**
     * Muestra por pantalla los datos del paciente.
     */
    public void mostrarDatosPantalla() {
        System.out.println("Paciente: " + this.getNombre() + "\t" + 
                            "Historia Clinica: " + this.getHistoriaClinica() +
                            "Domicilio: " + this.getDomicilio());
        System.out.println("Localidad de Nacimiento: " + this.getNacido().getNombre() + "\t" +
                            "Provincia: " + this.getNacido().getProvincia());
        System.out.println("Localidad de Residencia: " + this.getVive().getNombre() + "\t" +
                            "Provincia: " + this.getVive().getProvincia());
    }
    
    /**
     * Devuelve los datos del paciente.
     * 
     * @return una cadena de caracteres
     */
    public String cadenaDeDatos() {
        return this.getNombre() + "......" + this.getHistoriaClinica() +
                "......" + this.getDomicilio() + " - " + this.getVive() +
                " - " + this.getVive().getProvincia();
    }
}