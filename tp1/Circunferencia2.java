
/**
 * Write a description of class Circunferencia2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
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