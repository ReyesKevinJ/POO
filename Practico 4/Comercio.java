import java.util.*;
/**
 * Write a description of class Comercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comercio
{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    //constructores 
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    //getters
    public String getNomre(){
        return this.nombre;
    }
    
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    
    
    //metodos para modificar hashmap
    
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(new Long(p_empleado.getCuil()),p_empleado);
    }
    
    public Empleado bajaEmpleado(long p_cuil){
        Empleado empleado = this.getEmpleados().get(new Long(p_cuil));
        this.getEmpleados().remove(new Long(p_cuil));
        return empleado;
    }
    
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(new Long(p_cuil));
    }
    
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(new Long(p_cuil));
    }
    
    public void sueldoNeto(long p_cuil){
        this.buscarEmpleado(p_cuil).sueldoNeto();
    }
    
    public void nomina(){
        System.out.println("**** Nomina de empleados de Avanti SRL ****");
        for(Empleado unEmpleado:this.getEmpleados().values()){
            unEmpleado.mostrarLinea();
        }
    }
}