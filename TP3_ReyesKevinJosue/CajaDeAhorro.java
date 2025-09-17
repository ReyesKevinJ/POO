
/**
 * La clase Caja de Ahorros representa a una cuenta personal que las personas
 * solicitan al banco como parte del manejo de sus finanzas.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class CajaDeAhorro {
    //Atributos
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;
    
    //Constructores
    /**
     * Caja de Ahorro con titular, numero identificador, saldo inicial de $0 y
     * con un maximo de 10 extracciones.
     */
    public CajaDeAhorro (int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }
    
    /**
     * Caja de Ahorro con titular, numero identificador, saldo inicial y
     * con un maximo de 10 extracciones.
     */
    public CajaDeAhorro (int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
        this.setTitular(p_titular);
    }
    
    //Setters
    /**
     * Asigna p_nroCuenta como unico identificador de la caja de ahorros.
     * 
     * @param p_nroCuenta numero de cuenta
     */
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Asigna p_saldo como nuevo saldo de la caja de ahorros.
     * 
     * @param p_saldo nuevo saldo
     */
    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }
    
    /**
     * Asigna p_titular como propietario de la caja de ahorros.
     * 
     * @param p_titular nombre del titular
     */
    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }
    
    /**
     * Asigna p_extraccionesPosibles como maxima cantidad de extracciones 
     * permitidas de la caja de ahorros.
     * 
     * @param p_extraccionesPosibles cantidad maxima de extracciones
     */
    private void setExtraccionesPosibles(int p_extraccionesPosibles) {
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    
    //Getters
    /**
     * Devuelve el numero identificador de la caja de ahorros.
     * 
     * @return un valor de tipo int
     */
    public int getNroCuenta() {
        return this.nroCuenta;
    }
    
    /**
     * Devuelve el saldo actual de la caja de ahorros.
     * 
     * @return un valor de tipo double
     */
    public double getSaldo() {
        return this.saldo;
    }
    
    /**
     * Devuelve el nombre del titular de la caja de ahorros.
     * 
     * @return un objeto de tipo Persona
     */
    public Persona getTitular() {
        return this.titular;
    }
    
    /**
     * Devuelve la cantidad maxima de extracciones permitidas de la caja 
     * de ahorros.
     * 
     * @return un valor de tipo int
     */
    public int getExtraccionesPosibles() {
        return this.extraccionesPosibles;
    }
    
    //Metodos de comportamiento
    /**
     * Devuelve true si la solicitud de extraccion no supera el saldo y tiene
     * extracciones disponibles, de lo contrario devuelve false.
     * 
     * @param p_importe monto que se solicita extraer
     * @return un valor de tipo booleano
     */
    private boolean puedeExtraer(double p_importe) {
        if(p_importe <= this.getSaldo() && this.getExtraccionesPosibles() > 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Extrae p_importe del saldo actual de la caja de ahorros y descuenta una
     * extraccion.
     * 
     * @param p_importe monto a extraer 
     */
    private void extraccion (double p_importe) {
       this.setSaldo(this.getSaldo() - p_importe);
       this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
    }
    
    /**
     * Coordina la extraccion de p_importe del saldo actual de la cuenta si es posible. 
     * De lo contrario arroja un mensaje indicando el motivo.
     * 
     * @param p_importe monto que se gestiona si puede extraerse o no
     */
    public void extraer (double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            this.extraccion(p_importe);
        }
        else if (this.getExtraccionesPosibles() == 0) {
            System.out.println("No tiene habilitadas mas extracciones!");
        }
        else {
            System.out.println("No puede extraer mas que el saldo!");
        }
    }
    
    /**
     * Añade p_importe al saldo actual de la caja de ahorros.
     * 
     * @param p_importe importe a incrementar al saldo 
     */
    public void depositar (double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }
    
    /**
     * Muestra por pantalla los detalles de la caja de ahorros: numero de cuenta,
     * saldo, titular y extracciones posibles.
     */
    public void mostrar () {
        System.out.println("\n- Caja de Ahorros -");
        System.out.printf("Nro. Cuenta: %d - Saldo: $%.2f \n", this.getNroCuenta(),
                            this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
        System.out.println("Extracciones posibles: " + this.getExtraccionesPosibles());
    }
}