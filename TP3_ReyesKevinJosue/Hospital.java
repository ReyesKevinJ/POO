
/**
 * La clase Hospital representa a una institucion dedicada al cuidado  las
 * personas.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class Hospital {
    //Atributos
    private String nombreHospital;
    private String nombreDirector;
    private Paciente paciente;
    
    //Constructor
    /**
     * Hospital con director y paciente.
     * 
     * @param p_nombreHospital nombre del hospital
     * @param p_nombreDirector nombre del director del hospital
     * @param p_paciente paciente del hospital
     */
    public Hospital (String p_nombreHospital, String p_nombreDirector, 
                        Paciente p_paciente) {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
        this.setPaciente(p_paciente);
    }
    
    /**
     * Hospital con director.
     * 
     * @param p_nombreHospital nombre del hospital
     * @param p_nombreDirector nombre del director del hospital
     */
    public Hospital (String p_nombreHospital, String p_nombreDirector) {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }
    
    //Setters
    /**
     * Asigna p_nombreHospital como nombre del hispital.
     * 
     * @param p_nombreHospital nuevo nombre del hospital
     */
    private void setNombreHospital(String p_nombreHospital) {
        this.nombreHospital = p_nombreHospital;
    }
    
    /**
     * Asigna p_nombreDirector como director del hospital.
     * 
     * @param p_nombreDirector nuevo director del hospital
     */
    private void setNombreDirector(String p_nombreDirector) {
        this.nombreDirector = p_nombreDirector;
    }
    
    /**
     * Asigna p_paciente como paciente del hospital.
     * 
     * @param p_paciente paciente del hospital
     */
    private void setPaciente(Paciente p_paciente) {
        this.paciente = p_paciente;
    }
    
    //Getters
    /**
     * Devuelve el nombre del hispital.
     * 
     * @return una cadena de caracteres
     */
    public String getNombreHospital() {
        return this.nombreHospital;
    }
    
    /**
     * Devuelve el nombre del director del hospital.
     * 
     * @return una cadena de caracteres
     */
    public String getNombreDirector() {
        return this.nombreDirector;
    }
    
    /**
     * Devuelve el nombre del paciente del hospital.
     * 
     * @return p_paciente paciente del hospital
     */
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    //Metodos de comportamiento
    /**
     * Muestra por pantalla los datos filia
     * 
     * @param p_paciente paciente propietario de los datos
     */
    public void consultaDatosFiliatorios(Paciente p_paciente) {
        System.out.println("Hospital: " + this.getNombreHospital() + "\t" +
                            this.getNombreDirector());
        System.out.println("---------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}