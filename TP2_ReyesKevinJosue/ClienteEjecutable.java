
/**
 * Clase ejecutable que prueba la funcionalidad de la clase Cliente.
 * <p>
 * Esta clase crea un objeto Cliente tomando los datos desde los argumentos del metodo main, muestra su información, realiza un deposito agregando
 * saldo y simula una extracción reduciendo el saldo actual.
 
 * <p>
 * Los argumentos que se deben pasar al ejecutar la clase son:
 * <ol>
 *   <li>args[0] - número de DNI del cliente (int)</li>
 *   <li>args[1] - apellido del cliente (String)</li>
 *   <li>args[2] - nombre del cliente (String)</li>
 *   <li>args[3] - saldo inicial del cliente (double)</li>
 * </ol>
 * </p>
 * <p>
 * El programa luego realiza un depósito fijo y una extracción simulada mostrando los saldos antes y después de cada operación.
 * </p>
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class ClienteEjecutable {
    /**
     * Método principal que ejecuta la prueba de la clase Cliente.
     * <p>
     * Crea un cliente a partir de los argumentos recibidos, muestra sus datos, agrega saldo mediante el método agregaSaldo y realiza una extracción
     * mediante el método nuevoSaldo, mostrando los resultados en pantalla.
     */
    
  public static void main(String [] args) {    
    Cliente cliente1 = new Cliente(Integer.parseInt(args[0]), args[1], args[2], Double.parseDouble(args[3]));   
    cliente1.mostrar();
    
    double deposito = 500;
    double extraccion = 300;
    
    System.out.println("\nSaldo agregado: $" + deposito);
    System.out.printf ("Saldo actualizado: $%.2f", cliente1.agregaSaldo(deposito));
    
    System.out.printf("\n\nExtraccion de $%.2f: ", extraccion);
    System.out.printf ("\nSaldo actualizado: $%.2f", cliente1.nuevoSaldo(cliente1.getSaldo() - extraccion));
  }
}