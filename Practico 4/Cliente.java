
/**
 * La clase Cliente representa a una persona con un número de DNI, apellido, nombre y un saldo asociado. 
 * Permite consultar y modificar estos valores, asi como mostrar la información del cliente.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class Cliente {
    //Atributos
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    //Constructor
    /**
     * Crea un nuevo objeto Cliente con los datos recibidos.
     * 
     * @param p_dni número de documento del cliente
     * @param p_apellido apellido del cliente
     * @param p_nombre nombre del cliente
     * @param p_importe saldo inicial del cliente
     */
    public Cliente (int p_dni, String p_apellido, String p_nombre, double p_importe) {
      this.setNroDni(p_dni);
      this.setApellido(p_apellido);
      this.setNombre(p_nombre);
      this.setSaldo(p_importe);
    }
    
    //Setters
    public void setNroDni (int p_nroDni) {
      this.nroDNI = p_nroDni;
    }
    public void setApellido(String p_apellido) {
      this.apellido = p_apellido;
    }
    public void setNombre(String p_nombre) {
      this.nombre = p_nombre;
    }
    public void setSaldo(double p_importe) {
      this.saldo = p_importe;
    }
    
    //Getters
    public int getNroDni() {
        return this.nroDNI;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    public double getSaldo() {
        return this.saldo;
    }
    
    //Metodos de comp
    /**
     * Muestra en pantalla la información del cliente en el siguiente formato:
     * -Cliente-
     * Nombre y Apellido: Juan Perez (24444333)
     * Saldo: $200.00
     */
    public void mostrar() {
      System.out.println("-Cliente-");
      System.out.println("Nombre y Apellido: " + this.nomYApe() + " (" + this.getNroDni() + ")");
      System.out.printf("Saldo: $%.2f\n", this.getSaldo());
    }
    
    /**
     * Reemplaza el saldo actual del cliente por el valor recibido.
     * 
     * @param p_importe nuevo saldo a establecer
     * @return el nuevo saldo del cliente
     */
    public double nuevoSaldo(double p_importe) {
      this.setSaldo(p_importe);
      return this.getSaldo();
    }
    
     /**
     * Suma el importe recibido al saldo actual del cliente.
     * 
     * @param p_importe monto a agregar al saldo
     * @return el nuevo saldo del cliente
     */
    public double agregaSaldo(double p_importe) {
      this.setSaldo(this.getSaldo() + p_importe); //actualiza el saldo
      return this.getSaldo();//devuelve el nuevo saldo
    }
    
     /**
     * Devuelve el apellido y el nombre en ese orden.
     * 
     * @return una cadena con formato "Apellido Nombre"
     */
    public String apeYNom() {
      return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Devuelve el nombre y el apellido en ese orden.
     * 
     * @return una cadena con formato "Nombre Apellido"
     */
    public String nomYApe() {
      return this.getNombre() + " " + this.getApellido();
    }
    
    
    
}