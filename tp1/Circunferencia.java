
/**
 * Write a description of class Circunferencia here.
 * 
 * @author (Torres Jemina Cesia - Reyes Kevin Josue)  
 * @version (a version number or a date)
 */
public class Circunferencia
{
    public static void main(String args []){
        double radio= Double.valueOf(args[0]);
        double circu = 2*Math.PI*radio;
        System.out.println(circu);        
    }
}