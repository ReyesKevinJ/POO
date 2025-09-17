
/**
 * La clase PersonaEjecutable prueba la funcionalidad de la clase Persona.
 * 
 * Se crean varias instancias de Persona con datos constantes,
 * y se muestran en consola distintos formatos de salida.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version
 */
public class PersonaEjecutable {
     /**
     * Método principal. 
     * Construye objetos de tipo Persona, prueba sus metodos e imprime los resultados en consola.
     */
    public static void main (String[] args) {
        //Construccion del objeto con argumentos constantes
        Persona persona1 = new Persona (35123456, "Juan", "Perez", 2003);
        Persona persona2 = new Persona (42790791, "Cesia", "Torres", 2000);
        Persona persona3 = new Persona (12345678, "Fulana", "de Tal", 2000);
        
        //Muestra los datos del objeto persona1
        System.out.println("Datos persona");
        persona1.mostrar();
        
        //Imprime DNI y Edad de persona2
        System.out.println("\nDatos persona");
        System.out.println("Apellido y Nombre: " + persona2.apeYNom());
        System.out.println("DNI: " + persona2.getDNI() + "\t" + "Edad: " + persona2.edad() + " años");
                
        //Imprime nombre y apellido de persona3
        System.out.println("\nDatos persona");
        System.out.println("Nombre y Apellido: " + persona3.getNombre() + ", " + persona3.getApellido());
    }
}