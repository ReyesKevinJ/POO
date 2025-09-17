
/**
 * La clase CuentaCorriente modela una cuenta bancaria de tipo corriente.
 * <br>Cada cuenta corriente posee un numero identificador, un titular 
 * (representado por un objeto Persona), un saldo y un limite de descubierto.
 * <br>Permite gestionar operaciones basicas como depositos y extracciones, 
 * contemplando la posibilidad de utilizar un limite de descubierto 
 * autorizado por el banco en caso de saldo insuficiente, y mostrar en pantalla
 * los detalles completos de la cuenta.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class CuentaCorriente {
    //Atributos
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;
    
    //Constructores
    /**
     * Cuenta corriente con titular, numero identificador, descubierto de $500 y
     * saldo inicial de $0.
     */
    public CuentaCorriente (int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setLimiteDescubierto(500);
        this.setSaldo(0);
        this.setTitular(p_titular);
    }
    
    /**
     * Cuenta corriente con titular, numero identificador, saldo inicial y 
     * descubierto de $500.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
        this.setTitular(p_titular);
    }
    
    //Setters
    /**
     * Asigna p_nroCuenta como unico identificador de la cuenta corriente.
     * 
     * @param p_nroCuenta numero de cuenta unico
     */
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Asigna p_saldo como nuevo saldo de la cuenta corriente.
     * 
     * @param p_saldo nuevo saldo
     */
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    /**
     * Asigna p_limiteDescubierto como monto maximo que el banco permite utilizar
     * cuando la cuenta no posee saldo suficiente.
     * 
     * @param p_limiteDescubierto limite por defecto
     */
    private void setLimiteDescubierto(double p_limiteDescubierto) {
        this.limiteDescubierto = p_limiteDescubierto;
    }
    
    /**
     * Asigna p_titular como propietario de la cuenta corriente.
     * 
     * @param p_titular nombre del titular
     */
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    
    //Getters
    /**
     * Devuelve el numero identificador de la cuenta corriente.
     * 
     * @return un valor de tipo int
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta corriente.
     * 
     * @return un valor de tipo double
     */
    public double getSaldo() {
        return this.saldo;
    }
    
    /**
     * Devuelve el monto maximo que el banco permite utilizar
     * cuando la cuenta no posee saldo suficiente.
     * 
     * @return un valor de tipo double
     */
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }
    
    /**
     * Devuelve el nombre del titular de la cuenta corriente.
     * 
     * @return un objeto de tipo Persona
     */
    public Persona getTitular() {
        return this.titular;
    }
    
    //Metodos de comportamiento
    /**
     * Devuelve true si la solicitud de extraccion no supera el saldo + descubierto y
     * false de lo contrario.
     * 
     * @param p_importe monto que se solicita extraer
     * @return un valor de tipo booleano
     */
    private boolean puedeExtraer(double p_importe) {
        if(p_importe <= (this.getSaldo() + this.getLimiteDescubierto())) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Extrae p_importe del saldo actual de la cuenta.
     * 
     * @param p_importe monto a extraer de la cuenta
     */
    private void extraccion (double p_importe) {
       this.setSaldo(this.getSaldo() - p_importe);
    }
    
    /**
     * Coordina la extraccion de p_importe del saldo actual de la cuenta si es posible. De lo contrario
     * arroja un mensaje "Saldo insuficiente".
     * 
     * @param p_importe monto que se gestiona si puede extraerse o no
     */
    public void extraer (double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            this.extraccion(p_importe);
        }
        else {
            System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");
        }
    }
    
    /**
     * Añade p_importe al saldo actual de la cuenta.
     * 
     * @param p_importe importe a incrementar al saldo de la cuenta 
     */
    public void depositar (double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Muestra por pantalla los detalles de la cuenta corriente: numero de cuenta,
     * saldo, titular y descubierto.
     */
    public void mostrar () {
        System.out.println("\n- Cuenta Corriente -");
        System.out.printf("Nro. Cuenta: %d - Saldo: $%.2f \n", this.getNroCuenta(),
                            this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Descubierto: " + this.getLimiteDescubierto());
    }
}