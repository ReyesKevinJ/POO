
/**
 * Write a description of class Docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Docente
{
    //variables de instancia
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;
    
    //constructor
    public Docente(String p_nombre,String p_grado, double p_sueldo,double p_asignacion){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldo);
        this.setAsignacionFamiliar(p_asignacion);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    
    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAsignacionFamiliar(double p_asignacion){
        this.asignacionFamiliar = p_asignacion;
    }
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getGrado(){
        return this.grado;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }
    //metodos
    /**
     * calcula el sueldo sumando el sueldo basico
     * con la asignacion familiar
     * @return double:ej(20000.0)
     */
    public double calcularSueldo(){
        return this.getSueldoBasico() + this.getAsignacionFamiliar();
    }
}