import java.util.*;
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banco
{
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;
    private ArrayList<CuentaBancaria> cuentasBancarias; 
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<Empleado>());
        this.agregarEmpleado(p_empleado);
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(new ArrayList<CuentaBancaria>());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados, ArrayList<CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuentasBancarias(p_cuentas);
    }
    
    //setters
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal =p_nroSucursal;
    }
    
    private void setEmpleados(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentasBancarias = p_cuentas;
    }
    
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    public ArrayList<CuentaBancaria> getCuentasBancarias(){
        return this.cuentasBancarias;
    }
    
    //metodos propios
    
    public boolean agregarEmpleado( Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.getEmpleados().remove(p_empleado);
    }
    
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().remove(p_cuenta);
    }
    
    public double sueldosAPagar(){
        double total =0;
        
        for(Empleado unEmpleado:this.getEmpleados()){
            total+=unEmpleado.sueldoNeto();
        }
        return total;
    }
    
    public void listarCuentasConSaldoCero(){
        System.out.println("Cuentas sin saldo:\n--- Cuenta"+
                            " -------------------- Apellido y Nombre ---------------");
        for(CuentaBancaria unaCuenta: this.getCuentasBancarias()){
            if(unaCuenta.getSaldo()==0){
                System.out.println(unaCuenta.getNroCuenta()+
                                    "\t"+unaCuenta.getTitular().apeYNom());
            }
        }
    }
    
    private int cuentasSaldoActivo(){
        int suma=0;
        for(CuentaBancaria unaCuenta: this.getCuentasBancarias()){
            if(unaCuenta.getSaldo()>0){
                suma++;
            }
        }
        return suma;
    }
    
    public void listarSueldos(){
        for(Empleado unEmpleado: this.getEmpleados()){
            System.out.println(unEmpleado.getCuil()+" "+unEmpleado.apeYNom()+
                                "------------------------------------------------$"
                                + unEmpleado.sueldoNeto());
        }
    }
    
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> titulares = new HashSet<Persona>();
        for(CuentaBancaria unaCuenta: this.getCuentasBancarias()){
            titulares.add(unaCuenta.getTitular());
        }
        return titulares;
    }
    
    public void mostrarResumen(){
        int cuentasCero = this.getCuentasBancarias().size()-this.cuentasSaldoActivo();
        System.out.println("Banco: "+this.getNombre()+"\t"+"Sucursal: "+this.getNroSucursal());
        System.out.println("Localidad: "+this.getLocalidad().getNombre()+"\t"+"Provincia: "
                            +this.getLocalidad().getProvincia());
        System.out.println("************************************************************\n"+
                            "RESUMEN DE CUENTAS BANCARIAS\n"+
                            "************************************************************");
        System.out.println("Numero Total de Cuentas Bancarias: "+ this.getCuentasBancarias().size()+
                            "Cuentas Activas: "+this.cuentasSaldoActivo()+
                            "Cuentas Saldo Cero: "+cuentasCero);
        System.out.println("-------------------------------------------------------------------------------------------");
        this.listarCuentasConSaldoCero();
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.print("Listado de Clientes: ");
        for(Persona unTitular: this.listaDeTitulares()){
            System.out.print(unTitular.apeYNom()+"; ");
        }
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    public void mostrar(){
        System.out.println("Banco: "+this.getNombre()+"\t"+"Sucursal: "+this.getNroSucursal());
        System.out.println("Localidad: "+this.getLocalidad().getNombre()+"\t"+"Provincia: "
                            +this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("Total a Pagar-------------------------------------------------------------------$"
                            + this.sueldosAPagar());
    }
}