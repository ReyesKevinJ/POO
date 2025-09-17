
/**
 * Write a description of class Triangulo here.
 * 
 * @author (Torres Jemina Cesia - Reyes Kevin Josue)  
 * @version (a version number or a date)
 */
public class Triangulo
{
    public static void main (String args[]){
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        double c = Double.valueOf(args[2]);
        double semiperimetro = (a+b+c)/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
        System.out.println(area);
    }
}