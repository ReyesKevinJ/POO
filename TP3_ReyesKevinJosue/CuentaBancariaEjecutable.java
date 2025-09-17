import java.util.Scanner;
/**
 * Clase ejecutable para gestionar cuentas bancarias.
 * Permite ingresar datos de personas y crear y gestionar cuentas bancarias.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */

public class CuentaBancariaEjecutable {
    /**
     * Controla el flujo del programa:
     * - Solicita datos de personas.
     * - Crea cuentas bancarias.
     * - Permite depositos y extracciones.
     * - Muestra los datos y saldos actualizados.
     */
    public static void main (String [] args) {
        Scanner lector = new Scanner(System.in);
        
        //Cuenta bancaria de persona1
        Persona persona1 = ingrDatosPersona(lector);
        CuentaBancaria cuentaPersona1 = ingrDatosCuenta(lector, persona1);
        cuentaPersona1.mostrar();
        System.out.printf("\nIngrese un monto a depositar: $");
        cuentaPersona1.depositar(lector.nextDouble());
        lector.nextLine();
        System.out.println("\n....Saldo actualizado.");
        System.out.println(cuentaPersona1.toString());
        
        //Cuenta bancaria de persona2
        System.out.println("\nNUEVA CUENTA\n");
        Persona persona2 = ingrDatosPersona(lector);
        CuentaBancaria cuentaPersona2 = ingrDatosCuenta(lector, persona2);
        cuentaPersona2.mostrar();
        System.out.printf("\nIngrese un monto a extraer: $");
        cuentaPersona2.extraer(lector.nextDouble());  
        lector.nextLine();
        System.out.println("\n....Saldo actualizado.");
        System.out.println(cuentaPersona2.toString());
    }
    
    /**
     * Pide los datos de una persona y luego devuelve el objeto Persona
     * con los datos cargados.
     * 
     * @param p_lector Scanner utilizado para leer desde el teclado
     * @return un objeto de tipo Persona
     */
    public static Persona ingrDatosPersona (Scanner p_lector) {
        System.out.println("--- Datos del Titular ---");
        System.out.printf("Ingrese Nombre: ");
        String nombre = p_lector.nextLine();; 
        System.out.printf("Ingrese Apellido: ");
        String apellido = p_lector.nextLine();
        System.out.printf("Ingrese DNI: ");
        int dni = p_lector.nextInt();
        System.out.printf("Ingrese año de nacimiento: ");
        int anio = p_lector.nextInt();
        
        Persona persona = new Persona (dni, nombre, apellido, anio);
        return persona;
    }
    
    /**
     * Pide los datos de una cuenta bancaria y la crea
     * asociandola a un titular ya existente.
     * Permite elegir si se carga o no un saldo inicial.
     * 
     * @param p_lector Scanner utilizado para leer desde el teclado
     * @param p_persona Persona que sera el titular de la cuenta
     * @return CuentaBancaria creada con los datos ingresados
     */
    public static CuentaBancaria ingrDatosCuenta(Scanner p_lector, 
                                                Persona p_persona) {
        System.out.println("\n--- Datos de la Cuenta Bancaria ---");
        System.out.printf("Ingrese Numero de la Cuenta: ");
        int numero = p_lector.nextInt();
        
        System.out.printf("\nDesea ingresar un saldo inicial (1.Si - 0.No): ");
        int opcionSaldo = p_lector.nextInt();
        
        if (opcionSaldo == 1) {
            System.out.printf("Ingrese nuevo Saldo: $");
            double saldo = p_lector.nextDouble();
            CuentaBancaria cuenta = new CuentaBancaria (numero, p_persona, saldo);
            return cuenta;
        }
        else {
            CuentaBancaria cuenta = new CuentaBancaria (numero, p_persona);
            return cuenta;
        }       
    }
}