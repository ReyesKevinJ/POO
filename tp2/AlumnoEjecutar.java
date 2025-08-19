
/**
 * Write a description of class AlumnoEjecutar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlumnoEjecutar
{
    public static void main(String args[]){
        int lu = Integer.valueOf(args[0]);
        double nota1 = Double.valueOf(args[3]);
        double nota2 = Double.valueOf(args[4]);
        Alumno Alumno1 = new Alumno(lu, args[1], args[2]);
        Alumno1.setNota1(nota1);
        Alumno1.setNota2(nota2);
        Alumno1.mostrar();
    }
}