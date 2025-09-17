import java.util.Scanner;
/**
 * Clase ejecutable que permite crear y mostrar empleados por consola.
 * <p>Esta clase utiliza la clase Empleado para instanciar objetos
 * empleados con datos ingresados por teclado y mostrar su información en pantalla.</p>
 * 
 * <p>Funcionalidad:
 *     <li>Cargar datos de dos empleados mediante ingreso por teclado.</li>
 *     <li>Mostrar los datos de cada empleado en pantalla.</li>
 *     <li>Permitir visualizar una linea resumen de un empleado.</li>
 * </ul>
 * 
 * @author (Torres Jemina Cesia)
 * @version 1.0 - 42790791
 */
public class EmpleadoEjecutable {
    /**
     * Metodo principal que se ejecuta al iniciar la aplicación.
     * <p>Se encarga de crear dos empleados llamando al metodo crearEmpleado(Scanner)
     * y mostrar su información.</p>
     * 
     * @param args argumentos pasados por teclado.
     */
    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);

        //Crea 2 empleados usando el metodo auxiliar
        System.out.println("== Cargar empleado ==");
        Empleado empleado1 = crearEmpleado (lector);

        System.out.println("== Cargar empleado ==");
        Empleado empleado2 = crearEmpleado(lector);

        //Muestra los datos de los empleados
        empleado1.mostrar();
        empleado2.mostrar();
        System.out.println(empleado2.mostrarLinea());

    }
    
    /**
     * Metodo auxiliar que crea un objeto Empleado solicitando los datos por teclado.
     * 
     * @param p_lector un objeto Scanner para leer la entrada del usuario
     * @return un nuevo objeto Empleado con los datos ingresados
     */
    public static Empleado crearEmpleado(Scanner p_lector) {
        System.out.print("Ingrese el CUIL: ");
        long cuil = p_lector.nextLong();
        p_lector.nextLine();
    
        System.out.print("Ingrese el Apellido: ");
        String apellido = p_lector.nextLine();
    
        System.out.print("Ingrese el Nombre: ");
        String nombre = p_lector.nextLine();
    
        System.out.print("Ingrese el Sueldo basico: ");
        double sueldoBasico = p_lector.nextDouble();
    
        System.out.print("Ingrese el Año de ingreso: ");
        int anioIngreso = p_lector.nextInt();
        
        Empleado empleado = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        
        //Retorna un nuevo objeto empleado con sus datos
        return empleado;
    }
}