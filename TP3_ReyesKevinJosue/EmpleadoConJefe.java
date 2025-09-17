import java.util.*;
/**
 * La clase EmpleadoConJefe representa a una persona con un numero de CUIL, apellido, nombre, un sueldo basico y un año de ingreso que trabaja para una empresa.
 * <br>Permite consultar y modificar estos valores, calcular los descuentos, la antiguedad, el adicional a cobrar, el sueldo neto y mostrar la información del EmpleadoConJefe.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class EmpleadoConJefe {
    //Atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    //Constructor
    /**
     * Crea un nuevo objeto EmpleadoConJefe con los datos ingresados por teclado.
     * @param p_cuil número de cuil del empleado
     * @param p_apellido apellido del empleado
     * @param p_nombre nombre del empleado
     * @param p_sueldoBasico sueldo basico del empleado
     * @param p_anioIngreso año de ingreso a la empresa del empleado
     */
    public EmpleadoConJefe (long p_cuil, String p_apellido, String p_nombre, 
                            double p_sueldoBasico, int p_anio) {
      this.setCuil(p_cuil);
      this.setApellido(p_apellido);
      this.setNombre(p_nombre);
      this.setSueldoBasico(p_sueldoBasico);
      this.setAnioIngreso(p_anio);
    }
    
    public EmpleadoConJefe(long p_cuil, String p_nombre, String p_apellido, double p_importe,
                            Calendar p_fecha,EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }
    
    public EmpleadoConJefe(long p_cuil, String p_nombre, String p_apellido, double p_importe,
                            Calendar p_fecha) {
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    //Setters
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }
    private void setCuil (long p_cuil) {
        this.cuil = p_cuil;
    }
    private void setApellido (String p_apellido) {
        this.apellido = p_apellido;
    }
    private void setNombre (String p_nombre) {
        this.nombre = p_nombre;
    }
    private void setSueldoBasico (double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }
    
    private void setAnioIngreso(int p_anio){
        this.fechaIngreso = new GregorianCalendar(p_anio, 0,1);
    }
    //Getters
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    public long getCuil() {
        return this.cuil;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getSueldoBasico() {
        return this.sueldoBasico;
    }
    public int getAnioIngreso() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    //Metodos
    /**
     * Devuelve los años de antiguedad del empleado.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar(); 
        int anioHoy = fechaHoy.get(Calendar.YEAR); //Obtiene el año actual
        return (anioHoy - getAnioIngreso());
    }
    
    /**
     * Suma los descuentos en obra social que corresponde al 2% del sueldo basico y el seguro de vida que corresponde a $1500.
     * @return el descuento total al sueldo básico.
     */
    private double descuento() {
        return (getSueldoBasico() * 0.02) + 1500;
    }
    
    /**
     * Calcula el adicional a cobrar sobre el sueldo basico.
     * @return el total adicional a cobrar.
     */
    private double adicional() {    
        if (antiguedad() < 2) {
            return getSueldoBasico() * 0.02; 
        } else if (antiguedad() >= 2 && antiguedad() < 10){
            return getSueldoBasico() * 0.04; 
        } else {
            return getSueldoBasico() * 0.06; 
        }
        
    }
    
    /**
     * Devuelve el sueldo neto del empleado.
     */
    public double sueldoNeto() {
        return (getSueldoBasico() + adicional()) - descuento();
    }
    
    /**
     * Devuelve el Nombre y Apellido del empleado, en ese orden.
     */
    public String nomYApe() {
        return getNombre() + " " + getApellido();
    }
    
    /**
     * Devuelve el Apellido y Nombre del empleado, en ese orden.
     */
    public String apeYNom() {
        return getApellido() + " " + getNombre();
    }
    
    /**
     * Muestra en pantalla la informacion del empleado.
     */
    public void mostrar() {
        System.out.println ("\nNombre y Apellido: " + nomYApe());
        System.out.println ("CUIL: " + getCuil() + "\t" + "Antiguedad: " + antiguedad() + " años de servicio");
        System.out.println ("Sueldo Neto: $" + sueldoNeto());
        if(this.getJefe() == null){
            System.out.println("Responde a: Gerente General");
        }else{
            System.out.println("Responde a: "+ this.getJefe().apeYNom());
        }
    }
    
    /**
     * Devuelve una cadena de caracteres con los datos del empleado.
 
     */
    public String mostrarLinea() {
        return "\n" + getCuil() + "\t" + getApellido() + ", " + getNombre() + "  ................. $" + sueldoNeto(); 
    }
    
    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();
        return fechaHoy.get(Calendar.DAY_OF_MONTH) == this.getFechaIngreso().get(Calendar.DAY_OF_MONTH)
            && fechaHoy.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH);
    }
}
    
    
