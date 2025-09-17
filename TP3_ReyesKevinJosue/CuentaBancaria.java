
/**
 * Clase CuentaBancaria
 * Representa una cuenta bancaria basica que permite 
 * gestionar un numero de cuenta, un titular y un saldo.
 * 
 * Ofrece operaciones de deposito, extraccion y consulta 
 * de informacion de la cuenta.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class CuentaBancaria {
    //Atributos
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    //Constructores
    /**
     * Cuenta bancaria con numero de cuenta y titular.
     * 
     * @param p_nroCuenta numero de la cuenta bancaria
     * @param p_titular titular de la cuenta bancaria
     */
    public CuentaBancaria (int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
    }
    
    /**
     * Cuenta bancaria con numero de cuenta, titular y saldo.
     * 
     * @param p_nroCuenta numero de la cuenta bancaria
     * @param p_titular titular de la cuenta bancaria
     * @param p_saldo saldo de la cuenta bancaria
     */
    public CuentaBancaria (int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setTitular(p_titular);
    }
    
    //Setters
    /**
     * Asigna p_nroCuenta al numero de la cuenta bancaria.
     * 
     * @param p_nroCuenta tipo int
     */
    private void setNroCuenta (int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Asigna p_saldo como nuevo saldo de la cuenta.
     * 
     * @param p_saldo tipo double
     */
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    /**
     * Asigna p_titular como unico titular de la cuenta.
     * 
     * @param p_titular tipo Persona
     */
    private void setTitular (Persona p_titular) {
        this.titular = p_titular;
    }
    
    //Getters
    /**
     * Devuelve el numero de la cuenta bancaria.
     * 
     * @return un valor de tipo int
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return un valor de tipo double
     */
    public double getSaldo() {
        return this.saldo;
    }
        
    /**
     * Devuelve el titular de la cuenta.
     * 
     * @return un objeto de tipo Persona
     */
    public Persona getTitular() {
        return this.titular;
    }
    
    //Metodos de comportamiento
     /**
     * Añade p_importe el saldo actual de la cuenta 
     * y luego devuelve el valor actualizado. 
     * 
     * @param p_importe monto a agregar al saldo
     * @return un valor de tipo double
     */
    public double depositar (double p_importe) {
      this.setSaldo(getSaldo() + p_importe);
      return this.getSaldo();
    }
    
    /**
     * Extrae p_importe del saldo actual de la cuenta 
     * y luego devuelve el valor actualizado
     * 
     * @param p_importe monto a restar al saldo
     * @return un valor de tipo double
     */
    public double extraer (double p_importe) {
        this.setSaldo(getSaldo() - p_importe);
        return this.getSaldo();
    }
    
    /**
     * Muestra por pantalla los datos de la cuenta bancaria.
     */
    public void mostrar() {
        System.out.println("\n- Cuenta Bancaria -");
        this.getTitular().mostrar();
        System.out.println("Saldo: $" + this.getSaldo());
    }
    
    /**
     * Devuelve una cadena con el numero, titular y saldo de la cuenta.
     * 
     * @return un valor de tipo String
     */
    public String toString() {
        return this.getNroCuenta() + "\t" + this.getTitular().nomYApe() 
                + "\t" + this.getSaldo();
    }
}