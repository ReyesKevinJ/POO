import java.util.Scanner;
/**
 * Clase ejecutable Secretaria que instancia escuelas, docentes y emite los respectivos
 * recibos de sueldo.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Secretaria {
    /**
     * Metodo principal donde se crea la relacion Escuela-Docente y se emiten recibos
     * de sueldo a partir de datos ingresados por teclado.
     */
    public static void main (String [] args) {
        Scanner lector = new Scanner (System.in);
        
        //Crea un objeto Docente y una Escuela donde se desempeña.
        Escuela manuelBelgrano802 = crearEscuela(lector);
        Docente elisaSanchez = crearDocente(lector);      
        manuelBelgrano802.imprimirRecibo(elisaSanchez); //Emision del recibo de sueldo
        
        //Crea un objeto Docente y una Escuela donde se desempeña.
        Escuela joseMartin184 = crearEscuela(lector);
        Docente marioGomez = crearDocente(lector);
        joseMartin184.imprimirRecibo(marioGomez); //Emision del recibo de sueldo
    }
    
    /**
     * Crea un objeto de tipo Escuela que cuenta con nombre, domicilio 
     * y nombre del director encargado.
     * 
     * @param p_lector 
     * @return institucion de tipo Escuela
     */
    public static Escuela crearEscuela(Scanner p_lector) {
        System.out.println("\n- Escuela -");
        System.out.printf("Ingrese Nombre de la institucion: ");
        String nombre = p_lector.nextLine();
        System.out.printf("Ingrese el Domicilio fisico: ");
        String domicilio = p_lector.nextLine();
        System.out.printf("Ingrese Nombre del Director encargado: ");
        String director = p_lector.nextLine();
        
        Escuela escuela = new Escuela (nombre, domicilio, director);
        return escuela;
    }
    
    /**
     * Crea un objeto de tipo Docente que cuenta con un nombre, es responsable de grado 
     * y percibe un sueldo basico y una asignacion familiar.
     * 
     * @param p_lector
     * @return un objeto Docente
     */
    public static Docente crearDocente(Scanner p_lector) {
        System.out.println("\n- Docente -");
        System.out.printf("Ingrese el Nombre y Apellido: ");
        String nombre = p_lector.nextLine();
        System.out.printf("Ingrese el Grado del cuál es responsable: ");
        String grado = p_lector.nextLine();
        System.out.printf("Ingrese el Sueldo basico: $");
        double sueldo = p_lector.nextDouble();
        System.out.printf("Ingrese la Asignación Familiar: $");
        double asignacion = p_lector.nextDouble();
        p_lector.nextLine();
        
        Docente docente = new Docente (nombre, grado, sueldo, asignacion);
        return docente;
    }
}
