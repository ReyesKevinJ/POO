import java.util.*;
/**
 * Write a description of class Empleado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Empleado
{
    
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
     * Constructor para objetos de la clase Enpleado
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_importe);
        setAnioIngreso(p_anio);
    }
    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
   
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    public long getCuil(){
        return this.cuil;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    private double descuento(){
        double descuento = (this.getSueldoBasico()*0.02)+ 1500;
        return descuento;
    }
    
    private double adicional(){
        int antiguedad = this.antiguedad();
        double sueldo = this.getSueldoBasico();
        if(antiguedad < 2){
            return sueldo + (sueldo * 0.02);
        }
        if(antiguedad <10){
            return sueldo + (sueldo * 0.04);
        }
        return sueldo + (sueldo * 0.1);
    }
    
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioIngreso();
    }
    
    public double sueldoNeto(){
        return (this.getSueldoBasico()-this.descuento())+this.adicional();
    }
    
    public String nomYApe(){
        return this.getNombre()+" "+this.getApellido();
    }
    
    public String apeYNom(){
        return this.getApellido()+", "+this.getNombre();
    }
    
    public String mostrarLinea(){
        return this.getCuil()+" "+this.apeYNom()+" ……………"+this.sueldoNeto();
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+ this.nomYApe());
        System.out.println("Cuil: "+this.getCuil()+" Antigüedad: "+this.antiguedad()+" años de servicio");
        System.out.println("Sueldo Neto: $"+this.sueldoNeto());
    }
}