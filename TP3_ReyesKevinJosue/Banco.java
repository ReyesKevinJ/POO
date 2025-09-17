import java.util.Scanner;
import java.util.Random;
/**
 * Clase ejecutable Banco que que permite crear cajas de ahorro y cuentas 
 * corrientes.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class Banco {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random numero = new Random();
        
        //Instanciacion nueva
        System.out.println("Crear nueva Caja de Ahorros");
        Persona persona1 = crearPersona(lector);
        CajaDeAhorro cajaDeAhorro1 = crearCajaAhorro(lector, persona1,
                                                 numero);
        System.out.println ("\n¡Caja de Ahorros creada con exito!");
        cajaDeAhorro1.mostrar();
        
        System.out.print("\nIngrese un monto a depositar: ");
        cajaDeAhorro1.depositar(lector.nextDouble());
        System.out.println("Deposito realizado con exito!");
        cajaDeAhorro1.mostrar();
        
        System.out.print("\nIngrese un monto a extraer: $");
        cajaDeAhorro1.extraer(lector.nextDouble());
        cajaDeAhorro1.mostrar();
        
        System.out.print("----------------------------------------------------");
        
        //Instanciacion nueva
        lector.nextLine();
        System.out.println("\nCrear nueva Cuenta Corriente");
        Persona persona2 = crearPersona(lector);
        CuentaCorriente cuentaCorriente2 = crearCuentaCorriente(lector, persona2,
                                                numero);
        System.out.println ("\n¡Cuenta Corriente creada con exito!");
        cuentaCorriente2.mostrar();
        
        System.out.print("\nIngrese un monto a depositar: ");
        cuentaCorriente2.depositar(lector.nextDouble());
        System.out.println("Deposito realizado con exito!");
        cuentaCorriente2.mostrar();
        
        System.out.print("\nIngrese un monto a extraer: $");
        cuentaCorriente2.extraer(lector.nextDouble());
        cuentaCorriente2.mostrar();
    }
    
    /**
     * Crea una persona solicitando datos por teclado.
     * 
     * @param p_lector objeto Scanner para leer datos
     * @return una nueva instancia de Persona
     */
    private static Persona crearPersona(Scanner p_lector) {
        System.out.println("\nIngresar datos del Titular");
        System.out.print("Apellido: ");
        String apellido = p_lector.nextLine();
        System.out.print("Nombre: ");
        String nombre = p_lector.nextLine();
        System.out.print("DNI: ");
        int dni = p_lector.nextInt();
        System.out.printf("Ingrese año de nacimiento: ");
        int anio = p_lector.nextInt();
        
        Persona persona = new Persona (dni, apellido, nombre, anio);
        return persona;
    }
    
    /**
     * Crea una caja de ahorro asociada a un titular,
     * con número de cuenta aleatorio y opcionalmente un depósito inicial.
     * 
     * @param p_lector objeto Scanner para leer datos
     * @param p_persona titular de la cuenta
     * @param p_numCuenta generador aleatorio para el numero de cuenta
     * @return una nueva instancia de CajaDeAhorro
     */
    private static CajaDeAhorro crearCajaAhorro (Scanner p_lector, Persona p_persona, Random p_numCuenta) {
        System.out.print("Desea ingresar un deposito inicial? (1-Si, 0-No): ");
        int opcion = p_lector.nextInt(); 
        int numeroCuenta = p_numCuenta.nextInt(1000); //Numero aleatorio = numero de cuenta
        
        if(opcion == 1) {
            System.out.print("Monto a depositar: $ ");
            double saldo = p_lector.nextDouble();
            CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(numeroCuenta, p_persona, saldo);
            return cajaDeAhorro;
        }
        else {
            CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(numeroCuenta, p_persona);
            return cajaDeAhorro;
        }
    }
    
    /**
     * Crea una cuenta corriente asociada a un titular,
     * con numero de cuenta aleatorio y opcionalmente un deposito inicial.
     * 
     * @param p_lector objeto Scanner para leer datos
     * @param p_persona titular de la cuenta
     * @param p_numCuenta generador aleatorio para el numero de cuenta
     * @return una nueva instancia de CuentaCorriente
     */
    private static CuentaCorriente crearCuentaCorriente (Scanner p_lector, Persona p_persona, Random p_numCuenta) {
        System.out.println("\n- Cuenta Corriente -");
        System.out.println("Desea ingresar un deposito inicial? (1-Si, 0-No): ");
        int opcion = p_lector.nextInt();  
        int numeroCuenta = p_numCuenta.nextInt(1000); //Numero aleatorio = numero de cuenta
        
        if(opcion == 1) {           
            System.out.print("Monto a depositar: $ ");
            double saldo = p_lector.nextDouble();
            CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuenta, p_persona, saldo);
            return cuentaCorriente;
        }
        else {
            CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuenta, p_persona);
            return cuentaCorriente;
        }
    }
    
    /**
     * Envia un mensaje de felicitación si hoy es el cumpleaños de la persona.
     * 
     * @param p_persona persona a verificar
     */
    private static void enviarFelicitacionCumpleaños(Persona p_persona) {
        if (p_persona.esCumpleaños()) {
            System.out.println("\n¡Feliz cumpleaños, " + p_persona.nomYApe() + "!");
        }
    }
}