/**
 * Clase ejecutable que simula la gestión de stock de productos.
 * <p>Se instancian dos productos: uno con constructor completo y otro con constructor parcial.
 * Se muestran operaciones de ajuste de stock y consulta de precios.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class GestionStock {
    public static void main(String[] args) {
        //Crea un laboratorio
        Laboratorio lab1 = new Laboratorio("Colgate S.A.", "Scalabrini Ortiz 5524", "54-11-4239-8447");

        //Se crean dos productos asociado al laboratorio
        Producto prod1 = new Producto(100, "Perfumeria", "Jabon Deluxe", 5.25, 
                                      0.10, 50, lab1);
        Producto prod2 = new Producto(2, "Medicamentos", "Paracetamol 500mg", 3.40, lab1);
        
        //Muestra y opera datos del prod1
        System.out.println("--- Producto ---");
        prod1.mostrar(); //Estado inicial con stock 0
        prod1.ajuste(500); //Agrega 500 al stock
        System.out.println("\n-> Despues de cargar stock +500:");
        System.out.println("Stock: " + prod1.getStock() + " - Stock Valorizado: $" + prod1.stockValorizado());
        prod1.ajuste(-200); //Baja 200 al stock
        System.out.println("\n-> Despues de destruir 200 unidades:");
        System.out.println("Stock: " + prod1.getStock() + " - Stock Valorizado: $" + prod1.stockValorizado());
    
        //Muestra y opera datos del prod2
        System.out.println("\n\n--- Producto ---");
        prod2.mostrar();
        prod2.ajuste(100); //Agrega 100 al stock
        prod2.ajustarExistMin(20); 
        prod2.ajustarPtoRepo(0.15);
        System.out.println("\n-> Despues de cargar stock +100:");
        System.out.println("Stock: " + prod2.getStock() + " - Stock Valorizado: $" + prod2.stockValorizado());
        System.out.println("\n - Existencia minima: " + prod2.getExistMinima() + " unidades");
        System.out.println(" - Punto de reposición: " + prod2.getPorcPtoRepo() + "%");
        
        //Consultas de clientes
        System.out.println("\nConsulta de cliente:");
        System.out.println (prod1.mostrarLinea());
        System.out.println (prod2.mostrarLinea());
    }
}
