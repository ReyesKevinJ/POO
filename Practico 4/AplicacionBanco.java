import java.util.*;
/**
 * Write a description of class AplicacionBanco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AplicacionBanco
{
     public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        lector.nextLine();
        // Crear Localidad y primer Empleado
        Localidad localidad1 = crearLocalidad(lector);
        Empleado empleado1 = crearEmpleado(lector);

        // Crear Banco
        Banco banco = crearBanco(lector, empleado1, localidad1);

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Contratar empleado");
            System.out.println("2. Despedir empleado");
            System.out.println("3. Mostrar banco");
            System.out.println("4. Agregar cuenta bancaria");
            System.out.println("5. Quitar cuenta bancaria");
            System.out.println("6. Mostrar resumen");
            System.out.println("7. Salir");
            System.out.printf("\nIngrese una opcion: ");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    banco.agregarEmpleado(crearEmpleado(lector));
                    System.out.println("**** Nuevo Empleado contratado ****");
                    break;
                case 2:
                    banco.quitarEmpleado(elegirEmpleado(lector, banco));
                    System.out.println("**** Empleado despedido ****");
                    break;
                case 3:
                    banco.mostrar();
                    break;
                case 4:
                    banco.agregarCuentaBancaria(crearCuenta(lector));
                    System.out.println("**** Nueva cuenta bancaria agregada ****");
                    break;
                case 5:
                    banco.quitarCuentaBancaria(elegirCuenta(lector, banco));
                    System.out.println("**** Cuenta bancaria eliminada ****");
                    break;
                case 6:
                    banco.mostrarResumen();
                    break;
                case 7:
                    System.out.println("Adios!");
                    return;
                default:
                    System.out.println("Opción inválida");
            }
        }
        lector.close();
    }

    // ========================= MÉTODOS AUXILIARES =============================

    private static Empleado crearEmpleado(Scanner p_lector) {
        System.out.println("\n- Datos del Empleado -");
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

        if (opcion == 1) {
            System.out.print("Dia de ingreso: ");
            int dia = p_lector.nextInt();
            System.out.print("Mes de ingreso (1-12): ");
            int mes = p_lector.nextInt() - 1;
            Calendar fecha = new GregorianCalendar(anio, mes, dia);
            return new Empleado(cuil, nom, ape, sueldo, fecha);
        } else {
            return new Empleado(cuil, nom, ape, sueldo, anio);
        }
    }

    public static Localidad crearLocalidad(Scanner p_lector) {
        p_lector.nextLine(); 
        System.out.println("\n- Datos de Localidad -");
        System.out.print("Localidad de: ");
        String nombre = p_lector.nextLine();
        System.out.print("Provincia de: ");
        String provincia = p_lector.nextLine();
        return new Localidad(nombre, provincia);
    }

    public static Empleado elegirEmpleado(Scanner p_lector, Banco p_banco) {
        System.out.println("\nSeleccione Empleado:");
        int i = 0;
        for (Empleado unEmpleado : p_banco.getEmpleados()) {
            System.out.println(i + " - " + unEmpleado.apeYNom());
            i++;
        }
        int opcion = p_lector.nextInt();
        return p_banco.getEmpleados().get(opcion);
    }

    public static Banco crearBanco(Scanner p_lector, Empleado p_empleado, Localidad p_localidad) {
        System.out.println("\n- Datos del Banco -");
        p_lector.nextLine();
        System.out.print("Nombre: ");
        String nombre = p_lector.nextLine();
        System.out.print("Numero de sucursal: ");
        int nroSucursal = p_lector.nextInt();
        return new Banco(nombre, p_localidad, nroSucursal, p_empleado);
    }

    public static CuentaBancaria crearCuenta(Scanner p_lector) {
        System.out.println("\n- Datos de Cuenta Bancaria -");
        System.out.print("Número de cuenta: ");
        int nroCuenta = p_lector.nextInt();
    
        System.out.print("Saldo inicial: ");
        double saldo = p_lector.nextDouble();
        p_lector.nextLine(); 
        System.out.print("Apellido del titular: ");
        int dni = p_lector.nextInt();
        
        System.out.print("Apellido del titular: ");
        String apellido = p_lector.nextLine();
    
        System.out.print("Nombre del titular: ");
        String nombre = p_lector.nextLine();
        Persona titular = new Persona(
            dni, 
            apellido, 
            nombre, 
            1990
        );
    
        return new CuentaBancaria(nroCuenta, titular, saldo);
    }

    public static CuentaBancaria elegirCuenta(Scanner p_lector, Banco p_banco) {
        System.out.println("\nSeleccione Cuenta:");
        int i = 0;
        for (CuentaBancaria unaCuenta : p_banco.getCuentasBancarias()) {
            System.out.println(i + " - N°" + unaCuenta.getNroCuenta() + 
                               " - Titular: " + unaCuenta.getTitular().apeYNom());
            i++;
        }
        int opcion = p_lector.nextInt();
        return p_banco.getCuentasBancarias().get(opcion);
    }
}