
/**
 * La clase LaboratorioEjecutable prueba la funcionalidad de la clase Laboratorio.
 * 
 * Se pueden crear varios objetos Laboratorio con diferentes constructores,
 * se actualizan sus valores y se muestran los resultados por consola.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class LaboratorioEjecutable {
    /**
    * Método principal. 
    * Prueba los constructores, setters y metodos de la clase Laboratorio.
    */
   public static void main(String[] args) {
       //Prueba el constructor completo
       Laboratorio laboratorio1 = new Laboratorio ("Farmacia Central", "Av. Siempre Viva 742", "1234-5678", 5000, 15);
       Laboratorio laboratorio2 = new Laboratorio ("Lab Salud", "Calle Falsa 123", "5555-1111", 2000, 10);
       //Prueba el constructor parcial
       Laboratorio laboratorio3 = new Laboratorio ("BioQuim", "Ruta 12 Km 5", "4444-2222");
       laboratorio3.nuevaCompraMinima(3000);
       laboratorio3.nuevoDiaEntrega(20);
       
       //Muestra datos de los laboratorios
       System.out.println("--- Datos de los laboratorios ---\n");
       
       System.out.println(laboratorio1.mostrar());
       System.out.println("Compra minima: " + "$" + laboratorio1.getCompraMinima() + " - Dia de entrega: " + laboratorio1.getDiaEntrega());
       System.out.println(laboratorio2.mostrar());
       System.out.println("Compra minima: " + "$" + laboratorio2.getCompraMinima() + " - Dia de entrega: " + laboratorio2.getDiaEntrega());
       System.out.println(laboratorio3.mostrar());
       System.out.println("Compra minima: " + laboratorio3.getCompraMinima() + " - Dia de entrega: " + laboratorio3.getDiaEntrega());
        
       //Cambio el valor para probar los setters
       laboratorio3.nuevaCompraMinima(6000);
       laboratorio3.nuevoDiaEntrega(18);
       //Muestro la actualizacion
       System.out.println("\nActualizacion "+laboratorio3.getNombre()+": ");
       System.out.println(laboratorio3.mostrar());
       System.out.println("Compra minima: " + laboratorio3.getCompraMinima() + " - Dia de entrega: " + laboratorio3.getDiaEntrega());
   }
}