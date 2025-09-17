
/**
 * Write a description of class CuentaBancaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    public Persona getTitular(){
        return this.titular;
    }
    
    public double depositar(double p_importe){
        double saldo = this.getSaldo()+p_importe;
        setSaldo(saldo);
        return saldo;
    }
    
    public double extraer(double p_importe){
        double saldo = this.getSaldo() - p_importe;
        setSaldo(saldo);
        return saldo;
    }
    
    public String toString(){
        return this.getNroCuenta()+"\t"+this.getTitular().nomYApe()+"\t"+this.getSaldo();
    }
    
    public void mostrar(){
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Titular: "+this.getTitular().nomYApe()+"("+this.getTitular().edad()+")");
        System.out.println("Saldo: "+this.getSaldo());
    }
}