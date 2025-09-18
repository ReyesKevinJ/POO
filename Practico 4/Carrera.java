import java.util.Scanner;
/**
 * Write a description of class Carrera here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Carrera {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        String nombreCurso = lector.nextLine();
        Curso curso = new Curso(nombreCurso);

        int opcion;
        do {
            System.out.println("\n===== MENÚ CURSO: " + curso.getNombre() + " =====");
            System.out.println("1. Inscribir Alumno");
            System.out.println("2. Quitar Alumno");
            System.out.println("3. Buscar Alumno");
            System.out.println("4. Verificar si alumno está inscripto");
            System.out.println("5. Imprimir promedio de un alumno");
            System.out.println("6. Mostrar inscriptos");
            System.out.println("7. Cantidad de alumnos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    Alumno nuevo = crearAlumno(lector);
                    curso.inscribirAlumno(nuevo);
                    System.out.println("Alumno inscripto con éxito.");
                    break;

                case 2:
                    System.out.print("Ingrese LU del alumno a quitar: ");
                    int luQuitar = lector.nextInt();
                    Alumno eliminado = curso.quitarAlumno(luQuitar);
                    if (eliminado != null) {
                        System.out.println("Alumno quitado: " + eliminado.nomYApe());
                    } else {
                        System.out.println("No se encontró alumno con LU " + luQuitar);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese LU del alumno a buscar: ");
                    int luBuscar = lector.nextInt();
                    Alumno encontrado = curso.buscarAlumno(luBuscar);
                    if (encontrado != null) {
                        encontrado.mostrar();
                    } else {
                        System.out.println("No se encontró alumno con LU " + luBuscar);
                    }
                    break;

                case 4:
                    System.out.print("Ingrese LU del alumno: ");
                    int luVerificar = lector.nextInt();
                    if (curso.estaIncripto(luVerificar)) {
                        System.out.println("El alumno está inscripto.");
                    } else {
                        System.out.println("El alumno NO está inscripto.");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese LU del alumno: ");
                    int luPromedio = lector.nextInt();
                    if (curso.buscarAlumno(luPromedio) != null) {
                        curso.imprimirPromedioDelAlumno(luPromedio);
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;

                case 6:
                    curso.mostrarInscriptos();
                    break;

                case 7:
                    System.out.println("Cantidad de alumnos: " + curso.cantidadDeAlumnos());
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        lector.close();
    }

    // Método auxiliar para crear un alumno desde teclado
    public static Alumno crearAlumno(Scanner lector) {
        System.out.println("\n--- Ingreso de datos de Alumno ---");
        System.out.print("LU: ");
        int lu = lector.nextInt();
        lector.nextLine(); 
        System.out.print("Nombre: ");
        String nombre = lector.nextLine();
        System.out.print("Apellido: ");
        String apellido = lector.nextLine();
        Alumno alumno = new Alumno(lu, nombre, apellido);

        System.out.print("Nota 1: ");
        alumno.setNota1(lector.nextDouble());
        System.out.print("Nota 2: ");
        alumno.setNota2(lector.nextDouble());
        lector.nextLine(); 
        return alumno;
    }
}
