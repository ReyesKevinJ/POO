import java.util.Scanner;
/**
 * La clase GestionHospital permite crear un hospital y un paciente
 * a partir de datos ingresados por teclado. Tambien simula el envio de los datos 
 * filiatorios de un paciente desde un hospital.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class GestionHospital {
    /**
      * Metodo principal que muestra un menu interactivo.
      * Crea un hospital y un paciente con datos ingresados por teclado. Permite
      * salir del programa mediante una opcion especifica.
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        
        while (opcion != 2) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Crear un hospital con un paciente");
            System.out.println("2. Salir");
            System.out.printf("\nIngrese una opcion: ");
            
            switch(lector.nextInt()) {
                case 1:
                    Paciente paciente1 = crearPaciente(lector);
                    System.out.println("\n¡Paciente creado con exito!"); 
                    Hospital hospital = crearHospital(lector, paciente1);
                    System.out.println("\n¡Hospital creado con exito!: ");
                    
                    System.out.printf("\nDesea enviar los datos filiatorios? (1-Si, 0-No): ");
                    
                    if (lector.nextInt() == 1) {
                        enviarDatosFiliarorios (hospital);
                    }
                    else {
                        System.out.println ("Regresando al menu principal...");
                    }
                    break;
                case 2:
                    System.out.println ("Adios!");
                    return;
            }
        }
    }
    
    /**
     * Crea un paciente con sus datos personales.
     * 
     * @param p_lector 
     * @return un objeto de tipo Paciente
     */
    public static Paciente crearPaciente(Scanner p_lector) { 
        System.out.println("\n- Datos del Paciente -");
        System.out.print("Numero de Historia Clinica: ");
        int historia = p_lector.nextInt();
        p_lector.nextLine();
        System.out.print("Nombre y Apellido: ");
        String nombre = p_lector.nextLine();
        System.out.print("Domicilio: ");
        String domicilio = p_lector.nextLine();
    
        Localidad localidadNacido = crearLocalidad(p_lector, "nacimiento");
        Localidad localidadVive = crearLocalidad(p_lector, "residencia");
        Paciente paciente = new Paciente(historia, nombre, domicilio, localidadNacido, localidadVive);
        return paciente;
    }
    
    /**
     * Crea y devuelve una localidad de nacimiento o residencia.
     * 
     * @param p_lector
     * @param p_tipoLocalidad tipo de localidad que crea
     * @return un objeto de tipo Localidad
     */
    public static Localidad crearLocalidad(Scanner p_lector, String p_tipoLocalidad) {
        System.out.println("\n- Datos de Localidad -");
        System.out.print("Localidad de " + p_tipoLocalidad + ": ");
        String nombre = p_lector.nextLine();
        System.out.print("Provincia de " + p_tipoLocalidad + ": ");
        String provincia = p_lector.nextLine();
        
        Localidad localidad = new Localidad(nombre, provincia);
        return localidad;
    }
    
    /**
     * Crea y devuelve un hospital con nombre, director y paciente.
     * 
     * @param p_lector ingreso por teclado
     * @param p_paciente paciente del hospital
     * @return un objeto de tipo Hospital
     */
    public static Hospital crearHospital(Scanner p_lector, Paciente p_paciente) {
        System.out.println("\n- Datos del Hospital -");
        System.out.print("Nombre del hospital: ");
        String nombreHospital = p_lector.nextLine();
        System.out.print("Nombre y Apellido del director: ");
        String nombreDirector = p_lector.nextLine();
        
        Hospital hospital = new Hospital(nombreHospital, nombreDirector, p_paciente);
        return hospital;
    }
    
    /**
     * Muestra por pantalla la simulacion de un envio de datos a un paciente
     * del hospital.
     * 
     * @param p_hospital hospital con un paciente
     */
    public static void enviarDatosFiliarorios (Hospital p_hospital) {
        System.out.println("\n- Datos filiatorios -");
        System.out.println("Envio de datos al paciente:  " + 
                            p_hospital.getPaciente().getNombre());
        System.out.println("...\n");
        p_hospital.consultaDatosFiliatorios(p_hospital.getPaciente());
    }
}