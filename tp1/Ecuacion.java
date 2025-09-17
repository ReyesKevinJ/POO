
/**
 * Write a description of class Ecuacion here.
 * 
 * @author (Torres Jemina Cesia - Reyes Kevin Josue) 
 * @version (a version number or a date)
 *
 */
public class Ecuacion
{
    public static void main(String args[]){
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminante = (b * b) - (4 * a * c);
         if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Dos raíces reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("Raíz doble:");
            System.out.println("x1 = x2 = " + x);
        } else {
            System.out.println("El discriminante es negativo, raíces complejas.");
        }  
        }
    }
