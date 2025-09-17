import java.util.*;

/**
 * Ejecutable para trabajar con EmpleadoConJefe.
 * Permite ingresar empleados, mostrar su información, verificar aniversario
 * y emitir un permiso de salida firmado por el jefe.
 */
public class EmpresaConJefe {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingreso de datos del primer Empleado (Gerente General)\n");
        //El primer empleado es el Gerente General (no tiene jefe)
        EmpleadoConJefe gerente = crearEmpleadoConJefe(lector, null);

        System.out.println("\nIngreso de datos del segundo Empleado\n");
        //El segundo empleado puede tener jefe (el gerente)
        EmpleadoConJefe empleado2 = crearEmpleadoConJefe(lector, gerente);

        //Mostrar informacion
        System.out.println("\n*** Datos de los empleados ***");
        gerente.mostrar();
        System.out.println("¿Es su aniversario hoy? " + gerente.esAniversario());
        emitirPermisoSalida(gerente);

        empleado2.mostrar();
        System.out.println("¿Es su aniversario hoy? " + empleado2.esAniversario());
        emitirPermisoSalida(empleado2);

        // Resumen
        System.out.println("\n*** Resumen ***");
        System.out.println(gerente.mostrarLinea());
        System.out.println(empleado2.mostrarLinea());
    }

    //Metodo para crear un empleado con o sin jefe
    private static EmpleadoConJefe crearEmpleadoConJefe(Scanner lector, EmpleadoConJefe jefe) {
        System.out.print("CUIL: ");
        long cuil = lector.nextLong();
        lector.nextLine();
        System.out.print("Apellido: ");
        String ape = lector.nextLine();
        System.out.print("Nombre: ");
        String nom = lector.nextLine();
        System.out.print("Sueldo básico: ");
        double sueldo = lector.nextDouble();
        System.out.print("Año de ingreso: ");
        int anio = lector.nextInt();
        lector.nextLine();

        System.out.printf("Fecha completa (1.Si, 2.No): ");
        int opcion = lector.nextInt();
        lector.nextLine();

        Calendar fechaIngreso;
        if(opcion == 1) {
            System.out.print("Dia de ingreso: ");
            int dia = lector.nextInt();
            System.out.print("Mes de ingreso (1-12): ");
            int mes = lector.nextInt() - 1;
            lector.nextLine();
            fechaIngreso = new GregorianCalendar(anio, mes, dia);
        } else {
            fechaIngreso = new GregorianCalendar(anio, 0, 1);
        }

        return new EmpleadoConJefe(cuil, nom, ape, sueldo, fechaIngreso, jefe);
    }

    //Metodo para emitir permiso de salida
    private static void emitirPermisoSalida(EmpleadoConJefe p_empleado) {
        if (p_empleado.esAniversario()) {
            System.out.println("\n--- Permiso de salida ---");
            System.out.println("Empleado: " + p_empleado.nomYApe());
            System.out.println("Firma del jefe: " + (p_empleado.getJefe() != null 
                            ? p_empleado.getJefe().apeYNom() : "GERENTE GENERAL"));
            System.out.println("-------------------------\n");
        }
        else {
            System.out.println("\nSin permiso de salida");
        }
    }
}
