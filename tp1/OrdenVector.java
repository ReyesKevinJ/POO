/**
 * @imports(javaScanner)
 */
import java.util.Scanner;
/**
 * Write a description of class OrdenVector here.
 * 
 * @author (Torres Jemina Cesia - Reyes Kevin Josue)  
 * @version (a version number or a date)
 */


public class OrdenVector
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double[] elementos = new double[4];
        for(int i=0;i<4;i++){
            System.out.println("Ingrese elemento "+(i+1));
            elementos[i]= teclado.nextDouble();
        }
        
        for(int i=0; i < elementos.length-1; i++){
                   for(int j=0; j < (elementos.length-1-i); j++){  
                        if(elementos[j] > elementos[j+1]){  
                                double aux=elementos[j];                 
                                elementos[j]=elementos[j+1];           
                                elementos[j+1]=aux;
                         }    
                   }
        }
        
        System.out.println("Menor: "+elementos[0]);
        for(int i =0 ; i<elementos.length;i++){
            System.out.print(elementos[i]+"    ");
        }
    }
}