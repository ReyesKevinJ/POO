import java.util.Scanner;
/**
 * Write a description of class Circunferencia2 here.
 * 
 * @author (Torres Jemina Cesia - Reyes Kevin Josue) 
 * @version (a version number or a date)
 */

public class Circunferencia2
{
    public static void main(String args []){  
        Scanner teclado = new Scanner(System.in);
        
        String continuar = "s";
        
        while(continuar.equalsIgnoreCase("s")){
            System.out.print("Ingrese el radio: ");
            double radio = teclado.nextDouble();
    
            double circunferencia = 2 * Math.PI * radio;
    
            System.out.println("La circunferencia es: " + circunferencia);
            
            System.out.print("quiere calcular otra(s-si, n-no):");
            
            continuar = teclado.next();
        
        }     
    }
}