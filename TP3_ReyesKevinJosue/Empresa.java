import java.util.*;

/**
 * La clase Empresa permite crear instancias de Empleado
 * a partir de datos ingresados por teclado, mostrar su información y verificar
 * si corresponde el dia de aniversario de ingreso.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Empresa {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //Empleado 1 
        System.out.println("Ingreso de datos del primer Empleado\n");
        Empleado empleado1 = crearEmpleado(lector);
        //Empleado 2
        System.out.println("Ingreso de datos del segundo Empleado\n");
        Empleado empleado2 = crearEmpleado(lector);
        
        //Mostrar información de ambos empleados
        System.out.println("\n*** Datos de los empleados ***");
        empleado1.mostrar();
        System.out.println("¿Es su aniversario hoy? " + empleado1.esAniversario());

        empleado2.mostrar();
        System.out.println("¿Es su aniversario hoy? " + empleado2.esAniversario());

        System.out.println("\n*** Resumen ***");
        System.out.println(empleado1.mostrarLinea());
        System.out.println(empleado2.mostrarLinea());
    }
    
    /**
     * Crea un empleado con datos ingresados por teclado.
     * 
     * @return un objeto de tipo Empleado
     */
    private static Empleado crearEmpleado (Scanner p_lector) {
        System.out.print("CUIL: ");
        long cuil = p_lector.nextLong();
        p_lector.nextLine();
        System.out.print("Apellido: ");
        String ape = p_lector.nextLine();
        System.out.print("Nombre: ");
        String nom = p_lector.nextLine();
        System.out.print("Sueldo básico: ");
        double sueldo = p_lector.nextDouble();
        System.out.print("Año de ingreso: ");
        int anio = p_lector.nextInt();
        
        System.out.printf("\nFecha completa (1.Si, 2.No): ");
        int opcion = p_lector.nextInt();
        if(opcion == 1) {
            System.out.print("\nDia de ingreso: ");
            int dia = p_lector.nextInt();
            System.out.print("Mes de ingreso (1-12): ");
            int mes = p_lector.nextInt() - 1; //Calendar empieza en 0 para enero
    
            Calendar fecha = new GregorianCalendar(anio, mes, dia);
            Empleado empleado = new Empleado(cuil, nom, ape, sueldo, fecha);
            return empleado;
        }
        else {
            Calendar fecha = new GregorianCalendar(anio, 0, 1);
            Empleado empleado = new Empleado(cuil, ape, nom, sueldo, anio);
            return empleado;
        }      
    }
    
    private static void emitirPermisoSalida(Empleado p_empleado) {
        if (p_empleado.esAniversario()) {
            System.out.println("\n--- Permiso de salida ---");
            System.out.println("Empleado: " + p_empleado.nomYApe());
            System.out.println("-------------------------\n");
        }
        else {
            System.out.println("\nSin permiso de salida");
        }
        
    }
}
