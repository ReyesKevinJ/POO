import java.util.*;
/**
 * La clase Empleado representa a una persona con un numero de CUIL, apellido, nombre, un sueldo basico y un año de ingreso que trabaja para una empresa.
 * <br>Permite consultar y modificar estos valores, calcular los descuentos, la antiguedad, el adicional a cobrar, el sueldo neto y mostrar la información del Empleado.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class Empleado {
    //Atributos
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    //Constructor
    /**
     * Crea un nuevo objeto Empleado con los datos ingresados por teclado.
     * @param p_cuil número de cuil del empleado
     * @param p_apellido apellido del empleado
     * @param p_nombre nombre del empleado
     * @param p_sueldoBasico sueldo basico del empleado
     * @param p_anioIngreso año de ingreso a la empresa del empleado
     */
    public Empleado (long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso) {
      setCuil(p_cuil);
      setApellido(p_apellido);
      setNombre(p_nombre);
      setSueldoBasico(p_sueldoBasico);
      setAnioIngreso(p_anioIngreso);
    }
    
    //Setters
    public void setCuil (long p_cuil) {
        cuil = p_cuil;
    }
    public void setApellido (String p_apellido) {
        apellido = p_apellido;
    }
    public void setNombre (String p_nombre) {
        nombre = p_nombre;
    }
    public void setSueldoBasico (double p_sueldoBasico) {
        sueldoBasico = p_sueldoBasico;
    }
    public void setAnioIngreso (int p_anioIngreso) {
        anioIngreso = p_anioIngreso;
    }
    
    //Getters
    public long getCuil() {
        return cuil;
    }
    public String getApellido() {
        return apellido;
    }
    public String getNombre() {
        return nombre;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public int getAnioIngreso() {
        return anioIngreso;
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
     * <p>Formato:
     * <br>Nombre y Apellido: Juan Perez
       <br>CUIL: 20351234385 Antigüedad: 22 años de servicio
       <br>Sueldo Neto: $ 300000.00 
     */
    public void mostrar() {
        System.out.println ("\nNombre y Apellido: " + nomYApe());
        System.out.println ("CUIL: " + getCuil() + "\t" + "Antiguedad: " + antiguedad() + " años de servicio");
        System.out.println ("Sueldo Neto: $" + sueldoNeto());
    }
    
    /**
     * Devuelve una cadena de caracteres con el CUIL, apellido, nombre y sueldo neto del Empleado.
     * <br>Formato:
     * <br>20351234385   Perez, Juan .........$ 300000.00 
     */
    public String mostrarLinea() {
        return "\n" + getCuil() + "\t" + getApellido() + ", " + getNombre() + "  ................. $" + sueldoNeto(); 
    }
}
    
    