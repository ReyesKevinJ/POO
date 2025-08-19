
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor for objects of class Cliente
     */
    Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe)
    {
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    private void setNroDNI(int p_dni){
        this.nroDNI= p_dni;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    
    public int getNroDNI(){
        return this.nroDNI;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double nuevoSaldo(double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    public double agregaSaldo(double p_importe){
        p_importe += this.getSaldo();
        this.setSaldo(p_importe);
        return this.getSaldo();
    }
    
    public String apeYNom(){
        return this.getApellido() +" "+this.getNombre();
    }
    
    public String nomYApe(){
        return this.getNombre()+" "+this.getApellido();
    }
    
    public void mostrar(){
        System.out.println("-Cliente-");
        System.out.println("Nombre y Apellido: "+ this.nomYApe()+"("+this.getNroDNI()+")"+"\n"+"Saldo: $"+this.getSaldo());
    }
}