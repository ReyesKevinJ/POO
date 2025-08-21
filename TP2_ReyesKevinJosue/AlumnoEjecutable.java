
/**
 * La clase AlumnoEjecutable prueba la clase Alumno creando varios objetos
 * con datos constantes. Se muestran los resultados de promedio, aprobación
 * y leyenda de cada alumno.
 * 
 * @author Torres Jemina Cesia
 * @author Reyes Kevin Josue
 * @version 1.0
 */
public class AlumnoEjecutable {
    public static void main(String[] args) {
        //Crea de objetos Alumno con sus datos
        Alumno alumno1 = new Alumno(Integer.parseInt(args[0]), args[1], args[2]);
   
        //Muestra informacion de los alumnos
        System.out.println("--- Informacion del alumno ---\n");
        alumno1.mostrar();
        
        //Modifico las notas y muestro la info nuevamente
        alumno1.setNota1(5.5);
        alumno1.setNota2(6.0);
        System.out.println("\nNotas actualizadas");
        alumno1.mostrar();
    }
}