import java.util.Scanner;
/**
 * Simula un registro civil donde se crean hombres y mujeres,
 * se registran matrimonios y divorcios mediante ingreso de datos por teclado.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class RegistroCivil {
    /**
     * Metodo principal que ejecuta la simulacion de crear dos parejas
     * y gestionar su estado civil.
     */
    public static void main (String [] args) {
        Scanner lector = new Scanner (System.in);
        
        //PRIMERA INSTANCIACION
        System.out.println("-- REGISTRO CIVIL --:");
        System.out.println("Nuevo registro");
        Mujer mujer1 = crearMujer(lector);
        mujer1.datos();
        Hombre hombre1 = crearHombre(lector);
        hombre1.datos();
        
        //Muestra el estado civil inicial de ambos
        System.out.println("\nAntes del matrimonio:");
        mujer1.mostrarEstadoCivil();
        hombre1.mostrarEstadoCivil();
        
        //Casarlos
        mujer1.casarseCon(hombre1);
        hombre1.casarseCon(mujer1);
        
        System.out.println("\nDespues del matrimonio:");
        mujer1.mostrarEstadoCivil();
        hombre1.mostrarEstadoCivil();
        
        //SEGUNDA INSTANCIACION
        System.out.println(".............................................:");
        
        System.out.println("-- REGISTRO CIVIL --:");
        System.out.println("Nuevo registro");
        Mujer mujer2 = crearMujer(lector);
        Hombre hombre2 = crearHombre(lector);
        
        //Muestra el estado civil inicial de ambos
        System.out.println("\nAntes del matrimonio:");
        mujer2.mostrarEstadoCivil();
        hombre2.mostrarEstadoCivil();
        
        //Casarlos
        mujer2.casarseCon(hombre2);
        hombre2.casarseCon(mujer2);
        
        System.out.println("\nDespues del matrimonio:");
        mujer2.mostrarEstadoCivil();
        hombre2.mostrarEstadoCivil();
        
        //Divorcio
        System.out.println("\nNuevo divoricio:");
        mujer2.divorcio();
        hombre2.divorcio();
        
        System.out.println("\nDespues del divorcio:");
        mujer2.mostrarEstadoCivil();
        hombre2.mostrarEstadoCivil(); 
    }
    
    /**
     * Crea una mujer solicitando datos por teclado.
     * 
     * @param p_lector objeto Scanner para leer datos ingresados
     * @return una nueva instancia de Mujer
     */
    private static Mujer crearMujer (Scanner p_lector) {
        System.out.println("- Datos Mujer");
        System.out.printf("Ingrese nombre: ");
        String nombre = p_lector.nextLine();
        System.out.printf("Ingrese apellido: ");
        String apellido = p_lector.nextLine();
        System.out.printf("Ingrese edad: ");
        int edad = p_lector.nextInt();
        p_lector.nextLine(); //limpiar buffer
        
        Mujer mujer = new Mujer (nombre, apellido, edad);
        return mujer;
    }
    
    /**
     * Crea un hombre solicitando datos por teclado.
     * 
     * @param p_lector objeto Scanner para leer datos ingresados
     * @return una nueva instancia de Hombre
     */
    private static Hombre crearHombre (Scanner p_lector) {
        System.out.println("- Datos Hombre");
        System.out.printf("Ingrese nombre: ");
        String nombre = p_lector.nextLine();
        System.out.printf("Ingrese apellido: ");
        String apellido = p_lector.nextLine();
        System.out.printf("Ingrese edad: ");
        int edad = p_lector.nextInt();
        p_lector.nextLine(); //limpiar buffer
        
        Hombre hombre = new Hombre (nombre, apellido, edad);
        return hombre;
    } 
}