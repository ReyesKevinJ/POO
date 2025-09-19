import java.util.*;
/**
 * Write a description of class GestionComercio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestionComercio
{
       public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el nombre del comercio: ");
        String nombreComercio = lector.nextLine();
        Comercio comercio = new Comercio(nombreComercio);

        int opcion;
        do {
            opcion = menu(lector, comercio.getNomre());
            ejecutarOpcion(opcion, lector, comercio);
        } while (opcion != 0);

        lector.close();
    }

    // ---- Menú ----
    private static int menu(Scanner lector, String nombreComercio) {
        System.out.println("\n===== GESTIÓN DE COMERCIO: " + nombreComercio + " =====");
        System.out.println("1. Dar de alta empleado");
        System.out.println("2. Dar de baja empleado");
        System.out.println("3. Buscar empleado");
        System.out.println("4. Verificar si es empleado");
        System.out.println("5. Mostrar sueldo neto de empleado");
        System.out.println("6. Listar nómina");
        System.out.println("7. Cantidad de empleados");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        return lector.nextInt();
    }

    // ---- Ejecución de opciones ----
    private static void ejecutarOpcion(int opcion, Scanner lector, Comercio comercio) {
        lector.nextLine(); // limpiar buffer
        switch (opcion) {
            case 1: // Alta
                Empleado nuevo = crearEmpleado(lector);
                comercio.altaEmpleado(nuevo);
                System.out.println("Empleado dado de alta con éxito.");
                break;

            case 2: // Baja
                System.out.print("Ingrese CUIL del empleado a dar de baja: ");
                long cuilBaja = lector.nextLong();
                Empleado eliminado = comercio.bajaEmpleado(cuilBaja);
                if (eliminado != null) {
                    System.out.println("Empleado dado de baja: " + eliminado.nomYApe());
                } else {
                    System.out.println("No se encontró empleado con ese CUIL.");
                }
                break;

            case 3: // Buscar
                System.out.print("Ingrese CUIL del empleado a buscar: ");
                long cuilBuscar = lector.nextLong();
                Empleado encontrado = comercio.buscarEmpleado(cuilBuscar);
                if (encontrado != null) {
                    encontrado.mostrar();
                } else {
                    System.out.println("Empleado no encontrado.");
                }
                break;

            case 4: // Verificar
                System.out.print("Ingrese CUIL: ");
                long cuilVerif = lector.nextLong();
                if (comercio.esEmpleado(cuilVerif)) {
                    System.out.println("El empleado existe en el comercio.");
                } else {
                    System.out.println("No es empleado registrado.");
                }
                break;

            case 5: // Sueldo neto
                System.out.print("Ingrese CUIL: ");
                long cuilSueldo = lector.nextLong();
                Empleado empSueldo = comercio.buscarEmpleado(cuilSueldo);
                if (empSueldo != null) {
                    System.out.println("Sueldo Neto de " + empSueldo.nomYApe() + ": $" + empSueldo.sueldoNeto());
                } else {
                    System.out.println("Empleado no encontrado.");
                }
                break;

            case 6: // Nómina
                comercio.nomina();
                break;

            case 7: // Cantidad
                System.out.println("Cantidad de empleados: " + comercio.cantidadDeEmpleados());
                break;

            case 0:
                System.out.println("Saliendo de la gestión...");
                break;

            default:
                System.out.println("Opción inválida.");
        }
    }

    // ---- Método auxiliar para crear empleado ----
    private static Empleado crearEmpleado(Scanner lector) {
        System.out.println("\n--- Ingreso de datos del empleado ---");
        System.out.print("CUIL: ");
        long cuil = lector.nextLong();
        lector.nextLine(); // limpiar buffer
        System.out.print("Apellido: ");
        String apellido = lector.nextLine();
        System.out.print("Nombre: ");
        String nombre = lector.nextLine();
        System.out.print("Sueldo básico: ");
        double sueldo = lector.nextDouble();
        System.out.print("Año de ingreso: ");
        int anio = lector.nextInt();
        lector.nextLine(); // limpiar buffer

        return new Empleado(cuil, apellido, nombre, sueldo, anio);
    }
}